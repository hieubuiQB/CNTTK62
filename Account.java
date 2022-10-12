
    public class Account {
        int id ;
        String name;
        int balance;
        public Account(int id, String name){
            this.id = id;
            this.name = name;
            this.balance = 0;
        }
        public Account(int id, String name, int balance){
            this.id = id;
            this.name = name;
            this.balance = balance;
        }
        void display(){
            System.out.println("stk:"+ id +", ten:"+ name+", so du:"+ balance);
        }
        void deposit (int amount) {

            this.balance += amount;
            System.out.println("So du trong tai khoan hien tai la: "+ this.balance);
        }
        void withdraw(int amount) {
            if(amount <= this.balance){
                this.balance -= amount;
                System.out.println("So du con lai trong tai khoan: " + this.balance);
            }else {
                System.out.println(" So du trong tai khoan khong co ");
            }
        }
        public static void main (String[]args){
            Account tk1 = new Account( 70,  "CP10");
            Account tk2 = new Account( 202,  "VT9",  100000);
            tk1.display();
            tk2.display();
            tk1.deposit(60000);
            tk2.withdraw(700000);
            tk1.withdraw(800000);

        }
    }
