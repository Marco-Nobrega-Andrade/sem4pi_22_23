package eapli.base.board.application;

import eapli.base.board.application.services.ShareBoardService;

public class ShareBoardController {
    public boolean shareBoard(String boardTitle, String email, boolean permission){
        ShareBoardService service = new ShareBoardService();
        return service.shareBoard(boardTitle, email, permission);
    }
}
