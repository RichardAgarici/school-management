package util;

import main.Student;

import java.util.Scanner;

public class InputUtil {
    public static int enterInteger(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String enterString(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
    public static Student fill(){
        String name = InputUtil.enterString("Enter Student name: ");
        String surname = InputUtil.enterString("Enter Student surname: ");
        int age = InputUtil.enterInteger("Enter student age name: ");
        String className = InputUtil.enterString("Enter student class name: ");
        return new Student(name, surname, age, className);
    }

}
