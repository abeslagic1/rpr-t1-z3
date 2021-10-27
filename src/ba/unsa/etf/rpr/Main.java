package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	Sat s = new Sat(13, 0, 1);
	s.ispisi();
	s.sljedeci();
	s.ispisi();
	s.pomjeriZa(-48);
	s.ispisi();
	s.postavi(14,14,13);
	s.ispisi();
    }
}
