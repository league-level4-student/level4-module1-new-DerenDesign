package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String text = "";
		for (int i = 0; i < unfunkifiedText.length(); i++) {
		if(i%2!=0) {
			char text2 = Character.toUpperCase(unfunkifiedText.charAt(i));
			text = text + text2;
		}
		else {
			char text2 = Character.toLowerCase(unfunkifiedText.charAt(i));
			text = text + text2;
		}
		
		}
	
		return text;
	}

}
