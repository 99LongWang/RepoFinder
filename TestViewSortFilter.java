import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestViewSortFilter {
    private ViewSortFilter viewSortFilter;
    private Repositories repo1;
    private Repositories repo2;
    private Repositories repo3;

    @BeforeEach
    public void setUp() {
        viewSortFilter = new ViewSortFilter();
        repo1 = new RepoType(1, 1, 1, "repoA", 1, "url", 1, new Date(), 1, "descriptionA");
        repo2 = new RepoType(1, 1, 1, "repoB", 1, "url", 1, new Date(), 1, "descriptionB");
        repo3 = new Companies(1, 1, 1, "repoC", 1, "url", 1, new Date(), "company", "1234567890", "techVision.com", "location");
        viewSortFilter.add(repo1);
        viewSortFilter.add(repo2);
        viewSortFilter.add(repo3);
    }

    @Test
    public void testSortByRepoName() {
        List<Repositories> sortedList = viewSortFilter.sortByRepoName();
        assertEquals(sortedList.get(0).getRepoName(), "repoA");
        assertEquals(sortedList.get(1).getRepoName(), "repoB");
        assertEquals(sortedList.get(2).getRepoName(), "repoC");
    }

    @Test
    public void testFilterByType() {
        List<Repositories> filteredList = viewSortFilter.filterByType("descriptionA");
        assertEquals(filteredList.size(), 1);
        assertEquals(filteredList.get(0).getRepoName(), "repoA");
    }

    @Test
    public void testSearchAndSort() {
        List<Repositories> searchAndSortList = viewSortFilter.searchAndSort("repo");
        assertEquals(searchAndSortList.size(), 3);
        assertEquals(searchAndSortList.get(0).getRepoName(), "repoA");
        assertEquals(searchAndSortList.get(1).getRepoName(), "repoB");
        assertEquals(searchAndSortList.get(2).getRepoName(), "repoC");
    }
}