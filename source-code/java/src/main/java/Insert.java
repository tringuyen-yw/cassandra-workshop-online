import com.datastax.dse.driver.api.core.DseSession;
import com.datastax.oss.driver.api.core.cql.*;
import java.util.UUID;

public class Insert {
    
    public static void main(String[] args) {

        try (DseSession session = DseSession.builder()
            .withCloudSecureConnectBundle(DBConnection.getConnectionPath())
            .withAuthCredentials(DBConnection.getUsername(), DBConnection.getPassword())
            .build()) {

            session.execute(
                SimpleStatement.builder( "INSERT INTO killrvideo.user_credentials (email, password, userid) VALUES (?,?,?)")
                        .addPositionalValues("hehe@funny.net", "Oh!ThisWorks??!", UUID.fromString("55555555-5555-5555-5555-555555555555"))
                        .build());
            System.out.println("Successful Insert");
        }
        catch(Throwable t) {
            System.out.println("Failed Insert");
            t.printStackTrace();
        }
    }
}
