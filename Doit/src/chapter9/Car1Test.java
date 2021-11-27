package chapter9;

import java.util.ArrayList;

import template.Car;

public class Car1Test {
	public static void main(String[] args) {
		ArrayList<Car1> carList = new ArrayList<Car1>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car1 car1 : carList) {
			car1.running();
			System.out.println("==================");
		}
	}
}
