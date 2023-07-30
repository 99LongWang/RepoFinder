import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ViewSortFilter vsf = new ViewSortFilter();
        // Create some list to test.
        List<Repositories> newRepoList = new ArrayList<>();
        List<Repositories> newRepoList2 = new ArrayList<>();
        List<Repositories> newRepoList3 = new ArrayList<>();
        // Create some repositories to test.
        vsf.add(new Repositories(16, 7, 416, "theName", 2, "https://appRepo.com", 1, new Date()));
        vsf.add(new RepoType(45, 4, 177, "App1", 1, "https://app1.com", 3, new Date(), 1, "Game"));
        vsf.add(new RepoType(91, 2, 211, "App3", 1, "https://app2.com", 2, new Date(), 2, "TestType"));
        vsf.add(new Companies(36, 9, 344, "App2", 2, "https://app3.com", 2, new Date(), "Company", "513123456", "company@gmail.com", "Location"));
        // Test view
        vsf.view();
        // Test sort
        newRepoList = vsf.sortByRepoName();
        System.out.println("After sort by repoName, newRepoList is: ");
        for (Repositories repo: newRepoList) {
            System.out.println(repo.getRepoName());
        }
        // Test filter
        String str = "TestType";
        System.out.println("After filter by repoType, newRepoList2 is: ");
        newRepoList2 = vsf.filterByType(str);
        for (Repositories repo: newRepoList2) {
            System.out.println(repo.getRepoName());
        }
        // Test search and sort
        String keyword = "App";
        System.out.println("After search and sort, newRepoList3 is: ");
        newRepoList3 = vsf.searchAndSort(keyword);
        for (Repositories repo: newRepoList3) {
            System.out.println(repo.getRepoName());
        }
    }
}
