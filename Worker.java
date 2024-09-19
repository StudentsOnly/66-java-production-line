import java.util.ArrayList;
import java.util.List;

public class Worker implements Runnable {

  private ProductionLine productionLine;
  private long workerId;
  private List<String> parts;
  private String productName;

  public Worker(ProductionLine productionLine, long workerId, String productName,
                List<String> parts) {
    this.productionLine = productionLine;
    this.workerId = workerId;
    this.productName = productName;
    this.parts = new ArrayList<>(parts);
  }

  @Override
  public void run() {
    parts.forEach(p -> productionLine.producePart(workerId, p));
    productionLine.assembleProduct(workerId, productName, parts);
  }
}
