public class Loader {
    public static void main(String[] args) {
        char ch1 = 'R';
        char ch2 = 'e';
        char ch3 = 'g';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {
        String result = "";
        switch (ch) {
            case 'r':
                result = "Stop drive";

                break;
            case 'e':
                result = "Get ready to go";
                break;
            case 'g':
                result = "We can go";
                break;

        }


        return result;
    }
}


