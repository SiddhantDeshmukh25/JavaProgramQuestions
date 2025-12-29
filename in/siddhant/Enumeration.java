package in.siddhant;

import java.util.ArrayList;
import java.util.List;

public class Enumeration {
    enum Status {
        ACTIVE,
        INACTIVE,
        BLOCKED
    }

    public static void main(String[] args) {
        List<Status> statusList = new ArrayList<>();
        statusList.add(Status.ACTIVE);
        statusList.add(Status.INACTIVE);
        statusList.add(Status.BLOCKED);
        System.out.println(statusList);
    }
}
