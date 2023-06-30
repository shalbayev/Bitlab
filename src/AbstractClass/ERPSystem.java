package AbstractClass;

public class ERPSystem extends User{
    User[] memory = new User[1000];
    int sizeOfUsers = 0;
    void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

//    void printTeacher(){
//        Teacher t = new Teacher();
//        for (int i = 0; i < sizeOfUsers; i++) {
//            t.getUserData(memory[i]);
//        }
//
//    }void printStudent(){
//        for (int i = 0; i < sizeOfUsers; i++) {
//            System.out.println(memory[i]);
//        }
//
//    }void printUser(int index){
//        if(memory[index]==null){
//            System.out.println("No such user in this index");
//        }else System.out.println(memory[index]);
//    }
    @Override
    String getUserData() {
        return "ID: " + getId() + " LOGIN: " + getLogin() + " PASSWORD: " + getPassword();
    }
}
