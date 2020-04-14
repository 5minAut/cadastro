# language: pt
@CT005
Funcionalidade: Realizar busca preenchendo todos os campos do filtro de busca

  Esquema do Cenário: Validar se o sistema está retornando a busca informando todos dos campos;
    Dado a busca pelos campos: <nome> <email> <telefone>;
    Então realizar busca pelos valores: <nome> <email> <telefone>;

    Exemplos: 
      | nome             | email                  | telefone         |
      | "Jadson Martins" | "jadsontins@gmail.com" | "+5592991603523" |
