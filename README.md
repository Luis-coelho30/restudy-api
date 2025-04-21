# restudy-api
API Rest desenvolvida para simular uma aplicação direcionada à ajudar os estudantes a organizarem metas de estudo, tasks e progresso

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +Long id
        +String name
        +String email
        +Set<Subject> subjects
        +Set<Task> tasks
    }

    class Subject {
        +Long id
        +String name
        +String description
    }

    class Task {
        +Long id
        +String title
        +LocalDateTime deadline
        +boolean completed
    }

    User --> Subject : has
    User --> Task : has
```
