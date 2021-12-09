public abstract class StatsDecor implements Stats {
    private Stats stats;

    public StatsDecor(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String decorate() { //mengambil method dari class job
        return stats.decorate();
    }
}

