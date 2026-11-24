class Parent {
    void fun() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    @Override
    void fun() {
        super.fun();
        System.out.println("This is Child class");
    }
}

 class Main2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
    }
}
