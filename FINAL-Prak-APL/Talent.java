public class Talent implements Observer { //implements class Observer
    private String chef;

    public Talent(String chef) {
        this.chef = chef;
    }

    @Override //
    public void update(String n) { //mengupdate obesrver
        Stats type = new Job(new Title(new Type())); //implements decorator pattern
        System.out.println("Kitchen" + n + "this is " + this.chef + type.decorate() + " ready to cook.");
    }

}
