CREATE TABLE  tax_bands(
	tax_rate_name VARCHAR(100) NOT NULL,
	tax_rate_percentage FLOAT NOT_NULL,
	PRIMARY KEY(tax_rate_name)
);

CREATE TABLE citizens(
	id int(11) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	salary float NOT_NULL,
	PRIMARY KEY(id)
);