import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO implements IItemDAO {

	public static final String ITEM_BY_ID = "SELECT * FROM ITEMS WHERE itemId = ?";
	static final String ALL_ITEMS = "SELECT * FROM ITEMS";

	public List<Item> getAllItems() {

		Connection conn = null;
		List<Item> list = null;

		try {
			conn = DbConnection.getConnection();

			PreparedStatement stmt = conn.prepareStatement(ALL_ITEMS);

			ResultSet rs = stmt.executeQuery();
			list = new ArrayList<Item>();

			while (rs.next()) {
				Item item = null;

				Long id = rs.getLong("id");
				String name = rs.getString("name");
				Integer availableQuantity = rs.getInt("available_quantity");
				Double price = rs.getDouble("price");

				item = new Item(id, name, availableQuantity, price);

				list.add(item);

			}

		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println("an error has occured");
			e.printStackTrace();
		}

		return list;
	}

	public Item getItemById(Integer itemId) throws ClassNotFoundException, IOException {

		Connection conn = null;

		Item item = new Item();

		PreparedStatement stmt = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareStatement(ITEM_BY_ID);
			ResultSet rs = stmt.executeQuery();

			Long id = rs.getLong("id");
			String name = rs.getString("name");
			Integer availableQuantity = rs.getInt("available_quantity");
			Double price = rs.getDouble("price");

			item = new Item(id, name, availableQuantity, price);

			return item;

		} catch (SQLException e) {
			System.out.println("sql db error");
			e.printStackTrace();
		}

		return item;
	}

}
