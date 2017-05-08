package it.cinemafacade.facades;

import it.cinemafacade.data.MovieData;


public interface MovieFacade
{
	MovieData getMovie(String code);
}
