package se.lexicon;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public AppRole getRole() {
        return role;
    }
    public void setRole(AppRole role) {
        this.role = role;
    }
    public boolean equals(Object obj) {
        return false;
    }
    public int hashCode() {
        return 0;
    }
    @Override
    public String toString() {
        return "";
    }
}
