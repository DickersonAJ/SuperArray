public class SuperArrayTester {

  public static void main(String[] args) {
    /*SuperArray words = new SuperArray();
    System.out.println( words.size() );
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    words.add(1, "hola");
    System.out.println(words.toString());
    words.add(4, "hola");
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
    System.out.println(words.toArray());
    System.out.println(words.indexOf("hola"));
    System.out.println(words.lastIndexOf("hola"));
    System.out.println(words.equals(words));
    SuperArray wurds = new SuperArray();
    wurds.add("bob");
    wurds.add("uni");
    wurds.add("ebi");
    System.out.println(words.equals(wurds));

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
    SuperArray big = new SuperArray(100);*/

    try {
      SuperArray problemChild = new SuperArray(-2);
      System.out.println(problemChild);
    }
    catch (IllegalArgumentException e1) {
      System.out.println(e1);
    }

    try {
      SuperArray work = new SuperArray(20);
      for (int i = 0; i < 30; i++) {
        work.add("x");
      }
      System.out.println(work);
    }
    catch (IllegalArgumentException e1) {
      System.out.println(e1);
    }

    SuperArray work = new SuperArray(20);
    for (int i = 0; i < 30; i++) {
      work.add("x");
    }
    try {
      work.get(-1);
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      work.get(50);
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      work.get(3);
      System.out.println(work.get(3));
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      work.set(300, "Y");
      System.out.println(work.set(3, "Y"));
      System.out.println(work.get(3));
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      work.set(-123, "Y");
      System.out.println(work.set(3, "Y"));
      System.out.println(work.get(3));
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      work.set(3, "Y");
      System.out.println(work.set(3, "Z"));
      System.out.println(work.get(3));
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }


    /*for (int i = problemChild.size(); i < 100; i++) {
      problemChild.add("constructors aren't void");
    }
    try {
      problemChild.get(-1);
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      problemChild.get(1000);
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }
    try {
      problemChild.get(1);
    }
    catch (IndexOutOfBoundsException e1) {
      System.out.println(e1);
    }*/

  }

}
