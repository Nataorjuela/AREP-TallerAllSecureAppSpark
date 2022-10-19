package escuelaing.edu.serverOne;

import static spark.Spark.*;

public class LoginService {


    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystore/ecikeystore.p12", "123456", null, null);
        port(getPort());


        get("/login",(req,res)->{
            res.redirect("index.html");
            return null;
        });
    }

    private static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
