import org.junit.Test;
import static org.junit.Assert.*;

public class ViewSortFilterTest {

    @Test
    public void testSortByRepoName() {
        ViewSortFilter vsf = new ViewSortFilter();
        // Add repositories to vsf
        vsf.add(new Repositories(1, 1, 101, "RepoB", 1, "https://repob.com", 1, new Date()));
        vsf.add(new Repositories(2, 2, 102, "RepoC", 1, "https://repoc.com", 2, new Date()));
        vsf.add(new Repositories(3, 3, 103, "RepoA", 1, "https://repoa.com", 3, new Date()));

        List<Repositories> sortedList = vsf.sortByRepoName();

        // Perform assertions to check if the sorting is correct
        assertEquals("RepoA", sortedList.get(0).getRepoName());
        assertEquals("RepoB", sortedList.get(1).getRepoName());
        assertEquals("RepoC", sortedList.get(2).getRepoName());
    }

    @Test
    public void testFilterByType() {
        ViewSortFilter vsf = new ViewSortFilter();
        // Add repositories to vsf
        vsf.add(new RepoType(1, 1, 101, "Repo1", 1, "https://repo1.com", 1, new Date(), 1, "TypeA"));
        vsf.add(new RepoType(2, 2, 102, "Repo2", 1, "https://repo2.com", 2, new Date(), 2, "TypeB"));
        vsf.add(new RepoType(3, 3, 103, "Repo3", 1, "https://repo3.com", 3, new Date(), 3, "TypeA"));

        String str = "TypeA";
        List<Repositories> filteredList = vsf.filterByType(str);

        // Perform assertions to check if the filtering is correct
        assertEquals(2, filteredList.size());
        assertEquals("Repo1", filteredList.get(0).getRepoName());
        assertEquals("Repo3", filteredList.get(1).getRepoName());
    }

    @Test
    public void testSearchAndSort() {
        ViewSortFilter vsf = new ViewSortFilter();
        // Add repositories to vsf
        vsf.add(new Repositories(1, 1, 101, "App1", 1, "https://app1.com", 1, new Date()));
        vsf.add(new Repositories(2, 2, 102, "App2", 1, "https://app2.com", 2, new Date()));
        vsf.add(new Repositories(3, 3, 103, "Game1", 1, "https://game1.com", 3, new Date()));

        String keyword = "App";
        List<Repositories> searchedAndSortedList = vsf.searchAndSort(keyword);

        // Perform assertions to check if the search and sorting are correct
        assertEquals(2, searchedAndSortedList.size());
        assertEquals("App1", searchedAndSortedList.get(0).getRepoName());
        assertEquals("App2", searchedAndSortedList.get(1).getRepoName());
    }
}
