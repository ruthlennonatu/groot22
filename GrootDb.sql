create database Groot22;

CREATE TABLE Customer (
    CustomerID int,
    LastName varchar(255),
    FirstName varchar(255),
    Email varchar(50)
);


CREATE TABLE Grants (
    GrantID int,
    GrantType varchar(255),
	Payout money
);

CREATE TABLE GrantStatus (
    GrantID int,
	CustomerID,
    grantApprovale varchar(50)
);

CREATE TABLE Users (
    UserID int,
	userName
);
