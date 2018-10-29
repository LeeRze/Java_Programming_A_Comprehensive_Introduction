
Example 1:

TwoGen<Integer, String> tgOb =
  new TwoGen<Integer, String>(42, "testing");

TwoGen<Integer, String> tgOb = new TwoGen<>("42", "testing");


Example 2:

boolean isSame(TwoGen<T, V> o) {
  if (ob1 == o.ob1 && ob2 == o.ob2) return true;
  else return false;
}

if (tgOb.isSame(new TwoGen<>(42,"testing"))) System.out.println("Same");
