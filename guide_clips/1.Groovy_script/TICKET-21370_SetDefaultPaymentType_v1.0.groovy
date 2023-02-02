import org.apache.commons.lang.StringUtils;


List<String> sitesHasCardPayment  = Arrays.asList(StringUtils.split(configurationService.getConfiguration().getString("card.payment.sites.uid"), ","));
for (site in sitesHasCardPayment )
{
	println("Sites: "+site);
}
//final List<String> sitesHasCardPayment = Arrays.asList("TCIUSA")
String query = "Select {PK} from {B2BCustomer}";

searchResult = flexibleSearchService.search(query);

for (customer in searchResult.getResult()) {

	if (customer.getCountry() == null)
	{
		println("Country Error: "+customer.getUid());
		defaultCountry = tciCMSSiteService.findCountryByCode("US");
		customer.setCountry(defaultCountry);
		println("Fix Country: "+customer.getCountry());
	} 
	
	String siteId = customer.getCountry().getCmsSiteId();
	
	if (customer.getIsAccountPayment() == null){
	
		if(StringUtils.isNotBlank(siteId) && sitesHasCardPayment.contains(siteId) && "TCIUSA".equals(siteId)){
			customer.setIsAccountPayment(Boolean.FALSE);
		} else {
			customer.setIsAccountPayment(Boolean.TRUE);
		}
		println("Fixed Customer: " + customer.getUid());
		modelService.save(customer);
	}
	
}
