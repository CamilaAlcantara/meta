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
        
  ## Informações sobre o job de aniversário: 
  
  <text> O job de aniversáio foi construído utilizando como padrão @Scheduled(cron = "0 01 12 * * *"), ou sejá ele irá executar todos os dias ao meio dia e irá retornar uma lista com os aniversáriante. Caso durante o teste da aplicação seja diferente desse horário, você poderá alterar cron antes de execultar o processo, o método também imprime uma mensagem no console da IDE. 
Para que fique fácil entender como modificar @Scheduled(cron = "0 01 12 * * *"), observe as dicas a seguir.
</text>

 <h4>Campos do Cron</h4>
  
  ```
       @Scheduled(cron = "A B C D E F")
     
  ```
 <h4>Significado dos Campos do Cron</h4>
  
  ```
      1) A: Segundos (0 - 59)
      2) B: Minutos (0 - 59)
      3) C: Horas (0 - 23)
      4) D: Dia (1 - 31)
      5) E: Mês (1 - 12)
      6) F: Dia da semana (0 - 6)
      7) Note também que nos exemplos foram usados o *, 
      esse caracter indica que para o campo específicado qualquer valor será considerado.
     
  ```
  
   ## Fontes para contato: 
  
<text> Em caso de dúvida para utilizar ou configurar a Api pode estar entrando em contato por e-mail e pelo whastapp, que assim que possível eu esclareço as dúvidas.
</text>
  
   <h4>Dados</h4>
  
  ```
     E-mail: camilamariana19@gmail.com
     Whatsapp: (33) 99917-4111
     
  ```

