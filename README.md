## 2) API method

### - Create/Add(POST): create new product
 
  request: http://localhost: 9090/api/v1/products POST
 ![image](https://user-images.githubusercontent.com/43161981/85679138-18ad8a80-b704-11ea-8cb1-c454f00b5c5d.png)

response:

![image](https://user-images.githubusercontent.com/43161981/85678949-eac84600-b703-11ea-9413-f3f40762a640.png)

![image](https://user-images.githubusercontent.com/43161981/85678984-f4ea4480-b703-11ea-8d0c-8823fde78223.png)

### - Get full list of products: 
 
 request: http://localhost:9090/api/v1/products GET
 
response :
![image](https://user-images.githubusercontent.com/43161981/85679433-5e6a5300-b704-11ea-81dd-35ff8c065c52.png)

```json
[
    {
        "id": 1,
        "name": "TV",
        "category": "electronics",
        "price": 3000,
        "manufacturer": "Samsung",
        "unitInStock": 200,
        "description": "Good Quality TV"
    },
    {
        "id": 2,
        "name": "Desktop",
        "category": "electronics",
        "price": 2500,
        "manufacturer": "Samsung",
        "unitInStock": 100,
        "description": "Gaming DeskTop"
    },
    {
        "id": 3,
        "name": "NoteBook",
        "category": "electronics",
        "price": 2000,
        "manufacturer": "Apple",
        "unitInStock": 100,
        "description": "MacBook Pro"
    },
    {
        "id": 4,
        "name": "NoteBook",
        "category": "electronics",
        "price": 2000,
        "manufacturer": "Apple",
        "unitInStock": 100,
        "description": "MacBook Air"
    },
    {
        "id": 5,
        "name": "Shoes",
        "category": "clothes",
        "price": 300,
        "manufacturer": "Adidas",
        "unitInStock": 10,
        "description": "Adidas YeezyBoost"
    },
    {
        "id": 6,
        "name": "Pants",
        "category": "clothes",
        "price": 50,
        "manufacturer": "Nike",
        "unitInStock": 2000,
        "description": "Nike Training Pants"
    },
    {
        "id": 7,
        "name": "Hat",
        "category": "clothes",
        "price": 30,
        "manufacturer": "Adidas",
        "unitInStock": 3000,
        "description": "Adidas Cap"
    },
    {
        "id": 8,
        "name": "Mouse",
        "category": "electronics",
        "price": 30,
        "manufacturer": "Logitech",
        "unitInStock": 4000,
        "description": "Logitech G102"
    },
    {
        "id": 9,
        "name": "Bag",
        "category": "clothes",
        "price": 40,
        "manufacturer": "Eight Seconds",
        "unitInStock": 5000,
        "description": "EightSeconds BackPack"
    },
    {
        "id": 10,
        "name": "Phone",
        "category": "electronics",
        "price": 200,
        "manufacturer": "Samsung",
        "unitInStock": 20,
        "description": "Galaxy S8+"
    },
    {
        "id": 11,
        "name": "DeskTop",
        "category": "electronics",
        "price": 2000,
        "manufacturer": "LG",
        "unitInStock": 10,
        "description": "LG DeskTop"
    }
]
```



### - Get details of products with id=N
 
request : http://localhost:9090/api/v1/products/2 GET

response : 
![image](https://user-images.githubusercontent.com/43161981/85679747-a5f0df00-b704-11ea-8ee4-c11be4ec89ae.png)



### -  fetch all products of a category

request :  http://localhost:9090/api/v1/products/category/clothes GET

response :
![image](https://user-images.githubusercontent.com/43161981/85680013-e2243f80-b704-11ea-844d-60eea523ff07.png)

```json
[
    {
        "id": 5,
        "name": "Shoes",
        "category": "clothes",
        "price": 300,
        "manufacturer": "Adidas",
        "unitInStock": 10,
        "description": "Adidas YeezyBoost"
    },
    {
        "id": 6,
        "name": "Pants",
        "category": "clothes",
        "price": 50,
        "manufacturer": "Nike",
        "unitInStock": 2000,
        "description": "Nike Training Pants"
    },
    {
        "id": 7,
        "name": "Hat",
        "category": "clothes",
        "price": 30,
        "manufacturer": "Adidas",
        "unitInStock": 3000,
        "description": "Adidas Cap"
    },
    {
        "id": 9,
        "name": "Bag",
        "category": "clothes",
        "price": 40,
        "manufacturer": "Eight Seconds",
        "unitInStock": 5000,
        "description": "EightSeconds BackPack"
    }
]
```


### - Update (PUT): modify values of product with id=N
 
 request : http://localhost:9090/api/v1/products/2 PUT
 
![image](https://user-images.githubusercontent.com/43161981/85680459-49da8a80-b705-11ea-9470-e25798066bb1.png)


response :

![image](https://user-images.githubusercontent.com/43161981/85680558-61b20e80-b705-11ea-9455-77b6109884fc.png)
![image](https://user-images.githubusercontent.com/43161981/85680615-6d9dd080-b705-11ea-88cc-52ab1fc61cf5.png)


### - Delete (DELETE): delete product with id=N
 
request : http://localhost:9090/api/v1/products/2 DELETE

response :
![image](https://user-images.githubusercontent.com/43161981/85680781-945c0700-b705-11ea-863c-ee62bad36e18.png)


## 3) Spring Boot의 actuator를 활용하여 Products REST API에 대한 URL Mapping 정보를 캡쳐

![image](https://user-images.githubusercontent.com/43161981/85687869-37178400-b70c-11ea-8799-e7557b82db4d.png)
![image](https://user-images.githubusercontent.com/43161981/85687967-4c8cae00-b70c-11ea-9d4c-b4b31a609007.png)
![image](https://user-images.githubusercontent.com/43161981/85688012-57474300-b70c-11ea-8029-43298f0d9fb4.png)
![image](https://user-images.githubusercontent.com/43161981/85688046-5f06e780-b70c-11ea-801e-44f66649eefd.png)
![image](https://user-images.githubusercontent.com/43161981/85688112-6cbc6d00-b70c-11ea-9c47-727a1ca10840.png)
![image](https://user-images.githubusercontent.com/43161981/85688148-73e37b00-b70c-11ea-9e29-b5846f356fca.png)
![image](https://user-images.githubusercontent.com/43161981/85688179-7ba31f80-b70c-11ea-90d5-940ec6145560.png)


