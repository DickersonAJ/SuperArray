public class SuperArray {
  private String [] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size+=1;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String str = data[index];
    data[index] = element;
    return str;
  }

  private void resize() {
    String[] moredata = new String[data.length + 10];
    for (int i = 0; i < data.length; i++) {
      moredata[i] = data[i];
    }
    data = moredata;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      data[i] = null;
    }
    size = 0;
  }

  public String toString() {
    String str = "[";
    for (int i = 0; i < size; i++) {
      str = str + data[i];
      if (i < size - 1) {
        str = str + ", ";
      }
    }
    str = str + "]";
    return str;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

}
