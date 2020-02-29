package Workers;

public class Executioner {

    public void executePrisioner() {
        System.out.println("Prisioner has been executed with a toy sword...");
    }

    public void torture() {
        System.out.println("Start tickling...");
    }

    public void release() {
        System.out.println("The prisioner has been released...");
    }

    public boolean hasBeenExecutedWithAToySword = false;
    public boolean hasBeenTickled = false;
    public boolean isFree = true;
}
