## 조건
* [**조건 1 : Database 이름: helloProductDB-학번, 예) helloProductDB-1592058**](#database-name)
* [**조건 2 : Product Table 이름: productTable**](#table-name)
* [**조건 3 : data.sql를 이용하여 미리 10개 이상의 Product 생성**](#data-sql)
* [**조건 4 : Spring Security 기능은 사용하지 않음**](#security-enabled)
* [**조건 5 : Postman을 활용하여 API 요청 및 응답 메시지를 보일 것**](#postman)

<br/>



### 조건 1 : Database 이름 helloproductdb-1592058  <a id="database-name"></a> 
-------------
[**코드 링크**](https://github.com/slflfl12/SpringBoot-eStore/blob/master/src/main/resources/application.properties)

#### ** 설명 **
spring.datasource.url= jdbc:mysql://localhost:3306/helloproductdb-1592058?characterEncoding=UTF-8&serverTimezone=Asia/Seoul
를 통해 DB명을 설정해주었습니다.

### **application.properties**

```java
server.port=9090

spring.datasource.url= jdbc:mysql://localhost:3306/helloproductdb-1592058?characterEncoding=UTF-8&serverTimezone=Asia/Seoul
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=create
spring.datasource.initialization-mode=always

#info.app.name=My Super Cool App
#info.app.descritions=A fun app
#info.app.version=1.0.0

security.basic.enabled=false
management.security.enabled=false

security.ignored=/**

#management.endpoints.web.exposure.include=mappings,health
management.endpoints.web.exposure.include=*

#logging
logging.level.kr.ac.hansung.cse=INFO
logging.file.name=app1.log

```

### 조건 2 : 테이블 이름 product_table<a id="table-name"></a>
-------------
[**코드 링크**](https://github.com/slflfl12/SpringBoot-eStore/blob/master/src/main/java/kr/ac/hansung/cse/model/Product.java)

**설명**
@Table(name = "product_table") 어노테이션을 이용해서 테이블의 이름을 정해주었습니다.

**Product Model**

```java
package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "product_table")
public class Product implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7969034284386278924L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private int price;

	@Column(name = "manufacturer")
	private String manufacturer;

	@Column(name = "unitInStock")
	private int unitInStock;

	@Column(name = "description")
	private String description;

	@Builder
	public Product(String name, String category, int price, String manufacturer, int unitInStock, String description) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacturer = manufacturer;
		this.unitInStock = unitInStock;
		this.description = description;
	}

}

```




### 조건 3 : data.sql에 10개의 데이터 생성  <a id="data-sql"></a>
-------------
[**코드 링크**](https://github.com/slflfl12/SpringBoot-eStore/blob/master/src/main/resources/data.sql)

**data.sql**

```sql
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("TV", "electronics", 3000, "Samsung", 200, "Good Quality TV")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Desktop", "electronics", 2500, "Samsung", 100, "Gaming DeskTop")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("NoteBook", "electronics", 2000, "Apple", 100, "MacBook Pro")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("NoteBook", "electronics", 2000, "Apple", 100, "MacBook Air")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Shoes", "clothes", 300, "Adidas", 10, "Adidas YeezyBoost")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Pants", "clothes", 50, "Nike", 2000, "Nike Training Pants")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Hat", "clothes", 30, "Adidas", 3000, "Adidas Cap")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Mouse", "electronics", 30, "Logitech", 4000, "Logitech G102")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Bag", "clothes", 40, "Eight Seconds", 5000, "EightSeconds BackPack")
insert into product_table(name, category, price, manufacturer, unit_In_Stock, description) values ("Phone", "electronics", 200, "Samsung", 20, "Galaxy S8+")

```


### 조건 4 : security 설정하지 않음 <a id="security-enabled"></a>
-------------

[**코드 링크**](https://github.com/slflfl12/SpringBoot-eStore/blob/master/src/main/resources/application.properties)

#### ** 설명 **
security.basic.enabled=false

management.security.enabled=false

security.ignored=/**

세가지 설정을 통해서 security 설정을 disable 시켰습니다.

#### **application.properties**

```java
server.port=9090

spring.datasource.url= jdbc:mysql://localhost:3306/helloproductdb-1592058?characterEncoding=UTF-8&serverTimezone=Asia/Seoul
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=create
spring.datasource.initialization-mode=always

#info.app.name=My Super Cool App
#info.app.descritions=A fun app
#info.app.version=1.0.0

security.basic.enabled=false
management.security.enabled=false

security.ignored=/**

#management.endpoints.web.exposure.include=mappings,health
management.endpoints.web.exposure.include=*

#logging
logging.level.kr.ac.hansung.cse=INFO
logging.file.name=app1.log

```

### 조건 5 : Postman 이용하여 요청 응답 메시지 받기 <a id="postman"></a>
-------------

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


## 3) Spring Boot의 actuator를 활용하여 Products REST API에 대한 URL Mapping 정보를 캡쳐해서 보여라.

![image](https://user-images.githubusercontent.com/43161981/85687869-37178400-b70c-11ea-8799-e7557b82db4d.png)
![image](https://user-images.githubusercontent.com/43161981/85687967-4c8cae00-b70c-11ea-9d4c-b4b31a609007.png)
![image](https://user-images.githubusercontent.com/43161981/85688012-57474300-b70c-11ea-8029-43298f0d9fb4.png)
![image](https://user-images.githubusercontent.com/43161981/85688046-5f06e780-b70c-11ea-801e-44f66649eefd.png)
![image](https://user-images.githubusercontent.com/43161981/85688112-6cbc6d00-b70c-11ea-9c47-727a1ca10840.png)
![image](https://user-images.githubusercontent.com/43161981/85688148-73e37b00-b70c-11ea-9e29-b5846f356fca.png)
![image](https://user-images.githubusercontent.com/43161981/85688179-7ba31f80-b70c-11ea-90d5-940ec6145560.png)


