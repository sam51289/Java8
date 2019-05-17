package impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import dto.Product;

public class StreamExample {

	public static void main(String[] args) {
	
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "HP Laptop", 25000f));
		productList.add(new Product(2, "Dell Laptop", 30000f));
		productList.add(new Product(1, "Lenovo Laptop", 29000f));
		productList.add(new Product(1, "Sony Laptop", 25000f));
		productList.add(new Product(1, "Apple Laptop", 90000f));
		
		
		System.out.println("Product List "+productList);
		
		//Filter without stream with price <30000
		List<Product> fileteredList = new ArrayList<Product>();
		productList.forEach(a -> {
			if (a.getPrice() < 30000f) {
				fileteredList.add(a);
			}
		}

		);
		
		System.out.println("Filtered products"+fileteredList);
		
		//With Stream
		Predicate<Product> pricePredicate = s->s.getPrice()<30000f;
		
		List<Product> newFilteredList=productList.stream().filter(pricePredicate.negate()).collect(Collectors.toList());
		System.out.println("New Filtered List"+newFilteredList);

		
		Long count =productList.stream().filter(pricePredicate.negate()).collect(Collectors.counting());
		System.out.println("Filtered Count is "+count);
		
		Double averageCost =productList.stream().filter(pricePredicate.negate()).collect(Collectors.averagingDouble(Product::getPrice));
		System.out.println("Filtered Count is "+averageCost);
		
		List<Float>filteredPrice = productList.stream().
				filter(pricePredicate).
				map(x->x.getPrice())
				//.skip(2)
				//.limit(5)
				//.distinct()
				
				.collect(Collectors.toList());
		System.out.println("Filtered priceList is "+filteredPrice);
		
		
		
		Collections.sort(filteredPrice);
		System.out.println(filteredPrice);
		
		System.out.println("Cosxunt is "+ productList.stream().
				filter(pricePredicate).
				map(x->x.getPrice())
				.count());
		
		
		  Map<Float, Long> result =	productList.stream().
				filter(pricePredicate).
				map(x->x.getPrice())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Filtered priceList is "+result);
		
		Double sum=  productList.stream().
					filter(pricePredicate).
					map(x->x.getPrice())
					.collect(Collectors.summingDouble(f->f));
		
		System.out.println("Double sum is "+sum);
		
		
		List<Integer> intList = IntStream.range(1, 100).boxed().collect(Collectors.toList());
		
		Stream<Integer> seqStream = intList.stream();
		
		Stream<Integer> perStream = intList.parallelStream();
		
		seqStream.filter(p -> p > 50).forEach(p-> System.out.println("Seq stream  "+p));
		
		perStream.filter(p -> p > 50).forEach(p-> System.out.println("Per stream  "+p));
		
		
	}
}
