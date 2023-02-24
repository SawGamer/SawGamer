package TLOSUNG._420_PasswortGueltigkeit;

public class Test {

    public static void main(String[] args) {
        PasswortGueltigkeit passwordCheck = new PasswortGueltigkeit();

        String goodPasword = "SAgfdaFd5468%^#";
        String badPasword = "password1234";
        String[] passwords = {goodPasword, badPasword};
        for(String password : passwords){
            System.out.print(password + " | ");
            if(passwordCheck.isPasswordValid(password)){
                System.out.println("Password is good");
            } else {
                System.out.println("Your password is bad and you should feel bad.");
            }
        }

    }
}
