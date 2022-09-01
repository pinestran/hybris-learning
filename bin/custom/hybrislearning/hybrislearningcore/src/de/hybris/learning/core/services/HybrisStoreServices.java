/**
 *
 */
package de.hybris.learning.core.services;

import de.hybris.learning.model.HybrisProductStoreDetailsModel;

import java.util.List;


/**
 * @author thong.tran
 *
 */
public interface HybrisStoreServices
{
	List<HybrisProductStoreDetailsModel> getStoreDetailById(String storeId);
}
