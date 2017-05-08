package it.cinemafacade.facades.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.model.ActorModel;
import it.cinemacore.model.CinemaModel;
import it.cinemacore.model.DirectorModel;
import it.cinemacore.model.MovieModel;
import it.cinemacore.model.ProductorModel;
import it.cinemacore.model.ShowtimeModel;
import it.cinemacore.services.CinemaService;
import it.cinemafacade.data.ActorData;
import it.cinemafacade.data.CinemaData;
import it.cinemafacade.data.DirectorData;
import it.cinemafacade.data.MovieData;
import it.cinemafacade.data.ProductorData;
import it.cinemafacade.data.ShowtimeData;
import it.cinemafacade.facades.CinemaFacade;


@Component(value = "cinemaFacade")
public class DefaultCinemaFacade implements CinemaFacade
{
	@Autowired
	private CinemaService cinemaService;

	@Override
	public List<CinemaData> getCinemas()
	{
		final List<CinemaModel> cinemaModels = cinemaService.getCinemas();
		final List<CinemaData> cinemaDataList = new ArrayList<CinemaData>();
		for (final CinemaModel cinemaModel : cinemaModels)
		{
			final List<ShowtimeData> showtimes = new ArrayList<ShowtimeData>();
			if (!CollectionUtils.isEmpty(cinemaModel.getShowtimes()))
			{
				for (final ShowtimeModel showtime : cinemaModel.getShowtimes())
				{
					showtimes.add(getShowtimeData(showtime));
				}
			}
			final CinemaData cinemaData = new CinemaData();
			cinemaData.setCode(cinemaModel.getCode());
			cinemaData.setName(cinemaModel.getName());
			cinemaData.setCity(cinemaModel.getCity());
			cinemaData.setShowtimes(showtimes);
			cinemaDataList.add(cinemaData);
		}
		return cinemaDataList;
	}

	@Override
	public CinemaData getCinema(final String code)
	{
		final CinemaModel cinemaModel = cinemaService.getCinemaForCode(code);
		final List<ShowtimeData> showtimes = new ArrayList<ShowtimeData>();
		if (cinemaModel != null && !CollectionUtils.isEmpty(cinemaModel.getShowtimes()))
		{
			for (final ShowtimeModel showtime : cinemaModel.getShowtimes())
			{
				showtimes.add(getShowtimeData(showtime));
			}
			final CinemaData cinemaData = new CinemaData();
			cinemaData.setCode(cinemaModel.getCode());
			cinemaData.setName(cinemaModel.getName());
			cinemaData.setCity(cinemaModel.getCity());
			cinemaData.setShowtimes(showtimes);
			return cinemaData;
		}
		throw new IllegalArgumentException("Cinema with code " + code + " not found.");
	}

	private ShowtimeData getShowtimeData(final ShowtimeModel showtime)
	{
		final ShowtimeData toReturn = new ShowtimeData();
		toReturn.setCode(showtime.getCode());
		toReturn.setDate(showtime.getDate());
		toReturn.setMovie(getMovie(showtime.getMovie()));
		return toReturn;
	}

	private MovieData getMovie(final MovieModel movie)
	{
		final MovieData toReturn = new MovieData();
		toReturn.setCode(movie.getCode());
		toReturn.setTitle(movie.getTitle());
		toReturn.setGenre(movie.getGenre().toString());
		toReturn.setTime(movie.getTime());
		toReturn.setYear(movie.getYear());
		toReturn.setSummary(movie.getSummary());
		toReturn.setDirector(getDirector(movie.getDirector()));
		toReturn.setProductor(getProductor(movie.getProductor()));
		final List<ActorData> actors = new ArrayList<ActorData>();
		if (!CollectionUtils.isEmpty(movie.getActors()))
		{
			for (final ActorModel actor : movie.getActors())
			{
				actors.add(getActor(actor));
			}
		}
		toReturn.setActors(actors);
		return toReturn;
	}

	private ProductorData getProductor(final ProductorModel productor)
	{
		final ProductorData toReturn = new ProductorData();
		toReturn.setCode(productor.getCode());
		toReturn.setName(productor.getName());
		toReturn.setSurname(productor.getSurname());
		toReturn.setNationality(productor.getNationality());
		return toReturn;
	}

	private DirectorData getDirector(final DirectorModel director)
	{
		final DirectorData toReturn = new DirectorData();
		toReturn.setCode(director.getCode());
		toReturn.setName(director.getName());
		toReturn.setSurname(director.getSurname());
		toReturn.setNationality(director.getNationality());
		return toReturn;
	}

	private ActorData getActor(final ActorModel director)
	{
		final ActorData toReturn = new ActorData();
		toReturn.setCode(director.getCode());
		toReturn.setName(director.getName());
		toReturn.setSurname(director.getSurname());
		toReturn.setNationality(director.getNationality());
		return toReturn;
	}

}
