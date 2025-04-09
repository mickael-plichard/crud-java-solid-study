# CRUD Java SOLID Study

Bienvenue dans cette étude pratique sur les bonnes pratiques de codage en Java ! 
Ce projet explore une application de gestion de tâches (To-Do List) à travers trois implémentations : 
- une architecture en couches standard
- une version optimisée avec SOLID
- une intégration avec Spring Boot

## Objectifs pédagogiques
- Comprendre l'architecture en couches et ses limites sans SOLID.
- Découvrir les principes SOLID pour un code modulaire et maintenable.
- Montrer comment SOLID facilite l'intégration d’un framework comme Spring.

## Structure du projet
- **`non-solid/`** : Une implémentation avec une architecture en couches basique (présentation, métier, données), mais sans respect strict des principes SOLID.
- **`solid/`** : Une version refactorisée suivant les principes SOLID.
- **`spring/`** : Une version utilisant Spring Boot et Spring Data JPA.
- **`diagrams/`** : Contient les diagrammes UML (classes, séquences) et d’architecture.

## Comment exécuter
- **Version non-SOLID** :
  1. Compilez : `javac non-solid/src/*.java`
  2. Exécutez : `java -cp non-solid/src TaskConsole`
- **Version SOLID** :
  1. Compilez : `javac solid/src/*.java`
  2. Exécutez : `java -cp solid/src TaskManagerApp`
- **Version Spring** :
  1. Accédez au dossier : `cd spring`
  2. Exécutez : `mvn spring-boot:run`

## Diagrammes UML
- **Non-SOLID** :
  - [Diagramme de classes](diagrams/non-solid-class-diagram.png)
  - [Diagramme de séquence](diagrams/non-solid-sequence-diagram.png)
- **SOLID** :
  - [Diagramme de classes](diagrams/solid-class-diagram.png)
  - [Diagramme de séquence](diagrams/solid-sequence-diagram.png)
- **Spring** :
  - [Diagramme de classes](diagrams/spring-class-diagram.png)
  - [Diagramme de séquence](diagrams/spring-sequence-diagram.png)
- **Architecture globale** : [Diagramme d’architecture](diagrams/architecture-diagram.png)
