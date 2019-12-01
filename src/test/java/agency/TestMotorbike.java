package agency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TimeProvider;

import java.time.LocalDateTime;
import java.util.Objects;

import static org.assertj.core.api.Assertions.*;


class TestMotorbike {



    private Motorbike catalinaMotorbike = new Motorbike(apple, catalina, catalinaYear, catalinaCylinderCapacity);
    private Motorbike windows95Motorbike = new Motorbike(microsoft, windows95, windows95Year, windows95CylinderCapacity);
    private static final String apple = "Apple";
    private static final String catalina = "Catalina";
    private static final String microsoft = "Microsoft";
    private static final String windows95 = "Windows95";
    private static final int catalinaYear = 2019;
    private static final int windows95Year = 1995;
    private static final int catalinaCylinderCapacity = 100;
    private static final int windows95CylinderCapacity = 400;
    private static final LocalDateTime YEAR2000 = LocalDateTime.of(2000, 1, 1, 0, 0);
    private static final LocalDateTime YEAR2019 = LocalDateTime.of(2019, 1, 1, 0, 0);

    @BeforeEach
    void fixClock(){
        TimeProvider.useFixedClockAt(YEAR2019);
    }

    @Test
    void testConstructionOfTooOldVehicle(){
        assertThatIllegalArgumentException()
                .isThrownBy(()->new Motorbike("Linux", "ubuntu",1899, 100))
                .withMessageContaining("1899");
    }

    @Test
    void testConstructionOfFutureVehicle() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Motorbike("Linux", "ubuntu", 2020, 100))
                .withMessageContaining("2020");
    }

    @Test
    void testConstructionOfVehicleWithBadCylinderCapacity() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Motorbike("Linux", "ubuntu", 2000, 40))
                .withMessageContaining("0");
    }

    @Test
    void testGetters() {
        assertThat(catalinaMotorbike).hasFieldOrPropertyWithValue("brand", apple)
                .hasFieldOrPropertyWithValue("model", catalina)
                .hasFieldOrPropertyWithValue("productionYear", catalinaYear)
                .hasFieldOrPropertyWithValue("cylinderCapacity", catalinaCylinderCapacity);
    }

    @Test
    void testConstructionOfFutureMotorbike(){
        assertThatIllegalArgumentException().
                isThrownBy(() -> new Motorbike("Linux", "ubuntu",
                        2020, 200));
    }

    @Test
    void testConstructionOfTooOldMotorbike(){
        assertThatIllegalArgumentException().
                isThrownBy(() -> new Motorbike("Linux", "ubuntu",
                        1899, 1));
    }

    @Test
    void testThatMotorbikeImplementsVehicle(){
        assertThat(catalinaMotorbike).withFailMessage("%s must implement %s",
                Motorbike.class, Vehicle.class)
                .isInstanceOf(Vehicle.class);
    }



    @Test
    void testDailyRentalPrice(){
        double expectedPriceCatalinaMotorbike = 0.25*catalinaCylinderCapacity;
        double expectedPriceWindowsMotorbike = 0.25*windows95CylinderCapacity;
        assertThat(catalinaMotorbike).as("Motorbike DailyRentalPrice")
                .withFailMessage("A new Motorbike with %s seats must have price %s",
                        catalinaCylinderCapacity, expectedPriceCatalinaMotorbike )
                .returns(expectedPriceCatalinaMotorbike, Motorbike::dailyRentalPrice);
        assertThat(windows95Motorbike).as("Motorbike DailyRentalPrice")
                .withFailMessage("An old Motorbike with %s seat must have price %s",
                        windows95CylinderCapacity, expectedPriceCatalinaMotorbike )
                .returns(expectedPriceWindowsMotorbike, Motorbike::dailyRentalPrice);
    }

    @Test
    void testToString(){
        String expectedStringMacOs = "Motorbike Apple Catalina 2019 (100cm³) : 25.0€";
        assertThat(catalinaMotorbike).returns(expectedStringMacOs, Objects::toString);
        String expectedStringWin = "Motorbike Microsoft Windows95 1995 (400cm³) : 100.0€";
        assertThat(windows95Motorbike).returns(expectedStringWin, Objects::toString);
    }

}