## Gestão de usuários

Este é um sistema pra gerenciamento de usuários de benefícios para auxiliar assistentes sociais.

## Sobre o Programa

O objetivo do programa é otimizar o tempo ao executar manipulação e consulta dos dados cadastrados.

**Os seguintes dados serão tratados:**

1. Nome
2. Idade
3. CPF
4. CEP
5. Beneficio

O usuário do sistema consegue cadastrar, consultar, deletar e atualizar os esses dados.

## Funcionamento

Este programa é do tipo console, serão apresentadas as opções númeradas através de um menu para o usuário digitar a opção desejada.

**Menu**

1. Cadastrar usuário
2. Consultar usuário
3. Alterar um registro
4. Deletar cadastro

Para cada opção o sistema irá realizar determinada ação e após finalizar o programa sugere a opção de voltar ao menu ou encerrar o sistema.

## Diagrama de classes

**Descrição dos métodos:**

`App`

**main(String[] args):**

 Método principal que inicializa o scanner, cria o arquivo de dados e gerencia o menu de opções para realizar operações de cadastro, consulta, deleção e atualização de usuários.
  ##
`Create`

**cadastrar(String nome, String idade, String cpf, String cep, String beneficio):**
  
Verifica se o CPF já está cadastrado. Se não estiver, adiciona um novo usuário ao arquivo dados.txt.
##
`Delete`

**deletar(String cpf):**
  
Procura pelo CPF no arquivo dados.txt e remove a linha correspondente. Usa um arquivo temporário para realizar a operação de deleção.
##
`Read`

**consultar(String cpf):**
  
Procura pelo CPF no arquivo dados.txt e exibe as informações do usuário se encontrado.
##
`Update`

**atualizar(File arquivo, Scanner sc):**
  
Atualiza as informações de um usuário no arquivo dados.txt. Solicita o CPF do usuário a ser atualizado e permite modificar o nome, idade, CPF, CEP ou benefício.
##

![Diagrama de classe (Trabalho Final)](https://github.com/mtresende/gestao_usuarios/assets/124203390/9f2aa0df-7991-4da2-ab6c-d30e0601c67b)
