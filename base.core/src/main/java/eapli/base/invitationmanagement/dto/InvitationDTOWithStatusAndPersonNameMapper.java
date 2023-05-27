package eapli.base.invitationmanagement.dto;

import eapli.base.meetingmanagement.domain.Invitation;


public class InvitationDTOWithStatusAndPersonNameMapper {

    public static InvitationDTOWithStatusAndPersonName toDTO(Invitation invitation){
        InvitationDTOWithStatusAndPersonNameBuilder builder = new InvitationDTOWithStatusAndPersonNameBuilder();
        return builder.withStatusAndName(invitation.returnResponseStatusString(),invitation.returnPersonNameString()).build();
    }
}
