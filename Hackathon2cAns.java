import java.util.Scanner;

public class Hackathon2cAns {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        double total = morningEnergy + eveningEnergy;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy (kWh): ");
        double mEnergy = sc.nextDouble();

        System.out.print("Enter evening energy (kWh): ");
        double eEnergy = sc.nextDouble();

        double res = calculateTotalEnergy(mEnergy, eEnergy);

        System.out.println("Total energy generated = " + res + " kWh");
        
        sc.close();
    }
}