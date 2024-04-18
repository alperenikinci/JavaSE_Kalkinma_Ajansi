--students tablosu olusturalim.
--name,surname,grade
--5 tane ogrenci olusturalim
--ogrencilerden birisinin soyismini guncelleyelim
--tabloya dogum yili kolonu ekleyelim
--ogrencilerin her birine bir dogum yili girelim (hepsinin dogdugu yil aynı olacak)
--ogrencilerden birinin adını, soyadını ve dogum tarihi guncelleyelim.
--5 ogrenciden birisinin kaydını silelim.

CREATE TABLE students (
	name VARCHAR(255),
	surname VARCHAR(255),
	grade INT
);


INSERT INTO students(name,surname,grade)
VALUES
('Alperen','İkinci',100),
('Muhammet','Kaya',80),
('Babür','Somer',90),
('Mustafa','Ozturk',70),
('Çağrı','Türkmen',95);

UPDATE students
SET surname = 'ÖZTÜRK'
WHERE name = 'Mustafa';


ALTER TABLE students
ADD birth_year VARCHAR(4);

UPDATE students
SET birth_year = 1996;

UPDATE students
SET name = 'Abuzer', surname = 'Komurcu', birth_year = 1996
WHERE name ='Alperen';

DELETE FROM students
WHERE name = 'Mustafa';

SELECT * FROM students;