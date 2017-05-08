package it.cinemacore.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.ActorDAO;
import it.cinemacore.model.ActorModel;


@Component(value = "actorDAO")
public class DefaultActorDAO implements ActorDAO
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<ActorModel> findActorsByCode(final String code)
	{
		final String queryString = "SELECT {a:" + ActorModel.PK + "}" + "FROM {" + ActorModel._TYPECODE + " AS a" + "WHERE "
				+ "{p: " + ActorModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<ActorModel> search(query).getResult();

	}


}
