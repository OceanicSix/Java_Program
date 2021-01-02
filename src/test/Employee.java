package test;

public class Employee {
    String type;
    int num;
    String name;

    public Employee(String type, int num, String name) {
        this.type = type;
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Employee type is %s, Employee num is %d, Employee name is %s",type,num,name);
    }


}