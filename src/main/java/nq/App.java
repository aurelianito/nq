/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nq;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        for( String a: args) {
        	System.out.println(a);
        }
    }
}
