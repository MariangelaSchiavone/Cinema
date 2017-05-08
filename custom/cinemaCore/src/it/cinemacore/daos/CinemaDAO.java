package it.cinemacore.daos;

import java.util.List;

import it.cinemacore.model.CinemaModel;


public interface CinemaDAO
{
	List<CinemaModel> findAllCinemas();

	List<CinemaModel> findCinemasByCode(String code);
}
