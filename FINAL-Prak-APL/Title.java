public class Title extends StatsDecor { //extends class StatsDecor
    public Title(Stats stats) {
        super(stats); //mengidentifikasi objek dari kelas stats
    }

    public String decorate() {
        return super.decorate() + this.decorateWithTitle(); //mengidentifikasi objek dari class title
    }

    public String decorateWithTitle() {
        return "from Master Chef Indonesia"; //mengembalikan string dari kelas Title
    }
}
