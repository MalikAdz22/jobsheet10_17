import java.util.Scanner;

public class BioskopWithScanner17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan Anda: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    do {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi sudah ditempati. Silakan pilih kursi lain.");
                        }
                    } while (penonton[baris-1][kolom-1] != null);

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    // fall through to case 2 if user enters "y"
                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 3);
    }
}
