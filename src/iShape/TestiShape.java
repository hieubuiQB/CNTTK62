package iShape;


public class TestiShape {
    public static void main(String[]args){
        iShape s1 = new Circle(12.0);
        iShape s2 = new Rectangle(3.0, 4.5);
        iShape s3 = new Circle(14.0);
        iShape s4 = new Rectangle(6.0, 5.5);
        iShape s5 = new Circle(13.0);
        iShape s6 = new Rectangle(2.0, 4.0);
        iShape s7 = new Circle(24.0);
        iShape s8 = new Rectangle(6.0, 1.5);
        iShape[] shapes = {s1, s2, s3, s4, s5, s6};
        int i = 1;
        for (iShape hinhDang:shapes
        ) {
            System.out.println("Dien tich hinh thu " + i++ +" la:" + hinhDang.getArea());
        }
    }
}
