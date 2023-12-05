import java.util.Arrays;

public class DataSet {
    private int[][] data;
    private int[] targets;

    public DataSet(int[][] data, int[] targets) {
        this.data = data;
        this.targets = targets;
    }

    public int[][] getData() {
        return data;
    }

    public int[] getTargets() {
        return targets;
    }

    public void display() {
        System.out.println("Conjunto de datos:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]) + " = " + targets[i]);
        }
        System.out.println();
    }

    public static DataSet createAndDataSet2() {
        int[][] data = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] targets = {0, 0, 0, 1}; // Resultados esperados para la AND de 2 entradas
        return new DataSet(data, targets);
    }

    public static DataSet createAndDataSet3() {
        int[][] data = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int[] targets = {0, 0, 0, 0, 0, 0, 0, 1}; // Resultados esperados para la compuerta AND de 3 entradas
        return new DataSet(data, targets);
    }

    public static DataSet createOrDataSet2() {
        int[][] data = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] targets = {0, 1, 1, 1}; // Resultados esperados para la compuerta OR (2 entradas)
        return new DataSet(data, targets);
    }

    public static DataSet createOrDataSet3() {
        int[][] data = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int[] targets = {0, 1, 1, 1, 1, 1, 1, 1}; // Resultados esperados para la compuerta OR (3 entradas)
        return new DataSet(data, targets);
    }
}
