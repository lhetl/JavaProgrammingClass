package Assignment.Assignment3.C;

public class RadioStation {
    private String name;
    private Program program;

    public RadioStation(String name, Program program) {
        this.name = name;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
