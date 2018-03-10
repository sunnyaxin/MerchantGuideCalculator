import model.Roman;
import model.Unit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtractExpressionTest {

    private ExtractExpression extractor;

    @Before
    public void setUp() throws Exception {
        extractor = new ExtractExpression();
    }

    @Test
    public void should_extract_expression_glob_is_I() throws Exception {
        String expression = "glob is I";
        Unit glob = extractor.extract(expression);

        assertEquals(glob.getName(), "glob");
        assertEquals(glob.getRomanNumber(), Roman.I);
    }

    @Test
    public void should_extract_expression_prok_is_V() throws Exception {
        String expression = "prok is V";
        Unit glob = extractor.extract(expression);

        assertEquals(glob.getName(), "prok");
        assertEquals(glob.getRomanNumber(), Roman.V);
    }
}
