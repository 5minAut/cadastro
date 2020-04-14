# language: pt
@CT008
Funcionalidade: Realizar a exclusão do cadastro de um usuário;

  Esquema do Cenário: Validar se o sistema está excluído o cadastro de usuário;
    Dado a busca pelo campo <telefone>
    E realizar busca pelos valores: <id> <telefone>;
    E realizar a exclusão de um usuário
    Então validar se a mensagem de alerta <msg>

    Exemplos: 
      | id | telefone         | msg                             |
      |  1 | "+5592991603523" | "Usuário excluído com sucesso!" |
