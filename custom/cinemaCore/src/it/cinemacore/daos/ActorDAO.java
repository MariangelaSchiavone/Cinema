package it.cinemacore.daos;

import java.util.List;

import it.cinemacore.model.ActorModel;


public interface ActorDAO
{

	List<ActorModel> findActorsByCode(String code);

}
