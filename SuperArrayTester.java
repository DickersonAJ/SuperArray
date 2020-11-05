public class SuperArrayTester {

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println( words.size() );
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    words.add(1, "hola");
    System.out.println(words.toString());
    words.add(6, "hola");
    words.add(0, "hola");
    System.out.println(words.toString());
    words.remove(1);
    System.out.println(words.toString());
    for (int i = words.size(); i < 100; i++) {
      words.add("constructors aren't void");
    }
    System.out.println(words.toString());
    System.out.println(words.indexOf("uni"));
    System.out.println(words.indexOf("xsdfrcgthjykbv"));
    /*for(int i = 0; i < words.size(); i++){
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
    SuperArray big = new SuperArray(100);*/
  }

}
