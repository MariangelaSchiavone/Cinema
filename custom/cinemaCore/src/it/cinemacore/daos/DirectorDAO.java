package it.cinemacore.daos;

import java.util.List;

import it.cinemacore.model.DirectorModel;


public interface DirectorDAO
{

	List<DirectorModel> findDirectorsByCode(String code);
}