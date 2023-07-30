import java.util.Date;

public class Repositories extends UserRepo {
    private String repoName;
    private int typeOfAppId; // Foreign Key
    private String url;
    private int companyId; // Foreign Key
    private Date createdDate;

    // Constructor
    public Repositories(int userRepoId, int userId, int repoId, String repoName, int typeOfAppId, String url, int companyId, Date createdDate) {
        super(userRepoId, userId, repoId);
        this.repoName = repoName;
        this.typeOfAppId = typeOfAppId;
        this.url = url;
        this.companyId = companyId;
        this.createdDate = createdDate;
    }

    // Getters and setters
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public int getTypeOfAppId() {
        return typeOfAppId;
    }

    public void setTypeOfAppId(int typeOfAppId) {
        this.typeOfAppId = typeOfAppId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}