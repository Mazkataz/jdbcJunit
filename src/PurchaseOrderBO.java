import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class PurchaseOrderBO {

	public Integer createPurchaseOrder(List<Item> items, Integer[] quantity, String customerName, String mobileNumber,
			Date orderDate) throws InsufficientQuantityException {

		if (items.size() != quantity.length) {
			throw new InsufficientQuantityException("the number quantities should match the number of purchases");

		}

		// call error if quantity doesnt match
		for (int x = 0; x < items.size(); x++) {
			if (quantity[x] != items.get(x).getAvailableQuantity()) {
				throw new InsufficientQuantityException("the number quantities should match the number of purchases");
			}

		}

		PurchaseOrderDAO purchaseOrder = new PurchaseOrderDAO();

		List<OrderLine> OL = new ArrayList<OrderLine>();

		Double total = 0.0;

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		PurchaseOrder po = new PurchaseOrder(orderDate, date, items.size(), total, customerName, mobileNumber, OL);

		Long id = purchaseOrder.createPurchaseOrder(po);

		return 0;
	}

	public List<PurchaseOrder> getAllPurchaseOrder() {

		PurchaseOrderDAO purDao = new PurchaseOrderDAO();

		List<PurchaseOrder> list = purDao.getAllPurchaseOrder();

		return list;

	}
	
	public void removeItemFromPurchaseOrder(long itemId) {
		
		
		
		
		
		
	}

}


