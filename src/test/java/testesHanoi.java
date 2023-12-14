import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testesHanoi {

    @Test
    public void testResolverTorreHanoiComZeroDiscos() {
        int movimentos = torreHanoi.resolverTorreHanoi(0);
        assertEquals(0, movimentos);
    }

    @Test
    public void testResolverTorreHanoiComUmDisco() {
        int movimentos = torreHanoi.resolverTorreHanoi(1);
        assertEquals(1, movimentos);
    }

    @Test
    public void testResolverTorreHanoiComDoisDiscos() {
        int movimentos = torreHanoi.resolverTorreHanoi(2);
        assertEquals(3, movimentos);
    }

    @Test
    public void testResolverTorreHanoiComTresDiscos() {
        int movimentos = torreHanoi.resolverTorreHanoi(3);
        assertEquals(7, movimentos);
    }

}
