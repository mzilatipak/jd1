package by.htp.tasks08_01_Text;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		Word word01 = new Word("ble!");
		Word word02 = new Word("bla!");
		Word word03 = new Word("blu!");
		Word word04 = new Word("ole!");
		Word word05 = new Word("ela!");
		Word word06 = new Word("uga!");
		
		Sentence sent = new Sentence();
		sent.addWord(word01);
		sent.addWord(word02);
		sent.addWord(word03);
		
		Text txt = new Text();
		txt.addText(sent);
		
		Sentence sent2 = new Sentence();
		sent2.addWord(word04);
		sent2.addWord(word05);
		sent2.addWord(word06);
		txt.addText(sent2);
		
		System.out.print(txt.getTitle() + "\n");
		txt.printText(); 
//		txt.addText(sentence.);
//		System.out.println(txt);
		
//		txt.printText(text);
	}

}
