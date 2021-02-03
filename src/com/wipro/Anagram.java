package com.wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
	public static void main(String[] args) {
		String[] words = {"CAT","DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET","EST"};
		Map<String, List<String>> map= new LinkedHashMap<>();
		Arrays.stream(words).forEach(word -> {
			char[] chars = word.toCharArray();
 			Arrays.sort(chars);
 			String key = String.valueOf(chars);
			if(map.containsKey(key)){
				map.get(key).add(word);
			}else{
				List<String> list = new ArrayList<>();
				list.add(word);
				map.put(key, list);
			}
		});
		System.out.println(map.values());
	}
}
