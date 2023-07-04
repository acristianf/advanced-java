public class MainGreeting {
    public static void main(String[] args) {
        GreetingMessage gm = name -> System.out.println("Hello " + name);
        gm.greet("Cristian");
    }
}
