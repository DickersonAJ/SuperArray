public class SuperArray {
  private String [] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("initialCapacity of " + initialCapacity
        + " cannot be negative");
    }
    data = new String[initialCapacity];
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
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    if (index >= size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    else if (index >= size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }

    else {
    String str = data[index];
    data[index] = element;
    return str;
    }
  }

  private void resize() {
    String[] moredata = new String[data.length * 2 + 1];
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

  public void add(int index, String element) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    else if (index > size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    else {
    if (index == size) {
      add(element);
    }
    else {
      /*add(data[size]);
      for (int i = size+1; i > index-1; i--) {
        set(i+1, data[i]);
      }
      set(index, element);*/
      add(element);
      for (int i = size-1; i > index; i--) {
        set(i, data[i-1]);
      }
      set(index, element);
    }
  }
  }

  public void remove(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    if (index >= size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    for (int i = index; i < size-1; i++) {
      set(i, data[i+1]);
    }
    set(size - 1, null);
    size-=1;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] moredata = new String[size];
    for (int i = 0; i < size; i++) {
      moredata[i] = data[i];
    }
    return moredata;
  }

  public int lastIndexOf(String value) {
    for (int i = size - 1; i > 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    if (size != other.size()) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (data[i].equals(other.get(i))) {
      }
      else {
        return false;
      }
    }
    return true;
  }

}
