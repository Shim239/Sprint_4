import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountParametrizedTest {

    @Parameterized.Parameter
    public String name;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters(name = ": \"{0}\" | expectedResult = {1}")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"I p", true},
                {"I  p", false},
                {"Iv", false},
                {"Iv ", false},
                {" Iv", false},
                {"Iva Pe Ru", false},
                {"Ivan Petrov19Simvol", true},
                {"Iva Petrov20Simvolov", false},
                {null, false}
        };
    }

    @Test
    public void checkName() {
        Account account = new Account(name);
        Assert.assertEquals(expectedResult, account.checkNameToEmboss());
    }
}
