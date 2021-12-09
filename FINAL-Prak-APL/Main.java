class Main {
    public static void main (String[] args) {

        Observable team = new Publisher(); //create new object dari class Publisher

        //membuat 3 buah objek sebagai talent
        Observer player1 = new Talent("Nadya");
        Observer player2 = new Talent("Lord Adi");
        Observer player3 = new Talent("Jesselyn");

        team.addObserver(player1);
        team.addObserver(player2);
        team.addObserver(player3);

        //memberikan notifikasi kepada setiap talent
        team.notif(" already to use, ");
    }
}
