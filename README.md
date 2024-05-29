# 7. Ćwiczenie pisania na klawiaturze  

## Spis treści
- [Opis Projektu]
- [Funkcjonalności]
- [Instrukcje Obsługi]
- [Wymagania]

## Opis Projektu
Projekt ten ma na celu naukę poprawnego przepisywania zdań przez użytkownika. Program wczytuje bazę zdań z pliku tekstowego, losowo wybiera jedno z nich i prosi użytkownika o jego przepisanie. Program następnie sprawdza poprawność wpisanego tekstu, wyświetla błędy oraz czas potrzebny na wykonanie zadania.

## Funkcjonalności
-  Program wczytuje zdania z pliku `zdania.txt`.
-  Wszystkie zdania są wyświetlane na ekranie.
-  Program losowo wybiera jedno zdanie do przepisania przez użytkownika.
-  Użytkownik wpisuje zdanie, które nie jest widoczne na ekranie.
-  Program porównuje wpisane zdanie z oryginalnym, wyświetla błędy i oblicza procentową ilość błędów.
-  Mierzony jest czas wprowadzania tekstu przez użytkownika.
-  Użytkownik może spróbować ponownie, jeżeli wyrazi taką chęć.

## Instrukcje Obsługi
    
 **Skonfiguruj środowisko Java:**
    - Upewnij się, że masz zainstalowaną Javę (minimum JDK 8).
    - Możesz sprawdzić wersję Javy poleceniem:
      java -version - w terminalu

 **Sprawdź czy masz w folderze plik zdania.txt w którym są zawarte zdania:**
   -utwórz plik zdania.txt

 **Skompiluj program:**
    javac NaukaPisania.java

 **Uruchom program:**
    java NaukaPisania
    


### Wymagania
- Java Development Kit (JDK) 8 lub nowszy.
- Plik `zdania.txt` zawierający zdania do przepisania przez użytkownika.


