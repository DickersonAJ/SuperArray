public class SuperArrayTester {

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println( words.size() );
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.set(0, "hello"));
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    for (int i = words.size(); i < 30; i++) {
      words.add("constructors aren't void");
    }
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    SuperArray empty = new SuperArray();
    System.out.println(empty.isEmpty());
    System.out.println(words.isEmpty());
    //words.clear();
    //System.out.println(words.isEmpty());
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.toString());
    System.out.println(words.contains("hello"));
    System.out.println(words.contains("adios"));
  }

}
