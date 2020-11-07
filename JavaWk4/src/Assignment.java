import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeNames.add("Beth Jones");
		employeeNames.add("John Smith");
		employeeNames.add("Susan Brown");
		employeeNames.add("Brian Johnson");
		employeeNames.add("Terry Turner");
		
		ids.add(111);
		ids.add(135);
		ids.add(122);
		ids.add(192);
		ids.add(174);
		
		System.out.println("employeeMap key and value:");
		int i = 0;
		for (Integer number : ids) {
			employeeMap.put(number, employeeNames.get(i));
			i++;
		}
		
		for (Integer employeeNum : employeeMap.keySet()) {
			System.out.println( employeeNum + ": " + employeeMap.get(employeeNum));
			}
		
		StringBuilder idsBuilder = new StringBuilder();
		System.out.println("\nidsBuilder results:");
		for (Integer num : ids) {
			idsBuilder.append(num + "-");
			System.out.println(idsBuilder.toString());
			//Could have done this as: System.out.println(idsBuilder.append(num + "-"));
			//Why use .toString() ?
		}
		
		StringBuilder namesBuilder = new StringBuilder();
		System.out.println("\nnamesBuilder results:");
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
			System.out.println(namesBuilder.toString());
		}
		
	}

}
