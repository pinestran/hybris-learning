/**
 *
 */
package de.hybris.learning.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.store.BaseStoreModel;


/**
 * @author thong.tran
 *
 */
public class HybrisEmailEvent extends AbstractCommerceUserEvent
{

	private final AbstractOrderModel cart;

	public HybrisEmailEvent(final AbstractOrderModel cart, final BaseSiteModel baseSite, final BaseStoreModel baseStore,
			final CurrencyModel currency)
	{

		this.cart = cart;
		setBaseStore(baseStore);
		setCurrency(currency);
		setSite(baseSite);
		setLanguage(cart.getUser().getSessionLanguage());
	}

	/**
	 * @return the cart
	 */
	public AbstractOrderModel getCart()
	{
		return cart;
	}

}
