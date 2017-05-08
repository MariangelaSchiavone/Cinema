package it.cinemacore.daos;

import java.util.List;

import it.cinemacore.model.MovieModel;


public interface MovieDAO
{
	List<MovieModel> findMoviesByCode(String code);
}
