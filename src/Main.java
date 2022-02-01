public class Main {

    public static void main(String[] args) {
        System.out.println(introduce("Sheryl"));
        System.out.println("I am " + age() + ".");
        System.out.println(hobbies("Sheryl"));
    }

    private static String introduce(String name) {
        return "Hi, my name is " + name + ".";
    }

    private static int age() {
        return 20;
    }
    
    private static String hobbies(Sring s){
        if (s.equals("Takeyoshi")){
            return "My hobby is playing rugby";
        }
        else {
            return "My hobby is coding";
        }
    }

    // Takeyoshi: make a method to return hobbies, put it in main
    // Jason: make a method to return occupation, put it in main
    // Naoshi: make a method to return nationality, put it in main


}
