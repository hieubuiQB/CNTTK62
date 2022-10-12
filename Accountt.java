
    public class Accountt {
        int id;
        String name;
        int balance;

        public Accountt (int id, String name) {
            this.id = id;
            this.name = name;
            this.balance = 0;
        }

        public Accountt (int id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        void display() {
            System.out.println("stk:" + id + ", ten:" + name + ", so du:" + balance);
        }

        public static void main(String[] args) {
            Accountt tk1 = new Accountt (50, "XT6") ;
            Accountt tk2 = new Accountt (152, "TA11", 100000);
            tk1.display();
            tk2.display();
        }
    }


