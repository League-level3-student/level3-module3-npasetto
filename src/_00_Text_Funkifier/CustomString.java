package _00_Text_Funkifier;

public class CustomString extends SpecialString{
	public CustomString(String s) {
		
		super(s);
		//System.out.println(s);
	}

	@Override
	public String funkifyText(String s) {
		String newString="";
		for (int i = 0; i < s.length()-2; i+=3) {
			newString+=(s.charAt(i+2)+"")+(s.charAt(i+1)+"")+(s.charAt(i)+"");
		}
		newString+=s.substring(newString.length());
		//System.out.println(newString);
		return newString;
	}
}
