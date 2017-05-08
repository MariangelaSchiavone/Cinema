package it.cinemafrontend.controllers;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.cinemafacade.data.ProductorData;
import it.cinemafacade.facades.ProductorFacade;


@Controller
public class ProductorController
{
	@Autowired
	private ProductorFacade productorFacade;

	@RequestMapping(value = "/cinemas/movies/productors/{productorCode}")
	public String showProductorDetails(@PathVariable String productorCode, final Model model) throws UnsupportedEncodingException
	{
		productorCode = URLDecoder.decode(productorCode, "UTF-8");
		final ProductorData productor = productorFacade.getProductor(productorCode);
		model.addAttribute("productor", productor);
		return "ProductorDetails";
	}

}