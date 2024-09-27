public class passwordEncrypt {

    public interface Encryptable {
        void encrypt();
        String decrypt();
    }

    public static void main(String[] args) {

        Encryptable hush = new Password("I don't like tomatoes!");
        System.out.println(hush);
        hush.encrypt();
        System.out.println(hush);
        hush.decrypt();
        System.out.println(hush);
        System.out.println();

        hush = new Password("verygoodpassword");
        System.out.println(hush);
        hush.encrypt();
        System.out.println(hush);
        hush.decrypt();
        System.out.println(hush);
    }


    public static class Password implements Encryptable {

        private String password;
        private boolean encrypted;

        public Password(String pw) {
            password = pw;
            encrypted = false;
        }

        public void encrypt() {
            if (!encrypted) {
                password = stringToHex(password);
                encrypted = true;
            }
        }

        public String decrypt() {
            if (encrypted) {
                password = hexToString(password);
                encrypted = false;
            }
            return password;
        }

        public boolean isEncrypted() {
            return encrypted;
        }

        public String toString() {
            return password;
        }

        //https://stackoverflow.com/questions/923863/converting-a-string-to-hexadecimal-in-java

        private String stringToHex(String input) {
            StringBuilder hexString = new StringBuilder();
            for (char c : input.toCharArray()) {
                hexString.append(String.format("%02X", (int) c));
            }
            return hexString.toString();
        }

        private String hexToString(String hexString) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < hexString.length(); i += 2) {
                String hexPair = hexString.substring(i, i + 2);
                result.append((char) Integer.parseInt(hexPair, 16));
            }
            return result.toString();
        }
    }
}

// this program was written with help from example programs provided in an email.
// i made changes to the program to aid my understanding and show that i have understood the layout and functions of the program.
// i have encrypted the secret using hexadecimal to challenge myself to use a different method than what was provided in the example.
