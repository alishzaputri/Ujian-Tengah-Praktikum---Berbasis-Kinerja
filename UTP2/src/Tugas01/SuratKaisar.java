package Tugas01;

import java.util.Scanner;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        int geser = input.nextInt();
        System.out.print(suratKaiser(teks,geser));
    }

    static String suratKaiser(String text, int shift) {
        String ciphertext = "";
        char alphabet;
        for (int i = 0; i < text.length(); i++) {
            alphabet = text.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }

        }
        return ciphertext;
    }
}

