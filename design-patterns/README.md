+ LEITURA
    + Padrões de Projetos 
        22/04/2014  --> 40
        23/04/2014  --> 77
        24/04/2014  --> 98
        25/04/2014  --> 133
        28/04/2014  --> 191
        29/04/2014  --> 196
        30/04/2014  --> 271
        05/05/2014  --> 338
        06/05/2014  --> 387
        09/05/2014  --> 412
        12/05/2014  --> 440
        13/05/2014  --> 479

+ ÍNDICE PERSONALIZADO
    + 1 - Strategy --> 20 - 42    
    + 2 - Observer --> 46 - 71
    + 3 - Decorator --> 76 - 95    
    + 4 - Factory --> 98 - 137
        + Simple Factory --> 104 - "113"    
        + Factory Method --> 114 - "131"
        + Comparação entre os Abstract e Method Factory 135
        + Abstract Factory --> 132 - "134"
    + 5 - Singleton --> 144 - 157
    + 6 - Command --> 162 - 191
    + 7 - Adapter e Facade --> 196 - 220
        + Adapter --> 196
            + Adaptador de Objetos --> 197 
            + Adaptador de Classes --> 203
        + Facade --> 210
            + Princípio do conhecimento mínimo (Lei de Demétrio)
    + 8 - Template Method --> 224 - 251
    + 9 - Iterator e Composite --> 254 - 305
         + Iterator --> 254
           + Definição  271
           + Novo princípio  273
         + Composite --> 275
           + Definição 286
    + 10 - State --> 308 - 338
         + Definição 329
        
    + 11 - Proxy --> 344 - 387
         Definição 367
         Proxy Remoto 345 - 366
         Definição proxy remoto e proxy virtual 368
         Proxy Virtual 368 - 374
         Proxy de Proteção e Proxy Dinâmico 376 - 383 
         
    + 12 - Padrões Compostos --> 392 - 
        "Usando varios padrões" - 393 - 395
            - Usou Decorator - 393 - 395 | jar 12_1
             * Para fazer varios patos diferentes implmentarem o mesmo comportamento 
            - Usou Adpter 396 - 399 | n 5 | jar 12_1
              * Para fazer o ganso ser usado como um pato
            - Usou o padrão Factory 399 - 401 | n 10 | jar 12_2
              * criando uma fabrida de patos para "acoplar os Quackables" na verdade para envolopa-los em uma classe que irá se encarregar de garantir que estes objetos façam o que deve ser feito usando o Padrão Factory mais precisamente o Abstract Facotory
            - Usou o padrão Composite e Iterator 402 - | n 12 | jar 12_3
             * Para agrupar os patos em bandos e até sub-bandos facilitando o gerenciamento,
            - Usou o Padrão Observer 406 - | n 14 | jar 12_4
             * Para poder inspecionar quando cada pato ou grupo deles fazia quack, idependente de ser talvez um ganso
         
