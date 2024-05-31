package R_login_system;

import java.util.HashMap;

public class DB {
    private final HashMap<String, String> loginData = new HashMap<>();

    DB() {
        loginData.put("mohamed", "walid");
        loginData.put("test", "test");
    }

    public HashMap<String, String> getLoginData() {
        return loginData;
    }
}
