package it.cinemafrontend.controllers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.cinemafacade.data.CinemaData;
import it.cinemafacade.facades.CinemaFacade;


@Controller
public class CinemaController
{

	@Autowired
	private CinemaFacade cinemaFacade;

	@RequestMapping(value = "/cinemas")
	public String showCinemas(final Model model)
	{
		final List<CinemaData> cinemas = cinemaFacade.getCinemas();
		model.addAttribute("cinemas", cinemas);
		return "Cinemas";
	}

	@RequestMapping(value = "/cinemas/{cinemaDetails}")
	public String showCinemaDetails(@PathVariable String cinemaDetails, final Model model) throws UnsupportedEncodingException
	{
		cinemaDetails = URLDecoder.decode(cinemaDetails, "UTF-8");
		final CinemaData cinema = cinemaFacade.getCinema(cinemaDetails);
		model.addAttribute("cinema", cinema);
		return "CinemaDetails";
	}

}
