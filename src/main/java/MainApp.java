import ru.geekbrains_Artjom_Islyamov.MyArrayDataException;
import ru.geekbrains_Artjom_Islyamov.MyArraySizeException;

public class MainApp {
    public static void main (String[] args) {


        String[][] arr = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "y", "4"},

        };
        System.out.println(mass(arr));
    }

    public static int mass (String[][] data) {
        if (data.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (data[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + 1, j + 1);
                }
            }
        }
        return sum;
    }
}