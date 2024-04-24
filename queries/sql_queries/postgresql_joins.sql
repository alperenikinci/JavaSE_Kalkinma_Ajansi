--JOIN
SELECT product_id, product_name, category_name
FROM products AS p
INNER JOIN categories AS c 
ON p.category_id = c.category_id;
-- products'daki category_id ile categories'deki category_id arasında eşleşen veriler için;
-- producttan product_id ve product_name, categories'den category_name sütununu birleştirir ve kayıtları döner.

SELECT testproduct_id, product_name, category_name
FROM testproducts AS tp
INNER JOIN categories AS c
ON tp.category_id = c.category_id;

SELECT * FROM testproducts;
SELECT * FROM products;


-- INNER JOIN : Her iki tabloda da eşleşen değerlere sahip kayıtları döndürür.
-- LEFT JOIN  : Soldaki tablodaki tüm kayıtları, sağdaki tablodaki eşleşen kayıtları döndürür.
-- RIGHT JOIN : Sağdaki tablodaki tüm kayıtları, soldaki tablodaki eşleşen kayıtları döndürür.
-- FULL JOIN  : Sol veya Sağ tabloda eşleşme olduğunda tüm kayıtları döndürür.


-- INNER JOIN
SELECT testproduct_id, product_name, category_name 
FROM testproducts AS tp
INNER JOIN categories AS c
ON tp.category_id = c.category_id;
-- Her iki tabloda da eşleşen değerlere sahip kayıtları seçer
-- JOIN ve INNER JOIN aynı sonucu verecektir. INNER, JOIN için varsayılan(default) birleştirme türüdür.


-- LEFT JOIN
SELECT testproduct_id, product_name, category_name 
FROM testproducts AS tp
LEFT JOIN categories AS c
ON tp.category_id = c.category_id;
-- LEFT JOIN'i kullanarak, categories tablosuyla eşleşmeyenler de dahil olmak üzere(category_id) testproducts'dan
-- tüm kayıtları aldık. 
-- LEFT OUTER JOIN ve LEFT JOIN aynı sonucu verecektir. OUTER, LEFT JOIN için varsayılan birleştirme türüdür.


-- RIGHT JOIN
SELECT testproduct_id, product_name, category_name 
FROM testproducts AS tp
RIGHT JOIN categories AS c
ON tp.category_id = c.category_id;

-- RIGHT JOIN sağ tablodan(right) TÜM kayıtları ve sol tablodan(left) eşleşen kayıtları seçer.
-- RIGHT OUTER JOIN ve RIGHT JOIN aynı sonucu verecektir. OUTER, RIGHT JOIN için de varsayılan birleştirme türüdür.


-- FULL JOIN
SELECT testproduct_id, product_name, category_name 
FROM testproducts AS tp
FULL JOIN categories AS c
ON tp.category_id = c.category_id;
--FULL JOIN eşleşme olmasa bile her iki tablodaki TÜM kayıtları seçer. Eşleşen satırlar için 
--her iki tablodaki değerler de mevcuttur. Eşleşme yoksa boş olanlar NULL değerini alır.


--CROSS JOIN
--CROSS JOIN keyword'ü, "sol" tablodaki TÜM kayıtları "sağ" tablodaki HER KAYITLA eşleştirir.
SELECT testproduct_id, product_name, category_name
FROM testproducts
CROSS JOIN categories;


-- UNION
-- UNION operatörü iki veya daha fazla sorgunun(query) sonuç kümesini birleştirmek için kullanılır.
-- Birleşimdeki sorgular şu kurallara uymalıdır;
	--1- Aynı sayıda sütuna sahip olmaları gerekir.
	--2- Sütunlar aynı veri türlerine sahip olmalıdır.
	--3- Sütunlar aynı sırada olmalıdır.

SELECT product_id, product_name, category_id
FROM products
UNION
SELECT testproduct_id, product_name, category_id
FROM testproducts
ORDER BY product_id;


--UNION ILE YAPINCA OZGUN VERI GELIR
SELECT product_id
FROM products
UNION
SELECT testproduct_id
FROM testproducts
ORDER BY product_id;


--UNION ALL ILE YAPINCA TEKRAR EDEN VERILER DE GELIR.
SELECT product_id
FROM products
UNION ALL
SELECT testproduct_id
FROM testproducts
ORDER BY product_id;

