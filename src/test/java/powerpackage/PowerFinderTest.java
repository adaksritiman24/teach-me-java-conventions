package powerpackage;
import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void mustReturnOneWhenOneRaisedToOne() {
        assert PowerFinder.Of(1,1) == 1;
    }

    @Test
    public void mustReturnTwoWhenTwoRaisedToOne() {
        assert PowerFinder.Of(2,1) == 2;
    }

    @Test
    public void mustReturnFourWhenTwoRaisedToTwo() {
        assert PowerFinder.Of(2, 2) == 4;
    }

    @Test
    public void mustReturnNineWhenThreeRaisedToTwo() {
        assert PowerFinder.Of(3, 2) == 9;
    }
}
