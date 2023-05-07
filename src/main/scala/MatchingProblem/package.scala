package object MatchingProblem {
  type Match = (Int, Int)
  type Matching = List[Match]
  type Preferences = Vector[Vector[Int]]

  def matchByElement(i: Int, n: Int): List[Match] = {
   val posibles = for{
     j<- 1 to n
   } yield (i,j)
    posibles.toList
  }

  def matchsByElements(n: Int): List[List[Match]] = {
    val posibles = for {
      j <- 1 to n
    } yield matchByElement(j, n)
    posibles.toList
  }
  /*
    def possibleMatchings(n: Int): List[List[Match]] = {
    }

      def matchings(n: Int): List[Matching] = {
        //Devuelvelalistadetodoslosposiblesmatchingsdenpilotos ...
      }

      def weightedMatchings(n: Int, pilotPrefs: Preferences, navigPrefs: Preferences): List[(Matching, Int)] = {
      }

      def bestMatching(n: Int, pilotPrefs: Preferences, navigPrefs: Preferences): (Matching, Int) = {

      }
    */

}
