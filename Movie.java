public class Movie  {
  private String name;

  private Character[] cast;

  public Movie(String name){
    this.name = name;
    this.cast = new Character[7];
  }

  public String getName(){
    return this.name;
  }

  public int characterCount()  {
    int count = 0;
    for (Character character : cast) {
      if (character != null) {
        count++;
      }
    }
    return count;
  }

  public void add(Character character)  {
    if (castFull()) {
      return;
    }
    int characterCount = characterCount();
    cast[characterCount] = character; //whatever is at position 0
  }

  public boolean castFull() {
    return characterCount() == cast.length;
  }

  public void retire() {
    for (int i = 0; i < cast.length; i++)  {
      cast[i] = null;
    }
  }
} 
