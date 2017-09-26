import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderDAO implements IPurchaseOrderDAO {

	public static final String INSERT_PO="insert into PURCHASE_ORDER (order_date, created_date, number_of_items, total_amount,customer_name, mobile_number) "
			+ "VALUES (?, ?, ?, ?, ?, ?)"; 
	
	public static final String ALL_PO = "SELECT * FROM PURCHASE_ORDER";
	
	public static final String DELETE_PO = "DELETE * FROM PURCHASE_ORDER WHERE id = ?";



	@Override
	public Long createPurchaseOrder(PurchaseOrder purchaseorderObj) {

		Connection conn = null;
		Long id = null; 

		PreparedStatement stmt = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareStatement(INSERT_PO);
			stmt.setDate(1, (Date) purchaseorderObj.getOrderDate());
			stmt.setDate(2, (Date) purchaseorderObj.getCreatedDate());
			stmt.setInt(3, purchaseorderObj.getNumberOfItems());
			stmt.setDouble(4, purchaseorderObj.getTotalAmount());
			stmt.setString(5, purchaseorderObj.getCustomerName());
			stmt.setString(6, purchaseorderObj.getMobileNumber());

			 stmt.executeUpdate();

			ResultSet rs_key = stmt.getGeneratedKeys(); 
			
			if(rs_key.first())
			{ id = rs_key.getLong("id");}
			
			
		
			
				

			return id;

		} catch (SQLException | ClassNotFoundException | IOException e ) {
			System.out.println("sql db error");
			e.printStackTrace();
		}
		return id;

	}
	
	public List<PurchaseOrder> getAllPurchaseOrder(){
		

		

			Connection conn = null;
			List<PurchaseOrder> list = null;

			try {
				conn = DbConnection.getConnection();

				PreparedStatement stmt = conn.prepareStatement(ALL_PO);

				ResultSet rs = stmt.executeQuery();
				list = new ArrayList<PurchaseOrder>();

				while (rs.next()) {
					PurchaseOrder purchaseorder = null;

					Long id = rs.getLong("id");
					Date od = rs.getDate("orderDate");
					Date cd = rs.getDate("createdDate");
					Integer numberOfItems = rs.getInt("numberOfItems");
					Double total = rs.getDouble("totalAmount");
					String name = rs.getString("customerName");
					String mobile = rs.getString("mobile_number");


					purchaseorder = new PurchaseOrder(id, od, cd, numberOfItems, total, name, mobile);

					list.add(purchaseorder);

				}

			} catch (ClassNotFoundException | SQLException | IOException e) {
				System.out.println("an error has occured");
				e.printStackTrace();
			}

			return list;
		}
		
	}




