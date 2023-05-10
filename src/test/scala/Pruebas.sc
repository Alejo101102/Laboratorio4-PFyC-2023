import MatchingProblem._

val pilot=Vector(Vector(2,3,1,1),Vector(1,1,4,3),Vector(1,2,3,4),Vector(2,3,2,1))
val navig=Vector(Vector(4,1,3,2),Vector(4,2,3,1),Vector(1,1,1,4),Vector(3,2,3,3))

matchByElement(1,4) // Valor esperado: List((1,1), (1,2), (1,3), (1,4))
matchByElement(2,4) // Valor esperado: List((2,1), (2,2), (2,3), (2,4))
matchByElement(4,4) // Valor esperado: List((4,1), (4,2), (4,3), (4,4))
matchByElement(2,5) // Valor esperado: List((2,1), (2,2), (2,3), (2,4), (2,5))
matchByElement(3,5) // Valor esperado: List((3,1), (3,2), (3,3), (3,4), (3,5))

matchsByElements(1) // Valor esperado: List(List((1,1)))
matchsByElements(2) // Valor esperado: List(List((1,1), (1,2)), List((2,1), (2,2)))
matchsByElements(3) // Valor esperado: List(List((1,1), (1,2), (1,3)), List((2,1), (2,2), (2,3)), List((3,1), (3,2), (3,3)))
matchsByElements(4) // Valor esperado: List(List((1,1), (1,2), (1,3), (1,4)), List((2,1), (2,2), (2,3), (2,4)), List((3,1), (3,2), (3,3), (3,4)), List((4,1), (4,2), (4,3), (4,4)))
matchsByElements(5) // Valor esperado: List(List((1,1), (1,2), (1,3), (1,4), (1,5)), List((2,1), (2,2), (2,3), (2,4), (2,5)), List((3,1), (3,2), (3,3), (3,4), (3,5)), List((4,1), (4,2), (4,3), (4,4), (4,5)), List((5,1), (5,2), (5,3), (5,4), (5,5)))

possibleMatchings(1) // Valor esperado: List(List((1,1)))
possibleMatchings(2) // Valor esperado: List(List((1,1), (2,1)), List((1,1), (2,2)), List((1,2), (2,1)), List((1,2), (2,2)))
possibleMatchings(3) // Valor esperado: List(List((1,1), (2,1), (3,1)), List((1,1), (2,1), (3,2)), List((1,1), (2,1), (3,3)), List((1,1), (2,2), (3,1))...
possibleMatchings(4) // Valor esperado: List(List((1,1), (2,1), (3,1), (4,1)), List((1,1), (2,1), (3,1), (4,2)), List((1,1), (2,1), (3,1), (4,3)),...
possibleMatchings(5) // Valor esperado: List(List((1,1), (2,1), (3,1), (4,1), (5,1)), List((1,1), (2,1), (3,1), (4,1), (5,2)), List((1,1), (2,1), (3,1), (4,1), (5,3))...

matchings(1) // Valor esperado: List(List((1,1)))
matchings(2) // Valor esperado: List(List((1,1), (2,2)), List((1,2), (2,1)))
matchings(3) // Valor esperado: List(List((1,1), (2,2), (3,3)), List((1,1), (2,3), (3,2)), List((1,2), (2,1), (3,3)), List((1,2), (2,3), (3,1)), List((1,3), (2,1), (3,2)), List((1,3), (2,2), (3,1)))
matchings(4) // Valor esperado: List(List((1,1), (2,2), (3,3), (4,4)), List((1,1), (2,2), (3,4), (4,3)), List((1,1), (2,3), (3,2), (4,4)), List((1,1), (2,3), (3,4), (4,2)), List((1,1), (2,4), (3,2)...
matchings(5) // Valor esperado: List(List((1,1), (2,2), (3,3), (4,4), (5,5)), List((1,1), (2,2), (3,3), (4,5), (5,4)), List((1,1), (2,2), (3,4), (4,3), (5,5)), List((1,1), (2,2), (3,4), (4,5), (5,3))...

weightedMatchings(2,pilot,navig) // Valor esperado: List((List((1,1), (2,2)),10), (List((1,2), (2,1)),13))
weightedMatchings(3,pilot,navig) // Valor esperado: List((List((1,1), (2,2), (3,3)),13), (List((1,1), (2,3), (3,2)),18), (List((1,2), (2,1), (3,3)),16), (List((1,2), (2,3), (3,1)),19)...
weightedMatchings(4,pilot,navig) // Valor esperado: List((List((1,1), (2,2), (3,3), (4,4)),16), (List((1,1), (2,2), (3,4), (4,3)),30), (List((1,1), (2,3), (3,2), (4,4)),21)...

bestMatching(1,pilot,navig) // Valor esperado: (List((1,1)),8)
bestMatching(2,pilot,navig) // Valor esperado: (List((1,2), (2,1)),13)
bestMatching(3,pilot,navig) // Valor esperado: (List((1,2), (2,3), (3,1)),19)
bestMatching(4,pilot,navig) // Valor esperado: (List((1,2), (2,1), (3,4), (4,3)),33)
