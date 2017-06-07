INSERT INTO AUTHOR (FIRSTNAME, LASTNAME, EMAIL) VALUES ('Krzysztof', 'Nowak', 'k.nowak@nowaki.pl'), ('Kamil', 'Baczkowski', 'k.baczkowski@baczki@pl'), ('Stefan', 'Ciastkowski', 'ciaste@stefano.pl')
INSERT INTO Category (title) VALUES ('Music'), ('Technology'), ('Moto'), ('News')
INSERT INTO USERCREDENTIALS (ID, USERNAME, PASSWORD) VALUES (1, 'test', 'test')
INSERT INTO USERGROUP (ID, GROUPNAME, USERCREDENTIALS_ID) VALUES (1, 'USERS', 1)
create view "USERGROUPVIEW" as select uc.USERNAME as "USERNAME", ug.GROUPNAME as "GROUPNAME" from usercredentials uc join usergroup ug on uc.ID=ug.USERCREDENTIALS_ID
