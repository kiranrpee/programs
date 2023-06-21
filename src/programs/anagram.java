package programs;

import java.util.Iterator;
import java.util.TreeSet;

public class anagram
{

public static void main(String[] args) 
{

	String s="race";
	String s1="acer";
	String s2="";
	String s3="";
	
	TreeSet<Character> t=new TreeSet<>();
	for(int i=0;i<s.length();i++)
	{
		t.add(s.charAt(i));
	}
	
	for(Character ch:t)
	{
		s2=s2+ch;
	}
	
	//System.out.println(s2);
	
	TreeSet<Character> t1=new TreeSet<>();
	for(int i=0;i<s1.length();i++)
	{
		t1.add(s1.charAt(i));
	}
	
	for(Character ch:t1)
	{
		s3=s3+ch;
	}
	
//	System.out.println(s2);
	//System.out.println(s3);
	
	if(s2.equals(s3))
	{
		System.out.println("angram");
	}
	else
	{
		System.out.println("not anagram");
	}
	
	
}
}
