# Résumé

Dispo depuis Java 16 (preview Java 14)

* Les records viennent compléter la boîte à outils des "structures" Java (avec les classes, les interfaces, les enums, ...).  
* Les records sont définis par leurs valeurs, ils sont donc immuables (avec tous les bienfaits de ce pattern).  
* Comme un record est défini par ses valeurs, on a automatiquement les methods equals, hashCode et toString qui sont implémentées en se basant sur ces valeurs. Cela implique aussi qu'on ne peut pas avoir d'autres attributs que ceux définis dans la déclaration.

* Il faut bien garder en tête que les attributs d'un record sont final : on doit donc tous les affecter dans le constructeur, sans quoi, le code ne compilera pas.
* Le compiler génère les méthodes suivantes : 
  * equals, hashCode, and toString methods
  * constructeur
  * getter avec le nom des attributs


# Quelques liens

* https://blog.ippon.fr/2021/04/02/jouons-avec-les-records-java/
* https://www.baeldung.com/java-record-keyword