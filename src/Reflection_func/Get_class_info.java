package Reflection_func;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class variable_info {
    private String q = "abc";

    public void func() {

    }

    public static void main(String[] args) throws Exception {
        variable_info a = new variable_info();
        Class c = variable_info.class;
        System.out.println(c.getName()); // Class info


        Field[] field1 = c.getFields();   // Variable info
        for (Field field : field1) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers));

        }

        Method[] method1 = c.getDeclaredMethods();// Method info
        for (Method method : method1) {
            System.out.println(method.getName());
        }


    }
}

