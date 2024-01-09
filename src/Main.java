//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int length = 10; // specify the desired length of the password
        String password = passwordGenerator.generatePassword(length);
        System.out.println("parameter method password: " + password);
        String password2 = passwordGenerator.generatePassword();
        System.out.println("default constructor password: " + password2);
    }
}