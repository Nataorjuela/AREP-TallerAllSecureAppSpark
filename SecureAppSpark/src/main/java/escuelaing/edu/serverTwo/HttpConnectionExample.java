package escuelaing.edu.serverTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnectionExample {
    //URL poner link de  maquina aws
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "http://ec2-44-208-32-187.compute-1.amazonaws.com:4242/saludo?name=";

    public static String connect(String name) throws IOException {

        URL obj = new URL(GET_URL+name);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        String res ="";
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            //System.out.println(response.toString());
            res=response.toString();

        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return res;
    }

}
