<h1> Api Meta Philips </h1>

 ## Tecnologias Usadas: 
  
<table>
  <tr>
   <td>Projeto</td>
   <td>Linguagem</td>
   <td>Spring Boot</td>
   <td>IDE</td>
   <td>Banco de Dados</td>
   <td>Server Port</td>
  </tr>
   <tr>
   <td>Maven Project</td>
   <td>Java 8</td>
   <td>2.5.1</td>
   <td>Spring Tool Suite 4</td>
   <td>Postgres</td>
   <td>8888</td>
  </tr>
</table>

  <h3> Outras </h3>
  
  1) Lombok
  2) Data JPA
  3) Para realizar os teste de get, post, pull e delete, foi utilizado o Postman para fazer as chamadas.
  
  
 ## Urls utilizadas para testar a API: 
 
  1) LISTAR:
      <table>
        <tr>
         <td>Método</td>
         <td>Url</td>
        </tr>
         <tr>
         <td>GET</td>
         <td>http://localhost:8888/cliente/listar</td>
        </tr>
      </table>
  
  2) INCLUIR:
      <table>
        <tr>
         <td>Método</td>
         <td>Url</td>
        </tr>
         <tr>
         <td>POST</td>
         <td>http://localhost:8888/cliente/incluir</td>
        </tr>
      </table>
      <h4>JSON utilizado para incluir</h4>
      
      ```
        {
    
            "nome":"Marina",
            "sobrenome":"Mendes",
            "dataNascimento": "1998-12-31",
            "cpf": "31194156997",
            "telefone": "33999174111",
            "endereco":"Rua Maria Helena, 123A",
            "ativo":1
        }
      ```
      
   3) ALTERAR:
      <table>
        <tr>
         <td>Método</td>
         <td>Url</td>
        </tr>
         <tr>
         <td>PUT</td>
         <td>http://localhost:8888/cliente/alterar</td>
        </tr>
      </table>
      <h4>JSON utilizado para alterar</h4>
      
      ```
        {
            "id": 1,
            "nome":"Marina",
            "sobrenome":"Mendes",
            "dataNascimento": "1998-10-11",
            "cpf": "31194156007",
            "telefone": "33999174111",
            "endereco":"Rua Maria Helena, 123B",
            "segundoEndereco": "Rua Madalena Texeira",
            "ativo":1
        }
        
      ```
   3) DELETAR:
         <table>
           <tr>
            <td>Método</td>
            <td>Url</td>
           </tr>
           <tr>
            <td>DELETE</td>
            <td>http://localhost:8888/cliente/delete</td>
           </tr>
         </table>
         <h4>JSON utilizado para deletar</h4>

        ```
          {
              "id": 1,
              "nome":"Marina",
              "sobrenome":"Mendes",
              "dataNascimento": "1998-10-11",
              "cpf": "31194156007",
              "telefone": "33999174111",
              "endereco":"Rua Maria Helena, 123B",
              "segundoEndereco": "Rua Madalena Texeira",
              "ativo":1
          }

        ```

