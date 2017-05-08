/**
 *
 */
package it.cinemacore.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.ProductorDAO;
import it.cinemacore.model.ProductorModel;


@Component(value = "productorDAO")
public class DefaultProductorDAO implements ProductorDAO
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<ProductorModel> findProductorsByCode(final String code)
	{
		final String queryString = //
				"SELECT {" + ProductorModel.PK + "}" //
						+ "FROM {" + ProductorModel._TYPECODE + "} "//
						+ "WHERE " + "{" + ProductorModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<ProductorModel> search(query).getResult();
	}

}
