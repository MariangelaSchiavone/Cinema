package it.cinemafacade.facades;

import java.util.List;

import it.cinemafacade.data.CinemaData;


public interface CinemaFacade
{
	List<CinemaData> getCinemas();

	CinemaData getCinema(String code);
}
