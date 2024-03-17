package Stage2;

import Stage1.Passenger;

import java.util.concurrent.ConcurrentLinkedQueue;

public class PassengerQueue {
    private final ConcurrentLinkedQueue<Passenger> queue;

    public PassengerQueue() {
        this.queue = new ConcurrentLinkedQueue<>();
    }

    /**
     * Adds a passenger to the queue.
     *
     * @param passenger The passenger to be added.
     */
    public void enqueue(Passenger passenger) {
        queue.offer(passenger);
    }

    /**
     * Removes and returns the passenger at the front of the queue.
     *
     * @return The passenger at the front of the queue, or null if the queue is empty.
     */
    public Passenger dequeue() {
        return queue.poll();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Gets the number of passengers in the queue.
     *
     * @return The number of passengers in the queue.
     */
    public int size() {
        return queue.size();
    }
}