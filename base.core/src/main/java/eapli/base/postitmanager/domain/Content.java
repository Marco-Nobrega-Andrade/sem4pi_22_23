package eapli.base.postitmanager.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Content implements ValueObject {
    private String content;

    protected Content(String content){
        if(content == null || content.isEmpty()){
            throw new IllegalArgumentException("The content cannot be null or empty.");
        }
        this.content = content;
    }

    protected Content(){
        //ORM
    }

    @Override
    public String toString() {
        return content;
    }
}
