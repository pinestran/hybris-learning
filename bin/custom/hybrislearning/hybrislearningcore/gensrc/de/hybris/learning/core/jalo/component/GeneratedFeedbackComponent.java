/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 6, 2022, 1:23:29 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.learning.core.jalo.component;

import de.hybris.learning.core.constants.HybrislearningCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.learning.core.jalo.component.FeedbackComponent FeedbackComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedFeedbackComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>FeedbackComponent.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>FeedbackComponent.username</code> attribute **/
	public static final String USERNAME = "username";
	/** Qualifier of the <code>FeedbackComponent.feedback</code> attribute **/
	public static final String FEEDBACK = "feedback";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(USERNAME, AttributeMode.INITIAL);
		tmp.put(FEEDBACK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FeedbackComponent.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FeedbackComponent.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FeedbackComponent.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FeedbackComponent.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FeedbackComponent.feedback</code> attribute.
	 * @return the feedback
	 */
	public String getFeedback(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FEEDBACK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FeedbackComponent.feedback</code> attribute.
	 * @return the feedback
	 */
	public String getFeedback()
	{
		return getFeedback( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FeedbackComponent.feedback</code> attribute. 
	 * @param value the feedback
	 */
	public void setFeedback(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FEEDBACK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FeedbackComponent.feedback</code> attribute. 
	 * @param value the feedback
	 */
	public void setFeedback(final String value)
	{
		setFeedback( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FeedbackComponent.username</code> attribute.
	 * @return the username
	 */
	public String getUsername(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FeedbackComponent.username</code> attribute.
	 * @return the username
	 */
	public String getUsername()
	{
		return getUsername( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FeedbackComponent.username</code> attribute. 
	 * @param value the username
	 */
	public void setUsername(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FeedbackComponent.username</code> attribute. 
	 * @param value the username
	 */
	public void setUsername(final String value)
	{
		setUsername( getSession().getSessionContext(), value );
	}
	
}
