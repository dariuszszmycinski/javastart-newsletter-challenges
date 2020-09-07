class Task {
    private String description;
    private Priority priority;

    public Task(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        String translation = switch(priority){
            case LOW->"niski";
            case MEDIUM->"średni";
            case HIGH,URGENT->"Pilne!";
        };
        return "Zadanie "+description +" ma priorytet " + translation;
    }
}
