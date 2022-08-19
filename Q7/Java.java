package Q7;

public class Java {
    public static void main(String[] args) {
        String see="Ali Ahmed AL_Saeedi";

        //get first character
        char first_1=see.charAt(0);

        //get last character
        char last=see.charAt(see.length()-1);

        //Remove the first chaeacter
       char first_2=see.charAt(0);

        System.out.println("The First Character = "+first_1);
        System.out.println("The Last Character = "+last);
        System.out.println("remove The first character = "+first_2);
    }
}
