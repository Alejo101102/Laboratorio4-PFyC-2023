package object MatchingProblem {
  type Match = (Int, Int)
  type Matching = List[Match]
  type Preferences = Vector[Vector[Int]]

  def matchByElement(i: Int, n: Int): List[Match] = {

  }

  def matchsByElements(n: Int): List[List[Match]] = {
    //devuelvelalistadelosposibesmatchsdecadaelemento(1hastan) ...
  }

  def possibleMatchings(n: Int): List[List[Match]] = {
    //Devuelvelalistadetodoslosposiblesmatchingsdecadaunodelosn //elementos. ...
  }

  def matchings(n: Int): List[Matching] = {
    //Devuelvelalistadetodoslosposiblesmatchingsdenpilotos ...
  }

  def weightedMatchings(n: Int, pilotPrefs: Preferences, navigPrefs: Preferences): List[(Matching, Int)] = {
  }

  def bestMatching(n: Int, pilotPrefs: Preferences, navigPrefs: Preferences): (Matching, Int) = {

  }
}

}
