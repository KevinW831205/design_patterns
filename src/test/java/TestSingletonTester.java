import com.github.kevinw831205.creational.singleton.BasicSingleton;
import com.github.kevinw831205.creational.singleton.SingletonTester;
import org.junit.Assert;
import org.junit.Test;

public class TestSingletonTester {

    @Test
    public void twoSingletons(){
        Assert.assertTrue(SingletonTester.isSingleton(BasicSingleton::getInstance));
    }

    @Test
    public void notSingleton(){
        Assert.assertFalse(SingletonTester.isSingleton(StringBuilder::new));
    }
}
