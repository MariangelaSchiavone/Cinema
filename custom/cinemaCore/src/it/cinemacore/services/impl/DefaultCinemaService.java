package it.cinemacore.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.CinemaDAO;
import it.cinemacore.model.CinemaModel;
import it.cinemacore.services.CinemaService;


@Component(value = "cinemaService")
public class DefaultCinemaService implements CinemaService
{
	@Autowired
	private CinemaDAO cinemaDAO;

	@Override
	public List<CinemaModel> getCinemas()
	{
		return cinemaDAO.findAllCinemas();
	}

	@Override
	public CinemaModel getCinemaByCode(final String code)
	{
		final List<CinemaModel> result = cinemaDAO.findCinemasByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Cinema with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Cinema code '" + code + "' is not unique, " + result.size() + " Cinemas found!");
		}
		return result.get(0);
	}

}
