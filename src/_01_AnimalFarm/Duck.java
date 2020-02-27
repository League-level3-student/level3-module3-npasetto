package _01_AnimalFarm;

public class Duck extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Quuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaccccccccccccccccccccccccccccccccccccccccckkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
	}

	@Override
	public void talk(String s) {
		// TODO Auto-generated method stub
		String[] stuff=s.split(" ");
		String talkString="";
		for (String string : stuff) {
			talkString+="Q";
			for (int i = 0; i < string.length(); i++) {
				if(i<string.length()/2) {
					talkString+="u";
				}else {
				talkString+="a";
				}
			}
			talkString+="ck ";
		}
		System.out.println(talkString);
	}

}
