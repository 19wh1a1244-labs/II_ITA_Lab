class StringBuffer
{

public static void main(String[] args)
{

StringBuffer s1 = new StringBuffer("Java");

StringBuffer s2 = new StringBuffer("Programming");

System.out.println("Appending: "+s1.append(s2));

System.out.println("Inserting: "+s1.insert(0,"Hello"));

System.out.println("deleting: "+s2.delete(0,2));

System.out.println("Delete char at: "+s2.deleteCharAt(5));

System.out.println("Reversing: "+s1.reverse());

System.out.println("Replaceing: "+s2.replace(0,2,"Hi"));

System.out.println("position of char: "+s1.charAt(3));

System.out.println("sub string: "+s2.substring(3,6));
System.out.println("Substring: "+s2.substring(4));
System.out.println("index of charecter: "+s2.indexOf("m"));

System.out.println("Last index of: "+s2.lastIndexOf("m"));

StringBuffer s3 = new StringBuffer("Hello");

System.out.println("Printing index of second l:"+s3.indexOf("l",2));

}

}