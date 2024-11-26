# Domingues Game List [![NPM](https://img.shields.io/npm/l/react)](https://github.com/DomgYuri/DominguesGameList/tree/main?tab=MIT-1-ov-file) 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

This project was developed using Java and the Spring Boot framework, with an integrated H2 database.

The API can return games organized in a list, classified into two categories: RPG and Platform. Additionally, it allows you to reorder the list according to your preferences, offering a personalized experience.

## Installation

1. Clone the repository:

```bash
git@github.com:DomgYuri/DominguesGameList.git
```
2. Install dependencies with Maven

3. Install Postman

## API Endpoints

### GET

```markdown
GET /http://localhost:8080/games - Returns a list of all games.
GET /http://localhost:8080/games/1 - Returns a game by ID.
GET /http://localhost:8080/lists - Returns the lists of games.
GET /http://localhost:8080/lists/2/games - Returns a game list by ID.
```
### POST
```markdown
POST /http://localhost:8080/lists/2/replacement - Registers a new order of games within the list.
```
```bash

In the source index, you specify the position of the game you want to move, and the destination index
is the position it will occupy.

{
    "sourceIndex" : 3,
    "destinationIndex" : 2 
}

```
