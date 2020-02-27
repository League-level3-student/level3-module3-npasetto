package _01_AnimalFarm;

public class Thing extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("T-_i__ng_gniht _hin_ing _thhi-inng");
	}

	@Override
	public void talk(String s) {
		// TODO Auto-generated method stub
		String[] stuff=s.split(" ");
		String talkString="";
		for (String string : stuff) {
			talkString+="th";
			for (int i = 0; i < string.length(); i++) {
				if(i<string.length()/2) {
					talkString+="t_th_th";
				}else {
				talkString+="i_hi_ih";
				}
			}
			talkString+="ing ";
		}
		System.out.println(talkString);
	}

}
