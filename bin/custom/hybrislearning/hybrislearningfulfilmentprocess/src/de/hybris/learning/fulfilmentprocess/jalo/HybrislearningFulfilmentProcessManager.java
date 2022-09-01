/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.learning.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.learning.fulfilmentprocess.constants.HybrislearningFulfilmentProcessConstants;

public class HybrislearningFulfilmentProcessManager extends GeneratedHybrislearningFulfilmentProcessManager
{
	public static final HybrislearningFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HybrislearningFulfilmentProcessManager) em.getExtension(HybrislearningFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
