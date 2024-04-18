-- Tabloya yeni kolon ekleme, mevcut kolonu degistirme veya silme;
--EKLEME
ALTER TABLE cars 
ADD color VARCHAR(255);

SELECT * FROM cars;

--SİLME
ALTER TABLE cars
DROP color;


--ADINI DEĞİŞTİRME
ALTER TABLE cars
RENAME COLUMN color TO colorrrr;

--VERI BOYUTUNU/TURUNU DEGISTIRME
ALTER TABLE cars
ALTER COLUMN color TYPE VARCHAR(150);