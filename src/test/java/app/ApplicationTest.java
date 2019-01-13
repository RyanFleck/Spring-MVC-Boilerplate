import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import app.Application;

class ApplicationTest {
 
    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
        assertEquals( 1, Application.testMe() );
    }
}
