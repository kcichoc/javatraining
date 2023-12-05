import models.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorTest {

    @Test
        // adnotacja posiada @+słowo - ułatiwnie programowania
    void shouldCalculateCorrectSalary() {
        Actor tomHanks = new Actor("Tom", "Hanks");
        int actual = tomHanks.calculateSalary(6, 8);
        int expected = 48;

        // serce testu czyli asercje

        assertThat(actual).as("Wynagrodzenie źle obliczone").isGreaterThan(5);


    }
@Test
    void shouldCalculateSalaryBonus() {
    Actor tomHanks = new Actor("Tom", "Hanks");
    int actual = tomHanks.giveBonus(9, 10);
    int expected = 20;

    assertThat(actual).as("Bonus wyliczony nieprawidłowo").isEqualTo(expected);
}

    @Test
    void shouldCalculateSalaryBonusIsBigger() {
        Actor tomHanks = new Actor("Tom", "Hanks");
        int actual = tomHanks.giveBonus(15, 10);
        int expected = 115;

        assertThat(actual).as("Bonus wyliczony nieprawidłowo").isEqualTo(expected);
    }
}
