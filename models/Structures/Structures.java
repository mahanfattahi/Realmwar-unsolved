package FinalProject.models.Structures;

public abstract class Structures {

    protected String name;
    protected int health;
    protected int cost;
    protected int level;


    public Structures(String name, int health, int cost, int level) {
        this.name = name;

        setHealth(health);

        setCost(cost);

        setLevel(level);
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {

        if(health <= 0)
            throw new IllegalArgumentException("health cannot be negative or zero");

        this.health = health;
    }

    public int getCost() {

        return cost;
    }

    public void setCost(int cost) {

        if(cost <= 0)
            throw new IllegalArgumentException("Cost cannot be negative or zero");

        this.cost = cost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {

        if(level <= 0)
            throw new IllegalArgumentException("level cannot be negative or zero");

        this.level = level;
    }


    public abstract void displayInfo();
}

