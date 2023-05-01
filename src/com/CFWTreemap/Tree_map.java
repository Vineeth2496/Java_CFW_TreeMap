package com.CFWTreemap;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap car=new TreeMap();
		System.out.println("Before Vehicles:"+car);
		car.put("Toyota", "Fortuner, Urban Cruiser, Innova Crysta");
		car.put("Mahindra", "Scorpio, XUV-700, THAR, Bolero");
		car.put("Land_Rover", "Range Rover, Defender, Evoque");
		car.put("Mercedes_Benz", "GLA, C-Class, G-Class, S-Class");
		System.out.println("Favorite Vehicles: "+car.toString());
		//  public int size();
		//	To check the size of TreeMap.
		System.out.println("Vehicles Manufacturer companies: "+car.size()+"\n");
		
		//  public boolean containsKey(java.lang.Object);
		//	To check key is contains in TreeMap or not and get the value using get method.
		String c;
		System.out.println("Enter Car Manufacturer: ");
		Scanner sc=new Scanner(System.in);
		c=sc.next();
		if (car.containsKey(c)) {
			System.out.println("Car Manufracturer: "+c+"\n"+"Available cars: "+car.get(c));
		}
		else {
			System.out.println("Car Manufracturer: "+c+"\n"+"Cars are Available ");
		}
		
		//  public boolean containsValue(java.lang.Object);
		System.out.println("Mercedes_Benz make cars are GLA, C-Class, G-Class, S-Class: "+car.containsValue("GLA, C-Class, G-Class, S-Class"));
		//  public V get(java.lang.Object);
		System.out.println("Mahindra cars are: "+car.get("Mahindra"));
		//  public java.util.Comparator<? super K> comparator();
		//  public K firstKey();
		//	To get First Key content as per sequential order (Alphabetic order). 
		System.out.println("First Manufracturer company: "+car.firstKey());;
		//  public K lastKey();
		//	To get Last Key content as per sequential order (Alphabetic order).
		System.out.println("First Manufracturer company: "+car.lastKey());
		//  public V putIfAbsent(K, V);
		//	To add TreeMap of content, if content is not there then to Add content will use computeIfAbsent method and values to compute.
		car.putIfAbsent("Audi", "A4, A6, Q5, Q7");
		System.out.println("Audi Manufracture inculding: "+car);
		//  public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
		//  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		//  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		//  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
		//  public V remove(java.lang.Object);
		System.out.println("Removing Audi cars: "+car.remove("Audi"));
		System.out.println("After removing Audi Manufracture: "+car);
		//  public void clear();
		car.clear();
		System.out.println("After clearing all Manufracture: "+car);
		
		//  public java.lang.Object clone();
		//	To create duplicate Object using clone method.
		GregorianCalendar cal=new GregorianCalendar();
		GregorianCalendar y=(GregorianCalendar)cal.clone();
		System.out.println(" "+cal.getTime());
		System.out.println(" "+y.getTime());
		//	public java.util.Map$Entry<K, V> firstEntry();
		//	To Check First entry of content as per sequential order
		TreeMap bike=new TreeMap();
		bike.put("Yamaha", "RX100, RX135, R15, FZ, Fascino");
		bike.put("Honda", "CBR, CB Unicorn, CB Shine, Activa");
		bike.put("Hero", "Glamour, Passion, Mastro");
		bike.put("Bajaj", "Avenger, Pulsar220, Pulsar NS200, Platina");
		System.out.println("Bikes: "+bike);
		System.out.println("First Bike Manufracture: "+bike.firstEntry());
		//	public java.util.Map$Entry<K, V> lastEntry();
		// To check last entry of content as per sequential order
		System.out.println("Last Bike Manufracture: "+bike.lastEntry());
		//  public java.util.Map$Entry<K, V> pollFirstEntry();
		//	To check first entry of as per sequential order.
		System.out.println("Poll First Entry of Bikes: "+bike.pollFirstEntry());
		//  public java.util.Map$Entry<K, V> pollLastEntry();
		//	To check first entry of as per sequential order.	
		System.out.println("Poll Last Entry of Bikes: "+bike.pollLastEntry());
		//  public java.util.Map$Entry<K, V> lowerEntry(K);
		//	to check lower entry value means before last entry value.
		System.out.println(bike.lastEntry());
		//  public K lowerKey(K);
		//	to check lower enter key means before last entry key. 
		System.out.println("LowerKey of Honda Manufracture: "+bike.lowerKey("Honda"));
		//  public java.util.Map$Entry<K, V> floorEntry(K);
		//	to get current HashMap as per floorEntry method.
		System.out.println("FloorEntry of Honda Manufracture: "+bike.floorEntry("Honda"));
		//  public K floorKey(K);
		//	to check current HashMap Key, using floorKey method.
		System.out.println("FloorKey of Hero Manufracture: "+bike.floorKey("Hero"));
		//  public java.util.Map$Entry<K, V> ceilingEntry(K);
		//	to check current class key and value using ceilingEntry if Integer values are not there then it will default take top of the value.
		System.out.println("Hero manufracture: "+bike.ceilingEntry("Hero"));
		//  public K ceilingKey(K);
		//	to check key content using ceilingKey method.
		System.out.println("Honda Manufracture: "+bike.ceilingKey("Honda"));
		//  public java.util.Map$Entry<K, V> higherEntry(K);
		//	To check the next higher entry of key and Values using HashMap using higherEntry method.
		System.out.println("HigherEntry of Yamaha Manufracture: "+bike.higherEntry("Bajaj"));
		//  public K higherKey(K);
		//	To check the next higher entry of key using HashMap using higherEntry method.
		System.out.println(bike.higherKey("HigherKey of the Hero Manufracture: "+"Bajaj"));
		//  public java.util.Set<K> keySet();
		//	to get Key content using Set and keySet.
		Set key=bike.keySet();
		System.out.println("Bike Manufractures: "+key);
		//  public java.util.NavigableSet<K> navigableKeySet();
		//	to get navigable key content in Ascending order
		TreeMap mw=new TreeMap();
		mw.put(1997, "Miss World - Diana Hayden");
		mw.put(1994, "Miss World - Aishwarya Rai");
		mw.put(1999, "Miss World - Yukta Mookhey");
		mw.put(2000, "Miss World - Priyanka Chopra");
		mw.put(2017, "Miss World - Manushi Chhillar");
		System.out.println("Miss World Winner of India: "+mw);
		System.out.println("India's Miss World Awards: "+mw.navigableKeySet());
		//  public java.util.NavigableSet<K> descendingKeySet();
		//	to get of key content in descending order
		NavigableSet N=mw.descendingKeySet();
		System.out.println("Descending Order of Miss World Years of India: "+N);
		//  public java.util.Collection<V> values();
		//	to get values of content using values method.
		System.out.println("Miss World's of India "+mw.values());
		//  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
		//	to make pair of data and to do fetching
		Set S=mw.entrySet();
		System.out.println("After Set the TreeMap"+S);
		System.out.println("\n"+"Fetching using Iterator method "+"\n");
		Iterator i=S.iterator();
		for(;i.hasNext();)
		{
			System.out.println(i.next());
		}
	}

}
/*

C:\Users\vinee>javap java.util.TreeMap
Compiled from "TreeMap.java"
public class java.util.TreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.util.NavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable {
  public java.util.TreeMap();
  public java.util.TreeMap(java.util.Comparator<? super K>);
  public java.util.TreeMap(java.util.Map<? extends K, ? extends V>);
  public java.util.TreeMap(java.util.SortedMap<K, ? extends V>);
  public int size();
  public boolean containsKey(java.lang.Object);
  public boolean containsValue(java.lang.Object);
  public V get(java.lang.Object);
  public java.util.Comparator<? super K> comparator();
  public K firstKey();
  public K lastKey();
  public void putAll(java.util.Map<? extends K, ? extends V>);
  final java.util.TreeMap$Entry<K, V> getEntry(java.lang.Object);
  final java.util.TreeMap$Entry<K, V> getEntryUsingComparator(java.lang.Object);
  final java.util.TreeMap$Entry<K, V> getCeilingEntry(K);
  final java.util.TreeMap$Entry<K, V> getFloorEntry(K);
  final java.util.TreeMap$Entry<K, V> getHigherEntry(K);
  final java.util.TreeMap$Entry<K, V> getLowerEntry(K);
  public V put(K, V);
  public V putIfAbsent(K, V);
  public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  public V remove(java.lang.Object);
  public void clear();
  public java.lang.Object clone();
  public java.util.Map$Entry<K, V> firstEntry();
  public java.util.Map$Entry<K, V> lastEntry();
  public java.util.Map$Entry<K, V> pollFirstEntry();
  public java.util.Map$Entry<K, V> pollLastEntry();
  public java.util.Map$Entry<K, V> lowerEntry(K);
  public K lowerKey(K);
  public java.util.Map$Entry<K, V> floorEntry(K);
  public K floorKey(K);
  public java.util.Map$Entry<K, V> ceilingEntry(K);
  public K ceilingKey(K);
  public java.util.Map$Entry<K, V> higherEntry(K);
  public K higherKey(K);
  public java.util.Set<K> keySet();
  public java.util.NavigableSet<K> navigableKeySet();
  public java.util.NavigableSet<K> descendingKeySet();
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public java.util.NavigableMap<K, V> descendingMap();
  public java.util.NavigableMap<K, V> subMap(K, boolean, K, boolean);
  public java.util.NavigableMap<K, V> headMap(K, boolean);
  public java.util.NavigableMap<K, V> tailMap(K, boolean);
  public java.util.SortedMap<K, V> subMap(K, K);
  public java.util.SortedMap<K, V> headMap(K);
  public java.util.SortedMap<K, V> tailMap(K);
  public boolean replace(K, V, V);
  public V replace(K, V);
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  java.util.Iterator<K> keyIterator();
  java.util.Iterator<K> descendingKeyIterator();
  final int compare(java.lang.Object, java.lang.Object);
  static final boolean valEquals(java.lang.Object, java.lang.Object);
  static <K, V> java.util.Map$Entry<K, V> exportEntry(java.util.TreeMap$Entry<K, V>);
  static <K, V> K keyOrNull(java.util.TreeMap$Entry<K, V>);
  static <K> K key(java.util.TreeMap$Entry<K, ?>);
  final java.util.TreeMap$Entry<K, V> getFirstEntry();
  final java.util.TreeMap$Entry<K, V> getLastEntry();
  static <K, V> java.util.TreeMap$Entry<K, V> successor(java.util.TreeMap$Entry<K, V>);
  static <K, V> java.util.TreeMap$Entry<K, V> predecessor(java.util.TreeMap$Entry<K, V>);
  void readTreeSet(int, java.io.ObjectInputStream, V) throws java.io.IOException, java.lang.ClassNotFoundException;
  void addAllForTreeSet(java.util.SortedSet<? extends K>, V);
  static <K> java.util.Spliterator<K> keySpliteratorFor(java.util.NavigableMap<K, ?>);
  final java.util.Spliterator<K> keySpliterator();
  final java.util.Spliterator<K> descendingKeySpliterator();
  static {};
}

C:\Users\vinee>
 */
