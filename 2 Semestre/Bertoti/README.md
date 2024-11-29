# Bertoti
## Atividade 1

  ### Realize um comentário baseado nos parágrafos abaixo:
  
  _"Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : 
engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might 
need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an 
important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming._

  _We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project,
engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned 
about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to 
make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."_

  Comentário: Este texto aborda a diferença entre programação e engenharia de software, destacando a importância do tempo, escala e os trade-off.
Na engenharia de software, os profissionais precisam considerar não apenas o desenvolvimento inicial, mas também modificações e manutenções futuras, 
além de dimensionar as decisões com base em estimativas imprecisas de tempo e crescimento. Nada em engenharia de software é mágica. 
É interessante observar como a programação é parte essencial da engenharia de software, mas não a resume por completo, já que envolve aspectos mais amplos e complexos.

## Atividade 2

  ### De 3 exemplos de trade-off em softwares e explicá-los.
  1. Usabilidade vs. Segurança: Um trade-off comum em softwares é entre a usabilidade, tornando o software fácil e intuitivo para os usuários, e a segurança, 
garantindo que os dados e a privacidade dos usuários estejam protegidos. Por exemplo, adicionar camadas extras de segurança, como autenticação em dois fatores, 
pode tornar o processo de login mais complexo para os usuários, impactando a usabilidade.

  2. Desempenho vs. Consumo de Recursos: Muitas vezes, os desenvolvedores enfrentam o dilema de otimizar o desempenho do software, garantindo que ele execute tarefas rapidamente, 
ao mesmo tempo em que minimizam o consumo de recursos, como memória e processamento. Por exemplo, a utilização de algoritmos mais eficientes pode aumentar o desempenho do software, 
mas também pode exigir mais recursos computacionais.

  3. Flexibilidade vs. Complexidade: Ao projetar um software, os desenvolvedores podem encontrar um trade-off entre a flexibilidade do sistema, permitindo que os usuários personalizem 
e adaptem o software de acordo com suas necessidades, e a complexidade do código subjacente. Adicionar muitas opções de personalização pode tornar o software mais complexo e difícil de manter.

## Atividade 3 

## Layered Architecture Style
# Scalability = 1 x Overall Cost = 5

•	Escalabilidade:
o	Desvantagem: À medida que a demanda por escalabilidade aumenta, os custos podem subir devido à necessidade de otimizar a comunicação entre camadas

•	Custo:
o	Benefício: Inicialmente mais econômico em termos de desenvolvimento e implantação, 

## Pipeline Architecture Style
# Scability = 1 x Simplicity = 5

•	Escalabilidade:
o	Desvantagem: Limita a capacidade de escalabilidade e pode se tornar um gargalo em cenários de alta demanda, resultando em tempos de resposta mais lentos.

•	Simplicidade:
o	Benefício: Facilita o desenvolvimento, manutenção e entendimento do sistema.

## Microkernel Architecture Style
# Fault tolerance = 1 x Overall Cost = 5

•	Tolerância a Falhas:
o	Benefício: Ao isolar componentes essenciais no microkernel, a arquitetura de microkernel oferece maior tolerância a falhas. Se um plug-in falhar, o restante do sistema pode continuar operando

•	Custo:
o	Desvantagem: podem elevar o custo inicial de desenvolvimento e operacional devido à necessidade de definir interfaces claras e gerenciar a comunicação entre o microkernel e os plug-ins

## Service-Based Architecture Style
# Performance = 3 x Overall Cost = 4

•	Performance:
o	Desvantagem: Overhead de comunicação e necessidade de coordenação podem afetar negativamente o desempenho.

•	Custo:
o	Benefício: Economia de recursos e flexibilidade de implantação reduzem os custos operacionais.

## Event-Driven Architecture Style
# Simplicity = 1 e Fault tolerance = 5

•	Simplicidade:
o	Desvantagem: falta de mecanismos robustos de detecção, recuperação podem tornar o sistema vulnerável a interrupções.

•	Tolerância a Falhas:
o	Vantagem: Um sistema tolerante a falhas é capaz de continuar operando mesmo quando ocorrem falhas em seus componentes.

## Microservices Architecture
# Overall Cost = 1 e Scability = 5

•	Custo:
o	Desvantagem: custos de desenvolvimento e infraestrutura podem ser altos devido à complexidade de implementação, necessidade de automação e ferramentas de monitoramento.

