package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Farm {
	static Random rand=new Random();
	static ArrayList<Animal> animals=new ArrayList<Animal>();
public static void main(String[] args) {
	for (int i = 0; i < 6; i++) {
		int rnd=rand.nextInt(4);
		switch (rnd){
			case 0:
				animals.add(new Cow());
				break;
			case 1:
				animals.add(new Duck());
				break;
			case 2:
				animals.add(new Pig());
				break;
			case 3:
				animals.add(new Thing());
				break;
		}
	}
	while(true) {
		for (Animal a : animals) {
			a.makeNoise();
			a.talk("I am an animal. What animal are you? This is a long word: bfdajisbvoajbzbzbijdvzsfdvn");
		}
	}
}
}
