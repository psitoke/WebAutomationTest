import java.util.ArrayList;
import java.util.stream.Stream;

public class javaStreams {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

names.add("Avishi"); names.add("Anvit");  names.add("Ahan");
names.add("akila");  names.add("durgesh"); names.add("abhinav"); names.add("Annie");
		
System.out.println("Names ending with letter n :");

Stream.of("Avishi", "Anvit", "Ahan", "Ahan", "durgesh").filter(s -> s.endsWith("n"))
				.forEach(s -> System.out.println(s));
// List<String> fName=Arrays.asList("Avishi", "Anvit", "Ahan", "Ahan","durgesh");

System.out.println("Names starting with letter a : ");
		names.stream().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));
	
System.out.println("Names starting with letter A");
		names.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
	}

}
