import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Crear y entrenar la red neuronal para compuerta AND (2 entradas)
        System.err.println("\nAND (2 entradas).");
        NeuralNetwork andNetwork2 = new NeuralNetwork(2);
        DataSet andDataSet2 = DataSet.createAndDataSet2();
        andDataSet2.display();
        andNetwork2.train(andDataSet2);
        System.out.println("Pesos finales: " + Arrays.toString(andNetwork2.getWeights()));
        System.out.println();

        // Crear y entrenar la red neuronal para compuerta AND (3 entradas)
        System.out.println("AND (3 entradas).");
        NeuralNetwork andNetwork3 = new NeuralNetwork(3);
        DataSet andDataSet3 = DataSet.createAndDataSet3();
        andDataSet3.display();
        andNetwork3.train(andDataSet3);
        System.out.println("Pesos finales: " + Arrays.toString(andNetwork3.getWeights()));
        System.out.println();

        // Crear y entrenar la red neuronal para compuerta OR (2 entradas)
        System.out.println("OR (2 entradas).");
        NeuralNetwork orNetwork2 = new NeuralNetwork(2);
        DataSet orDataSet2 = DataSet.createOrDataSet2();
        orDataSet2.display();
        orNetwork2.train(orDataSet2);
        System.out.println("Pesos finales: " + Arrays.toString(orNetwork2.getWeights()));
        System.out.println();

        // Crear y entrenar la red neuronal para compuerta OR (3 entradas)
        System.out.println("OR (3 entradas).");
        NeuralNetwork orNetwork3 = new NeuralNetwork(3);
        DataSet orDataSet3 = DataSet.createOrDataSet3();
        orDataSet3.display();
        orNetwork3.train(orDataSet3);
        System.out.println("Pesos finales: " + Arrays.toString(orNetwork3.getWeights()));
        System.out.println();
    }
}
