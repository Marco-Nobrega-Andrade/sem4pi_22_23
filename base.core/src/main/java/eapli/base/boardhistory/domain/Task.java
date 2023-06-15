package eapli.base.boardhistory.domain;

import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.postitmanager.domain.PostIt;
import eapli.base.usermanagement.domain.BoardOwner;

import javax.persistence.*;

@Entity
public class Task{
    @EmbeddedId
    private TaskId taskId;
    private Operation operation;
    @ManyToOne
    private BoardOwner  boardOwner;
    @ManyToOne
    private BoardParticipant boardParticipant;
    @OneToOne
    private PostIt postIt;

    protected Task(TaskId taskId, Operation operation, BoardOwner boardOwner, BoardParticipant boardParticipant, PostIt postIt){
        if(taskId == null || operation == null || (boardParticipant == null && boardOwner == null)){
            throw new IllegalArgumentException("The task cannot be created with null Value Objects");
        }
        this.taskId = taskId;
        this.operation = operation;
        this.boardOwner = boardOwner;
        this.postIt = postIt;
        this.boardParticipant = boardParticipant;
    }
    protected Task(){

    }

    public String returnTaskIdString(){
        return taskId.returnTaskIdString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operation: " + operation.toString());

        if(boardOwner!=null){
            sb.append(" | BoardOwner: " + boardOwner);
        }else {
            sb.append(" | BoardParticipant: " + boardParticipant.toString());
        }

        if(postIt!=null){
            sb.append(" | Post-It: " + postIt);
        }

        return sb.toString();
    }
}
