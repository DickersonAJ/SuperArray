public class Demo{

  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i > 0; i--) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
      }
      /*for (int j = i - 1; j >= 0; j--) {
        if (s.get(i).equals(s.get(j))) {
          s.remove(i);
          j = -1;
        }
      }*/
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray o = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        o.add(a.get(i));
      }
    }
    removeDuplicates(o);
    return o;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray c = new SuperArray();
    if (a.size() > b.size()) {
      for (int i = 0; i < a.size(); i++) {
        c.add(a.get(i));
        if (i < b.size()) {
          c.add(b.get(i));
        }
      }
    }
    else {
      for (int i = 0; i < b.size(); i++) {
        if (i < a.size()) {
          c.add(a.get(i));
        }
        c.add(b.get(i));
      }
    }
    return c;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray(6);
    a.add("9");
    a.add("2");
    a.add("1");
    a.add("2");
    a.add("4");
    a.add("3");
    SuperArray b = new SuperArray(7);
    b.add("0");
    b.add("0");
    b.add("0");
    b.add("4");
    b.add("2");
    b.add("2");
    b.add("9");
    System.out.println(findOverlap(a, b));
    System.out.println(zip(a, b));
  }
}
