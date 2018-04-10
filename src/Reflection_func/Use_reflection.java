package Reflection_func;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Use_reflection {
    public static void name() {

    }

    public static void main(String[] args) throws Exception {
        variable_info a = new variable_info();
        Field f = a.getClass().getDeclaredField("q");
        f.setAccessible(true); //set the q's modifier to public
        f.set(a, "test_reflection"); // change q's value in a
        String b = (String) f.get(a);
        System.out.println(b);

    }
}