import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyTestForTest {

    private MyTest myTest;

    public boolean pointInRightBottom(int x, int y) {
        var point = myTest.createPoint(x, y);
        return point.getX() > 0 && point.getY() < 0;
    }
}
