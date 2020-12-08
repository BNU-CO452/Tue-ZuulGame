/**
 *
 */
public class Player
{
    private final String name;
    private int score;
    private int count;

    /**
     * Added another comment
     * @param name
     */
    public Player(String name)
    {
        this.name = name;
        score = 0;
    }

    /**
     *
     * @return
     */
    public int getScore()
    {
        return score;
    }

    public void resetScore()
    {
        score = 0;
    }

    public void increaseScore(int amount)
    {
        if(amount > 0)
            score += amount;
    }

    /**
     *
     * @param count
     */
    public void setCount(int count)
    {
        this.count = count;
    }

    /**
     *
     */
    public void print()
    {
        System.out.println("Player : " + name);
        System.out.println();
    }
}
