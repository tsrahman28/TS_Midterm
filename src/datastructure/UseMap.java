package datastructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		HashMap<String, List<String>> map = new HashMap<>();


		List<String> list1 = new ArrayList<>();
		list1.add("list1_data1");
		list1.add("list1_data2");
		list1.add("list1_data3");
		list1.add("list1_data4");


		List<String> list2 = new ArrayList<>();
		list2.add("list2_data1");
		list2.add("list2_data2");
		list2.add("list2_data3");
		list2.add("list2_data4");


		List<String> list3 = new ArrayList<>();
		list3.add("list3_data1");
		list3.add("list3_data2");
		list3.add("list3_data3");
		list3.add("list3_data4");


		map.put("1", list1);
		map.put("2", list2);
		map.put("3", list3);


		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String keyValue = entry.getKey();
			System.out.println("Key Value: " + keyValue);
			List<String> list = entry.getValue();
			Iterator<String> iterator = list.iterator();
			System.out.print("List Data: ");
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
			System.out.println();
		}

	}

}

