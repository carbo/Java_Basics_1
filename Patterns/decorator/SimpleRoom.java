package Patterns.decorator;

public class SimpleRoom implements Room {

    @Override
    public String showRoom() {
        return "Normaler Raum";
    }

}