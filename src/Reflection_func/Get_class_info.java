package Reflection_func;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class variable_info {
    public String q = "abc";

    private void func() {
        System.out.println("123");
    }

    public static void main(String[] args) throws Exception {
        variable_info a = new variable_info();
        Class c = variable_info.class;
        System.out.println(c.getName()); // Class info


        Field[] field1 = c.getDeclaredFields();   // getDeclaredFields() will
        // show both private and public Variable info; getFields() will only show public
        //variable info
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

