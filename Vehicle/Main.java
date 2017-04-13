import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    bicycle.setName("ビアンキ");
    bicycle.setColor("緑");
    
    bicycle.printData();
    
    System.out.println("-----------------");
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("走る距離を入力してください：");
    int distance = scanner.nextInt();
    bicycle.run(distance);
    
    System.out.println("=================");
    
    Car car = new Car();
    car.setName("フェラーリ");
    car.setColor("赤");
    
    car.printData();
    
    System.out.println("-----------------");
    
    System.out.print("走る距離を入力してください：");
    int secondDistance = scanner.nextInt();
    car.run(secondDistance);
    
    System.out.println("-----------------");
    System.out.print("給油量を入力してください：");
    int chargeFuel = scanner.nextInt();
    car.charge(chargeFuel);
    
    
    }
}
