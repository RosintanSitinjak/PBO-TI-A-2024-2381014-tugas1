public class Soal1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{4, 8, 12};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Jumlah dari bilangan/elemen: " + sum);
    }
}
