import java.util.Date;
import java.util.List;

public class PurchaseOrder {

	private Long id;
	public PurchaseOrder(Long id, Date orderDate, Date createdDate, Integer numberOfItems, Double totalAmount,
			String customerName, String mobileNumber) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.createdDate = createdDate;
		this.numberOfItems = numberOfItems;
		this.totalAmount = totalAmount;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}

	private Date orderDate;
	private Date createdDate;
	private Integer numberOfItems;
	private Double totalAmount;
	private String customerName;
	private String mobileNumber;
	private List<OrderLine> orderLineList;

	public PurchaseOrder() {
		super();
	}

	public PurchaseOrder(Long id, Date orderDate, Date createdDate, Integer numberOfItems, Double totalAmount,
			String customerName, String mobileNumber, List<OrderLine> orderLineList) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.createdDate = createdDate;
		this.numberOfItems = numberOfItems;
		this.totalAmount = totalAmount;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.orderLineList = orderLineList;
	}

	public PurchaseOrder(Date orderDate, Date createdDate, Integer numberOfItems, Double totalAmount,
			String customerName, String mobileNumber, List<OrderLine> orderLineList) {
		super();
		this.orderDate = orderDate;
		this.createdDate = createdDate;
		this.numberOfItems = numberOfItems;
		this.totalAmount = totalAmount;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.orderLineList = orderLineList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<OrderLine> getOrderLineList() {
		return orderLineList;
	}

	public void setOrderLineList(List<OrderLine> orderLineList) {
		this.orderLineList = orderLineList;
	}

}
