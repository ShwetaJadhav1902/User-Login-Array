package UserLoginArray;
import java .util.Scanner;
public class MainPass {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		LoginPage l=new LoginPage() ;
		int cho;
		do {
			System.out.println("1.set \n2.login \nEnter the choice : ");
			 cho=sc.nextInt();
			 
			switch(cho) {
			
			case 1:
				//l = new LOGINpGE();
				System.out.println("Enter Username : ");
				String User=sc.next();
				l.setUserName(User);
				
				System.out.println("Enter Password : ");
				String Pass=sc.next();
				l.setPassWord(Pass);
				break;
			case 2:
				//l = new LOGINpGE();
				System.out.println("Enter Username : ");
				String us=sc.next();
				System.out.println("Enter Password : ");
				String pw=sc.next();
				
				if(l.getUserName().equals(us) || l.getUserName().equals(null)) {
					if(l.getPassWord().equals(pw) || l.getPassWord().equals(null)) {
						System.out.println("login sucessfully\nEnter the Size OF array");
						
						int n=sc.nextInt();
						
						Product Pro[]= new Product[n];
						
						for(int i = 0;i<n;i++) {
							
							System.out.println("Enter The Details Of Product no "+i);
							
							Product P = new Product();
													
					        System.out.println("Enter Product ID: ");
					        int id = sc.nextInt();
					        P.setId(id);
					        sc.nextLine(); 

					        System.out.println("Enter Product Name: ");
					        String name = sc.nextLine();
					        P.setName(name);

					        System.out.println("Enter Product Price: ");
					        double price = sc.nextDouble();
					        P.setPrice(price);
					        
					        System.out.println("Enter GST percentage: ");
					        double gst = sc.nextDouble();
					        P.setGst(gst);
					        sc.nextLine(); 

					        System.out.println("Enter Order Location: ");
					        String orderLocation = sc.next();
					        P.setOrderLocation(orderLocation);
							
					        Pro[i]=P;
					        
						}
						
						
						for(Product X:Pro) {
							System.out.println(X);
							System.out.println("-=-=-=-=-=-=-=-");
						}
						
						
						
					}
					else {
						System.out.println("invalid Password\n");
					}
				}
				else {
					System.out.println("invalid username\n");
				}
				break;
			case 3:
				//l = new LOGINpGE();
				System.out.println(l.getUserName());
				System.out.println(l.getPassWord());
				break;
			default: 
			
			}

		}while(cho !=0);
		sc.close();
	}

}
