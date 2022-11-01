package escuelaing.edu;
import static spark.Spark.*;


public class OtherService
{
    public static void main( String[] args )
    {
        staticFileLocation("/static");
        port(getPort());

        get("/saludo", (req, res) -> {
            String name=req.queryParams("name");
            System.out.println("name:"+name);
            String result="hello "+name;
            return result;
        });
    }

    private static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4242;
    }
}
