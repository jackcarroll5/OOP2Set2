/*This class forms a video-game character based on the title,power-up and
* type of character the person is.*/

public class Game {

    private String characterName;
    private String powerUp;
    private String type;


    public Game()
    {
       setCharacterName("");
       setPowerUp("");
       setType("");
    }

    public Game(String characterName,String powerUp,String type)
    {
        setCharacterName(characterName);
        setPowerUp(powerUp);
        setType(type);
    }

    public void setCharacterName(String characterName)
    {
        this.characterName = characterName;
    }


    public void setPowerUp(String powerUp)
    {
      this.powerUp = powerUp;
    }

    public void setType(String type)
    {
      this.type = type;
    }


    public String getCharacterName()
    {
        return characterName;
    }

    public String getPowerUp()
    {
        return powerUp;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
      return String.format("\nCharacter: %-20s \nPower-Up: %-20s \nType: %-20s",getCharacterName(),getPowerUp(),getType());
    }

}
