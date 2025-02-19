public class addMedicine {

    String name;
    String id;
    int num;
    int amount;
    double price;
    double netPay;
    static double total=0;
    public addMedicine(){

    }
    public addMedicine(String name, String id, int num, double price) {
        this.name= name;
        this.id= id;
        this.num=num;
        this.price= price;
    }
    public addMedicine(String name, int amount,double price){
        this.name=name;
        this.amount=amount;
        this.price=price;
        netPay=(amount*price);
        total= total+netPay;
        //System.out.println(netPay);
    }


    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }

    public void display(){
        System.out.println("Medicine name: "+name+", ID: "+id+", Quantity: "+num+", Unit Price: "+price);
    }
    public void selldisplay(){
        System.out.println("Medicine name: "+name+", Quantity: "+amount+", Price: "+price);
    }
    public void netdislay(){
       // netPay=netPay+(amount*price);
        System.out.println("Pay "+name+": "+netPay+" TK");
    }
    public void total(){
        System.out.println("__________________________________");
        System.out.println("Total Pay: "+total+" TK");
        System.out.println("\n\n");
    }

}

