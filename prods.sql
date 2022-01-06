CREATE TABLE Products (
    prodname VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL
    PRIMARY KEY (prodname)
);
CREATE TABLE Price_history (
    prodname VARCHAR(255) NOT NULL,
    price DECIMAL(18,2) NOT NULL,
    startdate DATE NOT NULL,
    enddate DATE
    FOREIGN KEY (prodname) REFERENCES Products(prodname)
);
SELECT Products.category, pph.price
FROM Products
INNER JOIN Price_history ON Products.prodname=Price_history.prodname;