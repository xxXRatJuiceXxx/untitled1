import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Mock
    private MyTest myTestMock;

    @Spy
    private MyTestForTest myTestForTestMock;

    private final static List<Point> pointList = List.of(
            new Point(2, 3),
            new Point(-2, -3),
            new Point(-2, 3),
            new Point(2, -3)
    );

    @Test
    public void mainTest() {

        myTestForTestMock.setMyTest(myTestMock);
        for (Point point : pointList) {
            Mockito.doReturn(point).when(myTestMock).createPoint(point.getX(), point.getY());
        }

        assertFalse(myTestForTestMock.pointInRightBottom(2, 3));
        assertFalse(myTestForTestMock.pointInRightBottom(-2, -3));
        assertFalse(myTestForTestMock.pointInRightBottom(-2, 3));
        assertTrue(myTestForTestMock.pointInRightBottom(2, -3));
    }
}