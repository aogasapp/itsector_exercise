# ITS Backoffice

Projeto para gestão de utilizadores.
## Funcionalidades
- Listagem de utilizadores
- Adicionar, remover e atualizar utilizador
- Não sendo permitido atualizar username

## Ambiente desenvolvimento

### Ferramentas
- Spring Tool Suite 4.4.2
- Mysql Workbench 6.3

### Bibliotecas
- Spring Boot Starter 2.2.2
- Java JDK 8
- Lombok 1.18.10
- Mysql Connector 8.0.18
- Postman 7.13.0

## API e métodos HHTP
No controller foram disponibilizados métodos HTTP/RESTful para cada uma das funcionalidades pedidas:
* Listagem de contatos: GET ("/contatos")
* Adicionar contato: POST ("/contatos")
* Remover contato: DELETE ("/contatos/id")
* Atualizar senha e nome: PUT ("/contatos/id")

# Desenvolvimento

#### Modelo
Inicialmente foi criado a classe modelo <Contato.java> que seria a entidade JPA (anotação @Entity) representando a tabela no banco de dados. Utilizadas anotações para identificar a chave primária  (@Id - auto increment na tabela) e controlar as colunas de horário de criação e modificação do registro (@CreationTimestamp e @UpdateTimestamp).

Além destas foram utilizadas anotações da biblioteca Lombok para gerar metódos gettters, setters e contrutor.

#### Controller
Criada a classe <ContatoController.java> onde estão expostos os endpoints da API.
A injeção do objeto responsável pela camada Service foi realizada pelo construtor evitando o uso da anotação @Autowired.
Fora omitidas validações das entradas dos dados.

#### Service
Foi inserida na camada de serviço <ContatoServiceImpl.ajav> a regra de atualização do username do utilizador.

# Banco de dados
Para persistência foi utilizado o Mysql. Foi acrescentado um script para criação do schema e tabela do exercício.
Os dados de acesso à base (application.properties) foram deixados em branco. Numa aplicação em produção essa informação poderia ser passada em linha de comando ou em arquivo do servidor.

# Utilização e exemplos
- Listagem de usuários
![alt text](https://github.com/aogasapp/itsector_exercise/blob/master/Exemplos%20de%20utilizacao/listagem%20de%20usuarios.png)

- Adição de usuário
![alt text](https://github.com/aogasapp/itsector_exercise/blob/master/Exemplos%20de%20utilizacao/adicao%20de%20usuario.png)

- Remoção de usuário
![alt text](https://github.com/aogasapp/itsector_exercise/blob/master/Exemplos%20de%20utilizacao/remocao%20de%20usuario.png)

- Atualização de dados
![alt text](https://github.com/aogasapp/itsector_exercise/blob/master/Exemplos%20de%20utilizacao/alteracao%20de%20usuario.png)