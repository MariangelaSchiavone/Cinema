package it.cinemacore.services;

import it.cinemacore.model.DirectorModel;


public interface DirectorService
{

	DirectorModel getDirectorForCode(String code);

}
