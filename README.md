# POC Chat avec WebSockets et SockJS

Ce POC (Proof of Concept) démontre l'utilisation des WebSockets pour créer une application de chat en temps réel. Il utilise SockJS pour fournir une alternative aux WebSockets dans le cas où ceux-ci ne sont pas disponibles.

## Introduction

Ce POC (Proof of Concept) démontre une application simple de chat en temps réel utilisant WebSockets. Les utilisateurs peuvent rejoindre le chat, envoyer des messages, et voir lorsque de nouveaux utilisateurs rejoignent ou quittent le chat.

## Comment démarrer ?

1. Clonez ce dépôt.
2. Installez les dépendances (si nécessaire).
3. Lancez l'application.
4. Ouvrez votre navigateur et accédez à [http://localhost:8080/](http://localhost:8080/).

## Fonctionnement

Lorsqu'un utilisateur se connecte, il saisit son nom d'utilisateur et rejoint le chat. Les messages sont envoyés au serveur via WebSockets (ou une alternative SockJS) et diffusés à tous les utilisateurs connectés.

## Liens avec l'application "Your Car Your Way"

Ce POC est une étape préliminaire vers la mise en œuvre d'une fonctionnalité de chat en temps réel dans l'application "Your Car Your Way". L'objectif est de permettre aux utilisateurs de l'application de communiquer avec le support en temps réel, améliorant ainsi l'expérience utilisateur et rendant l'application plus interactive.

## Structure du code

index.html: Page principale de l'application, contient les éléments d'interface utilisateur pour le chat.
main.js: Logique principale côté client pour la gestion des connexions WebSocket, l'envoi et la réception de messages.
[Autres fichiers si nécessaire]

## Technologie utilisée

WebSockets pour une communication bidirectionnelle entre le serveur et le client.
STOMP (Simple Text Oriented Messaging Protocol) pour la gestion des messages.
SockJS pour fournir une alternative aux WebSockets en cas de non-disponibilité.
