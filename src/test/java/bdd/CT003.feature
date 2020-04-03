# language: pt
@CT003
Funcionalidade: Realizar busca no sistema pelo filtro do campo email

  Esquema do Cenário: Validar se o sistema está retornando a busca pelo filtro do campo email;
    Dado a busca pelo campo <email>
    Então realizar busca pelos valores: <id> <email>;

    Exemplos: 
      | id | email                  |
      |  3 | "jadsontins@gmail.com" |
