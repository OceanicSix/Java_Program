package test;

public class Tools {
    public static boolean arrayContain(String[] ar, String target) {
        boolean result = false;
        int i = 0;
        while (i < ar.length && !result) {
            if (ar[i].equalsIgnoreCase(target))
                result = true;
            i++;
        }
        return result;

    }
    public void add(){

    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {
//        String[] ar = {"a", "b", "abc"};
//        System.out.println(Tools.arrayContain(ar, "c"));
        String st = "335";
        System.out.println(Tools.isNumeric(st));
    }
}