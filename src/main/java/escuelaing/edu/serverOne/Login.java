package escuelaing.edu.serverOne;


public class Login {

    private static CacheDB cache;

    public Login() {
        cache=new CacheDB();
    }

    public boolean validateUser(String name, String password){
           boolean isUser= cache.existUser(name);
           boolean validPassword = false;
           if (isUser){
                validPassword=cache.getPassword(name).equals(password);
           }
           return validPassword;
    }

}
