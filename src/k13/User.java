package k13;

public class User {
    private String userId;
    private String password;
    private String accessLevel;

    public User(String userId, String password, String accessLevel) {
        this.userId = userId;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
}
