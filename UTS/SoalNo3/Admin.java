package UTS.SoalNo3;

public class Admin extends User{

    public Admin(UserProfile profile) {
        super(profile);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Admin memperbarui detail kendaraan ID: " + vehicleId);
    }

    public void addVehicle() {
        System.out.println("Admin berhasil menambahkan kendaraan baru.");
    }

    public void retrieveComplain() {
        System.out.println("Admin mengambil daftar keluhan.");
    }

    public void verifyUser(Customer customer) {
        System.out.println("Admin memverifikasi akun customer.");
    }
}
