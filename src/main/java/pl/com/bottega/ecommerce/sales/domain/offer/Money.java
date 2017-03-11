package pl.com.bottega.ecommerce.sales.domain.offer;

public class Money {
	
	public long value;
	public String currency;
	
	public Money(long value, String currency) {
		this.value = value;
		this.currency = currency;
	}
}