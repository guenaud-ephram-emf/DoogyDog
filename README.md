# Exercice 01 : Le chien
## Durée : 60'
## Objectifs visés :
- Première implémentation d’une classe simple.
- Production/instanciation et utilisation d‘objets.

## PARTIE 1 : Créez votre classe qui modélisera **un chien**
Dans ce projet vous allez créer votre première classe Java qui modélisera/représentera **un chien**.
### a) Créer la classe
Créez cette nouvelle classe à l'aide de ce que vous offre Visual Studio Code. Comme l'enseignant vous l'a démontré, cela peut être fait de plusieurs manières. En voici une simple :
- commencez par afficher le contenu du fichier `Application.java`. Cela informera Visual Studio Code qu'il s'agit d'un projet de type Java et chargera l'extension lui permettant d'en faire.
- ensuite, dans la zone "JAVA PROJECTS" qui sera apparue en bas à gauche, faites un clic-droit là où vous voulez créer votre classe, puis `New`, puis `Java class` et répondez à la question posée.

Veillez à mettre votre nouvelle classe dans le bon package Java (dans notre cas, vu la nature de cette nouvelle classe, il vous faudra la ranger dans le package `models` que vous allez devoir créer).

### b) Lui donner les caractéristiques et savoir-faire attendu
Un chien aura comme attributs un nom et un âge.  
Il devra également fournir tous les getters.  
Il devra être capable de se réveiller, manger de la nourriture, dormir et aboyer.

N.B. Pour ces méthodes il faut simplement écrire sur la console l’action que l’objet est sensé faire, c'est-à-dire :
```Java
// => pour la méthode dormir()
System.out.println("s’endort");

// => pour la méthode reveiller()
System.out.println("se réveille"); 	

// => pour la méthode aboyer()
System.out.println("aboie");

// => pour la méthode manger()
System.out.println("mange " + nourriture);
```
## PARTIE 2 : Créer des chiens à l'aide de votre classe
Maintenant que votre classe représentant un chien a été créée, on va créer des chiens et les utiliser.

Dans le `main()`du programme, instanciez/créez plusieurs chiens en leur donnant des noms et des âges différents.

Ensuite, faites-les dormir, se réveiller, manger, aboyer, ...
## PARTIE 3 : Rendre votre classe plus communicante
Personnalisez votre classe en précisant le nom du chien lorsqu’il fait une action.

Par exemple, lorsqu'on donnera l'ordre à un chien de dormir, plutôt que de voir ceci sur la console :
```Java
s’endort
```
on aimerait voir cela :  
```Java
Médor s’endort
```
## PARTIE 4 : Rendre votre classe plus intelligente
On va maintenant introduire de la logique dans votre application. Le but est d'éviter que, lorsqu'un chien dort, on ne puisse pas le faire aboyer, etc.

Commencez par réfléchir, par noter sur un papier toutes les règles logiques de votre application. Réfléchissez avant d’agir !

Pour réaliser cela, il est probable qu'il faille ajouter des caractéristiques à votre chien afin de pouvoir distinguer des situations qui peuvent se poser. Pour vous aider, pensez aux différents états dans lesquels votre chien peut se trouver.
## PARTIE 5 : Qu'est-ce qui a changé avec la partie 4 ?
[Afficher les diagrammes UML de classe de votre application](README_UML_P5.md)

Répondez à ces questions :
- Qu’est-ce qui a changé ?
- Que voit-on avec les classes ?
- Pourquoi n'y voit-on pas d'autres changements ?


# RESTITUTION :
Rendre cet exercice normalement par `push` GitHub
