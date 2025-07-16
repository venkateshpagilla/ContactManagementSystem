import java.util.*;
import java.io.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email;
    }
}

public class ContactManagementSystem {
    static ArrayList<Contact> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadContacts(); // Load contact
