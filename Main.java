import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) {

    ProductionLine productionLine = new ProductionLine();

    try (ExecutorService executorService = Executors.newFixedThreadPool(6)) {
      for (int i = 0; i < 6; i++) {
        executorService.submit(new Worker(productionLine, i, "Best product", List.of(
          "wheel",
          "window",
          "seat",
          "axle",
          "steering"
        )));
      }
      executorService.shutdown();
      executorService.awaitTermination(1, TimeUnit.HOURS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("App done.");
  }
}
