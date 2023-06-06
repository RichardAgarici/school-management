package main;

import util.InputUtil;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Operation Center");
        while (true) {
            int operations = InputUtil.enterInteger("What do you want to do?" +
                    "\n1:Register student" +
                    "\n2:Show all student" +
                    "\n3:Find student" +
                    "\n4:Update student" +
                    "\n0:To Quit");
            if (operations == 1) {
                MenuUtil.registerStudent();
            } else if (operations == 2) {
                MenuUtil.printAllStudents();
            } else if (operations == 3) {
                MenuUtil.findStudent();
            } else if (operations == 4) {
                MenuUtil.updateStudent();
            } else if(operations==0) {
                System.out.println("Quitting from operation");
                break;
            }else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}
