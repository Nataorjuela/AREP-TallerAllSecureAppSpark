package escuelaing.edu.serverOne;

import java.util.HashMap;
import java.util.Map;

public class CacheDB {
    private static Map<String,String> users=new HashMap<>();
    public CacheDB() {
        users.put("natalia","password1");
        users.put("claudia","password2");
        users.put("juan","password3");
    }

    public String getPassword(String user){
        return users.get(user);
    }

    public boolean existUser(String user){
        return users.containsKey(user);
    }

    public void addUser(String name,String password){
        users.put(name,password);
    }


}
