create database Groot22;

CREATE TABLE Customer (
    CustomerID int,
    LastName varchar(255),
    FirstName varchar(255),
    Email varchar(50)
);


CREATE TABLE Grants (
    GrantID int,
	Payout money, 
);

insert into Customer(CustomerID, LastName, FirstName, Email) values ('1', 'Doe', 'John', 'johndoe@gmail.com');
insert into Customer(CustomerID, LastName, FirstName, Email) values ('2', 'Doe', 'Jane', 'janedoe@gmail.com');
insert into Customer(CustomerID, LastName, FirstName, Email) values ('3', 'Bloggs', 'Joe', 'joeBloggs@gmail.com');

insert into Grants(GrantID, Payout) values ('1', '10000');
insert into Grants(GrantID, Payout) values ('2', '15000');