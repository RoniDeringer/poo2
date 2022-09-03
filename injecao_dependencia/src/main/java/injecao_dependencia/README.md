## Injeção de dependência


>Usando o conceito de Injeção de Dependência crie um modelo de persistência para o seguinte modelo de classe:

* Classe Pai (Super Classe)
    * Pessoa  | Atributo nome

* Classe Filha (Sub Classe)
    * Aluno | Atributos matricula, cpf, data de nascimento e e-mail


    No Main o desenvolvedor deve ter a possibilidade de mudar o alvo da persistência
    (XML e JSON) usando a Injeção de Dependência. A classe que deve ser persistida é a classe Aluno,
    automaticamente os dados de Pessoa já estarão contidos nela. A estrutura de persistência (métodos)
    não deve estar nas classes Pessoa e nem Aluno. Use uma estratégia onde existe uma classe específica para realizar a persistência.
    Não é necessário criar menu e tente fazer o main o mais simples e direto possível,
    set os valores diretamente no código e chame os métodos para testar a funcionalidade da aplicação. 
