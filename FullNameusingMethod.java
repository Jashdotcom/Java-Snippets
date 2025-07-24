public class FullNameusingMethod {

    public static void main(String[] args){

        String fullName = "Spongebob Squarepants";
        System.out.println(fullName);
    }
    static String getfullName(String first , String last){
        return first + " " + last;
    }
}
