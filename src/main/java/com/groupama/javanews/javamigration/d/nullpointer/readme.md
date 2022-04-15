# Résumé

Dispo depuis Java 15 (preview Java 14)

* Désormais, le message associé à un objet de type NullPointerException nous donne une réponse plus utile au débuggage    


* On remarque l’apparition de deux termes :
  * Cannot invoke : l’élément à appeler (variable, retour de méthode, ...)
  * because : l’élément qui provoque le NPE
  * Par défaut, cette feature est désactivée, il faut ajouter l’option : -XX:+ShowCodeDetailsInExceptionMessages au compilateur java pour l’activer.

# Quelques liens

* https://blog.ippon.fr/2020/06/03/les-principales-nouveautes-de-java-14/#records