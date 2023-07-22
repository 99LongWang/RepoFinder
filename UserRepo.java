public class UserRepo {
    private int userRepoId; // Primary Key
    private int userId; // Foreign Key
    private int repoId; // Foreign Key

    // Constructor
    public UserRepo(int userRepoId, int userId, int repoId) {
        this.userRepoId = userRepoId;
        this.userId = userId;
        this.repoId = repoId;
    }


    public int getUserRepoId() {
        return userRepoId;
    }


    public int getUserId() {
        return userId;
    }


    public int getRepoId() {
        return repoId;
    }
}
