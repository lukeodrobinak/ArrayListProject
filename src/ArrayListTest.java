public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            a.add(i+1);
        }
        System.out.println(a);
        a.add(1,7);
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        a.size();
        System.out.println(a.get(2));
        a.set(0,6);
        System.out.println(a);
    }
}
