
import java.util.HashMap;
import java.util.Map;

public class LoginService {
    Map<String, String> map = new HashMap<>();
    public LoginService() {
        map.put("eleven","eleven@123");
        map.put("max","max@123");
        map.put("steve","steve@123");
        map.put("lucas","lucas@123");
    }
    public boolean validate(String username,String pwd) {
        if(map.containsKey(username)){
            String originalPassword = map.get(username);
            if(originalPassword.equals(pwd)){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}