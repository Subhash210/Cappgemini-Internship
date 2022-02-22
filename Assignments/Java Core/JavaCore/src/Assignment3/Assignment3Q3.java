package Assignment3;

public class Assignment3Q3 {
	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		//Question a
		System.out.println(str.toLowerCase());
		//Question b
		System.out.println(str.toUpperCase());
		//Question c
		System.out.println(str.replace('a', '$'));
		//Question d
		System.out.println(str.contains("collection"));
		//Question e
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.equals(str1));
		//Question f
		System.out.println(str.equalsIgnoreCase(str1));
	}
}
