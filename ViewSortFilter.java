import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ViewSortFilter {
    private static List<Repositories> repoList;
    
    // Constructor
    public ViewSortFilter() {
        repoList = new ArrayList<>();
    }
    
    /**
     * Simple add method.
     * @param newRepo The repository added to the list.
     */
    public void add(Repositories newRepo) {
        repoList.add(newRepo);
    }
    
    /**
     * View all applications in the repository.
     */
    public void view() {
        System.out.println("Print all repositories: ");
        for (Repositories v: repoList) {
            System.out.println(v.getRepoName());
            // I add a toString method in the end of Repositories.java in my computer.
            //System.out.println(v.toString());
        }
    }
    
    /**
     * Arrange applications based on the name of the repository.
     * @return A new repositories list.
     */
    public List<Repositories> sortByRepoName() {
        // Create a new list.
        List<Repositories> newRepoList = new ArrayList<>();
        for (Repositories repo: repoList) {
            newRepoList.add(repo);
        }
        // Start sort.
        int size = repoList.size();
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                // Check which one is bigger, then swap.
                int compare = newRepoList.get(j).getRepoName().compareTo(newRepoList.get(j + 1).getRepoName());
                if (compare > 0) {
                    Repositories temp = newRepoList.get(j);
                    newRepoList.set(j, newRepoList.get(j + 1));
                    newRepoList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return newRepoList;
    }
    
    /**
     * Filter applications based on the type of repository.
     * @param typeDesc The type.
     * @return A new repositories list.
     */
    public List<Repositories> filterByType(String typeDesc) {
        List<Repositories> newRepoList = new ArrayList<>();
        for (Repositories repo : repoList) {
            if (repo instanceof RepoType && typeDesc.equals(((RepoType) repo).getTypeDesc())) {
                newRepoList.add(repo);
            }
        }
        return newRepoList;
    }
    
    /**
     * This method allows users to perform string search and sorting on the respective fields of all applications.
     * @param keyword User input.
     * @return Search result.
     */
    public List<Repositories> searchAndSort(String keyword) {
        List<Repositories> newRepoList = new ArrayList<>();
        // Start search.
        for (Repositories repo: repoList) {
            int i = repo.getRepoName().indexOf(keyword);
            if (i != -1) {
                newRepoList.add(repo);
            }
        }
        // Use helper method to sort.
        newRepoList = sortWithFilter(newRepoList);
        return newRepoList;
    }
    
    /**
     * Helper method for searchAndSort to sort applications.
     * @param list The list after search.
     * @return A list that has been searched and arranged.
     */
    public List<Repositories> sortWithFilter(List<Repositories> list) {
        // Almost as same as sortByRepoName().
        List<Repositories> newRepoList = new ArrayList<>();
        for (Repositories repo: list) {
            newRepoList.add(repo);
        }
        int size = list.size();
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                int compare = newRepoList.get(j).getRepoName().compareTo(newRepoList.get(j + 1).getRepoName());
                if (compare > 0) {
                    Repositories temp = newRepoList.get(j);
                    newRepoList.set(j, newRepoList.get(j + 1));
                    newRepoList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return newRepoList;
    }
}
