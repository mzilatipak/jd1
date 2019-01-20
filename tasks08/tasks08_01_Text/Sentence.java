package by.htp.tasks08_01_Text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> sentence = new ArrayList<Word>(); //obj sent-s - soderjit links na arrList
/*
	public void printSentence() {
		for (int i = 0; i < sentence.size(); i++) {
			System.out.print(sentence.get(i).getWord() + " ");
		}
	}
*/
	public void addWord(Word word) {
		sentence.add(word);
	}

	public Sentence(ArrayList<Word> sentence) {
		this.sentence = sentence;
	}

	public Sentence() {
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(ArrayList<Word> sentence) {
		this.sentence = sentence;
	}
}
