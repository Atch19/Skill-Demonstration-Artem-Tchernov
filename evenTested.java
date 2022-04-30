import static org.junit.Assert.*;
import org.junit.*;
public class evenTested{
    public even mp = new even();
    @Test
    public void Test1(){
        int beta = 3;
        assertEquals(true, mp.evenTest(beta));
    }
}