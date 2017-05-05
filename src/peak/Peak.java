package peak;

import java.util.ArrayList;

public class Peak {
	
	public Peak(){
	}
	
	public int findPeak(ArrayList<Integer> in){
		//check if array is empty
		int castles = 0;
		if(in.size() == 0){
			 
			 return castles;
		}
		for (int i = 0; i<in.size()-1;i++){
			if (i == 0){
				castles = castles + 1;
			} else if((in.get(i-1) < in.get(i)) && (in.get(i) >= in.get(i+1))){
				castles = castles + 1;
			} else if((in.get(i-1) > in.get(i)) &&(in.get(i) <= in.get(i+1))){
				castles = castles + 1;
			} 
		}
		return castles;	
	}
	

	
}
