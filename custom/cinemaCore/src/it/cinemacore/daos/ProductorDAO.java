/**
 *
 */
package it.cinemacore.daos;

import java.util.List;

import it.cinemacore.model.ProductorModel;


public interface ProductorDAO
{
	List<ProductorModel> findProductorsByCode(String code);
}
