import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String args[]) throws IOException, ParseException, InsufficientQuantityException {

		int numItems=0; 

		SimpleDateFormat sdf = new SimpleDateFormat();
		ItemDAO itemDAO = new ItemDAO();
		List<Item> itemList = itemDAO.getAllItems();

		Iterator<Item> itr = itemList.listIterator();

		System.out.format("%-15s %-25s %-25s %-15s\n", "Item ID", "Name", "Available Quantity", "Price");
		while (itr.hasNext()) {
			Item item = itr.next();
			System.out.format("%-15s %-25s %-25s %-15s\n", item.getId(), item.getName(), item.getAvailableQuantity(),
					item.getPrice());
		}

		System.out.println("Creating new purchase order...");
		System.out.println("Enter Customer Name:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String customerName = reader.readLine();
		System.out.println("Enter Contact Number:");
		String mobile = reader.readLine();
		System.out.println("Enter Order Date(yyyy-MM-dd):");
		Date orderDate = sdf.parse(reader.readLine());
		System.out.println("Enter all the Item ID you want to purchase:");
		String purchases = reader.readLine();
		String[] purchaseList = purchases.split(",");
		
		
		System.out.println("Enter number of quantities:");
		String quantity = reader.readLine();
		String[] quantityList = quantity.split(",");
		
		
		
		
		
		
		


		
		
		
		
		
		
		
	}

}