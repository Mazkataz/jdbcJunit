
public class OrderLine {
	private Long id;
	private Item item;
	PurchaseOrder purchaseOrder;
	Double price;
	Integer quantity;

	public OrderLine() {
		super();
	}

	public OrderLine(Item item, PurchaseOrder purchaseOrder, Double price, Integer quantity) {
		super();
		this.item = item;
		this.purchaseOrder = purchaseOrder;
		this.price = price;
		this.quantity = quantity;
	}

	public OrderLine(Long id, Item item, PurchaseOrder purchaseOrder, Double price, Integer quantity) {
		super();
		this.id = id;
		this.item = item;
		this.purchaseOrder = purchaseOrder;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
