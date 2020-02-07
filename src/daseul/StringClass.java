package daseul;

public class StringClass {
	/** String(String s)
	 * 주어진 문자열(s)를 갖는 String 인스턴스를 생성한다.
	 * 예제)String s = new String("Hello");
	 * 결과)s = "Hello"
	 * 
	 * String(Char[] value)
	 * 주어진 문자열(value)를 갖는 String 인스턴스를 생성한다.
	 * 예제)char[] c = {'H','E','L','L','O'};
	 * 	   String s = new String (c);
	 * 결과)s = "Hello"
	 * 
	 * String(StringBuffer buf)
	 * StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String 
	 * 인스턴스를 생성한다.
	 * 예제)StringBuffer sb = 
	 * 			new StringBuffer ("Hello");
	 * 	   String s = new String (sb);
	 * 결과)s = "Hello"
	 * 
	 * Char charAt(int index)
	 * 저장된 위치(index)에 있는 문자를 알려준다.
	 * (index)는 0부터 시작
	 * 예제) String s = "Hello";
	 * 		String n = "0123456";
	 * 	 	char c = s.charAt(1);
	 * 		char c2 = n.charAt(1);
	 * 결과) c = 'e'
	 * 		c2 = '1'
	 * 
	 * int comparaTo (String str)
	 * 문자열(str)과 사전순서로 비교한다.
	 * 같으면 0을, 사전순서로 이전이면 음수를, 이후면 양수를 반환한다.
	 * 예제)int i = "aaa".compareTo("aaa"); 
	 * 	   int i2 = "aaa".comparaTo("bbb");
	 *	   int i3 = "bbb".comparaTo("aaa");
	 * 결과) i = 0
	 * 		i2 = -1
	 * 		i3 = 1
	 * 
	 * String concat(String str)
	 * 문자열을 뒤에 덧붙인다.
	 * 예제)String s = "abcedfg";
	 *     String s2 = s.concat("World")
	 * 결과) s2 = "Hello World"
	 * 
	 * boolean contain (CharSequence s)
	 * 지정된 문자열(s)이 포함되었는지 검사한다.
	 * 예제) String s = "abcedfg";
	 * 		boolean b = s.contains("bc");
	 * 결과)b = true
	 * 
	 * boolean endsWith(String suffix)
	 * 지정된 문자열(suffix)로 끝나는지 검사한다.
	 * 예제)String file = "Hello.txt";
	 * 	   boolean b = file.endsWith("txt");
	 * 결과) b = true
	 * 
	 * boolean equals(Object obj)
	 * 매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교한다. 
	 * obj가 String 이 아니거나 문자열이 다르면 false를 반환한다. 
	 * 예제)String s = "Hello";
	 * 	   boolean b = s.equals("Hello");
	 * 	   boolean b2 = s.equals("hello");
	 * 결과) b = true
	 * 	    b2 = false
	 * 
	 * boolean equalsIgnoreCase(String str)
	 * 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교한다. 
	 * 예제) String s = "Hello";
	 * 	    boolean b = s.equalsIgnoreCase("Hello");
	 * 	    boolean b2 = s.equalsIgnoreCase("heLLo");
	 * 	
	 * 결과) b = true
	 * 		b2 = true
	 * 
	 * int indexOf(int ch)
	 * 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
	 * 못 찾으면 -1을 반환한다. (index는 0부터 시작)
	 * 예제)String s = "Hello";
	 * 	   int idx1 = s.indexOf('o');
	 * 	   int idx2 = s.indexOf('k');
	 * 결과)idx1 = 4
	 * 	   idx2 = -1
	 * 
	 * int indexOf(int ch, int pos)
	 * 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여
	 * 위치(index)를 알려준다. 못 찾으면 1을 반환한다.(index는 0부터 시작)
	 * 예제)String s = "Hello";
	 * 	   int idx1 = s.indexOf('e', 0);
	 * 	   int idx2 = s.indexOf('e', 2);
	 * 결과)idx1 = 1
	 * 	   idx2 = -1
	 * 
	 * 
	 * int indexOf(String str)
	 * 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다.
	 * 없으면 -1을 반환한다.(index는 0부터 시작)
	 * 예제)String s = "ABCDEFG";
	 * 	   int idx = s.indexOf("CD");
	 * 결과)idx = 2
	 * 
	 * 
	 * String intern()
	 * 문자열을 상수풀(constant pool)에 등록한다.
	 * 이미 그 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소 값을 반환한다.
	 * 예제)String s = new String("abc");
	 * 	   String s2 = new String("abc");
	 * 	   boolean b = (s==s2);
	 * 	   boolean b2 = s.equals(s2);
	 * 	   boolean b3 = (s.intern() == s2.intern());
	 * 결과)b = false
	 * 	   b2 = true
	 * 	   b3 = true
	 * 
	 * int lastIndexOf(int ch)
	 * 예제)String s = "java.lang.Object";
	 * 	   int idx1 = s.lastIndexOf('.');
	 * 	   int idx2 = s.IndexOf('.');
	 * 결과)idx = 9
	 * 	   idx = 4
	 * 
	 * 
	 * int lastIndexOf(String str)
	 * 예제)String s = "java.lang.java";
	 * 	   int idx1 = s.lastIndexOf("java");
	 * 	   int idx2 = s.IndexOf("java");
	 * 결과)idx = 10
	 * 	   idx = 0
	 * 
	 * int length()
	 * 예제)String s = "Hello";
	 * 	   int length = s.length();
	 * 결과)length = 5
	 * 
	 * String replace(char old, char nw)
	 * 예제)String s = "Hello";
	 * 	   String s1 = s.replace('H,'C');
	 * 결과)s1 = "Cello"
	 * 
	 * 
	 * String replace(CarSequence old, CharSequence nw)
	 * 예제)String s = "Hellollo";
	 * 	   String s1 = s.replace('H,'LL');
	 * 결과)s1 = "HeLLoLLo"
	 * 
	 * String replaceAll (String regex, String replacement)
	 * 예제)String ab = "AABBAABB";
	 * 	   String r = ab.replaceAll("BB","bb");
	 * 결과)r = "AAbbAAbb"
	 * 
	 * String replaceFirst(String regex, String replacement)
	 * 예제)String ab = "AABBAABB";
	 * 	   String r = ab.replaceFirst("BB","bb");
	 * 결과)r = "AAbbAABB"
	 * 
	 * String[] split(String regex)
	 * 예제)String animals = "dog,cat,bear"
	 * 	   String[] arr = ainmals.split(",");
	 * 결과)arc[0] = "dog"
	 * 	   arr[1] = "cat"
	 * 	   arr[2] = "bear"
	 * 
	 * String[] split(String regex, int limit)
	 * 예제)String animals = "dog,cat,bear"
	 * 	   String[] arr = ainmals.split(",",2);
	 * 결과)arr[0] = "dog"
	 * 	   arr[1] = "cat,bear"
	 * 
	 * boolean startsWith(String prefix)
	 * 예제)String s = "java.lang.Object"
	 * 	   boolean b =  s.startsWith("java")
	 * 	   boolean b2 = s.startsWith("lang")
	 * 결과)b = "true"
	 * 	   b2 = "false"
	 * 
	 * String substring(int begin)
	 * String substring(int begin, int end)
	 * 예제)String s = "java.lang.Object"
	 * 	   boolean c =  s.substring("Object")
	 * 	   boolean p = s.substring("lang")
	 * 결과) c = "Object"
	 * 	    p = "lang"
	 * 
	 * 
	 * Stirng toLowerCase()
	 * 예제)String s = "Hello";
	 * 	   String s1 = s.toLowerCase();
	 * 결과)s1 = "hello"
	 * 
	 * String toString()
	 * 예제)String s = "Hello";
	 * 	   String s1 = s.toString();
	 * 결과)s1 = "hello";
	 * 
	 * String toUpperCase()
	 * 예제)String s = "Hello";
	 * 	   String s1 = s.toUpperCase();
	 * 결과)s1 = "HELLO";
	 * 
	 * String trim()
	 * 예제)String s = "      Hello World       ";
	 * 	   String s1 = s.trim();
	 * 결과)s1 = "Hello World";
	 * 
	 * Static String valueOf (boolean b)
	 * Static String valueOf (char c)
	 * Static String valueOf (int i)
	 * Static String valueOf (long l)
	 * Static String valueOf (float f)
	 * Static String valueOf (double d)
	 * Static String valueOf (Object o)
	 * 예제)String b = String.valueOf(true)
	 * 	   String c = String.valueOf('a')
	 * 	   String i = String.valueOf(100)
	 *     String l = String.valueOf(100L)
	 *     String f = String.valueOf(10f)
	 *     String d = String.valueOf(10.0)
	 *     java.util.Date dd = new java.util.Date();
	 *     String date = String.valueOf(dd);
	 * 결과)
	 * b="true"
	 * c="a"
	 * i="100"
	 * l="100"
	 * f="10.0"
	 * d="10.0"
	 * date= "Wed Jan 27 21:26:29 KST 2016"
	 * 
	 * 
	 * 
	 **/
}
