import com.github.kevinw831205.structural.bridge.practice.Square;
import com.github.kevinw831205.structural.bridge.practice.VectorRenderer;
import org.junit.Assert;
import org.junit.Test;

public class BridgeTest {
    @Test
    public void squaresAsLines(){
        VectorRenderer vectorRenderer = new VectorRenderer();
        Square square = new Square(vectorRenderer);

        Assert.assertEquals("Drawing Square as lines",square.toString());

    }

}
