# Aplicaciones, Perceptron.
## Hands-On 8.
### Instrucciones.

- Construir un Modelo orientado a objetos (UML) del Perceptrón.
A partir del Modelo UML anterior, implementar (en Java) y entrenar el Perceptrón para que aprenda a reconocer las compuertas AND y OR en los siguientes casos: 
    - 1. Dos señales de entrada- Una de salida.
    - 2. Tres señales de entrada - Una de salida.

### Diagrama UML:
```plantuml
@startuml

class NeuralNetwork {

- weights: double[]     
- learningRate: double  

+ NeuralNetwork(inputSize: int)   
+ initializeWeights(): void       
+ train(trainingData: DataSet) : void 
+ predict(inputs: int[]) : int    
+ updateWeights(inputs: int[], error: int) : void 
+ getWeights() : double[]    

}

class DataSet {

- data: int[][]       
- targets: int[]      
+ DataSet(data: int[][], targets: int[]) 
+ getData() : int[][]  
+ getTargets() : int[] 

+ display() : void    
+ createAndDataSet2() : DataSet 
+ createAndDataSet3() : DataSet 
+ createOrDataSet2() : DataSet 
+ createOrDataSet3() : DataSet 

}

@enduml