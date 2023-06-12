package eapli.base.boardhistory.domain;

import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.postitmanager.domain.PostIt;
import eapli.base.usermanagement.domain.BoardOwner;

public class TaskBuilder {
    private TaskId taskId;
    private Operation operation;
    private BoardOwner boardOwner;
    private BoardParticipant boardParticipant;
    private PostIt postIt;
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

    public TaskBuilder withBoardParticipant(BoardParticipant boardParticipant) {
        this.boardParticipant = boardParticipant;
        return this;
    }
    public TaskBuilder withPostIt(PostIt postIt){
        this.postIt = postIt;
        return this;
    }

    public Task build(){
        if (this.postIt == null){
            return new Task(this.taskId, this.operation, this.boardOwner);
        }
        if (this.boardParticipant != null){
            return new Task(this.taskId, this.operation, this.boardParticipant,this.postIt);
        }
        return new Task(this.taskId, this.operation, this.boardOwner,this.postIt);
    }


}
