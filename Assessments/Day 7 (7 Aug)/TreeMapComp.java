import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapComp {

	public static void main(String a[]) {
		TreeMap<Employee, Organisation> tm = new TreeMap<Employee, Organisation>(new Comparator<Employee>()
				{ public int compare(Employee e1, Employee e2) {
	       

		   //INNER CLASS
			
			
			
	    	return (int) (e2.getSalary()-e1.getSalary());
	    }});
		tm.put(new Employee("subham", 3000), new Organisation("TCS", 394854));
		tm.put(new Employee("anil", 6000), new Organisation("CTS", 768886));
		tm.put(new Employee("aksa", 2000), new Organisation("WIPRO", 46332));
		tm.put(new Employee("risahv", 2400), new Organisation("ITC", 39486554));
		Set<Entry<Employee, Organisation>> s = tm.entrySet();
		Iterator<Entry<Employee, Organisation>> itr1 = s.iterator();
		int i = 0;
		while (itr1.hasNext()) {// Entry is inner interface in Map interface

			Map.Entry me = (Map.Entry) itr1.next();
			System.out.println("\nKey:" + me.getKey() + " " + "\nvalue:" + me.getValue());

			if (i == 0) {
				i++;
				itr1.remove(); // to remove Map.Entry key value pair
				// me.setValue(obj); //to update a value
			}
		}
	}
}