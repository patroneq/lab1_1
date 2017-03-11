package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	
	public BigDecimal discount;
	public String discountCause;
	
	public Discount(String discountCause, BigDecimal discount) {
		this.discountCause = discountCause;
		this.discount = discount;
	}
}
