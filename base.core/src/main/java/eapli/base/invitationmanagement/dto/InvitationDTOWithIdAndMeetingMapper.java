package eapli.base.invitationmanagement.dto;

public class InvitationDTOWithIdAndMeetingMapper {

    public InvitationDTOWithIdAndMeeting toDTO(Long invitationId,Long meetingId,String meetingDate){
        InvitationDTOWithIdAndMeetingBuilder builder = new InvitationDTOWithIdAndMeetingBuilder();
        return builder.withAll(invitationId, meetingId, meetingDate).build();
    }
}
