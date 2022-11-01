package escuelaing.edu.serverOne;

import escuelaing.edu.serverTwo.HttpConnectionExample;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class LoginService {
    private static Login login;

    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        //secure("keystore/keyserverone.p12", "123456", null, null);


        staticFileLocation("/static");
        port(getPort());
        Login login=new Login();

        get("/saludo", (req, res) -> {
            String name=req.queryParams("name");
            System.out.println("name:"+name);
            String password=req.queryParams("pswd");
            System.out.println("pswd:"+password);

            boolean validLogin = login.validateUser(name,password);
            System.out.println("valid:"+validLogin);
            if(validLogin){
                return HttpConnectionExample.connect(name);

            }
            return "Usuario o Contraseña no válida";
        });


    }


    private static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
