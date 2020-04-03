# language: pt
@CT004
Funcionalidade: Realizar busca no sistema pelo filtro do campo telefone

  Esquema do Cenário: Validar se o sistema está retornando a busca pelo filtro do campo telefone;
    Dado a busca pelo campo <telefone>
    Então realizar busca pelos valores: <id> <telefone>;

    Exemplos: 
      | id | telefone         |
      |  1 | "+5592991603523" |
