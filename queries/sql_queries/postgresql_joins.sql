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