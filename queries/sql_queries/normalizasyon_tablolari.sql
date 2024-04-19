CREATE TABLE tbl_customer_orders (
	customer_id INT PRIMARY KEY,
	customer_name VARCHAR(255),
	customer_email VARCHAR(255),
	order_id INT,
	order_date BIGINT,
	order_total_amount DECIMAL (10,2)
);

CREATE TABLE tbl_customer(
	customer_id INT PRIMARY KEY,
	customer_name VARCHAR(255),
	customer_email VARCHAR(255)
);

CREATE TABLE tbl_orders (
	order_id INT PRIMARY KEY,
	order_date BIGINT,
	order_total_amount DECIMAL (10,2),
	customer_id INT,
	FOREIGN KEY (customer_id) REFERENCES tbl_customer(customer_id)
);



