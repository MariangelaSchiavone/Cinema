package it.cinemacore.services;

import it.cinemacore.model.ActorModel;


public interface ActorService
{

	ActorModel getActorForCode(String code);

}
