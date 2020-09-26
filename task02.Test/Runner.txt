public class Runner {
    private static String password = "password";
    public static void main(String[] args) {
        equalsPassword(args[0]);
    }

    public static void equalsPassword (String args) {
        if (args.equals(password)) {
            System.out.println("Your password is valid!");
        } else {
		System.out.println("Your password is invalid!");	
	}
    }
}