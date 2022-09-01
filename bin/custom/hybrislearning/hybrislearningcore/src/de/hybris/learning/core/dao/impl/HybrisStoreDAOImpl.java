/**
 *
 */
package de.hybris.learning.core.dao.impl;

import de.hybris.learning.core.dao.HybrisStoreDAO;
import de.hybris.learning.model.HybrisProductStoreDetailsModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author thong.tran
 *
 */
public class HybrisStoreDAOImpl extends AbstractItemDao implements HybrisStoreDAO
{

	private static final Logger LOGGER = LoggerFactory.getLogger(HybrisStoreDAOImpl.class);

	private static final String query = "select {" + HybrisProductStoreDetailsModel.PK + "} from {"
			+ HybrisProductStoreDetailsModel._TYPECODE + "} where {" + HybrisProductStoreDetailsModel.STOREID + "}=?code";

	@Override
	public List<HybrisProductStoreDetailsModel> getHybrisStoreDetailDAO(final String storeId)
	{
		ServicesUtil.validateParameterNotNull(storeId, "Store Id not allow empty.");

		// set param
		final Map<String, Object> params = new HashMap<>();
		params.put("code", storeId);

		// search result
		final SearchResult<HybrisProductStoreDetailsModel> searchResult = getFlexibleSearchService().search(query, params);
		LOGGER.info("Search result class: ", searchResult.getClass());

		// check result then return value
		return searchResult.getResult() == null ? Collections.emptyList() : searchResult.getResult();
	}


}
