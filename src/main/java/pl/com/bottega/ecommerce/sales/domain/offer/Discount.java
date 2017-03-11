package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
	
	public Money discount;
	public String discountCause;
	
	public Discount(String discountCause, Money discount) {
		this.discountCause = discountCause;
		this.discount = discount;
	}
}
