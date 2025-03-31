package com.example.harypotedle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private final CharacterRepository characterRepository;

    public DataInitializer(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void run(String... args) {
        List<Character> characters = List.of(
                new Character("Harry Potter", "Mężczyzna", "Gryffindor", "Uczeń, Członek Zakonu Feniksa", 1980, "Półkrwi"),
                new Character("Hermiona Granger", "Kobieta", "Gryffindor", "Uczeń, Członek Zakonu Feniksa", 1979, "Mugolak"),
                new Character("Ron Weasley", "Mężczyzna", "Gryffindor", "Uczeń, Członek Zakonu Feniksa", 1980, "Czystej Krwi"),
                new Character("Albus Dumbledore", "Mężczyzna", "Gryffindor", "Dyrektor, Członek Zakonu Feniksa", 1881, "Półkrwi"),
                new Character("Severus Snape", "Mężczyzna", "Slytherin", "Nauczyciel, Członek Zakonu Feniksa, Śmierciożerca", 1960, "Półkrwi"),
                new Character("Lord Voldemort", "Mężczyzna", "Slytherin", "Czarnoksiężnik", 1926, "Półkrwi"),
                new Character("Minerva McGonagall", "Kobieta", "Gryffindor", "Nauczyciel, Członek Zakonu Feniksa", 1935, "Czystej Krwi"),
                new Character("Syriusz Black", "Mężczyzna", "Gryffindor", "Członek Zakonu Feniksa", 1959, "Czystej Krwi"),
                new Character("Luna Lovegood", "Kobieta", "Ravenclaw", "Uczeń, Członek Zakonu Feniksa", 1981, "Czystej Krwi"),
                new Character("Draco Malfoy", "Mężczyzna", "Slytherin", "Uczeń, Śmierciożerca", 1980, "Czystej Krwi"),
                new Character("Ginny Weasley", "Kobieta", "Gryffindor", "Uczeń, Członek Zakonu Feniksa", 1981, "Czystej Krwi"),
                new Character("Rubeus Hagrid", "Mężczyzna", "Gryffindor", "Nauczyciel, Pracownik Hogwartu, Członek Zakonu Feniksa", 1928, "Półkrwi"),
                new Character("Neville Longbottom", "Mężczyzna", "Gryffindor", "Uczeń, Członek Zakonu Feniksa", 1980, "Czystej Krwi"),
                new Character("Fred Weasley", "Mężczyzna", "Gryffindor", "Uczeń, Członek Zakonu Feniksa, Właściciel", 1978, "Czystej Krwi"),
                new Character("George Weasley", "Mężczyzna", "Gryffindor", "Uczeń, Członek Zakonu Feniksa,Właściciel", 1978, "Czystej Krwi"),
                new Character("Bellatrix Lestrange", "Kobieta", "Slytherin", "Śmierciożerca", 1951, "Czystej Krwi"),
                new Character("Zgredek", "Mężczyzna", "Brak", "Pracownik Hogwartu", 1992, "Skrzat"),
                new Character("Remus Lupin", "Mężczyzna", "Gryffindor", "Nauczyciel, Członek Zakonu Feniksa", 1960, "Półkrwi"),
                new Character("Artur Weasley", "Mężczyzna", "Gryffindor", "Urzędnik Ministerstwa Magii, Członek Zakonu Feniksa", 1950, "Czystej Krwi"),
                new Character("Molly Weasley", "Kobieta", "Gryffindor", "Członek Zakonu Feniksa", 1950, "Czystej Krwi"),
                new Character("Cedrik Diggory", "Mężczyzna", "Hufflepuff", "Uczeń", 1977, "Czystej Krwi"),
                new Character("Dolores Umbridge", "Kobieta", "Slytherin", "Urzędnik Ministerstwa Magi", 1961, "Półkrwi"),
                new Character("Lucjusz Malfoy", "Mężczyzna", "Slytherin", "Śmierciożerca, Członek Rady Zarządzającej", 1954, "Czystej Krwi"),
                new Character("Cho Chang", "Kobieta", "Ravenclaw", "Uczeń", 1979, "Półkrwi"),
                new Character("Gilderoy Lockhart", "Mężczyzna", "Ravenclaw", "Nauczyciel, Pisarz", 1964, "Półkrwi"),
                new Character("Horacy Slughorn", "Mężczyzna", "Slytherin", "Nauczyciel", 1899, "Czystej Krwi"),
                new Character("Kingsley Shacklebolt", "Mężczyzna", "Gryffindor", "Auror, Członek Zakonu Feniksa", 1960, "Czystej Krwi"),
                new Character("Nimfadora Tonks", "Kobieta", "Hufflepuff", "Auror, Członek Zakonu Feniksa", 1973, "Półkrwi"),
                new Character("Viktor Krum", "Mężczyzna", "Durmstrang", "Uczeń", 1976, "Półkrwi"),
                new Character("Fleur Delacour", "Kobieta", "Beauxbatons", "Uczeń,Członek Zakonu Feniksa", 1977, "Półkrwi"),
                new Character("Peter Pettigrew", "Mężczyzna", "Gryffindor", "Śmierciożerca, Członek Zakonu Feniksa", 1960, "Półkrwi"),
                new Character("Olimpia Maxime", "Kobieta", "Beauxbatons", "Dyrektor", 1950, "Półkrwi"),
                new Character("Quirinus Quirrell", "Mężczyzna", "Ravenclaw", "Nauczyciel", 1968, "Półkrwi"),
                new Character("Pomona Sprout", "Kobieta", "Hufflepuff", "Nauczyciel", 1941, "Czystej Krwi"),
                new Character("Sybilla Trelawney", "Kobieta", "Ravenclaw", "Nauczyciel", 1963, "Półkrwi"),
                new Character("Argus Filch", "Mężczyzna", "Brak", "Pracownik Hogwartu", 1950, "Charłak"),
                new Character("Stworek", "Mężczyzna", "Brak", "brak", 1900, "Skrzat"),
                new Character("Garrick Ollivander", "Mężczyzna", "Ravenclaw", "Wytwórca różdżek", 1909, "Czystej Krwi"),
                new Character("Kornelisz Knot", "Mężczyzna", "Slytherin", "Urzędnik Ministerstwa Magii", 1960, "Czystej Krwi"),
                new Character("Barty Crouch Junior", "Mężczyzna", "Slytherin", "Śmierciożerca", 1962, "Czystej Krwi"),
                new Character("Alastor Szalonooki Moody", "Mężczyzna", "Gryffindor", "Auror, Członek Zakonu Feniksa", 1940, "Czystej Krwi"),
                new Character("Gregory Goyle", "Mężczyzna", "Slytherin", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Vincent Crabbe", "Mężczyzna", "Slytherin", "Uczeń", 1980, "Czystej Krwi"),
                new Character("James Potter", "Mężczyzna", "Gryffindor", "Członek Zakonu Feniksa", 1960, "Czystej Krwi"),
                new Character("Lily Potter", "Kobieta", "Gryffindor", "Członek Zakonu Feniksa", 1960, "Mugolak"),
                new Character("Percy Weasley", "Mężczyzna", "Gryffindor", "Uczeń, Urzędnik Ministerstwa Magii", 1976, "Czystej Krwi"),
                new Character("Bill Weasley", "Mężczyzna", "Gryffindor", "Członek Zakonu Feniksa", 1970, "Czystej Krwi"),
                new Character("Charlie Weasley", "Mężczyzna", "Gryffindor", "Członek Zakonu Feniksa", 1972, "Czystej Krwi"),
                new Character("Narcyza Malfoy", "Kobieta", "Slytherin", "Śmierciożerca", 1955, "Czystej Krwi"),
                new Character("Seamus Finnigan", "Mężczyzna", "Gryffindor", "Uczeń", 1980, "Półkrwi"),
                new Character("Dean Thomas", "Mężczyzna", "Gryffindor", "Uczeń", 1980, "Mugolak"),
                new Character("Lavender Brown", "Kobieta", "Gryffindor", "Uczeń", 1980, "Półkrwi"),
                new Character("Parvati Patil", "Kobieta", "Gryffindor", "Uczeń", 1980, "Półkrwi"),
                new Character("Padma Patil", "Kobieta", "Ravenclaw", "Uczeń", 1980, "Półkrwi"),
                new Character("Pansy Parkinson", "Kobieta", "Slytherin", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Blaise Zabini", "Mężczyzna", "Slytherin", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Oliver Wood", "Mężczyzna", "Gryffindor", "Uczeń", 1978, "Półkrwi"),
                new Character("Katie Bell", "Kobieta", "Gryffindor", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Angelina Johnson", "Kobieta", "Gryffindor", "Uczeń", 1979, "Półkrwi"),
                new Character("Alicia Spinnet", "Kobieta", "Gryffindor", "Uczeń", 1979, "Półkrwi"),
                new Character("Rolanda Hooch", "Kobieta", "Nieznany", "Nauczyciel", 1950, "Półkrwi"),
                new Character("Filius Flitwick", "Mężczyzna", "Ravenclaw", "Nauczyciel", 1940, "Półkrwi"),
                new Character("Cuthbert Binns", "Mężczyzna", "Ravenclaw", "Nauczyciel", 1800, "Czystej Krwi"),
                new Character("Firenzo", "Mężczyzna", "Brak", "Nauczyciel", 1970, "Centaur"),
                new Character("Poppy Pomfrey", "Kobieta", "Nieznany", "Pracownik Hogwartu", 1950, "Czystej Krwi"),
                new Character("Jęcząca Marta", "Kobieta", "Ravenclaw", "Duch", 1930, "Mugolak"),
                new Character("Sir Nicholas de Mimsy-Porpington", "Mężczyzna", "Gryffindor", "Duch", 1400, "Czystej Krwi"),
                new Character("Mrużka", "Kobieta", "Brak", "Pracownik Hogwartu", 1960, "Skrzat"),
                new Character("Rufus Scrimgeour", "Mężczyzna", "Gryffindor", "Urzędnik Ministerstwa Magii", 1950, "Czystej Krwi"),
                new Character("Amelia Bones", "Kobieta", "Hufflepuff", "Urzędnik Ministerstwa Magii", 1940, "Czystej Krwi"),
                new Character("Frank Longbottom", "Mężczyzna", "Gryffindor", "Auror, Członek Zakonu Feniksa", 1950, "Czystej Krwi"),
                new Character("Alice Longbottom", "Kobieta", "Gryffindor", "Auror, Członek Zakonu Feniksa", 1950, "Czystej Krwi"),
                new Character("Mundungus Fletcher", "Mężczyzna", "Człowiek", "Członek Zakonu Feniksa", 1960, "Półkrwi"),
                new Character("Graup", "Mężczyzna", "Brak", "brak", 1980, "Olbrzym"),
                new Character("Rita Skeeter", "Kobieta", "Slytherin", "Redaktor", 1960, "Półkrwi"),
                new Character("Lee Jordan", "Mężczyzna", "Gryffindor", "Uczeń", 1980, "Półkrwi"),
                new Character("Igor Karkaroff", "Mężczyzna", "Slytherin", "Dyrektor, Śmierciożerca", 1950, "Czystej Krwi"),
                new Character("Fenrir Greyback", "Mężczyzna", "Brak", "Śmierciożerca", 1960, "Półkrwi"),
                new Character("Ksenofilius Lovegood", "Mężczyzna", "Ravenclaw", "Redaktor", 1950, "Czystej Krwi"),
                new Character("Petunia Dursley", "Kobieta", "Brak", "Mugol", 1960, "Niemagiczny"),
                new Character("Vernon Dursley", "Mężczyzna", "Brak", "Mugol", 1955, "Niemagiczny"),
                new Character("Dudley Dursley", "Mężczyzna", "Brak", "Mugol", 1980, "Niemagiczny"),
                new Character("Mykew Gregorowicz", "Mężczyzna", "Nieznany", "Wytwórca różdżek", 1910, "Czystej Krwi"),
                new Character("Aberforth Dumbledore", "Mężczyzna", "Gryffindor", "Członek Zakonu Feniksa, Właściciel", 1884, "Półkrwi"),
                new Character("Arabella Figg", "Kobieta", "Brak", "Członek Zakonu Feniksa", 1935, "Charłak"),
                new Character("Andromeda Tonks", "Kobieta", "Slytherin", "Członek Zakonu Feniksa", 1953, "Czystej Krwi"),
                new Character("Katie Bell", "Kobieta", "Gryffindor", "Uczeń", 1980, "Półkrwi"),
                new Character("Colin Creevey", "Mężczyzna", "Gryffindor", "Uczeń", 1981, "Mugolak"),
                new Character("Cormac McLaggen", "Mężczyzna", "Gryffindor", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Susan Bones", "Kobieta", "Hufflepuff", "Uczeń", 1980, "Półkrwi"),
                new Character("Amos Diggory", "Mężczyzna", "Hufflepuff", "Pracownik Ministerstwa Magii", 1950, "Czystej Krwi"),
                new Character("Justyn Finch-Fletchey", "Mężczyzna", "Hufflepuff", "Uczeń", 1980, "Mugolak"),
                new Character("Ernest Macmillan", "Mężczyzna", "Hufflepuff", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Gruby Mnich", "Mężczyzna", "Hufflepuff", "Duch", 1010, "Czystej Krwi"),
                new Character("Zachariasz Smith", "Mężczyzna", "Hufflepuff", "Uczeń", 1980, "Czystej Krwi"),
                new Character("Regulus Black", "Mężczyzna", "Slytherin", "Śmierciożerca", 1961, "Czystej Krwi"),
                new Character("Antonin Dołohow", "Mężczyzna", "Durmstrang", "Śmierciożerca", 1955, "Czystej Krwi"),
                new Character("Krwawy Baron", "Mężczyzna", "Slytherin", "Duch", 982, "Czystej Krwi"),
                new Character("Penelopa Clearwater", "Kobieta", "Ravenclaw", "Uczeń", 1977, "Półkrwi"),
                new Character("Helena Ravenclaw", "Kobieta", "Ravenclaw", "Duch", 976, "Czystej Krwi"),
                new Character("Irytek", "Mężczyzna", "Brak", "Duch", 856, "Poltergeist"),
                new Character("Gellert Grindewald", "Mężczyzna", "Durmstrang", "Czarnoksiężnik", 1883, "Czystej Krwi"),
                new Character("Arianna Dumbledore", "Kobieta", "Brak", "Brak", 1885, "Półkrwi"),
                new Character("Wilhelmina Grubbly-Plank", "Kobieta", "Hufflepuff", "Nauczyciel", 1940, "Czystej Krwi")
        );

        characterRepository.saveAll(characters);
    }
}