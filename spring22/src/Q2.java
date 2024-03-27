/*Complete the following code using the following instructions:
a.Write necessary public getter/setter methods for the private variable b.
b. Write a constructor with three parameters. First two parameters must be passed to
 the super class constructor. The third parameter should initialize instance variable c.
 c. Override the show() method.  Inside the show() method print the summation
  of variable a, b and c. d. Write a constructor that will take an object as its parameter.
   The object must be passed to the super class constructor. e. Override the show() method.
     Inside the show() method print the summation of variable a, and b. */

class Base {
    public int a;
    private double b;

    public Base(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public Base(Base ob) {
        a = ob.a;
        b = ob.getB();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    void show() {
        System.out.println("sum of variables in the Base class: " + (a + b));
    }
}

class Override extends Base {
    int c;

    Override(int a, double b, int c) {
        super(a, b);
        this.c = c;
    }

    Override(Base ob) {
        super(ob);
    }

//    @Override
    void show() {
        System.out.println("sum of variables in the Override class: " + (a + getB() + c));
    }
}

class Override2 extends Base {
    Override2(int a, double b) {
        super(a, b);
    }

    Override2(Base ob) {
        super(ob);
    }

//    @Override
    void show() {
        System.out.println("sum of variables in the Override2 class: " + (a + getB()));
    }
}

class MethodOverride {
    public static void main(String[] args) {
        Override obj = new Override(10, 20.5, 12);
        obj.show();
        Override2 obj2 = new Override2(6, 10);
        obj2.show();
        Override2 obj3 = new Override2(obj2);
        obj3.show();
    }
}
