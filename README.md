# MedReminder

## Funkcjonalności

### Baza Danych

Baza danych działa w oparciu o bibliotekę Room ze względu na łatowść jej implementacji oraz wymóg posiadania uporządkowanej struktury danych do poprawnego działania funkcjonalności.
Całość znajduje się w folderze db. Tabele zostały zadeklarowane za pomocą klas w db/Entity, możliwe do wykorzystania metody znajdują się w db/DAO, 
a plik BazaDanych.java spajając resztę w jedną całość tworzy bazę danych wykorzystując silngleton, zapobiegający utworzeniu więcej niż jednej bazy danych. 

#### Tabele:
1. **Leki** zawiera 3 pola prywatne. Autogenerowane id (Primary Key), nazwę leku oraz dawkę. Metody tej tabeli to insetr, wyświetlanie po id oraz usunięcie rekordu.
2. **Harmonogram** posiada autogenerowane id (Primary Key), id zaciągnięte z tabeli Leki (Foreign Key) i czas w minutach od północy do ustalania terminu zażycia. Na tabeli można wywołać metody: insert, delete,
a także wyświetlenie harmonogramu po id leku (parametr odpowiadający Foreign Key). Każda godzina danego dnia, o której należy wziąć lek stanowi osobny rekord.
3. **Rejestr** to historia wziętych leków tabela utworzona w celu śledzenia statystyk. Jej pola to: autogenerowany id (Primary Key), idHarmonogramu (Foreign Key) oraz datę.
Posiada metody insert, delete, wyszukiwanie według id harmonogramu, a także wg idHarmonogramu w połączeniu z datą od początku do końca dnia. Oznaczenie przez użytkownika leku jako wzięty tworzy w niej wpis
z aktualnym timestampem.
