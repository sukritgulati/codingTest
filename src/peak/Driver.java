package peak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {
	
	public static void main(String args[]){
		Driver castleDriver = new Driver();
		Peak peak = new Peak();
		ArrayList<Integer> landscapeArray = castleDriver.getLandscape();		
		System.out.println("No.of castles to make at peaks and valleys are: "+peak.findPeak(landscapeArray));
		
	}
	public Driver(){
	}
	
	
	public ArrayList<Integer> getLandscape(){
		
		ArrayList<Integer> array =new ArrayList<>();
		try {
            FileReader reader = new FileReader("Landscape.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
            	line = line.trim();
            	int temp = Integer.parseInt(line);
            	if(temp < 0) {
            		Exception e = new Exception();
            		throw  e;
            	}
            	array.add(temp); 
                System.out.println(line);
            }
            reader.close();
            return array;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("The input is not valid! Please try again");
        }
		return array;
	}
	
}
