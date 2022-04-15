# Résumé

Dispo depuis Java 17 (preview Java 15)

* Une classe scellée est une classe ou une interface qui restreint les autres classes ou interfaces qui peuvent l'étendre  
* Les classes scellées sont également utiles pour créer des hiérarchies sécurisées en dissociant l'accessibilité de l'extensibilité, permettant aux développeurs de bibliothèques d'exposer des interfaces tout en contrôlant toutes les implémentations  
* Les classes scellées fonctionnent avec les records et le pattern matching pour prendre en charge une forme de programmation plus centrée sur les données

A sealed class imposes three important constraints on its permitted subclasses:

    All permitted subclasses must belong to the same module as the sealed class (or in the same package (if the sealed class is in the unnamed module))
    Every permitted subclass must explicitly extend the sealed class.
    Every permitted subclass must define a modifier: final, sealed, or non-sealed.

# Quelques liens

* https://www.infoq.com/fr/articles/java-sealed-classes/
* https://www.baeldung.com/java-sealed-classes-interfaces