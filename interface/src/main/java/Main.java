import transport.Aircraft;
import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transportation;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int totalMoney = 300;
    List<Transportation> transportationList = Arrays.asList(new Aircraft(), new Train(), new Car(), new Bus());
    transportationList.forEach(transportation -> printResult(transportation, totalMoney));
  }

  private static void printResult(Transportation transportation, int totalMoney) {
    System.out.printf("$%s %s enough for %s.\n",
        totalMoney,
        totalMoney >= transportation.getPrice() ? "is" : "is not",
        transportation.getClass().getSimpleName());
  }
}
