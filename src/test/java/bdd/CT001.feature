# language: pt
@CT001
Funcionalidade: Realizar o cadastro do usuário no sistema

  Esquema do Cenário: Validar se o sistema está cadastrando o usuário com sucesso;
    Dado o click no botão Add usuários;
    E preencher todos os campos: <nome> <email> <telefone>;
    E clicar no botão Adicionar;
    Então realizar busca pelos valores: <id> <telefone>;

    Exemplos: 
      | id | nome             | email                  | telefone         |
      |  1 | "Jadson Martins" | "jadsontins@gmail.com" | "+5592991603523" |
