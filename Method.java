public class Method {

    public static void main(String[] args){

        String name = "Jash";

        happyBirthday(name);
        happyBirthday(name);
        happyBirthday(name);

    }
    static void happyBirthday(String name){

        System.out.println("Happy Birthday to You!");
        System.out.println("Happy Birthday to You!");
        System.out.printf("Happy Birthday to dear %s!",name);
        System.out.println();
        System.out.println("Happy Birthday to You!");
        System.out.println();

    }
}
