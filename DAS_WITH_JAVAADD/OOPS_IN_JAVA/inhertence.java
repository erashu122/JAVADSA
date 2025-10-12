package DAS_WITH_JAVAADD.OOPS_IN_JAVA;

    class Grandparent {
        Grandparent() {
            System.out.println("Grandparent constructor");
        }
        void greet() {
            System.out.println("Hello from Grandparent");
        }
    }

    class Parent extends Grandparent {
        Parent() {
            System.out.println("Parent constructor");
        }
        void greet() {
            super.greet();
            System.out.println("Hello from Parent");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child constructor");
        }
        void greet() {
            super.greet();// Calls parent greet
            System.out.println("Hello from Child");
        }
    }

    public class inhertence {
        public static void main(String[] args) {
            Child c=new Child();
            c.greet();

        }
    }

