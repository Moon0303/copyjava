package api02.util.stringTokenize;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer tok = new StringTokenizer("Hello Java a b c d e");
		while (tok.hasMoreTokens()) {
			String token = tok.nextToken();
			System.out.print("\t" + token);
}
}
}