+ PADRÕES OO
    + Strategy 
        Define uma família de algorítimos, encapsula cada um deles e os torna intercambiáveis.
        A estratégia permite que o algoritimo varie independentemente dos clientes que o utilizam.
        
    + Observer 
        Define uma dependência um-para-muitos entre objetos de modo que,
        quando um objeto muda de estado, todos os seus dependentes são notificados
        e atualizados automaticamente.
    + Decorator 
        Anexa responsabilidades adicionais a um objeto de maneira dinâmica.
        Os decoradores fornecem uma alternativa flexível
        para a subclasse para estender a funcionalidade.
        
    + Factory 
        + Simple Factory
        + Factory Method 
            Defina uma interface para criar um objeto, mas deixe as subclasses
            decidirem em qual classe criar a instância.
            O Factory Method permite que uma classe defra a criação de
            instâncias para as subclasses.
    
        + Abstract Factory 
            Forneça uma interface para criar famílias de objetos relacionados
            ou dependentes sem especificar suas classes concretas
    
        + Singleton
            Verifique se uma classe tem apenas uma instância
            e forneça um ponto global de acesso a ela
        + Command 
            Encapsula uma solicitação como um objeto,
            permitindo que você parametrize clientes com diferentes solicitações,
            enfileire ou registre solicitações e implemente oprações reversíveis.
    
    + Adapter
        Converte a interface de uma classe para outra interface
        que os clientes espera, encontrar. Permite a operação
        conjunta de classes que não poderiam faze-lo de outra
        maneira porque suas interfaces são incompatíveis.
        
    + Facade
        Fornece uma interface unificada para um conjunto de interfaces em um subsistema. O Facade(Fachada)  define uma interface de nível mais alto que facilita a utilização do subsistema.
    
    + Template Method
        Define o esqueleto de um algoritimo numa opração. Transferindo alguns passos para as sbuclasses. No Template Method, as subclasses podem redefinir certos passos de um algoritimo sem modificar a sua estrtutura.
    
    + Iterator
        Fornce uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor a sua representação subjacente.
    
    + Composite
        Permite que você componha objetos em estruturas de árvore para representar hierarquias parte-todo. Com esse padrão, os cliente  podem tratar objetos individuais ou composições de objetos de maneira uniforme.
        
    + State
        Permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado sua classe.
    
    + Proxy
        Fornece um substituto ou representante de outro objeto para controlar o acesso a ele;
        
    + Padrões compostos 
        Um Padrão Composto combina dois ou mais padrões numa solução que é aplicável a problemas recorrentes ou genéricos.
        
    + Vivendo Melhor Com Os Padrões
    
    
+ PRINCÍPIOS OO
    * Encapsule o que varia
    * Dê prioridade á composição em relação a herança
    * (Strategy) Programe para interface, não para implementações
    * (Observer) Busque projetos levemente ligados entre objetos que iteragem
    * (Decorator) As classes devem estar abertas para extensão,
       mas fechadas para modificação
    * (Factory) Dependa de abstrações. Não dependa de classes concretas.
    * (Princípio do conhecimento mínimo (Princípio de Demétrio)) Só converse com seus amigos
    * (Template Method) Não nos telefone nós telefonaremos para você
     
    * (Iterator e Composite) Uma classe só deve ter uma úinica razão para mudar
    


