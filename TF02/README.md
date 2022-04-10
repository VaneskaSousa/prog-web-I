# Trabalho de fixação 02
1. O que é uma página web?
> É um documento que pode ser mostrado (renderizado) em um navegador como Google Chrome, Internet Explorer, Opera, Safari e etc.

2. Explique a Arquitetura Cliente/Servidor.
> A arquitetura ou modelo cliente-servidor é quando existem dois "caminhos" (processos) separados: o caminho do cliente, que é responsavel pela obtenção dos dados e o caminho do servidor, que é responsavel pela manutenção dessa informação.

3. Qual a principal função do protocolo HyperText Transfer Protocol (HTTP)?
> A principal função do protocolo HTTP é trasmitir paginas web na internet através de mensagens, não se limitando unicamente hipertexto. Dessa forma o http funciona como uma especie de mensageiro que leva e tras o conteudo dos servidores para os clientes. 

4. O protocolo HTTP é sem estado? Explique sua resposta.
> Sim, o protocolo HTTP é sem estado pois consiste em um protocolo de comunicação que considera cada requisição como uma transmição independente e sem relação com anterior. O protocolo HTTP é exatamente assim, de maneira que não prevê nenhum meio de armazenamento de solicitações ou exige qualquer tipo de dependencia entre as requisições feitas. 

5. Cite as diferenças entre o HTTP persistente sem paralelismo
e HTTP persistente com paralelismo.
- Com paralelismo: 
> Usando HTTP/1.1 é possivel varias requisições serem realizadas ao mesmo tempo.
- Sem paralelismo: 
> Só pode rodar uma requisição quando a anterior é fechada, embora a conexão não seja fechada (precisa fechar manualmente).

6. Explique as diferenças entre os Métodos HTTP GET e POST.
- Get
> O metodo GET envia dados no cabeçalho da requisição, podendo serem vistos na URL da página. Com isso eles sofrem uma limitação de caracteres (aceitam apenas 255) porem são mais performaticos do que o metodo post, pois é mais "direto" contudo é menos seguro. Este é o metodo mais recomendado para obter dados que serão usados em um recurso, como dados para uma busca (select). 
- Post
> Já o metodo POST envia os parametros no corpo da requisição, "escondendo" os dados da URL. Isso faz dele um pouco mais seguro que o metodo GET porem menos performatico. Este metodo também permite o envio de mais informações sem correr o risco de perde-las no meio do caminho, pois as informações são encapsuladas. Esse é o metodo ideal para envio de informações que serão processadas.

7. O que são Cookies? Para que servem? Quais os cuidados que
deve-se ter por questões de privacidade?
- O que são:
> São pequenos arquivos salvos localmente (ou seja, na sua máquina) por servidores que servem para coletar informações pessoais afim de personalizar a experiencia no site ou simplesmente coletar informações do usuário e até mesmo facilitar o transporte de informações dentro do proprio site. 
- Quais cuidados:
> Os cookies nao contem virus, devido a natureza da sua informação porem podem ser usados para coletar informações suas sem seu consetimento para depois ser vendido
para outras empresas (como telemarketing ou e-commerces). Os cookies também podem pegar dados valiosos como IPs, geolocalização e mesmo dados sensiveis como CPF, RG. 
Para evitar isso é preciso ter cuidado, evitar salvar dados sensiveis (preenchimento automatico), evitar permitir todos os cookies (rejeite todos ou aceite somente os obrigatorios). Limpar todos os cookies do seu navegador periodicamente também é um bom costume preventivo.
