package testng._revise;

import org.testng.annotations.Test;

public class FactoryDemoTest {

    int id;

    public FactoryDemoTest(int id) {
        this.id = id;
    }

    @Test
    public void displayMessage() {
        System.out.println("Message " + id);
    }
}
