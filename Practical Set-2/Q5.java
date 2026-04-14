class BankAccount {
    String id, name;
    double bal;

    void assign(String i, String n, double b){
        id=i; name=n; bal=b;
    }

    void display(){
        System.out.println(id+" "+name+" "+bal);
    }

    public static void main(String[] args){
        BankAccount[] a = new BankAccount[5];

        for(int i=0;i<5;i++){
            a[i]=new BankAccount();
            a[i].assign("A"+i,"User"+i,1000+i*100);
        }

        String search="A2";

        for(BankAccount b:a){
            if(b.id.equals(search)){
                b.display();
            }
        }
    }
}
