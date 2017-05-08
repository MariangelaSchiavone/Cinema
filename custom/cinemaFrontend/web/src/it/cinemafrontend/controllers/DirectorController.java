package it.cinemafrontend.controllers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.cinemafacade.data.DirectorData;
import it.cinemafacade.facades.DirectorFacade;


@Controller
public class DirectorController
{
	@Autowired
	private DirectorFacade directorFacade;

	@RequestMapping(value = "/directors/{directorCode}")

	public String showDirectorDetails(@PathVariable String directorCode, final Model model) throws UnsupportedEncodingException
	{
		directorCode = URLDecoder.decode(directorCode, "UTF-8");
		final DirectorData director = directorFacade.getDirector(directorCode);
		director.setName(nameEncoded.getNameEncoded(director.getName()));
		model.addAttribute("director", director);
		return "DirectorDetails";
	}

}
