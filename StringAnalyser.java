package task2.corejava;

public class StringAnalyser {

	public static void main(String[] args) {
		String sentence="Hello this is java";
		String[] wordct=sentence.split(" ");
		int wc=0,ct=0;
		//wordcount
		for(int i=0;i<wordct.length;i++) {
			wc++;
		}
		System.out.println("Word count:"+wc);
	    String result = sentence.replaceAll("\\s", "");
	    ct=result.length();
		System.out.println("Character count:"+ct);
	}

}
