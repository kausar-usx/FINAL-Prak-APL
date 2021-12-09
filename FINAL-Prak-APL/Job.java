public class Job extends StatsDecor {
    public Job(Stats stats) {
        super(stats); //mengidentidikasi objek dari kelas stats
    }

    public String decorate() {
        return super.decorate() + this.decorateWithJob(); //method this akan mengidentifikasi object dari class Job
    }

    public String decorateWithJob() {
        return " and Influencer"; //Mengembalikan string dari job
    }
}

