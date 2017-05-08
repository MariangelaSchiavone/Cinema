package it.cinemacore.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.DirectorDAO;
import it.cinemacore.model.DirectorModel;
import it.cinemacore.services.DirectorService;


@Component(value = "directorService")
public class DefaultDirectorService implements DirectorService
{
	@Autowired
	private DirectorDAO directorDAO;

	@Override
	public DirectorModel getDirectorForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<DirectorModel> result = directorDAO.findDirectorsByCode(code);
		if (CollectionUtils.isEmpty(result))
		{
			throw new UnknownIdentifierException("Director with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Director code '" + code + "' is not unique, " + result.size() + " directors found!");
		}
		return result.get(0);
	}

}