package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newString="";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				newString+=(s.charAt(i)+"").toLowerCase();
			} else {
				newString+=(s.charAt(i)+"").toUpperCase();
			}
		}
		return newString;
	}

}
