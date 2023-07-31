-- Drop existing tables (if they exist)
DROP TABLE IF EXISTS userRepo;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS repositories;
DROP TABLE IF EXISTS repotypes;
DROP TABLE IF EXISTS Companies;

-- Table Companies
CREATE TABLE Companies (
    companyID INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    phoneNumber VARCHAR(20),
    email VARCHAR(50),
    location VARCHAR(50)
);

-- Table repotypes
CREATE TABLE repotypes (
    repoTypeID INTEGER PRIMARY KEY,
    repoDecs VARCHAR(500) NOT NULL
);

-- Table repositories
CREATE TABLE repositories (
    repoID INTEGER PRIMARY KEY,
    reponame VARCHAR(50) NOT NULL,
    repotype INTEGER,
    companyURL VARCHAR(100),
    companyID INTEGER,
    FOREIGN KEY (repotype) REFERENCES repotypes(repoTypeID),
    FOREIGN KEY (companyID) REFERENCES Companies(companyID)
);

-- Table users
CREATE TABLE users (
    userID INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50),
    phonenumber VARCHAR(20),
    loginID VARCHAR(20),
    loginPass VARCHAR(50)
);

-- Table userRepo
CREATE TABLE userRepo (
    userRepoID INTEGER PRIMARY KEY,
    userID INTEGER,
    repoID INTEGER,
    FOREIGN KEY (userID) REFERENCES users(userID),
    FOREIGN KEY (repoID) REFERENCES repositories(repoID)
);
