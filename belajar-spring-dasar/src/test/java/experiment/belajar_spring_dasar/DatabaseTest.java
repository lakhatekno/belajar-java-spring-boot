package experiment.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void singletonTest(){
        var db1 = Database.getInstance();
        var db2 = Database.getInstance();

        Assertions.assertSame(db1, db2);
    }
}
