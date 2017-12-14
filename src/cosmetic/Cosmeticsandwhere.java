package cosmetic;

import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Cosmeticsandwhere {
	static Scanner Scan = new Scanner(System.in);
	static String test = "";
	public static ArrayList<String> brand = new ArrayList();
        public static boolean runMangeCount = true;
        
        public Cosmeticsandwhere(){
            if(runMangeCount)
            runManage();
        }

        public void runManage(){
            Manage.cosmeticfiles();
            Manage.getnameOfbrand();
            Manage.gettypesOfCosmetics();
            Manage.getlocation();
            Manage.getinformation();
            Manage.getPrices();
            runMangeCount = false;
            
        }
	public static void main(String[] args) throws IOException {
		
//		ArrayList<String>a = manage.keeper;
//		System.out.println(a);
	}


//	public static void starter(){
//	System.out.println("+=============================================+");
//	System.out.printf("%-45s |%n","|");
//	System.out.printf("%-2s %38s %5s%n","|","Welcome to Adam&Girls Cosmetics Store","|");
//	System.out.printf("%-45s |%n","|");
//	System.out.println("+=============================================+");
//	System.out.printf("%s %38s %3s%n","|","Hello ! This programe will help you find ","|");
//	System.out.printf("%s %38s %5s%n","|","your cosmetics information and location","|");
//	System.out.printf("%-45s |%n","|");
//	System.out.printf("|%s %11s%n","[1] All list of product from brand","|");
//	System.out.printf("|%s %11s%n","[2] All list of product from types","|");
//	System.out.printf("|%s %9s%n","[3] All list of product in the store","|");
//	System.out.printf("|%s %14s%n","[4] Get location of the product","|");
//	System.out.printf("|%s %11s%n","[5] Get information of the product","|");
//	System.out.printf("|%s %17s%n","[6] Get Price of  cosmetics ","|");
////	System.out.printf("|%s %34s%n","[7] Payment","|");
//	System.out.printf("|%s %37s%n","[x] Exit","|");
//	System.out.printf("%-45s |%n","|");
//	commandOrder();
//	}
	
	
	
//	public static void commandOrder(){
//		while(true){
//			System.out.println("+=============================================+");
//			System.out.printf("%-45s |%n","|");
//			System.out.printf("|%s ","Enter your command: ");
//			String command = Scan.next();
//			System.out.printf("%-45s |%n","|");
//			System.out.println("+=============================================+");
//			switch(command){
//			case "1" :
//				allListofBrand();
//				System.out.println();
//				break;
//			case "2" :
//				allTypesofProduct();
//				System.out.println();
//				break;
//			case "3" :
//				allListofProduct();
//				System.out.println();
//				break;
//			case "4" :
//				getLocate();
//				System.out.println();
//				break;
//			case "5" :
//				getInformation();
//				System.out.println();
//				break;
//			case "6" :
//				getPriceofCosmetics();
//				System.out.println();
//				break;
////			case "7":
////				return;
//			case "x":
//				exitPro();
//				return;
//				
//				
//			}
//		}		
//	}
	


        
	public String allListofProduct(){
            String keep = "";
		for(int i = 0 ; i <Manage.keeper.size() ; i++){
                    keep = keep.concat(String.format("[CODE: %d] %s %s%n",i+1,Manage.nameOfbrand[i] ,Manage.typesOfCosmetics.get(i)));
//			System.out.printf("[CODE: %d] %s %s%n",i+1,Manage.nameOfbrand[i] ,Manage.typesOfCosmetics.get(i));
		}
		return keep;
	}
	
	public String allListofBrand(){
            String keep = "";
		for (int i = 0; i < Manage.keeper.size() - 1; i++) {
			if (!(Manage.nameOfbrand[i]).equals(Manage.nameOfbrand[i + 1])) {
                            keep = keep.concat(String.format("[ %s ]\n" ,Manage.nameOfbrand[i]));
//				brand.add(Manage.nameOfbrand[i]));
//				System.out.printf("> %s\n" ,Manage.nameOfbrand[i]);
				brand.add(Manage.nameOfbrand[i]);
			}
		}
		return keep;
	}

	public String allTypesofProduct(){
            String keep = "";
		for (int i = 0; i < 5; i++) {
                    keep = keep.concat(String.format("- %s\n",Manage.typesOfCosmetics.get(i)));
//			System.out.println(Manage.typesOfCosmetics.get(i));
                        
		}
		return keep;
	}
	
	public static boolean getLocate(){
		System.out.print("Enter Your Code: ");
		int code = Scan.nextInt();
		if(code>0){
			System.out.printf("Your item: %s %s %n", Manage.nameOfbrand[code-1],Manage.typesOfCosmetics.get(code-1));
			System.out.printf("Your item is at: %s ", Manage.location[code-1]);
		}
		return true;
	}
	
	public static boolean getInformation(){
		System.out.print("Enter Your Code: ");
		int code = Scan.nextInt();
		if(code>0){
			System.out.printf("Your item: %s %s %n", Manage.nameOfbrand[code-1],Manage.typesOfCosmetics.get(code-1));
			System.out.printf("Your item is at: %s ", Manage.information[code-1]);
			
		}
		return true;
	}
	
	public static boolean getPriceofCosmetics(){
		System.out.print("Enter Your Code: ");
		int code = Scan.nextInt();
		if(code>0){
			System.out.printf("Your item: %s %s %n", Manage.nameOfbrand[code-1],Manage.typesOfCosmetics.get(code-1));
			System.out.printf("Your item is cost: %s Baht", Manage.price[code-1]);
			
		}
		return true;
	}
	
	
	
	public static void exitPro(){
		System.out.println("+=============================================+");
		System.out.printf("| %22s %22s %n","Thank you !","|");
		System.out.println("+=============================================+");
		
	}
	
}
