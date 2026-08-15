package base;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class hooks extends basePage{

    public hooks() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        getDriver().get(getUrl());
    }

    @AfterTest
    public void teardown(){
        WebDriverInstance.cleanup();
    }
}
