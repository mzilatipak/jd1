package by.htp.tasks08_01_Text;

import java.util.ArrayList;
import java.util.List;

public class Text {
	String title = "yo-ho-ho!";
	List<Sentence> text = new ArrayList<Sentence>();
	
	
	public void addText (Sentence sentence) {
		text.add(sentence); //add dobavlyaet chto-to odno, addAll - vsyu kollekciyu
	}
	
	public void printText() {
		for (int i = 0; i < text.size(); i++) { //perebor lista sentensa
			for (int j = 0; j < text.get(i).getSentence().size(); j++) { //perebor lista word-ov
			System.out.print(text.get(i).getSentence().get(j).getWord() + " ");
			}
		}
	}

	public Text(String title, List<Sentence> text) {
		this.title = title;
		this.text = text;
	}

	public Text() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}
}
