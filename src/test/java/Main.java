import Login.Login;
import org.testng.annotations.Test;

public class Main  extends Login {

    @Test
    public void callingMethods(){
       Login log = new Login();
       log.openBrowser();
       log.navigateTobaseUrl();
       log.enterUserName();
       log.enterPassword();
       log.clickOnLogin();

    }


}
