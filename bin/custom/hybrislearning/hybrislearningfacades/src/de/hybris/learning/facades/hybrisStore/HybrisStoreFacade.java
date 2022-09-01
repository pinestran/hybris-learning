/**
 *
 */
package de.hybris.learning.facades.hybrisStore;

import de.hybris.learning.facades.store.data.HybrisStoreData;

import java.util.List;


/**
 * @author thong.tran
 *
 */
public interface HybrisStoreFacade
{
	List<HybrisStoreData> getStoreDataById(String storeId);
}
