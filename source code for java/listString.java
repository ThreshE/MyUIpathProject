package listString;

import java.util.ArrayList;
import java.util.List;

public class listString {
	public static List<String> getStr(){
		List<String> list = new ArrayList<String>();
		list.add("��");
		list.add("��");
		return list;
	}
	public static void main(String[] args) {
		System.out.println(getStr());
		
	}

}