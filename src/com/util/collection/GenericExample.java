package com.util.collection;

import java.util.ArrayList;
import java.util.List;
 class FruitOne{

	@Override
	public String toString() {
		return "i am  a Fruit !!";
	}
	 
 }
 class AppleOne extends FruitOne{

	@Override
	public String toString() {
		return "i am an apple !!";
	}
	 
 }
 class AsianApple extends AppleOne{

	@Override
	public String toString() {
		return "I am an AsianApple !!";
	}
	 
 }

public class GenericExample {
 public static void main(String[] args) {
	List<AppleOne> apples=new ArrayList<AppleOne>();
	apples.add(new AppleOne());
	List<?extends FruitOne> basket=apples;
	for (FruitOne fruit:basket){
		System.out.println(fruit);
	}
	List<? extends FruitOne> basketOne=new ArrayList<AppleOne>();
	//basket.add(new AppleOne());
	//basket.add(new AsianApple());
	//basket.add(new FruitOne());
}
}
