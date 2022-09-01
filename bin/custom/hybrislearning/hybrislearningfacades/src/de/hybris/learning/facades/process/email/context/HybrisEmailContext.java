/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.learning.facades.process.email.context;

import de.hybris.learning.core.model.HybrisEmailProcessModel;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * Velocity context for a customer email.
 */
public class HybrisEmailContext extends AbstractEmailContext<HybrisEmailProcessModel>
{


	@Override
	public void init(final HybrisEmailProcessModel businessProcessModel, final EmailPageModel emailPageModel)
	{
		// XXX Auto-generated method stub
		super.init(businessProcessModel, emailPageModel);
		put(EMAIL, getCustomerEmailResolutionService().getEmailForCustomer(getCustomer(businessProcessModel)));
		put(DISPLAY_NAME, getCustomer(businessProcessModel).getDisplayName());
	}

	@Override
	protected BaseSiteModel getSite(final HybrisEmailProcessModel businessProcessModel)
	{
		// XXX Auto-generated method stub
		return null;
	}

	@Override
	protected CustomerModel getCustomer(final HybrisEmailProcessModel businessProcessModel)
	{
		// XXX Auto-generated method stub
		return (CustomerModel) businessProcessModel.getCart().getUser();
	}

	@Override
	protected LanguageModel getEmailLanguage(final HybrisEmailProcessModel businessProcessModel)
	{
		// XXX Auto-generated method stub
		return null;
	}

}
