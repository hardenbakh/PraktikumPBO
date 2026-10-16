package UTS.SoalNo3;

public class UserProfile {
    private int userid;
    private String password;
    private String name;
    private int age;
    private String emailId;
    public String doc;

    public UserProfile(int userId, String password, String name, int age, String emailId, String doc) {
        this.userid = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }

    public int getUserId() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() { 
        return age;
    }

    public String getEmail() {
        return emailId;
    }

    public void editProfile() {
        System.out.println("Profil pengguna berhasil diperbarui.");
    }

    public void showDocuments() {
        System.out.println("Menampilkan dokumen: " + doc);
    }
}
