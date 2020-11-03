public class SuperArray {
  private String [] data;
  private int size;

  public void SuperArray() {
    data = new String[10];
    //for (int i = 0; i < data.length; i++) {
    //  data[i] = "";
    //}
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    //if (size < data.length) {
      System.out.println(data);
      System.out.println(size);
      data[size] = element;
      size+=1;
      return true;
    //}
    //return false;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String str = data[index];
    data[index] = element;
    return str;
  }

}
