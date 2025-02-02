public class Password {
    private static String passwordGenerator(){
        int maximumCharacters = 8;
        String[] characters = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "a", "b", "c", "d", "e", "f" ,"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "z", "y"};
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < maximumCharacters; i++) {
            int position = (int) (Math.random() * characters.length);
            password.append(characters[position]);
        }
        return password.toString();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Password Generator.");
        System.out.println("There is your password: "+ passwordGenerator());
    }
}