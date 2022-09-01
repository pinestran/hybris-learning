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
package de.hybris.learning.jalo;

import de.hybris.learning.constants.YcommercewebservicesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem hybrisProductStoreDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHybrisProductStoreDetails extends GenericItem
{
	/** Qualifier of the <code>hybrisProductStoreDetails.storeId</code> attribute **/
	public static final String STOREID = "storeId";
	/** Qualifier of the <code>hybrisProductStoreDetails.storeName</code> attribute **/
	public static final String STORENAME = "storeName";
	/** Qualifier of the <code>hybrisProductStoreDetails.storeCity</code> attribute **/
	public static final String STORECITY = "storeCity";
	/** Qualifier of the <code>hybrisProductStoreDetails.storeOwnerName</code> attribute **/
	public static final String STOREOWNERNAME = "storeOwnerName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STOREID, AttributeMode.INITIAL);
		tmp.put(STORENAME, AttributeMode.INITIAL);
		tmp.put(STORECITY, AttributeMode.INITIAL);
		tmp.put(STOREOWNERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeCity</code> attribute.
	 * @return the storeCity
	 */
	public String getStoreCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STORECITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeCity</code> attribute.
	 * @return the storeCity
	 */
	public String getStoreCity()
	{
		return getStoreCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeCity</code> attribute. 
	 * @param value the storeCity
	 */
	public void setStoreCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STORECITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeCity</code> attribute. 
	 * @param value the storeCity
	 */
	public void setStoreCity(final String value)
	{
		setStoreCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeId</code> attribute.
	 * @return the storeId
	 */
	public String getStoreId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STOREID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeId</code> attribute.
	 * @return the storeId
	 */
	public String getStoreId()
	{
		return getStoreId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeId</code> attribute. 
	 * @param value the storeId
	 */
	public void setStoreId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STOREID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeId</code> attribute. 
	 * @param value the storeId
	 */
	public void setStoreId(final String value)
	{
		setStoreId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeName</code> attribute.
	 * @return the storeName
	 */
	public String getStoreName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STORENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeName</code> attribute.
	 * @return the storeName
	 */
	public String getStoreName()
	{
		return getStoreName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeName</code> attribute. 
	 * @param value the storeName
	 */
	public void setStoreName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STORENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeName</code> attribute. 
	 * @param value the storeName
	 */
	public void setStoreName(final String value)
	{
		setStoreName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeOwnerName</code> attribute.
	 * @return the storeOwnerName
	 */
	public String getStoreOwnerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STOREOWNERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>hybrisProductStoreDetails.storeOwnerName</code> attribute.
	 * @return the storeOwnerName
	 */
	public String getStoreOwnerName()
	{
		return getStoreOwnerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeOwnerName</code> attribute. 
	 * @param value the storeOwnerName
	 */
	public void setStoreOwnerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STOREOWNERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>hybrisProductStoreDetails.storeOwnerName</code> attribute. 
	 * @param value the storeOwnerName
	 */
	public void setStoreOwnerName(final String value)
	{
		setStoreOwnerName( getSession().getSessionContext(), value );
	}
	
}
