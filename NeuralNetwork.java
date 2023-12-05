import java.util.Arrays;

public class NeuralNetwork {
    private double[] weights;
    private double learningRate = 0.1;

    public NeuralNetwork(int inputSize) {
        weights = new double[inputSize];
        initializeWeights();
    }

    private void initializeWeights() {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random() * 0.1;
        }
    }

    public void train(DataSet dataSet) {
        int[][] inputSet = dataSet.getData();
        int[] outputSet = dataSet.getTargets();

        for (int epoch = 0; epoch < 1000; epoch++) {
            for (int i = 0; i < inputSet.length; i++) {
                int prediction = predict(inputSet[i]);
                int error = outputSet[i] - prediction;
                updateWeights(inputSet[i], error);
            }
        }
    }

    private int predict(int[] inputs) {
        double sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return (sum >= 0.5) ? 1 : 0;
    }

    private void updateWeights(int[] inputs, int error) {
        for (int j = 0; j < weights.length; j++) {
            weights[j] += learningRate * error * inputs[j];
        }
    }

    public double[] getWeights() {
        return Arrays.copyOf(weights, weights.length);
    }
}
