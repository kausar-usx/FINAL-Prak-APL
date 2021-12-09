interface Observable {
    //tiga buah interface
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notif(String n);
}
