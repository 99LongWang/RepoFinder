import java.util.Date;

public class RepoType extends Repositories {
    private int repoTypeId; // Foreign Key
    private String typeDesc;

    // Constructor
    public RepoType(int userRepoId, int userId, int repoId, String repoName, int typeOfAppId, String url, int companyId, Date createdDate, int repoTypeId, String typeDesc) {
        super(userRepoId, userId, repoId, repoName, typeOfAppId, url, companyId, createdDate);
        this.repoTypeId = repoTypeId;
        this.typeDesc = typeDesc;
    }

    // Getters and setters
    public int getRepoTypeId() {
        return repoTypeId;
    }

    public void setRepoTypeId(int repoTypeId) {
        this.repoTypeId = repoTypeId;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}