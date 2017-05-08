package it.cinemafacade.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.cinemacore.model.ProductorModel;
import it.cinemacore.services.ProductorService;
import it.cinemafacade.data.ProductorData;
import it.cinemafacade.facades.ProductorFacade;


@Component(value = "productorFacade")
public class DefaultProductorFacade implements ProductorFacade
{
	@Autowired
	private ProductorService productorService;

	@Override
	public ProductorData getProductor(final String name)
	{
		ProductorModel productor = null;
		if (name != null)
		{
			productor = productorService.getProductorForCode(name);
			if (productor == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Productor with name " + name + " not found.");
		}
		// Now we can create the ProductData transfer object
		final ProductorData productorData = new ProductorData();
		productorData.setCode(productor.getCode());
		productorData.setName(productor.getName());
		productorData.setSurname(productor.getSurname());
		productorData.setNationality(productor.getNationality());
		return productorData;
	}
}
