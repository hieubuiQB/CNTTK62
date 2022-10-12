package Person;

public class KiemTra {
    public static void main(String[] args) {
        Student s = new Student("Hieu", 21, "QUANG BINH", 9.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("Hai",  28 ,"TP HCM", 1700);
        t.display();
    }
}
