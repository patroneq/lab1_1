package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	
	private BigDecimal discount;
	private String discountCause;
	
	public Discount(String discountCause, BigDecimal discount) {
		this.discountCause = discountCause;
		this.discount = discount;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}

	public String getDiscountCause() {
		return discountCause;
	}
}
