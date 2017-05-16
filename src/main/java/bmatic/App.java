package bmatic;

import bmatic.baristaville.BaristaMatic;

/**
 * App is the main class that creates a BaristaMatic and starts the machine.
 */
public class App {
    /**
     * Only static main method, to start the Barista-Matic program.
     * hide the implicit public
     */
    private App() {
    }

    public static void main(String[] args) {
        new BaristaMatic().startMachine();
    }
}
