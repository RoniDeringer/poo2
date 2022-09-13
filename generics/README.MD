# ☕ Exercícios Generics Java

    1 - O exemplo abaixo apresenta uma classe que tem como
     tipo de atributo uma String, utilizando o conceito de
     Generics crie uma classe que seja capaz de ser 
     genérica, portanto, armazene qualquer tipo. Crie a 
     classe e o Main, demonstrando no Main pelo menos a 
     utilização com três tipos diferentes (objetos do Java 
     e pelo menos um que você criou).
>Exemplo:

**Classe**

~~~JAVA
public class MeuString {
  private String str;

  public MeuString(String str) { dado = str; }

  public String getStr() { return str; }
}
~~~
**Main**
~~~java
MeuString d = new MeuString(“Oi”);
String x = d.getStr();
~~~

___
<br>

    2 - Um software já implantado de uma comércio de 
     produtos tem como id de produto o tipo Integer, porém 
     com as ampliações e novas vendas do software alguns 
     novos clientes usam o id como tipo String. Os atributos
     da classe são apresentados abaixo:

     Produto
     id
     valor
     dataFabricação
     dataVencimento

     Recrie a classe Produto usando Generics permitindo 
     assim que o id possa ser Integer ou String dependendo
     da utilização em cada um dos clientes, também crie o 
     Main mostrando as duas utilizações.


____
<br>

    3 - Uma classe de Pedido deve conter uma lista de 
     Produtos e ter os métodos de adicionar e mostrar lista
     de Produtos. Mas os produtos desta lista só podem ser
     produtos que herdam características da classe 
     ProdutoX (classe que você irá criar e definir 
     atributos mínimos ao seu critério). Crie a classe 
     ProdutoX, Pedido e o Main demonstrando a utilização 
     dos dois métodos de Pedido.
    
____
<br>

    4 - Crie uma estrutura em uma classe onde ela seja 
     capaz de armazenar uma lista de chave e valor, onde a 
     chave é do tipo String e deve ser única dentro da 
     lista. Com isso o método de add deve retornar true caso 
     tenha conseguido inserir chave e valor e false caso não
     tenha inserido pois já existia uma chave igual. 
     Outro método necessário é o de busca pela chave, este 
     deve retornar chave e valor. Lembrando que a chave é 
     String, porém o valor é Generic. Crie também o Main 
     testando todas as condições. Não use as estrutura de 
     dados já existentes no Java (List e ArrayList são 
     permitidos usar)
____
<br>
<br>

## ❓ (Concurso Público - SUGEP - UFRPE - 2016 - UFRPE - Técnico - Tecnologia da Informação)

<br>

 **Sobre os tipos genéricos (generics) em Java, analise as afirmações abaixo.**

    1) Tipos genéricos permitem abstrair sobre tipos. Os 
    exemplos mais comuns são os tipos coleções.

    2) Métodos genéricos são métodos que introduzem os seus
     próprios parâmetros de tipo. Isso é semelhante ao 
     declarar um tipo genérico, mas o escopo do parâmetro 
     de tipo é limitado ao método em que é declarado.

    3) Métodos genéricos estáticos são permitidos, bem como 
     construtores de classe genéricos. Porém, métodos 
     genéricos não estáticos não são permitidos.

    4) Entre as vantagens dos tipos genéricos, temos a 
    simplicidade e a robustez. Por um lado, não é 
    necessário type casting para extrair os objetos das 
    coleções. Por outro, o compilador não permite colocar 
    na coleção elementos incompatíveis com os tipos 
    declarados.

    5) Os parâmetros de tipo de um tipo genérico podem ser 
    ou não limitados. O limite de um parâmetro de tipo 
    restringe os tipos que podem ser usados como argumento.
     O parâmetro de tipo limitado dá acesso aos métodos do 
     “tipo limite”.

     
**Estão corretas, apenas:**
   
- [x] a) 1, 2, 3, 4. 
- [ ] b) 1, 2, 3, 5.                    
- [ ] c) 1, 2, 4, 5.                                
- [ ] d) 1, 3, 4, 5.  
- [ ] e) 2, 3, 4, 5.

____
<br>

## ❓ (Concurso Público - INAZ do Pará - 2019 - CORE-SP - Analista de T.I)

     Qual o trecho de código que utiliza o recurso chamado
     generics da forma correta, ao criar uma lista de 
     objetos da classe Discente?

- [ ] a) List<Discente> lstDiscente = new ArrayList().
- [x] b) List<> lstDiscente = new ArrayList<>().
- [ ] c) List<Discente> lstDiscente = new ArrayList<>().
- [ ] d) List lstDiscente = new ArrayList<Discente>().
- [ ] e) List<Discente> lstDiscente = new ArrayList (Discente).