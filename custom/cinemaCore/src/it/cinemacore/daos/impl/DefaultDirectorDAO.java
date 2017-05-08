package it.cinemacore.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.DirectorDAO;
import it.cinemacore.model.DirectorModel;


@Component(value = "directorDAO")
public class DefaultDirectorDAO implements DirectorDAO
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<DirectorModel> findDirectorsByCode(final String code)
	{
		final String queryString = //
				"SELECT {p:" + DirectorModel.PK + "}" //
						+ "FROM {" + DirectorModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + DirectorModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<DirectorModel> search(query).getResult();
	}
}