/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.learning.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.learning.core.constants.HybrislearningCoreConstants;
import de.hybris.learning.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class HybrislearningCoreManager extends GeneratedHybrislearningCoreManager
{
	public static final HybrislearningCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HybrislearningCoreManager) em.getExtension(HybrislearningCoreConstants.EXTENSIONNAME);
	}
}
