class SplitComma {

  String strs;

  String str;

  static int CounterComma = 0;

  SplitComma(String s) {

    strs = s;

    str = s;

    while ((str.indexOf(",")) != -1) {
 
      CounterComma++;

      str = str.substring(str.indexOf(",") + 1, str.length());

    }


  }

  void Splits(String s) {

    int num = this.CounterComma;

    String[] result = new String[num];

    for (int i = 0; i < num; i++) {

      result[i] = s.substring(0, s.indexOf(","));

      s = s.substring(s.indexOf(",") + 1, s.length());

      System.out.println(result[i]);

    }
 
    System.out.println(s);

    return;

  }

}

class SplitDemo {

  public static void main(String[] args) {

    String str = "abc,def,hi";

    SplitComma x = new SplitComma(str);

    x.Splits(str);

  }

}
