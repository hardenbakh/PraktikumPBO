package UTS.SoalNo3;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        this.profile.doc = doc; 
        System.out.println("Customer mengajukan verifikasi menggunakan dokumen: " + doc);
        this.verificationStatus = true;
    }
}