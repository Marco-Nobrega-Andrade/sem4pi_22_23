package eapli.base.boardhistory.domain;

import eapli.base.usermanagement.domain.BoardOwner;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Task{
    @EmbeddedId
    private TaskId taskId;
    private Operation operation;
    @OneToOne
    private BoardOwner  boardOwner;

    protected Task(TaskId taskId, Operation operation, BoardOwner boardOwner){
        this.taskId = taskId;
        this.operation = operation;
        this.boardOwner = boardOwner;
    }

    protected Task(){

    }

}
