
package de.hybris.learning.facades.hybrisStore.impl;

import de.hybris.learning.core.services.HybrisStoreServices;
import de.hybris.learning.facades.hybrisStore.HybrisStoreFacade;
import de.hybris.learning.facades.store.data.HybrisStoreData;
import de.hybris.learning.model.HybrisProductStoreDetailsModel;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

/**
 * @author thong.tran
 *
 */
public class HybrisStoreFacadeImpl implements HybrisStoreFacade
{

	private HybrisStoreServices hybrisStoreServices;
	private Converter<HybrisProductStoreDetailsModel, HybrisStoreData> hybrisStoreConverter;

	@Override
	public List<HybrisStoreData> getStoreDataById(final String storeId)
	{
		final List<HybrisProductStoreDetailsModel> list = getHybrisStoreServices().getStoreDetailById(storeId);

		return Converters.convertAll(list, getHybrisStoreConverter());
	}

	/**
	 * @return the hybrisStoreServices
	 */
	public HybrisStoreServices getHybrisStoreServices()
	{
		return hybrisStoreServices;
	}

	/**
	 * @param hybrisStoreServices
	 *           the hybrisStoreServices to set
	 */
	public void setHybrisStoreServices(final HybrisStoreServices hybrisStoreServices)
	{
		this.hybrisStoreServices = hybrisStoreServices;
	}


	/**
	 * @return the hybrisStoreConverter
	 */
	public Converter<HybrisProductStoreDetailsModel, HybrisStoreData> getHybrisStoreConverter()
	{
		return hybrisStoreConverter;
	}

	/**
	 * @param hybrisStoreConverter
	 *           the hybrisStoreConverter to set
	 */
	public void setHybrisStoreConverter(final Converter<HybrisProductStoreDetailsModel, HybrisStoreData> hybrisStoreConverter)
	{
		this.hybrisStoreConverter = hybrisStoreConverter;
	}


}
