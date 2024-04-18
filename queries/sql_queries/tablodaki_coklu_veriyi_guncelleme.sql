--Çoklu veri güncelleme -> Birden fazla sütunu aynı anda güncelleme
UPDATE cars
SET color = 'white', year = 2000
WHERE brand = 'Nissan'; -- OR brand = 'Ford';

SELECT * FROM cars;