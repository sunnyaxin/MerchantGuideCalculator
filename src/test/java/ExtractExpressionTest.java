import model.Unit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtractExpressionTest {

    private ExtractExpression extractExpression;

    @Before
    public void setUp() throws Exception {
        extractExpression = new ExtractExpression();
    }

    @Test
    public void should_extract_expression_glob_is_I() throws Exception {
        String expression = "glob is I";
        Unit glob = extractExpression.extract(expression);

        assertEquals(glob.getName(), "glob");
        assertEquals(glob.getNumber(), "I");
    }
}
