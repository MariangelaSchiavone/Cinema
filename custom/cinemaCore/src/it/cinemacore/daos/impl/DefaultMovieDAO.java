package it.cinemacore.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.MovieDAO;
import it.cinemacore.model.MovieModel;


@Component(value = "movieDAO")
public class DefaultMovieDAO implements MovieDAO
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<MovieModel> findMoviesByCode(final String code)
	{
		final String queryString = "SELECT {" + MovieModel.PK + "} FROM {" + MovieModel._TYPECODE + "} WHERE {" + MovieModel.CODE
				+ "}=?code";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<MovieModel> search(query).getResult();
	}

}
