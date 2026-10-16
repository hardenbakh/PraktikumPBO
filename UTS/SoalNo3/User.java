package UTS.SoalNo3;

public class User {
    public UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public boolean logIn(int userId, int password) {
        System.out.println("User dengan ID " + userId + " berhasil login.");
        return true;
    }

    public void recoverPassword() {
        System.out.println("Link pemulihan sandi telah dikirim.");
    }

    public void logOut() {
        System.out.println("User berhasil logout.");
    }
}