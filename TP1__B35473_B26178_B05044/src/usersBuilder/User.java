package usersBuilder;

import java.io.Serializable;
import java.util.Calendar;

/**
 * The user object with its data, get and set
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class User implements Serializable {

    private String id; // user shcedule
    private String name; // user name
    private String email; // user email
    private String password; // user email password
    private Calendar birthdate; // user birthdate
    private String phoneNumber; // user phoneNumber

    public User() {
    }

    public User(String id, String name, String email, String password, Calendar birthdate, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nUsuario{ " + "Schedule: " + id + ", name: " + name + "\nemail: " + email + ", password: " + password + ", birthdate: " + birthdate.getTime().toLocaleString() + ", phoneNumber: " + phoneNumber + '}';
    }

}
