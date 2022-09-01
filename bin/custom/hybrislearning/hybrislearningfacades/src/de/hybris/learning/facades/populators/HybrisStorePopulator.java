/**
 *
 */
package de.hybris.learning.facades.populators;

import de.hybris.learning.facades.store.data.HybrisStoreData;
import de.hybris.learning.model.HybrisProductStoreDetailsModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author thong.tran
 *
 */
public class HybrisStorePopulator implements Populator<HybrisProductStoreDetailsModel, HybrisStoreData>
{

	@Override
	public void populate(final HybrisProductStoreDetailsModel source, final HybrisStoreData target) throws ConversionException
	{

		target.setStoreCity(source.getStoreCity());
		target.setStoreName(source.getStoreName());
		target.setStoreOwnerName(source.getStoreOwnerName());
	}

}