•	Escalabilidade:
o	Vantagem: permite que cada serviço seja dimensionado de forma independente conforme necessário, o que melhora a capacidade de resposta e a resiliência do sistema.


## Atividade 4
Pensar em uma aplicação, onde terá que: definir a arquitetura, definir as classes UML, realizar um código java e testar.

### Idéia 

  Um aplicativo de médico virtual. Nele contém uma extensa biblioteca de informações sobre doenças, sintomas, medicamentos e até procedimentos médicos, junto com um amplo questionário de saúde com perguntas que os médicos costumam fazer aos pacientes.

  Nele, o usuário pode inserir o máximo de informações possível sobre sua saúde, como peso, idade, sexo, tipo sanguíneo, glicose, e assim por diante. A partir daí, pode iniciar uma consulta respondendo a uma série de perguntas apresentadas pelo aplicativo.

  Por exemplo, se o usuário estiver com sintomas de gripe, ele pode clicar em "consulta" e o aplicativo começará a fazer uma série de perguntas, como "quais sintomas você está sentindo?". Com base nas respostas fornecidas, o aplicativo poderá sugerir tratamentos adequados, como o uso de Paracetamol.

  No entanto, se o aplicativo não conseguir chegar a uma conclusão definitiva com base nas informações fornecidas ou se não houver informações suficientes para determinar a situação de saúde do usuário, ele poderá sugerir que o usuário consulte um médico da área correspondente.

  Além disso, o aplicativo também pode ser usado como um guia de medicamentos, permitindo que os usuários pesquisem doenças e/ou sintomas e recebam uma lista de medicamentos adequados. Quanto mais informações o usuário fornecer, mais precisos serão os resultados. Por exemplo, se o usuário fornecer informações sobre sua pressão arterial, glicose ou gravidez recente, o aplicativo poderá excluir certos medicamentos, seguindo o padrão de um médico.

  É importante ressaltar que este aplicativo não substitui uma consulta médica profissional, sendo apenas uma ferramenta para auxiliar. Assim como na engenharia elétrica, onde existem programas que facilitam a elaboração de projetos, mas não substituem a experiência e o conhecimento dos engenheiros, este aplicativo é uma ferramenta complementar aos serviços médicos tradicionais.

  ## 1. Definição da Arquitetura:
O aplicativo de médico virtual descrito se encaixa na **Arquitetura de Microsserviços** 

- **Modularidade**: Divisão do aplicativo em serviços independentes (biblioteca médica, questionário de saúde, consulta de sintomas, recomendação de medicamentos, dados do usuário, integração com profissionais de saúde).
- **Escalabilidade**: Cada serviço pode ser escalado individualmente conforme necessário, melhorando a capacidade de resposta durante períodos de alta demanda.
- **Desenvolvimento Independente**: Diferentes equipes podem trabalhar simultaneamente em diferentes serviços, acelerando o desenvolvimento.
- **Tecnologias Diferentes**: Cada serviço pode usar a tecnologia mais adequada para sua função específica.
- **Resiliência**: Falhas em um serviço não afetam diretamente os outros, garantindo maior disponibilidade do sistema.
- **Flexibilidade e Manutenibilidade**: Facilita a adição e modificação de funcionalidades sem impactar o sistema inteiro.

### Trade-off entre Custo e Escalabilidade

- **Custo Inicial**: Mais elevado devido à complexidade de definir interfaces e gerenciar a comunicação entre serviços, além do investimento em infraestrutura e ferramentas.
- **Escalabilidade a Longo Prazo**: Reduz custos operacionais ao permitir que apenas os serviços necessários sejam dimensionados conforme a demanda aumenta.

  ## 2. Classes UML:

  # Classes Principais

User: Representa o usuário do aplicativo.

HealthData: Armazena dados de saúde do usuário.

SymptomChecker: Realiza consultas baseadas em sintomas.

MedicalLibrary: Contém informações sobre doenças, sintomas e tratamentos.

MedicationRecommendation: Recomenda medicamentos com base nos dados do usuário e nos sintomas.

Consultation: Representa uma consulta realizada pelo usuário.

![Diagrama sem nome](https://github.com/lucasalex1203/Bertoti/assets/143049663/42db2c2d-8df9-4156-bbb5-e73d4f190568)

 
  ## 3. Código Java:

 
  ## 4. Testes:


  
