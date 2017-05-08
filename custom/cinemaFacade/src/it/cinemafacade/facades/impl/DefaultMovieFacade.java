package it.cinemafacade.facades.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.model.ActorModel;
import it.cinemacore.model.DirectorModel;
import it.cinemacore.model.MovieModel;
import it.cinemacore.model.ProductorModel;
import it.cinemacore.services.MovieService;
import it.cinemafacade.data.ActorData;
import it.cinemafacade.data.DirectorData;
import it.cinemafacade.data.MovieData;
import it.cinemafacade.data.ProductorData;
import it.cinemafacade.facades.MovieFacade;


@Component(value = "movieFacade")
public class DefaultMovieFacade implements MovieFacade
{

	@Autowired
	private MovieService movieService;

	@Override
	public MovieData getMovie(final String code)
	{
		MovieModel movie = null;
		if (code != null)
		{
			movie = movieService.getMovieForCode(code);
			if (movie == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Movie with code " + code + " not found.");
		}

		final MovieData movieData = new MovieData();
		movieData.setCode(movie.getCode());
		movieData.setTitle(movie.getTitle());
		movieData.setGenre(movie.getGenre().toString());
		movieData.setTime(movie.getTime());
		movieData.setSummary(movie.getSummary());
		movieData.setYear(movie.getYear());

		final DirectorData directorData = new DirectorData();
		final DirectorModel directorModel = movie.getDirector();
		directorData.setCode(directorModel.getCode());
		directorData.setName(directorModel.getName());
		directorData.setSurname(directorModel.getSurname());
		directorData.setNationality(directorModel.getNationality());

		movieData.setDirector(directorData);

		final ProductorData productorData = new ProductorData();
		final ProductorModel productorModel = movie.getProductor();
		productorData.setCode(productorModel.getCode());
		productorData.setName(productorModel.getName());
		productorData.setSurname(productorModel.getSurname());
		productorData.setNationality(productorModel.getNationality());

		movieData.setProductor(productorData);

		final List<ActorData> actors = new ArrayList<ActorData>();
		final Iterator<ActorModel> actorModelIterator = movie.getActors().iterator();
		while (actorModelIterator.hasNext())
		{
			final ActorModel actorModel = actorModelIterator.next();
			final ActorData actorData = new ActorData();
			actorData.setCode(actorModel.getCode());
			actorData.setName(actorModel.getName());
			actorData.setSurname(actorModel.getSurname());
			actorData.setNationality(actorModel.getNationality());
			actors.add(actorData);
		}
		movieData.setActors(actors);
		return movieData;
	}

}
