import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class RepoTypeTest {
    private RepoType repoType;

    @BeforeEach
    public void setUp() {
        repoType = new RepoType(1, 1, 1, "repo", 1, "url", 1, new Date(), 1, "description");
    }

    @Test
    public void testRepoTypeId() {
        repoType.setRepoTypeId(2);
        assertEquals(2, repoType.getRepoTypeId());
    }

    @Test
    public void testTypeDesc() {
        repoType.setTypeDesc("new description");
        assertEquals("new description", repoType.getTypeDesc());
    }
}