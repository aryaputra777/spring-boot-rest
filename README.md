# spring-boot-rest

## List User

Request :
- Method : GET
- Endpoint : `/api/v1/users`
- Header :
  - Accept: application/json
    Response :

```json 
[
  {
    id: 1,
    name: "Arya",
    email: "putraarya@mail.com",
    handphone: "0121433",
    password: "password",
    createddate: "1992-12-12"
  },
  {
    id: 2,
    name: "Putra",
    email: "putraarya@mail.com",
    handphone: "0121433",
    password: "password",
    createddate: "1992-12-12"
  }
]
```
## Create User

Request :
- Method : POST
- Endpoint : `/api/v1/user`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json 
{
    "name": "aryaps",
    "email": "putr@gmail.com",
    "handphone": "0008888",
    "password": "asdad",
    "createddate": "1992-12-12"
}
```

Response :

```json 

```



## Update User

Request :
- Method : PUT
- Endpoint : `/api/v1/user/{userId}`
- - Query Param :
  - name : string,
  - email : string
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json 

```

Response :

```json 

```


## Delete User

Request :
- Method : DELETE
- Endpoint : `/api/v1/user/{userId}`
- Header :
    - Accept: application/json

Response :

```json 

```

#Next Feature 
Will be 
1. Add Response Message.
2. Add Unit Test.
3. Encrypt password.
4. Use Authentication.
5. Add Integration Test.
