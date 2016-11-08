CREATE TABLE  tax_bands(
	excempt_tax_limit float,
	lower_tax_rate float,
	lower_tax_limit float,
	higher_tax_rate float,
	solitary_tax_rate float
);

CREATE TABLE citizens(
	id int(11) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	salary float NOT NULL,
	PRIMARY KEY(id)
);