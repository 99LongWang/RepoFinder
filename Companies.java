import java.util.Date;

public class Companies extends Repositories {
    private String companyName;
    private String phoneNumber;
    private String email;
    private String location;

    // Constructor
    public Companies(int userRepoId, int userId, int repoId, String repoName, int typeOfAppId, String url, int companyId, Date createdDate, String companyName, String phoneNumber, String email, String location) {
        super(userRepoId, userId, repoId, repoName, typeOfAppId, url, companyId, createdDate);
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.location = location;
    }

    // Getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}