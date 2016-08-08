package books;

import java.util.HashMap;

public class Book {
	
	String name;
	HashMap<String,Integer> wordFrequency;
	int nPara;
	double avgParaLength;
	double avgSentenceLength;
	double avgWordLength;
	double punctDensity;
	int totalWords;
	int uniqueWords;
	double vocab;
	double[] letterFrequency;
	double  wordToSentenceRatio;
	
	public Book()
	{
		this.wordFrequency = new HashMap<String,Integer>();
		this.letterFrequency = new double[26];
	}
}
