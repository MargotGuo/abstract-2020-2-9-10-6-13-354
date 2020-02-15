import transport.Aircraft;
import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transportation;

public class Main {
  public static void main(String[] args) {
    int totalMoney = 300;

    Transportation aircraft = new Aircraft();
    Transportation train = new Train();
    Transportation car = new Car();
    Transportation bus = new Bus();

    System.out.printf("Xiao Ming %s choose aircraft.\n", totalMoney >= aircraft.getPrice() ? "can" : "cannot");
    System.out.printf("Xiao Ming %s choose train.\n", totalMoney >= train.getPrice() ? "can" : "cannot");
    System.out.printf("Xiao Ming %s choose car.\n", totalMoney >= car.getPrice() ? "can" : "cannot");
    System.out.printf("Xiao Ming %s choose bus.\n", totalMoney >= bus.getPrice() ? "can" : "cannot");
  }
}
