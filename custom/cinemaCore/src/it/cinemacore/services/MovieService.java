package it.cinemacore.services;

import it.cinemacore.model.MovieModel;

public interface MovieService
{
	MovieModel getMovieForCode(String code);
}
