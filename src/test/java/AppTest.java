import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();

    @Test
    public void addMeTest() {
        assertEquals(12, app.addMe(11, 1));
    }

    @Test
    public void subMeTest() {
        assertEquals(10, app.subtractMe(11, 1));
    }
}
