# language: pt
@CT002
Funcionalidade: Realizar busca no sistema pelo filtro do campo nome

  Esquema do Cenário: Validar se o sistema está retornando a busca pelo filtro do campo nome;
    Dado a busca pelo campo <nome>
    Então realizar busca pelos valores: <id> <nome>;

    Exemplos: 
      | id | nome              |
      |  2 | "Jadson Martins" |
