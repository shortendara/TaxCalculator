CREATE TABLE  tax_bands(
	tax_rate_id int(11) NOT NULL,
	excempt_tax_limit float,
	lower_tax_rate float,
	lower_tax_limit float,
	higher_tax_rate float,
	solidary_tax_rate float,
	PRIMARY KEY(tax_rate_id)
);

CREATE TABLE citizens(
	id int(11) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	salary float NOT NULL,
	PRIMARY KEY(id)
);