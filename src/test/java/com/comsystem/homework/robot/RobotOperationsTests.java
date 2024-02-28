package com.comsystem.homework.robot;

import com.comsystem.homework.model.RobotPlan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class RobotOperationsTests {

    RobotOperations robotOperations = new RobotOperations();
    @Test
    public void excavateStonesForDays() {
        int days = 6;
        RobotPlan plan = robotOperations.excavateStonesForDays(days);
        Assertions.assertEquals(12, plan.numberOfStones());

    }

    @Test
    public void daysRequiredToCollectStones() {
        int stones = 12;
        RobotPlan plan = robotOperations.daysRequiredToCollectStones(stones);
        Assertions.assertEquals(6, plan.numberOfDays());

    }
}
