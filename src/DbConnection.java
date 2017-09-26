import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DbConnection {

public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {        
        
		final Properties prop = new Properties();
		final InputStream inputStream = DbConnection.class.getClassLoader()
				.getResourceAsStream(
						"mysql.properties");
		prop.load(inputStream);
		Class.forName(prop.getProperty("db.driver"));
		final Connection connection = DriverManager.getConnection(prop.getProperty("db.url"), 
				prop.getProperty("db.user"), prop.getProperty("db.password"));
		return connection;
		
	}
	
	
}
