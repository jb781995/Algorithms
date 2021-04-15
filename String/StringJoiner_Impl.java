package Geeks.String;

import java.util.StringJoiner;

public class StringJoiner_Impl {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("&", "?","");
		sj1.setEmptyValue("");
		//sj1.add("Meera").add("Bharadwaj").add("Madly").add("Loves").add("Each Other");
		System.out.println(sj1);
		String preset = "preset";
		String imageModifiers = "imageModifiers";
		if(!preset.isBlank())
			sj1.add("$"+preset+"$");
		if(!imageModifiers.isEmpty())
			sj1.add(imageModifiers);
		
		String res = "publishServer"+"/"+"is/image/"+"s7File"+sj1.toString();
		System.out.println("DM Image URL: "+res);

	}

}
