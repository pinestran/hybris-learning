/**
 *
 */
package de.hybris.learning.v2.controller;

import de.hybris.learning.facades.hybrisStore.HybrisStoreFacade;
import de.hybris.learning.queues.data.HybrisStoreDataList;
import de.hybris.platform.commercewebservicescommons.dto.store.HybrisStoreDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;


/**
 * @author thong.tran
 *
 */
@Controller
@RequestMapping(value = "/{baseSiteId}")
@Api(tags = "Hybris Store")
public class HybrisStoreController extends BaseCommerceController
{

	private static final Logger LOGGER = LoggerFactory.getLogger(HybrisStoreController.class);

	@Resource
	private HybrisStoreFacade hybrisStoreFacade;

	@Secured("ROLE_TRUSTED_CLIENT")
	@RequestMapping(value = "/{storeId}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(nickname = "getHybrisStoreDetail", value = "Get Hybris Store Detail", notes = "Return list of Hybris Store Detail", authorizations =
	{ @Authorization(value = "oauth2_client_credentials") })
	@ApiBaseSiteIdParam
	public HybrisStoreDataListWSDTO getStoreDetailById(@ApiParam(value = "storeId", required = true)
	@PathVariable
	final String storeId, @ApiParam(value = "Response configuration", allowableValues = "BASIC, DEFAULT, FULL")
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{

		final HybrisStoreDataList hybrisStoreDataList = new HybrisStoreDataList();
		hybrisStoreDataList.setHybrisStore(hybrisStoreFacade.getStoreDataById(storeId));

		return getDataMapper().map(hybrisStoreDataList, HybrisStoreDataListWSDTO.class, fields);
	}
}
