package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {
    private HelloSolution inst;

    @Before
    public void setUp() {
        inst = new HelloSolution();
    }

    @Test
    public void compute() {
        assertThat(inst.hello("x"), equalTo("Hello, x!"));
    }
}
