import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MovieTest{
  Movie movie;
  Character character;

  @Before 
  public void before() {
    movie = new Movie("The Nutty Professor");
    character = new Character();
  }

  @Test
  public void hasName(){
    assertEquals("The Nutty Professor", movie.getName()); 
  }

  @Test
  public void castStartsEmpty(){
    assertEquals(0, movie.characterCount());
  }

  @Test
  public void canAddCharacter(){
    movie.add(character);
    assertEquals(1, movie.characterCount());
  }

  @Test
  public void cannotAddCharacterWhenCastFull() {
    for ( int i = 0; i < 10; i++ ) {
      movie.add(character);
    }
    assertEquals(7, movie.characterCount());
  }

  @Test
      public void castIsFull(){
      for ( int i = 0; i < 7; i++ )  {
        movie.add(character);
      }
    assertEquals(true, movie.castFull());
  }

  @Test
    public void shouldEmptyCastAfterRetiring() {
      movie.add(character);
      assertEquals(1, movie.characterCount());
      movie.retire();
      assertEquals(0, movie.characterCount());
    }
}
