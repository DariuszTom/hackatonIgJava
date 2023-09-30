package hackatonIgJava.Model;

public class User {
    private String username;
    private String password;
    private Pacient pacient;

    public User(String username, String password, Pacient pacient) {
        this.username = username;
        this.password = password;
        this.pacient = pacient;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Pacient getPacient() {
        return pacient;
    }
}