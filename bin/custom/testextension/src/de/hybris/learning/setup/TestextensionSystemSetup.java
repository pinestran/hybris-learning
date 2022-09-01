/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.learning.setup;

import static de.hybris.learning.constants.TestextensionConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.learning.constants.TestextensionConstants;
import de.hybris.learning.service.TestextensionService;


@SystemSetup(extension = TestextensionConstants.EXTENSIONNAME)
public class TestextensionSystemSetup
{
	private final TestextensionService testextensionService;

	public TestextensionSystemSetup(final TestextensionService testextensionService)
	{
		this.testextensionService = testextensionService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		testextensionService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TestextensionSystemSetup.class.getResourceAsStream("/testextension/sap-hybris-platform.png");
	}
}
