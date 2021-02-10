# Supermemory
Esse aplicativo visa auxiliar no processo de estudo e memorização de usando o sistema de revisão espaçada criada por Piotr Wozniak, mais especificamente a implementação simplificada conhecida como sistema Leitner.

## Rodando o programa


## Tecnologias usadas
+ Java 15
+ Spring 2.4.1
  + Spring Web
  + Spring JPA
  + Thymeleaf
+ Lombok
+ MapStructure




## Revisão espaçada
É possivel aprender mais facilmente assuntos complexos, espaçando o tempo de revisão baseado no tempo que nosso cerebro leva para esquecer o que foi estudado.
O algoritimo é extremamente complexo e pode ser visto em detalhes nesse [link][alg]
Nessa aplicação será  implemententado uma versão menos complexa, o sistema Leitner.

## Sistema Leitner.
O app consiste em cinco container, cada container contem N numero de flashcards.
Cada container representa um estagio no ciclo de repetições. Esses sendo. Um dia, dois dias, uma semana, duas semanas, aposentados.
O usuario pode cadastrar quantos flashcards desejar. Esse tendo uma pergunta e a resposta dessa pergunta. 
Ao registrar um novo card ele é colocado no primeiro container. Quando o usuario deve ler os cards e se acertar a pergunta ele passa para o proximo container e um timer é colocado para que o usuario seja lembrado quando for hora de estudar o card novamente. Caso erre ele volta para o primeiro e o ciclo recomeça.








[alg]: https://www.supermemo.com/en/archives1990-2015/help/smalg
