class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  
  
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
  
  public void printData() {
    System.out.println("【自転車の情報】");
    System.out.println("名前：" + this.getName());
    System.out.println("色：" + this.getColor());
    System.out.println("走行距離：" + this.getDistance() + "km");
  }
  
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    distance += this.distance;
    System.out.println("走行距離：" +  distance +"km");
  }
}