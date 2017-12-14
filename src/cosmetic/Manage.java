package cosmetic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import jdk.nashorn.internal.ir.CatchNode;

public class Manage extends Cosmeticsandwhere{
	
	public static ArrayList<String> keeper = new ArrayList<>();
	public static String[] nameOfbrand;
	public static ArrayList<String> typesOfCosmetics;
	public static String[] location;
	public static String[] information;
	public static double[] code;
	public static double[] price;
	public static int[] qty;
	public static double[] total;
	
        public Manage(){
      
        }
        
	public static void cosmeticfiles(){
            try{
		FileReader cosmeticfile = new FileReader("src\\data\\cosmetics.txt");
		BufferedReader reader = new BufferedReader(cosmeticfile);
		String readline = reader.readLine();
		while (readline != null) {
			if (!readline.startsWith("+")) {
				keeper.add(readline);

			}
			readline = reader.readLine();
		}

	}catch(Exception e){
                System.out.println(e);
    }
        }
	
	public static void getnameOfbrand() {
		nameOfbrand = new String[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			nameOfbrand[i]= keeper.get(i).split("/")[0];
		}
	}
	
	public static void gettypesOfCosmetics() {
		typesOfCosmetics = new ArrayList<>();
		for(int i = 0 ; i<keeper.size() ; i++){
			typesOfCosmetics.add(keeper.get(i).split("/")[1]);
		}
	}
	
	public static void getlocation() {
		location = new String[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			location[i]= keeper.get(i).split("/")[2];
		}
	}
	
	public static void getinformation() {
		information = new String[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			information[i]= keeper.get(i).split("/")[3];
		}
	}
	
	public static void getPrices(){
		price = new double[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			price[i] = Double.valueOf(keeper.get(i).split("/")[4]);
		}
	}
	
	public static void getCode(){
		code= new double[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			code[i] = Double.valueOf(keeper.get(i).split("/")[5]);
		}

	}
	
//	public static int[] getQty(){
//		qty = new int[keeper.size()];
//		for(int i = 0 ; i<keeper.size() ; i++){
//			qty[i] = 0;
//		}
//		return qty;
//	}

}
