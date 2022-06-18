import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama: ALISHZA PUTRI RAHMADINA");
        System.out.println("NIM: 215150700111013");

        System.out.println("--------------------------------------------------");
        System.out.println("Selamat datang di game Defend FILKOM ! ");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        System.out.print("Silahkan pilih karakter yang anda inginkan : ");
        System.out.println("\n1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");
        System.out.print("Pilihan Anda : ");
        int pilih = 0;

        try {
            pilih = input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Tolong masukkan angka ! ");
            System.out.print("Silahkan pilih karakter yang anda inginkan : ");
            System.out.println("\n1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            System.out.print("Pilihan Anda : ");
            input.nextLine();
            pilih = input.nextInt();
        }
        input.nextLine();

        if (pilih != 1 && pilih != 2 && pilih != 3){
            System.out.println("Silahkan input angka 1/2/3 untuk memilih karakter!");
            System.out.print("Silahkan pilih karakter yang anda inginkan : ");
            System.out.println("\n1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            System.out.print("Pilihan Anda : ");
            try {
                pilih = input.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Silahkan input angka 1/2/3 untuk memilih karakter!");
                System.out.print("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("\n1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                System.out.print("Pilihan Anda : ");
                pilih = input.nextInt();
            }
            input.nextLine();
        }

        ArrayList<Character> role = new ArrayList<>();

        if (pilih == 1){
            role.add(new Magician());
        }
        else if (pilih == 2){
            role.add(new Healer());
        }
        else if (pilih == 3){
            role.add(new Warrior());
        }

        role.add(new Titan());

        System.out.println("Selamat datang, " + nama + " !");

        System.out.println("------------ STATUS ------------");
        info(role.get(0));

        int i = 1;
        do {
            System.out.println("============ TURN " + i + " ============");
            if (role.get(0).attack()) {
                role.get(1).receiveDamage(role.get(0).getAttack());
            }
            i++;
            System.out.printf("%-20s: %d%n", "Enemy's HP", role.get(1).getHP());
            System.out.printf("%-20s: %d%n", nama + "'s HP", role.get(0).getHP());
            if (role.get(1).getHP() == 0)
                break;

            System.out.println("============ TURN " + i + " ============");
            if (role.get(0) instanceof Healer) {
                System.out.println("Menggunakan skill Heal!");
                ((Healer) role.get(0)).heal();
            }

            if (role.get(1).attack()) {
                role.get(0).receiveDamage(role.get(1).getAttack());
            }
            System.out.printf("%-20s: %d%n", "Enemy's HP", role.get(1).getHP());
            System.out.printf("%-20s: %d%n", nama + "'s HP", role.get(0).getHP());
            i++;
        }
        while(role.get(0).getHP() != 0 && role.get(1).getHP() != 0);
        System.out.println("=================================");
        if (role.get(0).getHP() == 0)
            System.out.println(nama + " Kalah");
        else
            System.out.println(nama + " Menang");

        System.out.println("");

        System.out.println("============ PLAYER ============");
        System.out.println("------------ STATUS ------------");
        info(role.get(0));
        System.out.println("============ MUSUH =============");
        System.out.println("------------ STATUS ------------");
        info(role.get(1));
    }

    static void info(Character role){
        Class player = role.getClass();
        System.out.printf("%-20s: %s%n", "Role", player.getSimpleName() );
        role.info();
    }
}
