# JavaBasico
Lições de Java Básico

<h1>Sobre os arquivos</h1>
Cada arquivo, com exceção de alguns como calculator, possuem os README completos com os enunciados dos exercícios em detalhes. Abaixo está um resumo breve sobre o que há em cada um dos diretórios e uma visão geral dos exercícios.  

<h3>calculator</h3>

Emprega noções básicas de operações aritméticas e uso de bibliotecas especializadas para cálculos de raiz quadrada por exemplo.

<h3>aula10Heranca</h3>

Auto explicativo.

<h3>ContaBancaria</h3>

Emprega o básico de encapsulamento, usando as notações fundamentais do conceito em Java: 
I - public: qualquer método de qualquer local pode acessar;
II - private: ninguém, além da própria classe, pode acessar, normalmente atributos priavtes usam de getters em métodos públicos SOMENTE para exibição e não acesso;
III - protected: somente as classes filhas (herdeiras) pode acessar o atributo protegido;
IV - final: aqueel atributo não poderá ser nunca mudado, muito usado para declaração de constantes.

<h3>batalhaNinja</h3>

Exercício baseado em Naruto que aborda o básico de herança, nela há três classes principais: Ninja, Jutsu e Batalha. Cada Ninja possui um único jutsu, o hp e o chakra do ninja são a mesma coisa, cada vez que um ninja é atingido ele perde chakra, e toda vez que ele usa um jutsu ele também perde chakra. Se chakra chegar a zero, ele e derrotado.

<h3>MercadoDeBola</h3>

Exercício de fixação de polimorfismo; havia uma classe pai Jogador num package jogador, todos os herdeiros desta classe eram os tipos de jogador (atacante, goleiro, lateral, etc). Há também clubes que tem interesse na compra dos jogadores. Estes, possuem seu preço base, que é alterado dependendo de regras específicas para cada tipo de jogador, um goleiro ganha 2% de aumento em seu preço base para cada penalti defendido por exemplo. Os jogadores também possuem um apetite financeiro, que determina ainda mais uma multiplicação final de seu custo para venda.

O exercício ainda possui uma classe Negociacao, que serve para efetuar com sucesso ou falha a compra de um jogador por um clube.

<h3>exploracaoEspacial</h3>

Além dos básicos do encapsulamento, este exercício aborda o conceito do static, usado para definir junto do final uma constante que será acessada somente pela classe à qual o atributo pertence. Ele é static porque é APENAS daquela classe, ele é final porque não será alterado. Exemplo:

    <strong>private static final int CUSTO_POR_POSICAO = 3;</strong>

Dentro da classe Nave, estou falando que o custo por cada posição percorrida será sempre de 3, isto é exclusivo da classe nave, e não pode ser mudado.

No exercício há também as classes Planeta e Recurso. As naves percorem os planetas que são arrays, sendo cada item do array um ponto na viagem, e cada ponto consome 3 do combustível da nave, como visto no parágrafo anterior. A nave será lançada num ponto do array e deve ir até o planeta posicionado no array, coletar os recursos e retornar; não sendo possível, ela fica à deriva. Cada planeta possui recursos.

<h3>ArmyManager</h3>

Exercício que emprega o conceito de interface do Java (espécie de "contrato"), as biliotecas ArrayList e BigDecimal, o uso de laço for. Aqui, há uma classe Militar que possui várias filhas, sendo cada uma delas um tipo de militar, especificamente neste exercicio, os tipos de miliatres são somente os veículos que eles sabem pilotar, sendo estes: PilotoCaminhao, PilotoTanque, PilotoAviao e PilotoHelicoptero. Havendo mais três classes: Elite, EspecialistaTerrestre e EspecialistaDoAr que pilotam múltiplos veículos.

As interfaces são os contratos, sendo todos num formato "PodePilotarVeiculo..." elas também usam a bilioteca LocalDate, para poder definir e verificar se a lincença do militar para pilotar um veiculo específico está em dia.

Cada classe militar possui também a importação de LocalDate, porque suas licenças um atributo do tipo LocalDate, possuindo um método getter para acessá-la, as interfaces então possuem um método cujo retorno é um boolean, na notação "isLicencaAviao() ..." para verificar se a licença está em dia ou não. 

Cada militar também possui salário. Os veículos poussem um package só seu com uma classe pai Veiculo, cujas herdeiras são os tipos de veiculos. Cada qual possui uma regra espcífica sobre tripulação, por exemplo, um tanque TEM que ter 3 militares em sua tripulação; um caminhão tem de ter no mínimo 5 e no máximo 30, e assim por diante.

Há por fim a classe Simulacao, que serve para simular o custo de uma missão, lembrando que cada militar possui um salário, e cada veículo consome uma quantidade x de combustível por quilometro rodado. Ou seja, quando um veiculo válido é criado, deve ser definido o quanto vai percorrer aquele veiculo durante a missão e isto será adiconado ao custo junto ao salário dos militares. 

<h3>dicionario</h3>

Exercício que fixa os conceitos de Enum, Exception (com throw new), bem como a biliotecas Map e HashMap. Aqui são criados dicionários, e os métodos devolvem a tradução de palavras do português para o inglês, e do inglês para o português.
