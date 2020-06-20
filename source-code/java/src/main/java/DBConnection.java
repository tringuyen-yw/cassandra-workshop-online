import java.nio.file.Path;
import java.nio.file.Paths;

public class DBConnection {
	// How to get secure-connect-killrvideocluster.zip ?
	// - login: https://astra.datastax.com/
	// - click on databases and selected the DB
	// - in "Connection Details" section, click on "Download secure connect bundle"
	// (see screenshot src/main/resources/secure-connect-killrvideocluster.zip)
	private static String connectionPath = "./src/main/resources/secure-connect-killrvideocluster.zip";
	private static String username = "KVUser";
	private static String password = "KVPassword";

	public static Path getConnectionPath() {
	  return Paths.get(connectionPath);
	}

	public static String getUsername() {
	  return username;
	}

	public static String getPassword() {
	  return password;
	}
}
