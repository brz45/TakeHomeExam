import java.lang.*;
import java.io.*;
import java.util.*;
public class StringReverse {
	public String reverseString(String str) {
		if (str == null) {
			String res = "null";
			return res;
		}
		String output = "";
		for (int i = str.length() -1; i >=0; i--) {
			output = output +str.charAt(i);
		}
	return output;
	}
}