package Security_manager;


public class program {
    public static final String OPERATION = "my-operation";
    public static void main (String[] args) {
        CustomPermission cpermit=new CustomPermission(OPERATION);
        SecurityManager securityManager = new SecurityManager();
        System.setSecurityManager(securityManager);
        try {

            String javaVersion = System.getProperty("java.version");
            System.err.println(javaVersion);
            if (securityManager != null) {
                securityManager.checkPermission(cpermit);
// program code goes here
                System.out.println("Operation is performed");
            }
        } catch (SecurityException se) {
            System.out.println(se.getMessage());
        }
    }
}