class StringMethods

{

public static void main(String args[])
{

int i;
String s1 = "Java";
String s2 = "Programming";

System.out.println("Concat: "+s1.concat(s2));

System.out.println("Length: "+s2.length());

System.out.println("Charecter at index: "+s2.charAt(5));

System.out.println("Equals: "+s1.equals(s2));

System.out.println("Comparing: "+s1.compareTo(s2));

System.out.println("Starts with: "+s2.startsWith("P"));

System.out.println("Ends with: "+s2.endsWith("ing"));

System.out.println("Index of: "+s1.indexOf("J"));

System.out.println("Last index: "+s2.lastIndexOf("m"));
System.out.println("Substring: "+s2.substring(4));

System.out.println("Change to lower case: "+s1.toLowerCase());

System.out.println("change to upper case: "+s2.toUpperCase());

System.out.println("Reoving white spaces: "+s1.trim());

String a[] = s1.split("");

System.out.println("Splitting string");

for(i=0;i<a.length;i++)
{
 
System.out.println(a[i]);

}

System.out.println("Replacing the string: "+s1.replace("v","1"));

System.out.println("Compare while ignoring the case: "+s1.equalsIgnoreCase("JAVA"));

}

}