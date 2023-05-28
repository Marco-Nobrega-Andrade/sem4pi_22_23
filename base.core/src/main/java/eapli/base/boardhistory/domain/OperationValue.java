package eapli.base.boardhistory.domain;

public enum OperationValue {
    CREATE { @Override public String toString() { return "Create"; } },
    ADD { @Override public String toString() { return "Add"; } },
    CHANGE{ @Override public String toString() { return "Change"; } },
    UNDO_CHANGE{ @Override public String toString() { return "Undo Change"; } },
    ARCHIVE{ @Override public String toString() { return "Archive"; } }

}
