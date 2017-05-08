package it.cinemacore.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.CinemaDAO;
import it.cinemacore.model.CinemaModel;


@Component(value = "cinemaDAO")
public class DefaultCinemaDAO implements CinemaDAO
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<CinemaModel> findAllCinemas()
	{
		final String queryString = "SELECT {p:" + CinemaModel.PK + "} FROM {" + CinemaModel._TYPECODE + " AS p} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		return flexibleSearchService.<CinemaModel> search(query).getResult();
	}

	@Override
	public List<CinemaModel> findCinemasByCode(final String code)
	{
		final String queryString = "SELECT {p:" + CinemaModel.PK + "} FROM {" + CinemaModel._TYPECODE + " AS p} WHERE {p:"
				+ CinemaModel.CODE + "}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<CinemaModel> search(query).getResult();
	}

}
