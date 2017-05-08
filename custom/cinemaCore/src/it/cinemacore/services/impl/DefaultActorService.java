package it.cinemacore.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import it.cinemacore.daos.ActorDAO;
import it.cinemacore.model.ActorModel;
import it.cinemacore.services.ActorService;


@Component(value = "actorService")
public class DefaultActorService implements ActorService
{
	@Autowired
	private ActorDAO actorDAO;

	@Override
	public ActorModel getActorForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{

		final List<ActorModel> result = actorDAO.findActorsByCode(code);
		if (CollectionUtils.isEmpty(result))
		{
			throw new UnknownIdentifierException("Actor with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Actor code '" + code + "' is not unique, " + result.size() + " actors found!");
		}
		return result.get(0);

	}

}
