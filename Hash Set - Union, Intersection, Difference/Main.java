import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Set<String> s1 = new HashSet<>();
    s1.add("XML");
    s1.add("Json");
    s1.add("Java");


    Set<String> s2 = new HashSet<>();
    s2.add("Python");
    s2.add("Ruby");
    s2.add("Json");

  
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);


    performUnion(s1, s2);
    performIntersection(s1, s2);
    performDifference(s1, s2);
    testForSubset(s1, s2);
  }

  public static void performUnion(Set<String> s1, Set<String> s2) {
    Set<String> s1Unions2 = new HashSet<>(s1);
    s1Unions2.addAll(s2);
    System.out.println("s1 union s2: " + s1Unions2);
  }

  public static void performIntersection(Set<String> s1, Set<String> s2) {
    Set<String> s1Intersections2 = new HashSet<>(s1);
    s1Intersections2.retainAll(s2);
    System.out.println("s1 intersection s2: " + s1Intersections2);
  }

  public static void performDifference(Set<String> s1, Set<String> s2) {
    Set<String> s1Differences2 = new HashSet<>(s1);
    s1Differences2.removeAll(s2);

    Set<String> s2Differences1 = new HashSet<>(s2);
    s2Differences1.removeAll(s1);

    System.out.println("s1 difference s2: " + s1Differences2);
    System.out.println("s2 difference s1: " + s2Differences1);
  }

  public static void testForSubset(Set<String> s1, Set<String> s2) {
    System.out.println("s2 is subset s1: " + s1.containsAll(s2));
    System.out.println("s1 is subset s2: " + s2.containsAll(s1));
  }
}