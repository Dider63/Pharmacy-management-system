import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        customerService medicine = new customerService();
        addMedicine a= new addMedicine();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Medicine");
            System.out.println("2. Available Medicine");
            System.out.println("3. Sell Item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
         int n= input.nextInt();
            input.nextLine();
           switch (n) {
                case 1: {

                    System.out.print("Enter medicine name: ");
                    String name= input.nextLine();
                    System.out.print("Enter medicine id: ");
                    String id= input.nextLine();
                    System.out.print("Enter quantity: ");
                    int amount=input.nextInt();
                    System.out.print("Enter unit price: ");
                    double price= input.nextDouble();
                    medicine.add(name,id,amount,price);
                    break;
                }
               case 2:
               {
                   medicine.viewMedicine();
                   break;
               }
                case 3: {
                    while(true) {

                        System.out.println("1. ADD");
                        System.out.println("2. END");
                        System.out.print("Enter your choice: ");

                        int n1 = input.nextInt();
                        input.nextLine();
                        switch (n1) {
                            case 1: {
                                System.out.print("Enter medicine name: ");
                                String name = input.nextLine();
                                System.out.print("Enter ID: ");
                                String id = input.nextLine();
                                System.out.print("Enter Quantity: ");
                                int amount= input.nextInt();
                                medicine.sellItem(name, id, amount);
                                break;
                            }
                            case 2: {
                                System.out.println("\nMedicine List: ");
                                medicine.viewSell();
                                a.total();
                                break;
                            }
                        }
                        if(n1==2){
                            break;
                        }
                    }
                    break;
                }
               case 4:{
                   System.out.println("Thank You");
                   return;
               }
            }
        }


    }
}