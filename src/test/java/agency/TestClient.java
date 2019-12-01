package agency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TestClient {



  private Client arnaud;

  @BeforeEach
  void initializeClient() {
    arnaud = new Client("Arnaud", "Labourel", 1981);
  }

  @Test
  void testGetFirstName(){
    assertThat(arnaud.getFirstName()).isEqualTo("Arnaud");
  }
  @Test
  void testGetLastName(){
    assertThat(arnaud.getLastName()).isEqualTo("Labourel");
  }
  @Test
  void testGetYearOfBirth(){
    assertThat(arnaud.getYearOfBirth()).isEqualTo(1981);
  }
}
