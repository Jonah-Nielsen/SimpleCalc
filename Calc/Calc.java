package Calc;


import java.util.*; 


public class Calc {
	

	



public static String cal(String[] str) {
	ArrayList<Integer> mulDiv = new ArrayList<>(); 
	ArrayList<Integer> addSub = new ArrayList<>();
	List<String> arr = Arrays.asList(str);
	ArrayList<String> arr1 = new ArrayList<>();
	arr1.addAll(arr);
	
	addSub.forEach((n) -> System.out.println(n));
	
	for (int i=0; i<str.length; i++){
		if ((arr1.get(i).compareTo("x")== 0)|| (arr1.get(i).compareTo("/")== 0)){
			mulDiv.add(i);
		}
		else if ((arr1.get(i).compareTo("+") == 0)||(arr1.get(i).compareTo("-") == 0)){
			addSub.add(i);
		}
	}
	
	for (int i =0; i<mulDiv.size(); i++){
		if (arr1.get(mulDiv.get(i)).compareTo("x")==0){
			
			double temp1 = Double.parseDouble(arr1.get(mulDiv.get(i) - 1));
			double temp2 = Double.parseDouble(arr1.get(mulDiv.get(i) + 1));
			
			double temp3 = temp1*temp2;
			arr1.set(mulDiv.get(i) -1, String.valueOf(temp3));
			arr1.subList(mulDiv.get(i), mulDiv.get(i)+2).clear();

			
			
			
			
			
			for (int j=0; j<addSub.size(); j++){
				if (mulDiv.get(i) < addSub.get(j)){
					addSub.set(j, addSub.get(j)-2);
				}
			}
			for (int j =0; j<mulDiv.size(); j++){
				mulDiv.set(j, mulDiv.get(j)-2);
			}
			
			
		}
		else if (arr1.get(mulDiv.get(i)).compareTo("/")==0){
			
			double temp1 = Double.parseDouble(arr1.get(mulDiv.get(i) - 1));
			double temp2 = Double.parseDouble(arr1.get(mulDiv.get(i) + 1));
			
			
			double temp3 = temp1/temp2;
			arr1.set(mulDiv.get(i) -1, String.valueOf(temp3));
			arr1.subList(mulDiv.get(i), mulDiv.get(i)+2).clear();
			

			
			
			for (int j=0; j<addSub.size(); j++){
				if (mulDiv.get(i) < addSub.get(j)){
					addSub.set(j, addSub.get(j)-2);
				}
			}
			for (int j =0; j<mulDiv.size(); j++){
				mulDiv.set(j, mulDiv.get(j)-2);
			}
		}
		
	}
	
	
	
	for (int i=0; i<addSub.size(); i++){
		if (arr1.get(addSub.get(i)).compareTo("+")==0){
			
			double temp1 = Double.parseDouble(arr1.get(addSub.get(i) - 1));
			double temp2 = Double.parseDouble(arr1.get(addSub.get(i) + 1));
			
			
			double temp3 = temp1+temp2;
			arr1.set(addSub.get(i) -1, String.valueOf(temp3));
			arr1.subList(addSub.get(i), addSub.get(i)+2).clear();

			
			
			
			for (int j =i; j<addSub.size(); j++){
			addSub.set(j, addSub.get(j)-2);
			}
		}
		
		else if (arr1.get(addSub.get(i)).compareTo("-")==0){
			
			double temp1 = Double.parseDouble(arr1.get(addSub.get(i) - 1));
			double temp2 = Double.parseDouble(arr1.get(addSub.get(i) + 1));
			
			
			
			double temp3 = temp1-temp2;
			arr1.set(addSub.get(i) -1, String.valueOf(temp3));
			arr1.subList(addSub.get(i), addSub.get(i)+2).clear();

			
			
			
			
			
			for (int j =i; j<addSub.size(); j++){
			addSub.set(j, addSub.get(j)-2);
			}
		}
	}	
	
	return arr1.get(0);
	
	}



}
