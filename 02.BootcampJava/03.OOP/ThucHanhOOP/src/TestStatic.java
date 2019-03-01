public class TestStatic {
    public int count = 0;

     public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        TestStatic testStatic1 = new TestStatic();
        TestStatic testStatic2 = new TestStatic();
        testStatic1.increase();
        testStatic2.increase();
        System.out.println(testStatic1.getCount());
        System.out.println(testStatic2.getCount());

        Object i = 10;

        int k = (Integer) i - 5;
        System.out.println(k);


        Integer j = new Integer(10);
        int f = j - 5;


    }
    }

