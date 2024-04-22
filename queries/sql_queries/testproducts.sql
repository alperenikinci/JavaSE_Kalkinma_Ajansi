CREATE TABLE testproducts (
    testproduct_id INT PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    category_id INT
);
INSERT INTO testproducts (testproduct_id, product_name, category_id)
VALUES
    (1, 'Johns Fruit Cake', 3),
    (2, 'Marys Healthy Mix', 9),
    (3, 'Peters Scary Stuff', 10),
    (4, 'Jims Secret Recipe', 11),
    (5, 'Elisabeths Best Apples', 12),
    (6, 'Janes Favorite Cheese', 4),
    (7, 'Billys Home Made Pizza', 13),
    (8, 'Ellas Special Salmon', 8),
    (9, 'Roberts Rich Spaghetti', 5),
    (10, 'Mias Popular Ice', 14);
