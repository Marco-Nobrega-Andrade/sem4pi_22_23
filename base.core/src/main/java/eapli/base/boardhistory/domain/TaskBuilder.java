package eapli.base.boardhistory.domain;

import eapli.base.usermanagement.domain.BoardOwner;

public class TaskBuilder {

    private TaskId taskId;
    private Operation operation;
    private BoardOwner boardOwner;

    public TaskBuilder withTaskId(long taskId){
        this.taskId = new TaskId(taskId);
        return this;
    }

    public TaskBuilder withOperation(OperationValue operation){
        this.operation = new Operation(operation);
        return this;
    }

    public TaskBuilder withBoardOwner(BoardOwner boardOwner){
        this.boardOwner = boardOwner;
        return this;
    }

    public Task build(){
        return new Task(this.taskId, this.operation, this.boardOwner);
    }
}
