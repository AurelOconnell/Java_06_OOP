public class Classroom {
    
    public static void main(String[] args) {

        Wilder julie = new Wilder("Julie", true);
        Wilder ben = new Wilder("Ben", false);
        Wilder emilie = new Wilder("Emilie", true);
        Wilder arnaud = new Wilder("Arnaud", false);

        System.out.println(julie.whoAmI());
        System.out.println(ben.whoAmI());
        System.out.println(emilie.whoAmI());
        System.out.println(arnaud.whoAmI());
    }
}
