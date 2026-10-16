# Rapport d'Exercice : Conception Orientée Objet et Design Patterns

## Situation 1 : Gestion des figures géométriques et des groupes

### 1. Description du Problème
La situation à modéliser est la suivante : 
> *"Une figure peut être soit un cercle, un rectangle ou un groupe de figures."*

### 2. Design Pattern Approprié : Composite
Le pattern **Composite** est un patron de conception structurel qui permet de composer des objets en structures arborescentes pour représenter des hiérarchies de type "tout-partie"[cite: 2]. Son objectif principal est de permettre aux clients de traiter des objets individuels et des compositions d'objets de manière uniforme[cite: 2].

#### Principe d'utilisation :
* **Interface Commune (`Figure`) :** Définit l'interface commune pour toutes les figures[cite: 2].
* **Les Feuilles (`Cercle` et `Rectangle`) :** Représentent les objets primitifs qui implémentent l'interface `Figure`[cite: 1, 2].
* **Le Composite (`Autres_Figures`) :** Représente le groupe de figures. Il implémente l'interface `Figure` et contient une collection d'objets de type `Figure` (`0..*`), permettant de traiter un groupe de la même manière qu'une figure simple[cite: 2].

---

### 3. Diagrammes de Classes

#### A. Première approche (Version initiale)
Ce premier diagramme montre une modélisation préliminaire de la hiérarchie des classes autour de la classe `Figure`.

![Première version du diagramme](image_6f58cb.png)

#### B. Version finale corrigée (Pattern Composite)
Ce second diagramme présente la solution finale correcte en utilisant le pattern Composite :

![Diagramme de classes final - Composite](image_6f58e7.png)
