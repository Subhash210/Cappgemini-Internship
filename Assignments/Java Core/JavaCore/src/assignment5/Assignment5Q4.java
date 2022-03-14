package assignment5;


class Pair<K, V> {
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		return value;
	}}
public class Assignment5Q4{
	
	public static void main(String[] args) {
		
		Pair<String, String> p1=new Pair<String, String>();
		p1.setKey("1");
		p1.setValue("Hello");
		System.out.println(p1.getKey()+" "+p1.getValue());

		Pair<String,java.util.Date> pair2 = new Pair<>();
		pair2.setKey("Today is: ");
		pair2.setValue(new java.util.Date());
		System.out.println(pair2.getKey()+" "+pair2.getValue());
	}

}