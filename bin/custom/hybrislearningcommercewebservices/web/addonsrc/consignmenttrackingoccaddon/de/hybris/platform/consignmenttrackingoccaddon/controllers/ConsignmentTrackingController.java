/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.consignmenttrackingoccaddon.controllers;

import de.hybris.platform.commercefacades.order.data.ConsignmentData;
import de.hybris.platform.consignmenttrackingfacades.ConsignmentTrackingFacade;
import de.hybris.platform.consignmenttrackingoccaddon.dto.consignmenttracking.ConsignmentTrackingWsDTO;
import de.hybris.platform.consignmenttrackingoccaddon.validation.ConsignmentTrackingValidator;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;

import javax.annotation.Resource;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


/**
 * Controller for consignment tracking, provide RESTful API for consignment tracking
 */
@Controller
@RequestMapping("/{baseSiteId}/orders/{orderCode}/consignments")
@Api(tags = "Consignment Tracking")
public class ConsignmentTrackingController
{
	@Resource(name = "consignmentTrackingFacade")
	private ConsignmentTrackingFacade consignmentTrackingFacade;

	@Resource(name = "dataMapper")
	private DataMapper dataMapper;

	@Resource
	private ConsignmentTrackingValidator consignmentTrackingValidator;

	@ResponseBody
	@RequestMapping(value = "/{consignmentCode}/tracking", method = RequestMethod.GET)
	@ApiOperation(value = "Gets consignment tracking information", notes = "Returns details of consignment tracking information based on the order code and the consignment code.")
	@ApiBaseSiteIdParam
	@Secured(
	{ "ROLE_CUSTOMERGROUP" })
	public ConsignmentTrackingWsDTO getConsignmentTrackingData(
			@ApiParam(value = "order identifier", required = true) @PathVariable("orderCode") final String orderCode,
			@ApiParam(value = "consignment identifier", required = true) @PathVariable("consignmentCode") final String consignmentCode)
	{
		consignmentTrackingValidator.checkIfOrderAccessible(orderCode);

		final ConsignmentData data = consignmentTrackingValidator.checkIfConsignmentDataExist(orderCode,
				consignmentCode);

		consignmentTrackingValidator.checkIfConsignmentShipped(data);

		final ConsignmentTrackingWsDTO consignmentTrackingWsDTOData = dataMapper.map(data, ConsignmentTrackingWsDTO.class);
		consignmentTrackingWsDTOData
				.setTrackingUrl(consignmentTrackingFacade.getTrackingUrlForConsignmentCode(orderCode, consignmentCode));
		return consignmentTrackingWsDTOData;

	}

}
