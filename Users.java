public class Users extends UserRepo {
    private String userName;
    private String email;
    private String phoneNumber;
    private String loginId;
    private String loginPassword;

    // Constructor
    public Users(int userRepoId, int userId, int repoId, String userName, String email, String phoneNumber, String loginId, String loginPassword) {
        super(userRepoId, userId, repoId);
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.loginId = loginId;
        this.loginPassword = loginPassword;
    }

    // Getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}