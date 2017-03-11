package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

class Product {
	
	// product
	public String id;
	public BigDecimal price;
	public String name;
	public Date snapshotDate;
	public String type;
	
	public Product(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate, String productType) {
		this.id = productId;
		this.price = productPrice;
		this.name = productName;
		this.snapshotDate = productSnapshotDate;
		this.type = productType;
	}
	
	public String getProductId() {
		return id;
	}
	
	public BigDecimal getProductPrice() {
		return price;
	}
	
	public String getProductName() {
		return name;
	}
	
	public Date getProductSnapshotDate() {
		return snapshotDate;
	}
	
	public String getProductType() {
		return type;
	}
}
