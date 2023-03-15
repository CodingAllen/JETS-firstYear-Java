package k13;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> acl = new HashMap<>();

    UserManager() {
        acl.put("jec001", new User("jec001", "pass001", "A"));
        acl.put("jec002", new User("jec002", "pass002", "B"));
        acl.put("jec003", new User("jec003", "pass003", "A"));
    }

    public String login(User u) {
        if (acl.containsKey(u.getUserId())) {
            if (acl.get(u.getUserId()).getPassword().equals(u.getPassword())) {
                return acl.get(u.getUserId()).getAccessLevel();
            }
        }
        return null;
    }

    public boolean add(User u) {
        if (!acl.containsKey(u.getUserId())) {
            acl.put(u.getUserId(), u);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(User u, String newPassword) {
        User user = acl.get(u.getUserId());
        if (user != null && user.getPassword().equals(u.getPassword())) {
            user.setPassword(newPassword);
            acl.put(user.getUserId(), user);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(String uesrId, String accessLevel) {
        User user = acl.get(uesrId);
        if (user != null) {
            user.setAccessLevel(accessLevel);
            acl.put(user.getUserId(),user);
            return true;
        } else {
            return false;
        }
    }
}
