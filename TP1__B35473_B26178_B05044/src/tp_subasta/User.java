package tp_subasta;

import java.util.Calendar;

/**
 *
 * @author robert
 */
public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private Calendar birthday;
    private String phoneNumber;

    public User() {
    }

    public User(String id, String name, String email, String password, Calendar birthday, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
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

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", birthday=" + birthday.getTime().toLocaleString() + ", phoneNumber=" + phoneNumber + '}';
    }

}
