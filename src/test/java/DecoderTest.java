import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DecoderTest {

    @Test
    public void VowelReplacementDecoding() {
        assertEquals("testing", Decoder.VowelReplacementDecoding("t2st3ng"));
        assertEquals("h2ll4", Decoder.VowelReplacementDecoding("h2ll4"));
    }

    @Test
    public void ConsonantsReplaceDecoding() {
        assertEquals("testing", Decoder.ConsonantsReplaceDecoding("vetviph"));
        assertEquals("z2b", Decoder.ConsonantsReplaceDecoding("y2a"));
    }
}