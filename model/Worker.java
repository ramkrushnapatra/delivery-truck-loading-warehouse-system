package model;

public class Worker {
    private Integer workerId;
    private String workerName;
    private String workerEmail;

    public Worker(Integer workerId, String workerName, String workerEmail) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerEmail = workerEmail;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }
}
