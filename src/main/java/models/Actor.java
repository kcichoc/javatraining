package models;

public class Actor
{
    // konstruktor niejawny, ale jest bez parametrów jak ponizej, jesli go wypełnimy to przestaje być niejawny
    // kontruktor - mechanizm do tworzenia obiektów alt + insert - kontructor

        private String firstName;
        private String lastName;

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public Actor(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
        }
        // moje własne metody
        // 2 etapy:


        // co ma robic metoda
        // wyliczac wynagrodzenie aktora
        // swatka * ilość filmów w roku


        // jak ma to zrobic

        //deklaracja metody

        // używanie


        //deklaracja metody
        public int calculateSalary(int stawka, int iloscFilmow) {
                int rezultat = stawka * iloscFilmow;
               return rezultat; }

        public int giveBonus(int rating, int salary) {
                int rezultat;
                if (rating < 10) {
                        rezultat = salary * 2;
                } else {
                        rezultat = salary;
                }
                return rezultat;

        }
}

