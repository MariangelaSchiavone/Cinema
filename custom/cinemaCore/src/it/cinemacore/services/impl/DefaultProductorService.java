/**
 *
 */
package it.cinemacore.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.daos.ProductorDAO;
import it.cinemacore.model.ProductorModel;
import it.cinemacore.services.ProductorService;


@Component(value = "productorService")
public class DefaultProductorService implements ProductorService
{
	@Autowired
	private ProductorDAO productorDAO;

	@Override
	public ProductorModel getProductorForCode(final String code)
	{

		final List<ProductorModel> result = productorDAO.findProductorsByCode(code);
		if (CollectionUtils.isEmpty(result))
		//(result.isEmpty()) non valuta quando è null
		{
			throw new UnknownIdentifierException("Productor with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Productor code '" + code + "' is not unique, " + result.size() + " productors found!");
		}
		return result.get(0);
	}


}
