/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.learning.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Register Controller for mobile. Handles login and register for the account flow.
 */
@Controller
@RequestMapping(value = "/contactpage")
public class ContactPageController extends AbstractPageController
{

	private static final String CONTACT_CMS_PAGE = "contactCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	public String getOffers(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel contactsCMSPage = getContentPageForLabelOrId(CONTACT_CMS_PAGE);
		storeCmsPageInModel(model, contactsCMSPage);
		setUpMetaDataForContentPage(model, contactsCMSPage);
		return getViewForPage(model);
	}
}
