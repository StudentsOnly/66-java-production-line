import java.util.ArrayList;
import java.util.List;

public class ProductionLine {

  private long workerId;
  private String productName;

  public void producePart(long workerId, String partName) {
    synchronized (this) {
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Worker " + workerId + " produced " + partName + ".");
    }
  }

  public void assembleProduct(long workerId, String productName, List<String> parts) {
    synchronized (this) {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      StringBuilder allParts = new StringBuilder();
      for (var part : parts) {
        allParts.append(part).append(" ");
      }
      System.out.println("Worker " + workerId + " produced " + productName +
        " with given parts: " + allParts + ".");
    }
  }

}
