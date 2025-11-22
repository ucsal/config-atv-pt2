# Atividade: Spring Cloud Config

## a) Explique o conceito de configuração externalizada e centralizada.

A **configuração externalizada** significa que as configurações de uma aplicação não ficam dentro do código (por exemplo, não ficam no `application.properties` empacotado no JAR), mas sim fora dele. Isso permite que você altere valores como URLs de banco de dados ou portas sem precisar recompilar ou redistribuir o aplicativo.

Já a **configuração centralizada** significa que todas as aplicações e microsserviços de um sistema leem suas configurações de um único ponto central, geralmente um servidor dedicado (Config Server). Dessa forma, as alterações nas configurações se propagam por todo o sistema de forma organizada, padronizada e consistente.

---

## b) Por que é importante ter um Config Server em um sistema bancário com múltiplos ambientes (dev, homologação, produção)?

Em um sistema bancário que possui ambientes diferentes, como desenvolvimento, homologação e produção, cada um com parâmetros específicos (URLs de serviços, chaves de API, credenciais), o uso de um Config Server é fundamental pois:

* **Garante a padronização** das configurações, evitando divergências e perda de controle entre os ambientes.
* **Possibilita auditoria** de alterações, já que as configurações ficam normalmente versionadas em Git (histórico de quem mudou e quando).
* **Facilita a segurança**, permitindo o gerenciamento e a troca de segredos e chaves de forma controlada.
* **Permite atualizações dinâmicas**, possibilitando mudar o comportamento do sistema sem a necessidade de interromper serviços críticos (restart).
* **Separa código de configuração**, reduzindo drasticamente o risco de vazamento de credenciais de produção no código fonte.