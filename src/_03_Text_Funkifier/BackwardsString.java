package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String text = "";
    	for(int i = unfunkifiedText.length()-1; i >= 0; i--) {
    		text = text + unfunkifiedText.charAt(i);
    	}
        return text;

    }

}
