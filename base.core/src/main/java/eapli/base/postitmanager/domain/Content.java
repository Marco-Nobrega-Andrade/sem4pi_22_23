package eapli.base.postitmanager.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Content implements ValueObject {
    private String content;
    private byte[] image;

    protected Content(String content){
        if(content == null || content.trim().isEmpty()){
            throw new IllegalArgumentException("The content cannot be null or empty.");
        }
        this.content = content;
    }
    protected Content(byte[] image){
        if(image == null){
            throw new IllegalArgumentException("The image cannot be null.");
        }
        this.image = image;
    }

    protected Content(String content, byte[] image){
        if (content == null || content.trim().isEmpty() || image == null){
            throw new IllegalArgumentException
                    ("The content cannot be null or empty and the image cannot be null.");
        }
    }

    protected Content(){
        //ORM
    }
    
}
