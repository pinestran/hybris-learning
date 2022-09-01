/**
 *
 */
package de.hybris.learning.storefront.controllers.cms;

import de.hybris.learning.core.model.component.YoutubeVideoComponentModel;
import de.hybris.learning.storefront.controllers.ControllerConstants;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Component("YoutubeVideoComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.YoutubeVideoComponent)
public class YoutubeVideoComponentController extends AbstractAcceleratorCMSComponentController<YoutubeVideoComponentModel>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(YoutubeVideoComponentController.class);

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final YoutubeVideoComponentModel component)
	{
		model.addAttribute("width", component.getWidth());
		model.addAttribute("height", component.getHeight());
		model.addAttribute("videoId", component.getVideoId());

		model.addAttribute("autoPlay", BooleanUtils.toBoolean(component.getAutoPlay()) ? 1 : 0);
		model.addAttribute("showControls", BooleanUtils.toBoolean(component.getShowControls()) ? 1 : 0);

		LOGGER.info("============================ The YoutubeVideo Component Custom ============================");
	}

}
