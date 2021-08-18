public abstract class Task {

    protected String title;
    protected boolean isDone;

    public Task(String title) {
        this.title = title;
        this.isDone = false;
    }

    public void maskAsDone() {
        this.isDone = true;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }
}
