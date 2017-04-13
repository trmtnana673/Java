class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getColor() {
    return this.color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public int getDistance() {
    return this.distance;
  }
  
  public int getFuel() {
    return this.fuel;
  }
  
  public void printData() {
    System.out.println("【自転車の情報】");
    System.out.println("名前：" + this.getName());
    System.out.println("色：" + this.getColor());
    System.out.println("走行距離：" + this.getDistance() + "km");
    System.out.println("ガソリン量：" + this.getFuel() + "L");
  }
  
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    
    if(distance <= this.getFuel() ) {
      this.distance += distance;
      fuel = this.getFuel() - distance;
    } else {
      System.out.println("ガソリンが足りません");
    }
    
    System.out.println("走行距離：" +  this.distance +"km");
    System.out.println("ガソリン量："+ fuel +"L");
  }
  
  public void charge(int chargeFuel) {
    System.out.println( chargeFuel + "L給油します");
    if (chargeFuel <= 0) {
      System.out.println("給油できません");
    } else if (chargeFuel + fuel >= 100) {
      System.out.println("満タンまで給油します");
      fuel = 100;
    } else {
      fuel += chargeFuel;
    }
    System.out.println("ガソリン量：" + fuel +"L");
  }
}