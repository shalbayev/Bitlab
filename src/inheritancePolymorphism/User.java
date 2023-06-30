package inheritancePolymorphism;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User() {
    }
    public User(int id, String login, String password, String name, String surname){
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /*    Например, если id= 1, login="zhansayakulbaeva@bk.ru", password= "qwerty12345", name= "Zhansaya", surname= "Kulbaeva", то тогда текст вывода будет:

                "ID: 1 FULL NAME: Zhansaya Kulbaeva LOGIN: zhansayakulbaeva@bk.ru PASSWORD: qwerty12345"*/
    void getData(){
        System.out.println("ID: " + id + " FULL NAME: " + name + " " + surname + " LOGIN: " + login + " PASSWORD: " + password);
    }
}
