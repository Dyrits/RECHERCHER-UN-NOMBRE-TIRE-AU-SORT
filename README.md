# Rechercher un nombre tiré au sort

## A propos de ce projet

### Cursus
ENI | Le développement Web côté serveur – BackEnd avec Java Enterprise Edition (JEE)  
~ [Module 2 - Les servlets](https://github.com/Dyrits/RECHERCHER-UN-NOMBRE-TIRE-AU-SORT/tree/master/Module%2002%20-%20Enonc%C3%A9s%20TP)  

### Énoncés (par l'ENI)

<details markdown="block">
<summary>Version 1</summary>  

A partir d'un nouveau Dynamic Web Project, créer l'application suivante.

#### Description fonctionnelle

L'application doit permettre à un utilisateur de trouver le nombre tiré au sort par le serveur. Ce nombre est compris entre 0 et 10.

Le résultat indique seulement si l'utilisateur a réussi ou pas.

En cas d'échec, l'utilisateur peut retenter sa chance. Il n'y a pas de limite au niveau du nombre d'essais et ils ne sont pas comptabilisés.

#### Eléments d'architecture

L'application se nomme TPRechercherNombre.
Elle est composée des éléments suivants :
- Un formulaire de saisie statique permettant à l'utilisateur de tenter sa chance.
- Une servlet effectuant le traitement.
- Une page HTML statique permettant d'informer le joueur de sa victoire.
- Une page HTML statique permettant d'informer le joueur de son échec et proposant un lien pour retenter sa chance.

> Plus de détails au sein du fichier PDF correspondant.

</details>
<details markdown="block">
<summary>Version 2</summary>  

A l'aide des paramètres d'initialisation, permettre à l'administrateur du site de personnaliser les bornes du tirage au sort. Les valeurs par défaut restent celles décrites dans les spécifications initiales.

</details>

> Plus de détails sont disponibles dans les fichiers au format PDF correspondant à chaque énoncé.

### Technologie principale
- Java
- Java EE

### Détails | Commentaires
Ce projet a été construit à partir de zéro en suivant des instructions spécifiques. 

<details markdown="block">
<summary>Version 1</summary>  

L'application a été renommée "FindTheNumber".

</details>  

<details markdown="block">
<summary>Version 2</summary>  

La version 1 effectuant un contrôle sur la saisie de l'utilisateur au sein du formulaire HTML, la valeur maximale a été étendue à 1000. Cela dit, l'utilisateur ne dispose d'aucun indice pour déterminer l'étendue des possibilités définies en paramètres d'initialisation.

</details>  

### Statut
Version 1 - Terminée  
Version 2 - Terminée   

#### Dernière mise à jour
18/07/2020  
(README | 21/07/2020)