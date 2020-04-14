# language: pt
@CT006
Funcionalidade: Realizar a edição do cadastro de um usuário

  Esquema do Cenário: Validar se o sistema está editando o cadastro de usuário;
    Dado a busca pelo campo <telefone>
    E realizar busca pelos valores: <id> <telefone>;
    E realizar a edição do campo <email>
    Então validar se a mensagem de alerta <msg>

    Exemplos: 
      | id | telefone         | email                    | msg                            |
      |  1 | "+5592991603523" | "jadsontins@hotmail.com" | "Usuário editado com sucesso!" |
