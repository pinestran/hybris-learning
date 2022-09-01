/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.learning.core.event;

import de.hybris.learning.core.model.HybrisEmailProcessModel;
import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import org.springframework.beans.factory.annotation.Required;


/**
 * Listener for "Hybris email test" functionality event.
 */
public class HybrisEmailEventListener extends AbstractAcceleratorSiteEventListener<HybrisEmailEvent>
{

	private ModelService modelService;
	private BusinessProcessService businessProcessService;


	protected BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	@Required
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	/**
	 * @return the modelService
	 */
	protected ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	protected void onSiteEvent(final HybrisEmailEvent event)
	{
		final HybrisEmailProcessModel hybrisEmailProcessModel = (HybrisEmailProcessModel) getBusinessProcessService()
				.createProcess("Hybris Email Process -" + event.getCart().getCode() + "-" + System.currentTimeMillis(),
						"hybrisEmailProcess");

		hybrisEmailProcessModel.setCart(event.getCart());
		hybrisEmailProcessModel.setCurrency(event.getCurrency());
		hybrisEmailProcessModel.setSite(event.getSite());
		hybrisEmailProcessModel.setStore(event.getBaseStore());
		hybrisEmailProcessModel.setLanguage(event.getLanguage());

		getModelService().save(hybrisEmailProcessModel);
		getBusinessProcessService().startProcess(hybrisEmailProcessModel);
	}

	@Override
	protected SiteChannel getSiteChannelForEvent(final HybrisEmailEvent event)
	{
		final BaseSiteModel site = event.getSite();
		ServicesUtil.validateParameterNotNullStandardMessage("event.site", site);
		return site.getChannel();
	}
}
