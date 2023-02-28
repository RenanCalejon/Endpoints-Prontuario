# Prontuario

API da aplicação para controle de consultas medicas.

## Endpoints

- Adicionar Paciente
    - [Cadastrar Paciente](#cadastrar-paciente)
    - Apagar paciente
    - Alterar paciente
    - Listar todos os pacientes
    - [Detalhar um paciente](#detalhar-paciente)
- Efetua Prontuario
    - Apagar Prontuario
    - Lista todos Prontuarios
- Adicionar Clinico
    - [Cadastrar clinico](#cadastrar-clinico)
    - Apagar clinico
    - Alterar clinico
    - Listar todos os clinicos
    - [Detalhar um clinico](#detalhar-clinico)
- Agendar Consulta
    - Apagar Consulta
    - Alterar Consulta
    - Lista todas as Consultas

---

### Cadastrar Paciente

`POST` /Prontuario/api/paciente{id}

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----
| Paciente_id | inteiro | sim | O id do paciente cadastrado
| Nome | decimal | sim | informação para saber cadastrar o Nome do paciente
| CPF | inteiro | sim | informação para saber o CPF do paciente
| Data de nascimento | data | sim | a data em que o paciente nasceu
| Sexo | inteiro | sim | informação para saber o sexo do paciente
| E-mail | texto | sim | informação para saber o  e-mail do paciente
| Telefone | texto | sim | informação para saber o telefone do paciente
  
  **Exemplo de corpo de requisição**

```js 
{   
    Paciente_id : 1,
    Nome: 'Kanye West',
    CPF: 647.412.643-43,
    Data de nascimento : '1985-01-15',
    Sexo: 'Masculino',
    E-mail: 'KanyeYeezus@hotmail.com',
    Telefone: (87) 3148-6883
}
```

**Respostas**

| código | descrição
|-|-
|201| Dados do paciente cadastrado com sucesso
|400| a validação dos campos falhou

### Detalhar paciente

`GET` /gestanca/api/paciente/{id}

**Respostas**

| código | descrição
|-|-
|200| os dados do paciente foram retornados no corpo da resposta
|404| não existe paciente com o id informado


**Detalhamento do Paciente**

```js 

{
   Paciente :{
        Paciente_id : 1,
        Nome: 'Kanye West',
}
    CPF: 647.412.643-43,
    Data de nascimento
    Sexo: 'Masculino',
    E-mail:'KanyeYeezus@hotmail.com',   
    Telefone: (84) 3148-6883 ,

}
```
---
### Cadastrar Clinico

`POST` /Prontuario/api/clinico{id}

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----
| Clinico_id | inteiro | sim | O id do clinico cadastrado
| Nome | decimal | sim | informação para saber cadastrar o Nome do clinico
| CPF | inteiro | sim | informação para saber o CPF do clinico
| Data de nascimento | data | sim | a data em que o clinico nasceu
| E-mail | texto | sim | informação para saber o  e-mail do clinico
| Especialização | texto | sim | informação para saber a especialização do clinico
  
  **Exemplo de corpo de requisição**

```js 
{
    Clinico_id : 1 ,
    Nome: 'Doctor Dre',
    CPF: 311.795.885-17,
    Data de nascimento : '1970-01-15',
    Sexo: 'Masculino',
    E-mail: 'DreWestSide@gmail.com',
    Especialização: 'Cardiologista'
}
```

**Respostas**

| código | descrição
|-|-
|201| Dados do clinico cadastrado com sucesso
|400| a validação dos campos falhou


### Detalhar clinico

`GET` /gestanca/api/clinico/{id}

**Respostas**

| código | descrição
|-|-
|200| os dados do clinico foram retornados no corpo da resposta
|404| não existe clinico com o id informado


**Detalhamento do Clinico**

```js 

{
   Clinico :{
        Clinico_id : 1,
        Nome: 'Doctor Dre',
}
    CPF: 311.795.885-17,
    Data de nascimento : '1970-01-15',
    Sexo: 'Masculino',
    E-mail: 'DreWestSide@gmail.com',
    Especialização:{
        Especialização: 'Cardiologista'
        Descrição :'especialidade médica que se ocupa do diagnóstico e tratamento das doenças que acometem o coração e componentes do sistema circulatório'
    }

}

```

