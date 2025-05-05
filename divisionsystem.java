import java.util.Scanner;

class Division {
    private int NuM1;
    private int NuM2;
    public int getNuM1() {
        return NuM1;
    }

    public void setNuM1(int nuM1) {
        this.NuM1 = nuM1;
    }
    public int getNuM2() {
        return NuM2;
    }

    public void setNuM2(int nuM2) {
        this.NuM2 = nuM2;
    }
    public void performDivision() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 9; i >= 0; i--) {
            setNuM1(10);
            setNuM2(i);
            try {
                int result = getNuM1() / getNuM2();
                System.out.println(getNuM1() + " / " + getNuM2() + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide " + getNuM1() + " by " + getNuM2() + " (Division by Zero)");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Division div = new Division();
        div.performDivision();
    }
}
