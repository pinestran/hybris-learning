/**
 *
 */
package de.hybris.learning.storefront.controllers.cms;

import de.hybris.learning.core.model.component.FeedbackComponentModel;
import de.hybris.learning.storefront.controllers.ControllerConstants;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author thong.tran
 *
 */
@Controller("FeedbackComponentController")
@RequestMapping(name = ControllerConstants.Actions.Cms.FeedbackComponent)
public class FeedbackComponentController extends AbstractAcceleratorCMSComponentController<FeedbackComponentModel>
{

	private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackComponentController.class);

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final FeedbackComponentModel component)
	{
		// get data from db then fill into model
		model.addAttribute("mail", component.getEmail());
		model.addAttribute("name", component.getUsername());
		model.addAttribute("feedback", component.getFeedback());
		LOGGER.info("============================ The Feedback Component Custom ============================");
	}

}
