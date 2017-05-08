package it.cinemafrontend.controllers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.cinemafacade.data.MovieData;
import it.cinemafacade.facades.MovieFacade;


@Controller
public class MovieController
{

	@Autowired
	private MovieFacade movieFacade;

	@RequestMapping(value = "/cinemas/movies/{movieDetails}")
	public String showMovieDetails(@PathVariable String movieDetails, final Model model) throws UnsupportedEncodingException
	{
		movieDetails = URLDecoder.decode(movieDetails, "UTF-8");
		final MovieData movie = movieFacade.getMovie(movieDetails);
		//movie.setTitle(NameEncoded.getNameEncoded(movie.getTitle()));
		model.addAttribute("movie", movie);
		return "MovieDetails";
	}

}
