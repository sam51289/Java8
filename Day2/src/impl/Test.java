package impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Float> arr= new ArrayList<Float>();
		arr.add(10.00f);
		arr.add(3.2f);
		arr.add(5.7f);
		arr.add(100f);
		arr.add(10.02f);
				
		System.out.println("List Data are");
		arr.forEach(a -> System.out.print(a));
		
		
		arr.removeIf(a->a>7);
		System.out.println("After removal");
		arr.forEach(System.out::println);
		
		
		
		Map<String,Integer> ageMap = new HashMap<String, Integer>();
		ageMap.put("Sumit",29);
		ageMap.put("Sandip",23);
		ageMap.put("Amit",21);
		
		ageMap.forEach((k,v)->{
			System.out.println(k+"'s age is "+ v);
		});
		System.out.println("Post filter");
		System.out.println(
		ageMap.entrySet().stream().filter(a-> a.getValue()>25).collect(Collectors.toSet()));
	}

}
