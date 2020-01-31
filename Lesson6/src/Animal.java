public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected double maxJumpHeight;

    public Animal(String name) {
        this.name =  name;

    }

    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(name + " не пробежал " + distance + " м");
        }
        else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println(name + " не проплыл " + distance + " м");
        }
        else {
            System.out.println(name + " проплыл " + distance + " м");
        }
    }

    public void jump(double height) {
        if (height > maxJumpHeight) {
            System.out.println(name + " не подпрыгнул на " + height + " м");
        }
        else {
            System.out.println(name + " подпрыгнул на " + height + " м");
        }
    }
}
