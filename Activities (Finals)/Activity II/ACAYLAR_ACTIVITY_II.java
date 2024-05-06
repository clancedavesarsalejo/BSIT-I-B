import java.util.Scanner;

class ACAYLAR_ACTIVITY_II {
    static void feetandinch(double feet) {
        double res = feet * 12;
        System.out.print(res);

    }

    public static void main(String[] args) {
        Scammer sc = new Scanner(System.in);
        System.out.print("Enter the feet: ");
        double feet = sc.nextDouble();
        feetandinch(feet);
    }
}