# restudy-api
API Rest desenvolvida para simular uma aplicação direcionada à ajudar os estudantes a organizarem metas de estudo, tasks e progresso

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        +Long id
        +String nome
        +String email
<<<<<<< HEAD
        +Set<Disciplina> subjects
=======
        +Set<Disciplina> disciplinas
        +Set<Tarefa> tarefas
>>>>>>> 4fac58243418152b6e78f7da0bb075dd708f88dd
    }

    class Disciplina {
        +Long id
        +String nome
        +String descricao
<<<<<<< HEAD
        +Set<Tarefa> tasks
=======
>>>>>>> 4fac58243418152b6e78f7da0bb075dd708f88dd
    }

    class Tarefa {
        +Long id
        +String titulo
        +LocalDateTime prazo
        +boolean completada
    }

    Usuario --> Disciplina : has
    Usuario --> Tarefa : has
```
