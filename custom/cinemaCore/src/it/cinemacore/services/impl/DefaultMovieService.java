package it.cinemacore.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.MovieDAO;
import it.cinemacore.model.MovieModel;
import it.cinemacore.services.MovieService;


@Component(value = "movieService")
public class DefaultMovieService implements MovieService
{

	@Autowired
	private MovieDAO movieDAO;

	@Override
	public MovieModel getMovieForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<MovieModel> result = movieDAO.findMoviesByCode(code);
		if (CollectionUtils.isEmpty(result))
		{
			throw new UnknownIdentifierException("Movie with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Movie code '" + code + "' is not unique, " + result.size() + " Movies found!");
		}
		return result.get(0);
	}

}
