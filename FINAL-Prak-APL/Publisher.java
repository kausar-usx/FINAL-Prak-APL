import java.util.ArrayList;
//array list untuk mengelola data

public class Publisher implements Observable {
    private ArrayList<Observer> cust = new ArrayList<>(); //membuat list yang terikat pada talent

    @Override
    public void addObserver(Observer observer) {
        cust.add(observer);
    }//menambah list dari observerver

    @Override
    public void removeObserver(Observer observer) {
        cust.remove(observer);
    }//menghapus list dari observer

    @Override
    public void notif(String n) {
        for (Observer customer : cust) {
            customer.update(n);
        }//menampilkan string dari oberver
    }
}
