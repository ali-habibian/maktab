package w4.intarray;

public class IntArray {
    private int[] array;
    // holds the current size of array
    private int size;
    // holds the total capacity of array
    private int capacity;

    // Default constructor to initialize the array and values
    public IntArray() {
        array = new int[2];
        size = 0;
        capacity = 2;
    }

    // Constructor to initialize the array and values with initial capacity
    public IntArray(int capacity) {
        array = new int[capacity];
        size = 0;
        this.capacity = capacity;
    }

    // Add an element to array
    public void add(int element) {
        // Double the capacity if all the allocated space is full
        if (size == capacity) {
            int[] temp = new int[capacity * 2];

            for (int i = 0; i < capacity; i++) { // Copy old array elements to temp
                temp[i] = array[i];
            }
            array = temp;
            capacity = capacity * 2;
        }
        // Add element in index "size"
        array[size] = element;
        size++;
    }

    // Get an element with its index
    public int get(int index) {
        return array[index];
    }

    // Remove an element with its index
    public void remove(int index) {
        if (index >= size || index < 0) { // Check that index is in array range
            System.out.println("No element at this index");
        } else {
            for (int i = index; i < size - 1; i++) { // Shift all elements after given index to left
                array[i] = array[i + 1];
            }
            // Set last index 0
            array[size - 1] = 0;
            size--;
        }
    }

    //  Trim the capacity of array to the current size and remove unused space
    public void trim() {
        System.out.println("Trimming the array");
        // Create temp array with length of our elements
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) { // Copy old array elements to temp
            temp[i] = array[i];
        }
        array = temp;
        capacity = array.length;
    }

    // Checking that array contains given element or not
    public boolean contains(int number) {
        for (int i = 0; i < size; i++) { // Search in array elements
            if (array[i] == number)
                return true;
        }
        return false;
    }

    // Print all elements in array
    public void print() {
        for (int i = 0; i < size; i++) { // Search in array elements
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Get the current size
    public int size() {
        return size;
    }

    // Get the current capacity
    public int capacity() {
        return capacity;
    }
}