+ PONTOS IMPORTANTES
    
    + Strategy
        * Saber os princípios OO não faz de você um bom designer.
        Os bons designers OO podem ser reutilizadores, estendidos e mantidos.
        
        * Padrões mostram como construir sistemas de boas qualidades de design OO;
        
        * Padrões são uma experiência orientada a objeto comprovada.
        
        * Padrões não fornecem códigos, mas soluções gerais para problemas de projeto.
          Você os aplica a seu aplicativo.
        
        * Os padrões não são inventados, são descobertos.
        
        * A maioria dos padrões e princípios trata de questões de alteração no software
        
        * A maioria dos padrões permite que uma parte do sistema
          varie independentemente de todas as outras partes;
        
        * Geralmente tentamos pegar e encapsular o que varia em um sistema.
        
        * Padrões fornecem uma linguagem compartilhada que pode 
          maximar o valor de sua comunicação com os outros desenvolvedores.
    
    + Observer
        * O padrão Observer define uma relação um-para-muitos entre os objetos
        
        * O subjects, ou como são conhecidos Observables,
          atualizam os observadores usando umainterface comum.
        
        * Os Observers são levemente ligados já que Observable não sabe de nada sobre eles,
          exceto que eles implementam a interface observadores.
        * Você pode empurrar ou puxar dadosde Observable ao utilizar o
          padrão (puxar pe considerado mais "correto").
        
        * Não dependa de uma ordem ou notificação específica para seus Observers.
        
        * Java tem várias implementações do Padrão Observer,
          incluindo o java.util.Observable para fins gerais.
        
        * Cuidado com as questões na implementação
          de java.util.Observable
        
        * Não tenha medo de criar sua própria implementação
          de Observable, se necessário.
        
        * Swing utiliza muito o Padrão Observer,
          assim como muitos frameworks GUI.
        
        * Você também irá encontrar este padrão em muitos outros,
          incluindo JavaBeans e RMI.
    
    + Decorator
        * A herança é uma forma de extensão, mas não necessariamente a melhor maneira
          de obter a flexibilidade em nossos projetos.
        
        * Em nossos projetos deveríamos permitir que o comportamento
          fosse estendido sem a necessidade de modificar o código existente.
        
        * Composição e delegação podem ser sempre usadas para adicionar
          novos comportamentos de execução
        
        * O padrão Decorator fornece uma alternativa para
          a subclasse para estender  o comportamento.
        
        * O padrão Decorator envolve um conjunto de classes de decorador
          usadas para englobar componentes concretos.
        
        * As classes de decorador espelham o tipo de componente que elas decoram.
          (Na verdade, elas são do mesmo tipo que os componentes que decoram,
          e ja por herança ou por implementação de interface).
        
        * os decoradores mudam o comportamento de sus componentes adicinando
          novos recursos antes e/ou depois (ou mesmo no lugar) de chamadas de método para o componente.
        
        * Você pode englobar um componente com qualquer número de decoradores.
        
        * Os decoradores geralmente são transparentes para o cliente do componente;
          ou seja, a menos do que o cliente, esteja utilizando  tipo concreto de componente.
        
        * Os decoradores podem resultar em muitos objetos pequenos em nosso design
          e o uso exagerado pode ser complexo.
        
    + Factory
        * Todas as fábricas encapsulam a criação de objetos
        
        * Simple Factory, embora não seja um padrão de projetos legítimo,
          é uma maneira simples de desvincular seus clientes das classes concretas.
        
        * Factory Method utiliza a herança: a criação de objetos é delegada
          a subclasses que implementam o método fábrica para criar objetos
        
        * Abstract Factory utiliza a composição de objetos: a criação de objetos
          é implementada em métodos expostos na interface de fábrica.
        
        * Todos os padrões factory promovem ligações fracas reduzindo
          a dependência de seu aplicativo em classes concretas.
        
        * O objetivo do Factory Methodé permitir que uma classe defira
          a criação de instâncias para suas subclasses.
        
        * O objetivo da Abstract Factory é criar famílias de objetos
          relacionados sem ter que depender de suas classes concretas
        
        * O princípio da Inversão de Dependência nos ajuda a evitar
          dependências em tipos concretos e a conseguir abstrações
        
        * Factories são uma técnica eficaz para codificar abstrações,
          e não classes concretas.
    
    + Singleton
        * O padrão Singleton garante que você tenha no máximo uma instância de
          uma classe em seu aoplicativo.
          
        * O Padrão Singleton também fornece um ponto de acesso global a essa instância.
        
        * A implementação de Java do Padrão Singleton utiliza um construtor private,
          um método statico combinado com uma variável stática.
        
        * Examine suas restrições de desempenho e recursos e escolha cuidadosamente
          uma implementação de Singleton apropriada para aplicativos de vários
          segmentos (e devemos considerar todos os aplicativos com vários segmentos!).
        
        * Conheça a implementação da trava duplamente verificada;
          ela não é segura para segmentos em versões anteriores a JAVA 2, versão 5.
        
        * Tome cuidado se você estiver usando vários carregadores  de classe;
          isso poderia atrapalhar a implementção de Singleton
          e resultar em várias instâncias.
        
        * Se você estiver usando um versão anterior á JAVA 1.2,
          crie um registro de Singletons para combater o coletor de lixo.
    
    + Command
        * O Padrão Command desconecta o objeto que faz uma solicitação 
          do objeto que sabe como atendê-la.
        
        * Um objeto de Comando está no centro dessa desconexão e encapsula
          um receptor com uma ação (ou conjunto de ações).
        
        * Um invoncador faz uma solicitação em um objeto de Comando chamando
          o seu método execute(), que invoca essasações no receptor.
        
        * Os invocadores podem ser parametrizados com Comandos, 
          mesmo dinamicamente durante a execução.
          
        * Os comandos podem suportar a reversão das ações executadas através da
          implementação de um método undo() que restaura o objeto ao seu estado
          anterior, antes que seu método execute() seja chamado.
          
        * Macrocomandos são extensões simples dos comandos que permitem a chamada
          simultânea de múltiplos comandos. Também é simples de implementar undo() em
          Macrocomandos.
          
        * Na prática, não é incomum que objetos de comando "inteligentes" implementem a
          solciitação por conta própria em vez de delegá-la a u receptor.
          
        * Os comandos também podem ser usados para implementar registros de ações
          executadas ("logging") e sistemas transacionais.
    
    + Adapter & Facade
        * Quando você tiver que usar a classe existente cuja interface não é adequeada para suas necessidades, use um adapter;
        
        * Quando você precisar simplificar e unificar uma interface grande com um conjunto complexo de interfaces, use um facade.
        
        * Um adaptador muda uma interface para algo que o cliente espera encontrar.
        
        * Uma Facade desconecta um cliente de um subsistema complexo
        
        * A aimplementação de um adaptador pode exigir pouco ou muito trabalho, dependendo do tamanho e da complexiadade da(s) interface(s) alvo.
        
        * A implementação de uma Facade exige que a componhamos com o seu subsistema e usemos delegação para executar o trabalho da mesma.
    
        * O Padrão Adapter possui dois formatos:
            - Adaptador de objetos e adaptador de classes.
          Os adaptadores de classes exigem heranã múltipla.
        
        * É posssível implementar mais de uma Facade para o mesmo subsistema.
        
        * Um Adapter envelopa um objeto para mudar sua interface; um Decorator envolopa um objeto para adicionar novos comportamentos e responsabilidades; e um Facade "envelopa" um conjunto de objetos para simplifica-los.
        
    + Template Method
        * Um "template method" define os passos de um algoritimo, permitindo que alguns desses passos sejam implementados por subclasses.
        
        * O Padrão Template Method é uma técnica importante de reutilização de código.
        
        * A classe abstrata do Template Method pode definir métodos concretos, métodos abstratos  e ganchos (hooks).
        
        * Os métodos abstratos são implementados por subclasses
        
        * Ganchos são métodos que não fazem nada, ou executam apenas um comportamento default na classe abstrata, mas podem ser substituídos na subclasse
        
        * O Template Method deve ser definido como final para impedir que as subclasses modifiquem o seu algoritimo.
        
        * O Príncipio HollyWood indica que o proceso decisório dever ser deixado a cargo dos módulos de nível mais alto, aos quais cabe determinar quando e como os módulos de baixo nível serão chamados
        
        * Você encontrará vários exemplos de uso do Padrão Template Method no mundo real, mas não espere que todos (como acontece com qualquer padrão) sigam estritamente os modelos teóricos.
        
        * O Método de Factory é uma especialização do Template Method
    
    + Iterator e Composite
        * Um Iterator permite o acesso aos elementos de um agregado sem expor a sua estrutura interna.
        
        * Um iterator assume a tarefa de realizar a iteração através de um agregado e a encapsula em outro objeto.
        
        * Quando usamos um Iterator, nós livramos o agregado da responsabilidade pela implementação de operações que permitam acessar sequencialmente os seus próprios dados.
        
        * Um Iterator fornece uma interface comum para o acesso sequencial aos itens de um agregado permitindo que você recorra ao polimorfismo quando estiver escrevendo código que utilize os itens de uma agregado.
        
        * Devemos nos esforçar para atribuir somente uma responsabilidade a cada classe.
        
        * O Padrão Composite fornece uma estrutura para conter tanto objetos individuais(Folhas) como objetos compostos(Nós).
        
        * O Padrão Composite permite que os cliente tratem os compostos e objetos individuais de maneira uniforme.
        
        * Um Componente é qualquer Objeto numa estrutura composta. Os Componentes poder ser outros compostos ou nós-folha.
        
        * A implementação do Padrão Composite possui vantagens e desvantagens (como qualquer outra). Você deve equilibrar as suas próprias necessidades com o nível de transparência e segurança que pretende obter.
        
    + State
        * O Padrão State permite que um objeto tenha muito comportamentos diferentes baseados no seu estado interno.
        
        * Ao contrário do que acontece numa máquina de estados procedural, o Padrão State representa cada estado como uma classe completa.
        
        * O contexto obtém seu comportamento delegando tarefas ao objeto de estado atual, com o qual ele está composto.
        
        * Quando encapsulamos cada estado numa classe, estamos limitando a abrangência de qualquer alteração que venha a ser necesária.
        
        * Os Padrões de State e Strategy possuem o mesmo diagrama de classes mas diferem na intenção.
        
        * O Padrão Strategy tipicamente configura as classes de Contexto com um comportamento ou algoritmo.
        
        * O Padrão State permite que um Contexto mude seu comportamento de acordo com as mudanças de estado.
        
        * As transições de estados podem ser controladas pelas classes de Estado ou pelas classes de Contexto.
        
        * O uso do Padrão State normalmente aumenta o número de classes no seu projeto.
        
        * As classes de Estado podem ser compartilhads entre instâncias de Contexto.
        
    + Proxy
        * O Padrão Proxy fornece um repesentante que assume o lugar de outro objeto para controlar o acesso do cliente a ele. Há diversas maneiras de gerenciar esse acesso.
        
        * O Proxy Remoto gerencia a interação entre um cliente e um objeto remoto.
        
        * O Proxy Virtual controla o acesso a um objeto para o qual a geração de instâncias é onerosa
        
        * O Proxy de Proteção controla seletivamente o acesso aos métodos de um objeto com base na origem chamada.
        
        * Existem muitas outras variantes do Padrão Proxy, inclusive proxies de firewall proxies de sincronização, proxies de cache, proxies de cópia-sobre-gravação e assim por diante.
        
        * Um Proxy é estruturalmente semelhante a um Decorator, mas suas finalidades são diferentes.
        
        * O Padrão Decorator acrescenta comportamentos a um objeto, ao passo que o Proxy controla o acesso a ele.
        
        * Os recursos internos de suporte a proxies em Java permitem construir uma classe de proxy dinâmico por demanda e despachar todas as chamdas recebidas por ela para um processador de sua livre escolha.
        
        * Como acontece com qualquer envelopador, o uso de proxies  tende a aumentar o número de classes e objetos nos seus projetos.
        
    + Padrões Compostos    
        * Padrão Modelo Visualização Controlador é um padrão composto que utiliza os padrões Observer, Strategy e Composite.
        
        * O modelo utiliza o Padrão Observer para manter seus observadores atualizados sem manter vínculos diretos com eles.
        
        * O controlador é a estratégia da visualização. A visualização pode usar diferentes implementações do controlador para obter comportamentos diferentes
        
        * A visualização utiliza o Padrão Composite para implementar a interface de usuário, que geralmente inclui componentes aninhados, como painéis quadros e botões.
        
        * Todos esses padrões funcionam conjuntamente para desvincular os três elementos do modelo MVC, mantendo a estrutura transparente e flexível.
        
        * O Padrão Adapter pode ser usado para adaptar um novo modelo a uma visualização e um controlador já existentes.
        
        * O Modelo 2 é uma adaptação do MVC para aplicativos de WEB.
        
        * No Modelo 2, o controlador é implementado como um servlet e a visualização utiliza JSP e HTML.
        
        
# closest -> pega um pai que for marcado


