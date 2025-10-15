// Misasoa ROBISON - 45009085

/*Exercice 1 - Propriétés fonctionnelles

-String::lowercase => BONNE METHODE FONCTIONNELLE : totale, déterministe et n'a pas de changements d'état, ne génère pas de mutation/reflexion
-Math::max ; Math::sin => BONNE METHODE FONCTIONNELLE : totale, déterministe, pure, ne génère pas de mutation/reflexion
-List::add => PAS BONNE METHODE : changements d'état, des effets de bord, non déterministe, génère des reflexions
-List::size => totale (sauf si la valeur maximum est atteinte), déterministe tant qu'on ne modifie pas la liste, ne fait pas de mutation, ne fait pas de null, MAIS peut poser des problèmes
-List::contains => totale, déterministe (si la liste est la même), non pure (dépend d'un état), on peut avoir des null, exceptions (donc problème)
-Integer::valueOF => BONNE METHODE FONCTIONNELLE : totale, déterministe, pure, ne génère pas de mutation, pas de null, pas de réflexions, pas d'exception
-FIle::length => non totale et non déterministe (si le fichier n'existe pas, on n'a pas de taille), non pure (on dépend d'une donnée extérieure), pas de mutation, peut avoir un null, pas de réfexions, peut avoir de exceptions 

-m1 => ne renvoie rien, donc ce n'est pas bon, on peut pas savoir si c'est déterministe, non pure (modifie l'état d'une instance), pas de réflexions, pas d'exceptions
-m2 => non totale (pas d'netrée), non déterministe (dépend de a, donc si a change, le résultat change aussi), non pure (dépend d'un état caché)
-m3 => non totale, non déterministe (le system.out.println peut ne pas produire de résultat)
-m4 => BONNE METHODE FONCTIONNELLE : toatle, pure, déterministe, pas d'exceptions, pas de mutations, pas de réflexions
-m5 => totale, non déterministe (la réponse dépend de a, on a pas le même résultat si a change)
-m6 => peut ne pas être déterministe (on peut modifier b, même s'il est static, il est en public)
-m7 => dépend de c mais c est une constante, donc totale, déterministe, pure
-m8 => d est privé, donc non modifiable
-m9 => totale, déterministe (d non modifiable), peut poser problème (la division par 0) donc produit une exception
-m10 => la division par 0 sur des float est OK, donc m10 totale et déterministe, donc pas de null, pas de mutation, pas d'exception, pas de réflexions car la division avec 0 en float donne un infini
-m11 => BONNE METHODE FONCTIONNELLE : totale, déterministe (val++ ne modifie pas val à l'extérieur, ce n'est que dans la méthode qu'elle est incrémentée), pure, pas de mutations, pas de null, pas de réflexions, pas d'exceptions

*/