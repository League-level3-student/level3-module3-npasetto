package _01_AnimalFarm;

public class Cow extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Mooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
		
	}

	@Override
	public void talk(String s) {
		String[] stuff=s.split(" ");
		String talkString="";
		for (String string : stuff) {
			talkString+="M";
			for (int i = 0; i < string.length(); i++) {
				talkString+="o";
			}
			talkString+=" ";
		}
		System.out.println(talkString);
	}

}
