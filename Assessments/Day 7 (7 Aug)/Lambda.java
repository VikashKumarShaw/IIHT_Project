import java.util.Comparator;
import java.util.TreeSet; 
public class Lambda { 
    public static void main(String[] args) 
    { 
		  	
    	TreeSet<String> tree_set = new TreeSet<String>((str1,str2)->str1.length()-str2.length()); 
    	tree_set.add("Vikash"); 
        tree_set.add("Rohan"); 
        tree_set.add("Sohrab"); 
        tree_set.add("Akshat"); 
        tree_set.add("Keshav"); 
        System.out.println("Set before using the comparator: " + tree_set); 
        
        for (String element : tree_set) 
            System.out.print(element + " "); 
    }      
} 