# Résumé

Dispo depuis Java 16

* Désormais, on peut faire un `.toList()` sur un stream au lieu du penible `collect(Collectors.toList())`  


* On remarque l’apparition de deux termes :
  * Cannot invoke : l’élément à appeler (variable, retour de méthode, ...)
  * because : l’élément qui provoque le NPE
  * Par défaut, cette feature est désactivée, il faut ajouter l’option : -XX:+ShowCodeDetailsInExceptionMessages au compilateur java pour l’activer.

# Quelques liens

* https://www.baeldung.com/java-16-new-features