package record;
class order{
private String date;
private  String number;

public order(String date , String number){
    this.date = date;
    this.number = number;
}
 public void confirm(){
    System.out.println("order" + number + "confirm on "+ date);
}

 public void close(){
    System.out.println("order " + number + "closed");
}
}
class specialorder extends order{
public specialorder(String date , String number){
    super("date"  , "number");
}
 public void dispatch(){
    System.out.println("special order is "  +  "dispatched");
}

}
class normalorder extends order{
    public normalorder(String date , String number){
    super("date" , " number");
}
 public void dispatch(){
    System.out.println("normal order is "  +  "dispatched");
}
 public void receive(){
    System.out.println("normal order is" + "received by customer");
}
}

class customer{
private String name;
private  String location;
public customer(String name , String location){
    this.name = name;
    this.location = location;
}
   public void sendorder( order order){
        System.out.println(name  + "from"  +  location  +  "sent an order");
    }

    void receiveorder(order order){
        System.out.println(name + "received order");
        order.close();
    }
}
public class OrderProg {
    public static void main(String[] args) {

customer c = new customer("REVANTH", "VIZIANAGARAM");
specialorder so = new specialorder("26TH FEB", "21");
c.sendorder(so);
so.dispatch();
c.receiveorder(so);
System.out.println();
normalorder no = new normalorder("27TH FEB", "26");
c.receiveorder(no);
no.dispatch();
no.receive();
c.receiveorder(no);        
    }
}

