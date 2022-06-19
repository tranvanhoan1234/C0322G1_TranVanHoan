USE `classicmodels`;
DROP PROCEDURE IF EXISTS `findAllCustomers`//
CREATE PROCEDURE findAllCustomers()

BEGIN
 SELECT * FROM customers where customerNumber = 175

END //

DELIMITER ;
CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;
select * from customer_views;
CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';