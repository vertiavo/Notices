Autorzy: Marek Jakubowski, Piotr Otapowicz

Temat: Serwis ogłoszeń

Opis sposobu zbudowania i instalacji:
	1. Zbudowanie projektu poprzez Maven.
	2. Deploy aplikacji na serwer aplikacyjny Payara (plik notices-ear.ear znajdujący się w folderze target tego modułu).
	3. Utworzenie puli połączeń oraz źródła danych.
	4. Skonfigurowanie dostępu do źródła danych w pliku persistance.xml w module notices-ejb w folderze src/main/resources/META-INF.
	5. Kliknięcie nazwy aplikacji i wybranie opcji Launch.
	6. Otwarcie strony na porcie 8080.

Link do repozytorium: https://github.com/vertiavo/Notices