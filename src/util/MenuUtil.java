package util;

import main.Configuration;
import main.Student;

public class MenuUtil {
    public static void printAllStudents() {
        if(Configuration.students==null){
            System.out.println("You do not have any students.");
            return;
        }
        System.out.println("Students that you have registered: ");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            System.out.println((i + 1) + ".Student \n" + st.getInfo());
        }
    }
    public static void registerStudent() {
        int count = InputUtil.enterInteger("How many students will you register?");
        Configuration.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Registration");
            Student st = InputUtil.fill();
            Configuration.students[i] = st;
        }
    }
    public static void findStudent(){
        String find = InputUtil.enterString("Enter name or surname that you want to find:");
        for(int i=0;i<Configuration.students.length; i++){
            Student st=Configuration.students[i];
            if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)){
                System.out.println(st.getInfo());
            }
        }
    }
    public static void updateStudent(){
        int studentPlace = InputUtil.enterInteger("For which student you want to do update?");
        System.out.println("Enter new information: ");
        Student st = InputUtil.fill();
        Configuration.students[studentPlace-1] = st;
        System.out.println(st.getInfo());
    }
}
