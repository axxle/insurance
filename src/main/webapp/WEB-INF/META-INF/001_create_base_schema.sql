CREATE TABLE contracts (
                          contractId SERIAL PRIMARY KEY,
                          contractDate date,
                          docStatus CHAR(20),
                          insuranceAmount CHAR(255),
                          insuranceCalcDate CHAR(10),
                          insuranceStartDate CHAR(10),
                          insuranceEndDate CHAR(10),
                          insurancePremium CHAR(255),
                          realtyArea CHAR(20),
                          realtyBuildYear CHAR(4),
                          realtyType CHAR(10),
                          birthDate CHAR(10),
                          fullName CHAR(255),
                          passportSeries CHAR(4),
                          passportNumber CHAR(6),
                          country CHAR(50),
                          postIndex CHAR(50),
                          federalRegion CHAR(100),
                          district CHAR(50),
                          place CHAR(100),
                          street CHAR(100),
                          houseBlock CHAR(10),
                          building CHAR(10),
                          houseNumber CHAR(10),
                          apartment CHAR(10),
                          comment CHAR(1023)
);

CREATE TABLE clientsDict (
                           clientId SERIAL PRIMARY KEY,
                           fullName CHAR(255),
                           lastName CHAR(85),
                           firstName CHAR(85),
                           parentName CHAR(85),
                           birthDate CHAR(10),
                           passportSeries CHAR(4),
                           passportNumber CHAR(6)
);