-- GROUP BY CLAUSE
-- GROUP BY genellikle sonuç kümesini bir veya daha fazla sütüna göre gruplandırmak için
	-- COUNT(), MAX(), MIN(),SUM(),AVG() gibi bir araya toplama(aggregate) işlevleriyle birlikte kullanılır.
SELECT COUNT(customer_id),country
FROM customers
GROUP BY country;

-- GROUP BY With JOIN
SELECT c.contact_name, COUNT(o.order_id)
FROM orders o
LEFT JOIN customers c ON o.customer_id = c.customer_id
GROUP BY c.contact_name;
-- order tablosunda her bir order'a ait bir customer_id bulunmakta.
-- customer tablosunda da yine her customer'ın bir customer_id'si bulunmakta.
-- order tablosunda her bir order için customer'id'ye bakıyor ve COUNT'a ekliyor. 
-- Sonrasında customer tablosunda ilgili customer_id'ye denk gelen contact_name ile
-- grupluyor ve order adedini yazdırıyor.

-- HAVING CLAUSE
-- HAVING clause SQL'e eklendi çünkü WHERE clause toplama(aggregate) işlevleriyle kullanılamıyor.
-- Aggregate işlemleri genellikle GROUP BY clause'ları ile kullanılır.
-- HAVING ekleyerek WHERE'de yaptığımız gibi koşullar yazabiliriz.
SELECT COUNT(customer_id),country
FROM customers
GROUP BY country
HAVING COUNT(customer_id)>5;

SELECT orders.order_id, SUM(products.price) --order_details isimli bir ortak tablodan çekmek lazım.
FROM orders
LEFT JOIN products ON orders.product_id = products.product_id
GROUP BY order_id
HAVING SUM(products.price)> 23.25;



--EXISTS
--EXISTS operatörü bir alt sorguda herhangi bir kaydın varlığını test etmek için kullanılır.
--ALT sorgu bir veya birden fazla kayıt döndürürse EXISTS operatörü TRUE değerini döndürür.
SELECT customers.customer_name
FROM customers
WHERE EXISTS (
	SELECT order_id
	FROM orders
	WHERE customer_id = customers.customer_id
);

--NOT EXISTS 
--EXISTS operatörünü tam ters işlevde çalıştırır.
--Alt sorguda verilen koşulları karşılayan kayıtlar hariç, bütün kayıtları döndürür.
SELECT customers.customer_name
FROM customers
WHERE NOT EXISTS (
	SELECT order_id
	FROM orders
	WHERE customer_id = customers.customer_id
);

CREATE TABLE IF NOT EXISTS employees (
 	employee_id INT PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	department VARCHAR(50),
	hire_date DATE
);


--ANY Operatörü
--ANY Operatörü, tek bir sütün değeri ile diğer değerler aralığı arasında karşılaştırma yapmanızı sağlar.
--Sonuç olarak bir Boolean değeri döndürür.
--Alt sorgu değerlerinden HERHANGİ BİRİ koşulu karşılıyorsa TRUE değerini döndürür.
--HERHANGİ(ANY), işlemin aralıktaki değerlerden herhangi biri için TRUE olması durumunda
	--koşulun doğru olacağı anlamına gelir.
SELECT product_name
FROM products
WHERE product_id = ANY (
SELECT product_id
	FROM orders
	WHERE quantity >100
);

/*UPDATE public.orders
	SET quantity=555
	WHERE order_id = 8;*/


-- ALL
SELECT product_name
FROM products
WHERE product_id = ALL (
	SELECT product_id
	FROM orders
	WHERE quantity > 10
);
-- Alt sorgu değerlerinin TÜMÜ(ALL) koşulu karşılıyorsa DOĞRU(TRUE) değerini döndürür.
-- Aksi takdirde FALSE döndürür. SELECT WHERE ve HAVING ifadeleriyle birlikte kullanılır.


-- CASE Expression
SELECT customer_name,
CASE
	WHEN customer_id <10 THEN 'Kucuktur 10dan'
	WHEN customer_id >50 THEN 'Buyuktur 50den'
ELSE
	'Farklı bir aralıktadır.'
END
FROM customers;