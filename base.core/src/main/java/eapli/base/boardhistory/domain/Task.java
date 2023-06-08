package eapli.base.boardhistory.domain;

import eapli.base.postitmanager.domain.PostIt;
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

    @OneToOne
    private PostIt postIt;

    protected Task(TaskId taskId, Operation operation, BoardOwner boardOwner, PostIt postIt){
        if(taskId == null | operation == null | boardOwner == null){
            throw new IllegalArgumentException("The task cannot be created with null Value Objects");
        }
        this.taskId = taskId;
        this.operation = operation;
        this.boardOwner = boardOwner;
        this.postIt = postIt;
    }

    protected Task(){

    }

}
