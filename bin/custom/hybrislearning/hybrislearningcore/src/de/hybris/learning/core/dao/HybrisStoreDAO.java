/**
 *
 */
package de.hybris.learning.core.dao;

import de.hybris.learning.model.HybrisProductStoreDetailsModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;


/**
 * @author thong.tran
 *
 */
public interface HybrisStoreDAO extends Dao
{

	List<HybrisProductStoreDetailsModel> getHybrisStoreDetailDAO(String storeId);
}
