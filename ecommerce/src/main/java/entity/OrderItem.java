package entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
	
    @ManyToOne
    @JoinColumn(name="order_id", nullable = false)
    private Order order;
    
    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;
    
    private int quantity;
    
    private BigDecimal price;

	public OrderItem(UUID id, Order order, Product product, int quantity, BigDecimal price) {
		this.id = id;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItem() {
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
    
    
	
}
