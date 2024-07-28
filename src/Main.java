public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,10);
        System.out.println("rectangle width="+rectangle.getWidth());
        System.out.println("rectangle length="+rectangle.getLength());
        System.out.println("area of rectangle="+rectangle.getArea());

        Cuboid cuboid= new Cuboid(5,10,5);
        System.out.println("Length of cuboid ="+cuboid.getLength());
        System.out.println("width of cuboid ="+cuboid.getWidth());
        System.out.println("height of cuboid ="+cuboid.getHeight());
        System.out.println("area of cuboid ="+cuboid.getArea());
        System.out.println("volume of cuboid ="+cuboid.getVolume());
    }
}