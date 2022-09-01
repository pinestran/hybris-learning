/**
 *
 */
package de.hybris.learning.core.search.solrfacetsearch.provider.impl;

import de.hybris.learning.core.model.ApparelProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Required;

/**
 * @author thong.tran
 *
 */
public class ProductHealthConditionValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider
{

	private FieldNameProvider fieldNameProvider;

	@Override
	public Collection<FieldValue> getFieldValues(final IndexConfig indexConfig, final IndexedProperty indexedProperty,
			final Object model) throws FieldValueProviderException
	{
		final Collection<FieldValue> fieldValues = new ArrayList<>();

		if (model instanceof ApparelProductModel)
		{
			final ApparelProductModel product = (ApparelProductModel) model;//this provider shall only be used with products
			addFieldValues(indexedProperty, product, fieldValues);
		}
		return fieldValues;
	}

	protected void addFieldValues(final IndexedProperty indexedProperty, final ApparelProductModel product,
			final Collection<FieldValue> fieldValues)
	{
		final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
		final String healthProductText = getHealthProduct(product);

		if (StringUtils.isNotBlank(healthProductText))
		{
			for (final String fieldName : fieldNames)
			{
				fieldValues.add(new FieldValue(fieldName, healthProductText));
			}
		}
	}

	protected String getHealthProduct(final ApparelProductModel product)
	{
		final String productInfo = product.getProductHealthCondition();
		if (StringUtils.isNotBlank(productInfo))
		{
			switch (productInfo)
			{
				case "goodQuality":
					return "good product";
				case "badQuality":
					return "bad product";
				case "worstQuality":
					return "worst product";
				default:
					return StringUtils.EMPTY;
			}
		}
		return StringUtils.EMPTY;
	}

	protected FieldNameProvider getFieldNameProvider()
	{
		return fieldNameProvider;
	}

	@Required
	public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
	{
		this.fieldNameProvider = fieldNameProvider;
	}

}
