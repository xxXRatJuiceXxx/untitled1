import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Test0 {


    private final MockedStatic<MyTest> myTestMockedStatic = mockStatic(MyTest.class);

    @Test
    public void mainTest() {
        myTestMockedStatic.when(MyTest::someMethod).thenReturn("Hello!");
        System.out.println(MyTest.someMethod());
    }

}