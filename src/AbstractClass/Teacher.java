package AbstractClass;

import java.util.Arrays;

public class Teacher extends User{
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    public Teacher() {
    }

    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects, int sizeOfSubjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }
    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
    @Override
    String getUserData() {
        return "ID: " + getId() + " LOGIN: " + getLogin() + " PASSWORD: " + getPassword() + " NICKNAME: " + getNickName() + " STATUS: " + getStatus();
    }
    void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }
}