import model.Classroom;
import model.Student;
import helpers.Message;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        boolean isExited = false;
        Message message = new Message();
        Classroom classroom = new Classroom();
        Scanner scanner = new Scanner(System.in);

        while (!isExited) {
            System.out.println("Selamat Datang di Mini-SALAM (CLI Version)");
            System.out.println();
            System.out.println("Silahkan pilih menu:");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Keluar");

            System.out.print("Ketikkan nomor pilihan: ");

            String choice = scanner.nextLine();

            switch (choice) {
                // Input Data Mahasiswa
                case "1" -> {
                    String name;
                    String email;
                    String nim;
                    String phone;


                    System.out.print("Masukkan Nama Lengkap: ");
                    name = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan No. Telp: ");
                    phone = scanner.nextLine();
                    System.out.print("Masukkan Email (Opsional): ");
                    email = scanner.nextLine();

                    if (name.isEmpty() || nim.isEmpty() || phone.isEmpty()) {
                        message.formatMessage("Nama, NIM, dan No. Telp tidak boleh kosong.");
                        break;
                    }

                    classroom.create(new Student(name, nim, email, phone));

                    message.formatMessage("Data berhasil disimpan.");

                }

                // Print Mahasiswa
                case "2" -> {

                    message.formatMessage("Jumlah mahasiswa: " + classroom.getSize());


                    for (Student student: classroom.getStudents()) {

                        student.print();

                    }

                    message.formatMessage("");
                }

                case "3" -> {

                    System.out.print("Cari nama/NIM/email/telp: ");
                    String term = scanner.nextLine();

                    ArrayList<Student> students = classroom.search(term);

                    if (students.size() == 0) {
                        message.formatMessage("Maaf, data tidak ditemukan :(");
                        break;
                    }

                    for (Student student: students) {
                        student.print();
                    }

                }

                // Keluar
                case "4" -> {
                    String exit_confirmation;


                    System.out.print("Yakin ingin keluar? [y/n]: ");
                    exit_confirmation = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if (exit_confirmation.equals("y") || exit_confirmation.equals("yes")) {
                        message.formatMessage("Terima kasih telah berkunjung! Sampai jumpa lagi :)");
                        isExited = true;

                    } else {

                        message.formatMessage("");
                    }
                }


                // Pilihan Tidak Ditemukan
                default -> message.formatMessage("Pilihan menu tidak ditemukan :(");
            }


        }
    }
}