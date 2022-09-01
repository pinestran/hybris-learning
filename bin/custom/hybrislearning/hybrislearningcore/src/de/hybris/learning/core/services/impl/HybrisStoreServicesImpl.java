/**
 *
 */
package de.hybris.learning.core.services.impl;

import de.hybris.learning.core.dao.HybrisStoreDAO;
import de.hybris.learning.core.services.HybrisStoreServices;
import de.hybris.learning.model.HybrisProductStoreDetailsModel;

import java.util.List;

import javax.annotation.Resource;


/**
 * @author thong.tran
 *
 */
public class HybrisStoreServicesImpl implements HybrisStoreServices
{

	@Resource
	private HybrisStoreDAO hybrisStoreDAO;

	@Override
	public List<HybrisProductStoreDetailsModel> getStoreDetailById(final String storeId)
	{

		return hybrisStoreDAO.getHybrisStoreDetailDAO(storeId);
	}

}
