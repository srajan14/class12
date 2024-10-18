import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        boolean infiniteloop= true;
        double[]accountbalance=new double[1000];
        String[]accountname=new String[1000];
        int option,size=100;
        while(infiniteloop){
            System.out.println("welcome to codingal bank service");
            System.out.println("banking menu");
            System.out.println("select any option from below ");
            System.out.println("1.add customer");
            System.out.println("2.change customer name");
            System.out.println("3.check account balance");
            System.out.println("4.update account balance");
            System.out.println("5.summary of all accounts");
            System.out.println("6.quit");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your option number to procede");
            option=sc.nextInt();
            if(option==1){
                System.out.println("add customer");
                sc.nextLine();
                System.out.println("enter customer name ");
                String name=sc.nextLine();
                accountname[size]=name;
                System.out.println("inter opning balance amount");
                double amt=sc.nextDouble();
                accountbalance[size]=amt;
                System.out.println("account create succesfully");
                System.out.println("account details"+(size));
                System.out.println("account name"+(accountname[size]));
                System.out.println("account balance"+(accountbalance[size]));
                size=size+1;

            }
            else if(option==2){
                System.out.println("change customer name menu");
                System.out.println("enter your account number");
                int accountindex;
                String temp;
                accountindex =sc.nextInt();
                sc.nextLine();
                if(accountindex>size){
                    System.out.println("account does not exsist");
                    
                }
                else{
                    temp=accountname[accountindex];
                    System.out.println("enter the new name");
                    String name=sc .nextLine();
                    accountname[accountindex]=name;
                    System.out.println("name updated succesfully"+name);
                }
            }
            else if(option==3){
                System.out.println("check accont balance menu");
                System.out.println("enter your account number");
                int accountindex;
                accountindex =sc.nextInt();
                if(accountindex>size){
                    System.out.println("account does not exsist");
                    
                }
                else{
                    
                    
                    System.out.println(accountname[accountindex]+"your balance is"+accountbalance[accountindex]);
                }   
            }
            else if(option==4){
                System.out.println("update bank account menu");
                System.out.println("enter your account number");
                int accountindex;
                accountindex =sc.nextInt();
                if(accountindex>size){
                    
                    System.out.println("account does not exsist");
                    
                }
                else{
                    
                    double amt=sc.nextDouble();
                    accountbalance[accountindex]+=amt; 
                    System.out.println(accountname[accountindex]+"your updated balance is"+accountbalance[accountindex]);
                }   
            }
            else if(option==5){
                System.out.println("account register");
                
            }
            else if(option==6){
                System.out.println("terminating");
                System.out.println("develop and managed by srajan");
                infiniteloop=false;
            }
            else{
                System.out.println("invalid input");
                System.exit(0);
            }
        }
    }
}