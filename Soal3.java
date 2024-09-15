import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
//        String[] perWord = new String[100];
        int counter = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Contoh camelCase: letGodDoTheRest");
        System.out.println("Masukkan kata dalam bentuk camelCase: ");
        String userIn = input.nextLine();

        for (int i = 0; i < userIn.length(); i++) {
            if (Character.isUpperCase(userIn.charAt(i))) {
                counter++;
            }
        }

        System.out.print("Banyak kata yang digabung dalam camelCase: " + counter);
    }
}
