interface Actor {
    public String getName();
    public int getSpeed();

}
class SimpleActor implements Actor{
    String name = "";
    int speed = 0;
    public SimpleActor(String n, int s) {
        name = n;
        speed = s;
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
}
