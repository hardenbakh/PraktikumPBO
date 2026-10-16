package UTS.SoalNo3;

public class Main {
    public static void main(String[] args) {
        UserProfile profileCustomer = new UserProfile(1, "bawal123", "Bakhtiar", 19, "Muqri@mail.com", "kartuTandaPenduduk.jpg");
        Customer customer = new Customer(profileCustomer);
        
        customer.logIn(1, 1386);
        customer.applyVerification("ktp.png");
        customer.profile.showDocuments();

        System.out.println();

        // Membuat profil untuk Admin
        UserProfile profileAdmin = new UserProfile(123, "sandi123", "bagaskara", 16, "bagas@mail.com", "admin.pdf");
        Admin admin = new Admin(profileAdmin);

        admin.logIn(123, 67577);
        admin.retrieveComplain();
        admin.verifyUser(customer);
        admin.logOut();
    }
}
