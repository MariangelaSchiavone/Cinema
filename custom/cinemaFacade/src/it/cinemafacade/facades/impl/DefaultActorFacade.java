package it.cinemafacade.facades.impl;

import it.cinemacore.model.ActorModel;
import it.cinemacore.services.ActorService;
import it.cinemafacade.data.ActorData;
import it.cinemafacade.facades.ActorFacade;


public class DefaultActorFacade implements ActorFacade
{

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
