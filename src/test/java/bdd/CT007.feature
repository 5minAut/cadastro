# language: pt
@CT007
Funcionalidade: Não realizar a edição de um cadastro e verificar se o sistema informa ao usuário que o cadastro não foi editado;

  Esquema do Cenário: Validar se o sistema exibe mensagem de alerta de não edição do cadastro para o usuário;
    Dado a busca pelo campo <telefone>
    E realizar busca pelos valores: <id> <telefone>;
    E realizar a edição do campo <email>
    Então validar se a mensagem de alerta <msg>

    Exemplos: 
      | id | telefone         | email                    | msg                    |
      |  1 | "+5592991603523" | "jadsontins@hotmail.com" | "Você não mudou nada!" |
