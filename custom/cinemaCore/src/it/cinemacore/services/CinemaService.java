package it.cinemacore.services;

import java.util.List;

import it.cinemacore.model.CinemaModel;


public interface CinemaService
{
	List<CinemaModel> getCinemas();

	CinemaModel getCinemaForCode(String code);
}
