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

  def possibleMatchings(n: Int): List[List[Match]] = {
    val listaDeListas = matchsByElements(n)

    def combinarListasInternas(listaDeListas: List[List[Match]]): List[List[Match]] = {
      if (listaDeListas.isEmpty) List(Nil)
      else {
        for {
          actual <- listaDeListas.head
          resto <- combinarListasInternas(listaDeListas.tail)
        } yield actual :: resto
      }
    }

    combinarListasInternas(listaDeListas)
  }

  def matchings(n: Int): List[Matching] = {
    val possible = possibleMatchings(n)
    val pairings = for {
      matches <- possible
      if matches.map(_._1).distinct.length == n && matches.map(_._2).distinct.length == n
    } yield matches
    pairings
  }
    def weightedMatchings(n: Int, pilotPrefs: Preferences, navigPrefs: Preferences): List[(Matching, Int)] = {
      val todosLosMatchings = matchings(n)
      val matchingsPesados = for {
        matching <- todosLosMatchings
        weight = matching.zipWithIndex.map { case ((pilot, navigator), index) => pilotPrefs(pilot - 1)(navigator - 1) * navigPrefs(navigator - 1)(pilot - 1) }.sum
      } yield (matching, weight)
      matchingsPesados
    }

  def bestMatching(n: Int, pilotPrefs: Preferences, navigPrefs: Preferences): (Matching, Int) = {
    val pesados = weightedMatchings(n, pilotPrefs, navigPrefs)
    pesados.maxBy(_._2)
  }
}
