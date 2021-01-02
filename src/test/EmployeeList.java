package test;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class EmployeeList {
    ArrayList<Employee> list;

    public EmployeeList() {
        list = new ArrayList<>();


    }

    public boolean readFile(String filename) {
        boolean isSuccessful = false;
        try {
            FileReader scanFile = new FileReader(filename);

            try {
                Scanner parser = new Scanner(scanFile);
                while (parser.hasNextLine()) {
                    String[] lineStr = parser.nextLine().split(",");
                    Employee curEmp = new Employee(lineStr[0], Integer.parseInt(lineStr[1]), lineStr[2]);
                    list.add(curEmp);

                }
                isSuccessful = true;
            }
            finally {
                scanFile.close();
            }


        }
        catch (Exception e) {
            System.out.println("IO error occurs");
            isSuccessful = false;
        }

        return isSuccessful;

    }


    public boolean writeFile(String filename) {
        boolean isSuccessful=false;
        try {
            PrintWriter outFile = new PrintWriter(filename);
            try {
                for (Employee elem : list) {
                    outFile.println(String.format("%s,%d,%s", elem.type, elem.num, elem.name));
                }

                isSuccessful = true;
            }
            finally {
                outFile.close();
            }
        }
        catch (Exception e){
            System.out.println("IO Error while write to file");
        }
        System.out.println("write to a file is " +isSuccessful);
        return isSuccessful;
    }

    public static void main(String[] args) {
        ;
        EmployeeList aList = new EmployeeList();
        aList.readFile("src\\test\\test.txt");
        for (Employee elem : aList.list) {
            System.out.println(elem);
        }

        aList.writeFile("text.txt");
    }
}