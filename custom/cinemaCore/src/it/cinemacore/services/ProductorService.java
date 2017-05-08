/**
 *
 */
package it.cinemacore.services;

import it.cinemacore.model.ProductorModel;

public interface ProductorService
{
	ProductorModel getProductorForCode(String code);
}
