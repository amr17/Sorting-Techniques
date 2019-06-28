import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class Graph extends Application {
    final static String bubbleSort = "bubbleSort";
    final static String doSelectionSort = "doSelectionSort";
    final static String insertionSort = "insertionSort";
    final static String mergesort = "mergesort";
    final static String MaxHeap = "Heap";
    final static String QuickSort = "QuickSort";
    
    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("timee");
        xAxis.setLabel("sorting technices");       
        yAxis.setLabel("Timing");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data(bubbleSort, mainn.bs));      
        series1.getData().add(new XYChart.Data(doSelectionSort, mainn.dss));
        series1.getData().add(new XYChart.Data(insertionSort, mainn.tis));
        series1.getData().add(new XYChart.Data(mergesort, mainn.tms));
        series1.getData().add(new XYChart.Data(QuickSort, mainn.tqs));
        series1.getData().add(new XYChart.Data(MaxHeap, mainn.tmh));  
       
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main (String[] args) {
        mainn.main(args);
        launch(args);
    }
}