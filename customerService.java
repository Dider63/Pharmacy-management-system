import java.util.ArrayList;
public class customerService{

    ArrayList<addMedicine> medicine;
    ArrayList<addMedicine> sell;
    public customerService(){
        medicine= new ArrayList<>();
        sell= new ArrayList<>();
    }

    public void add(String name, String id,int num,double price){
        medicine.add(new addMedicine(name,id,num,price));
        System.out.println("Medicine added successfully");
    }
    public void viewMedicine(){
        for(addMedicine medicine1: medicine){
            medicine1.display();
        }
    }
    public void viewSell(){
        for(addMedicine medicine3: sell){
            medicine3.selldisplay();
            medicine3.netdislay();
        }
    }



    public void sellItem(String name,String id,int amount){
      //  System.out.println(name+" "+id);
        int j=1;
        for(addMedicine medicine2: medicine){
       if(name.equals(medicine2.getName()) && id.equals(medicine2.getId())){
           int num= medicine2.getNum()-amount;
           medicine2.setNum(num);
           sell.add(new addMedicine(name,amount, medicine2.price));
+

         //  System.out.println("name: "+medicine2.getName()+", Id: "+medicine2.getId()+", Amount: "+amount);
           break;
       } else if (j == medicine.size()) {
           System.out.println("Medicine not found");
       }
       j++;
        }
    }

}
