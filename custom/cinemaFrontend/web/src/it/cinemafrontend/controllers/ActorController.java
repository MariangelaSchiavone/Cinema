package it.cinemafrontend.controllers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.cinemafacade.data.ActorData;
import it.cinemafacade.facades.ActorFacade;


@Controller
public class ActorController
{

	@Autowired
	private ActorFacade actorFacade;

	@RequestMapping(value = "/cinemas/movies/actors/{actorCode}")
	public String showActorDetails(final Model model, @PathVariable String actorCode) throws UnsupportedEncodingException
	{
		actorCode = URLDecoder.decode(actorCode, "UTF-8");
		final ActorData actor = actorFacade.getActor(actorCode);
		model.addAttribute("actor", actor);
		return "ActorDetails";
	}

}
