INSERT INTO cars (brand,model,year)  
VALUES 
('Ferrari', 'Enzo', 2002),
('Nissan', 'R34', 1999),
('Nissan','Silvia',2002),
('Cobra', 'Shelby', 1962),
('Aston Martin', 'DB 11', 2013),
('Ford','Ranger',2000);

SELECT * FROM cars;

SELECT * FROM cars
WHERE brand = 'Nissan'; --Markası Nissan olanları getir.

SELECT * FROM cars
WHERE year < 1999; --Modeli 1975'den kücük olanları getir.

SELECT * FROM cars
WHERE year > 1999; --Modeli 1975'den büyük olanları getir.

SELECT * FROM cars
WHERE year <= 1999; --Modeli 1975'den kücük veya eşit olanları getir.

SELECT * FROM cars
WHERE year >= 1999; --Modeli 1975'den büyük veya eşit olanları getir.

SELECT * FROM cars
WHERE brand <> 'Cobra'; -- Markası 'Cobra' olmayanları getir.

SELECT * FROM cars
WHERE brand != 'Cobra'; -- Markası 'Cobra' olmayanları getir. Yukarıdakiyle aynı işi yapar.


--% işareti sıfır,bir veya birden fazla karakteri temsil eden bir wildcard'dır.
SELECT * FROM cars
WHERE model LIKE 'R%'; -- Modeli 'R' ile başlayanları getirir.

SELECT * FROM cars
WHERE model LIKE '%r'; -- Modeli 'r' ile bitenleri getirir.

SELECT * FROM cars
WHERE brand LIKE '%a%'; -- Markasının içinde 'a' harfi geçenleri getirir.

SELECT * FROM cars
WHERE brand LIKE '%ra%'; -- Markasının içinde 'ra' geçenleri getirir.

-- _ widcard karakteri tek bir karakteri temsil eder. Herhangi bir karakter veya sayı olabilir.
SELECT * FROM cars
WHERE brand LIKE 'F__ra_i';
-- Markası F ile başlayan ardından iki adet wildcard karakter alan (__),
--ardından 'ra' ve ardından yine bir wildcard karakter alan markayı döndürür.


--Birden fazla koşulu kontrol etmek istediğimizde AND operatörü kullanılır.
SELECT * FROM cars
WHERE brand = 'Nissan'
AND model = 'Silvia'; -- Markası 'Nissan' VE(AND) modeli 'Silvia' olan tüm kayıtları döndürür.


--Birden fazla koşuldan herhangi birisinin doğruluğunu kontrol etmek için OR operatörü kullanılır
SELECT * FROM cars
WHERE brand = 'Nissan'
OR model = 'Enzo'; -- Markası 'Nissan' olan VEYA modeli 'Enzo' olan tüm kayıtları döndürür.

-- IN operatörü, bir sütunun değeri listedeki değerlerden herhangi 
-- biriyle/birileriyle eşleştiğinde kullanılır. Bir liste verileceği zaman çok kullanışlıdır.
SELECT * FROM cars
WHERE brand IN ('Nissan','Aston Martin','Ford'); -- Markası {Nissan,Aston Martin,Ford} olanları getir.


SELECT * FROM cars
WHERE year BETWEEN 1950 AND 2000; -- Yılı 1950 ile 2000 yılları arasında olan bütün kayıtları getirir.


SELECT * FROM cars
WHERE model IS NULL; -- Model NULL olan tüm kayıtları döndürür.

--NOT operatörü, operatörün doğruluğunu tersine çevirmek için LIKE, ILIKE, IN, BETWEEN, NULL operatörleriyle
--birlikte kullanılabilir.
SELECT * FROM cars
WHERE brand NOT LIKE -- F ile başlamayan kayıtları döndürür. -> LIKE case sensitive (büyük-küçük harf duyarlı).
'F%';

SELECT * FROM cars
WHERE brand NOT ILIKE -- f ya da F ile başlamayan kayıtları döndürür. -> ILIKE case sensitive değil (büyük-küçük harf duyarsız).
'f%';

SELECT * FROM cars
WHERE brand NOT IN('Cobra','Ford','Ferrari'); -- Markanın bu listede olmadığı bütün kayıtları döndürür.

SELECT * FROM cars
WHERE year NOT BETWEEN 1950 AND 2000; -- Yılı 1950 ile 2000 yılları arasında olmayan bütün kayıtları getirir.

SELECT * FROM cars
WHERE model IS NOT NULL; -- model NULL olmayan bütün kayıtları döndürür.





