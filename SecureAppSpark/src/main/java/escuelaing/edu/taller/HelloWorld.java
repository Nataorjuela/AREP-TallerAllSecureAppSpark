package escuelaing.edu.taller;
/**
 * Hello world!
 *
 */
import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystore/ecikeystore.p12", "123456", null, null);
        port(5000);
        get("/hello", (req, res) -> "Hello World");
    }

}