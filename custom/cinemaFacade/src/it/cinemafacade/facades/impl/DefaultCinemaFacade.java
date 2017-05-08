package it.cinemafacade.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.services.CinemaService;
import it.cinemafacade.data.CinemaData;
import it.cinemafacade.facades.CinemaFacade;


@Component(value = "cinemaFacade")
public class DefaultCinemaFacade implements CinemaFacade
{
	@Autowired
	private CinemaService cinemaService;

	@Override
	public List<CinemaData> getCinemas()
	{
		// YTODO Auto-generated method stub
		return null;
	}

	@Override
	public CinemaData getCinema(final String code)
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
