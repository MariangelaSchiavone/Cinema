package it.cinemafacade.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.model.ActorModel;
import it.cinemacore.services.ActorService;
import it.cinemafacade.data.ActorData;
import it.cinemafacade.facades.ActorFacade;


@Component(value = "actorFacade")
public class DefaultActorFacade implements ActorFacade
{

	@Autowired
	private ActorService actorService;

	@Override
	public ActorData getActor(final String code)
	{

		ActorModel actor = null;
		if (code != null)
		{
			actor = actorService.getActorForCode(code);
			if (actor == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Actor with code " + code + " not found!");
		}

		final ActorData actorData = new ActorData();
		actorData.setName(actor.getName());
		actorData.setSurname(actor.getSurname());
		actorData.setNationality(actor.getNationality());
		return actorData;

	}

}
