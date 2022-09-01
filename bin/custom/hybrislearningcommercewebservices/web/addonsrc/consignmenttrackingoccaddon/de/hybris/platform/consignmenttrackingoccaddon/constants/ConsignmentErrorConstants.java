/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
 package de.hybris.platform.consignmenttrackingoccaddon.constants;

/**
 * define the constants for consignment tracking error information
 */
public class ConsignmentErrorConstants
{

	public static final String ORDER_NOT_FOUND_MESSAGE = "The order does not exist or belongs to another customer.";
	public static final String CONSIGNMENT_NOT_FOUND_MESSAGE = "No consignment found for the current order.";
	public static final String CONSIGNMENT_INCORRECT_MESSAGE = "The consignment code is incorrect.";

	public static final String ORDER_NOT_FOUND = "orderNotFound";
	public static final String CONSIGNMENT_NOT_FOUND = "consignmentNotFound";
	public static final String CONSIGNMENT_INCORRECT = "consignmentIncorrect";

	private ConsignmentErrorConstants()
	{

	}

}
