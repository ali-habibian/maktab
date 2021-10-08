package haltamrin.toyfactory;

public class Cart {
    private Toy[] toys;

    private int size;
    private int capacity;

    public Cart(){
        toys = new Toy[2];

        for (Toy toy:toys) {
            toy = new Toy();
        }

        size = 0;
        capacity = 2;
    }

    public void addToy(Toy toy) {
        if (size == capacity) {
            Toy[] temp = new Toy[capacity * 2];

            for (int i = 0; i < capacity; i++) {
                temp[i] = toys[i];
            }
            toys = temp;
            capacity = capacity * 2;
        }

        toys[size] = toy;
        size++;
    }

    public Toy[] getToysBuyed(){
        return this.toys;
    }
}
