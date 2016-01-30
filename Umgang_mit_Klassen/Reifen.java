package Umgang_mit_Klassen;

class Reifen {

	  /** Reifendruck  */
	  private double druck;

	  /** Konstruktor */
	  public Reifen (double luftdruck) {
	    druck = luftdruck;
	  }

	  /** Zugriffsfunktion für Reifendruck */
	  public double aktuellerDruck () {
	    return druck;
	  }
	}
