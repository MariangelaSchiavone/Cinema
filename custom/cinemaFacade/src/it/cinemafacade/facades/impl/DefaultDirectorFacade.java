package it.cinemafacade.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.model.DirectorModel;
import it.cinemacore.services.DirectorService;
import it.cinemafacade.data.DirectorData;
import it.cinemafacade.facades.DirectorFacade;


@Component(value = "directorFacade")
public class DefaultDirectorFacade implements DirectorFacade
{
	private DirectorService directorService;

	@Override
	public DirectorData getDirector(final String code)
	{
		DirectorModel director = null;
		if (code != null)
		{
			director = directorService.getDirectorForCode(code);
			if (director == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Director with code " + code + " not found.");
		}
		final DirectorData directorData = new DirectorData();
		directorData.setCode(director.getCode());
		directorData.setName(director.getName());
		directorData.setSurname(director.getSurname());
		directorData.setNationality(director.getNationality());
		return directorData;
	}

	@Autowired
	public void setStadiumService(final DirectorService directorService)
	{
		this.directorService = directorService;
	}
}