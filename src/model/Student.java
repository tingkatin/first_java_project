package model;

public class Student {

    private final String name;
    private final String nim;
    private final String email; // NULLABLE

    private final String phone;

    public Student(String name, String nim, String email, String phone) {
        this.name = name;
        this.email = email;
        this.nim = nim;
        this.phone = phone;
    }


    public String getName() {
        return this.name;
    }

    public String getNim() {
        return this.nim;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }


    public void print() {
        System.out.println("Nama: " + this.name);

        System.out.println("NIM: " + this.nim);

        System.out.println("No. Telp: " + this.phone);

        System.out.println("Email: " + this.email);

        System.out.println();
    }

}
