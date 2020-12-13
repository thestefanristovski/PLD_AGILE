package command;

import com.sothawo.mapjfx.Coordinate;
import controller.MVCController;
import objects.Depot;
import objects.Intersection;
import objects.PlanningRequest;
import objects.Request;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Controller;

import java.util.ArrayList;

public class SwapOrderCommandTest{

    SwapOrderCommand swapOrderCommand;
    MVCController mvcController;
    Request request0, request1, request2;
    Depot depot;
    Controller.LocationTagContent newPickupLtc, newDeliveryLtc, depotLtc;

    @Before
    public void before(){

        request0 = new Request(0, new Intersection(45.884784, 4.8456121, 0), new Intersection(45.884451, 4.8715468, 0), 160, 200);
        request1 = new Request(1, new Intersection(45.750404, 4.8744674, 1), new Intersection(45.754433, 4.8718023, 1), 360, 240);
        request2 = new Request(2, new Intersection(45.731080, 4.8979990, 2), new Intersection(45.755142, 4.8716140, 2), 200, 260);
        depot = new Depot(new Intersection(45.7845123, 4.7799845, 3), null);
        newPickupLtc = new Controller.LocationTagContent("Pickup 1", "Saint-Exupery", "Rue de la paix", "15:00", new Coordinate(45.741886, 4.8938003), new ArrayList<>(), request1);
        newDeliveryLtc = new Controller.LocationTagContent("Delivery 1", "Saint-Jean", "Part-Dieu", "15:10", new Coordinate(45.741886, 4.8938003), new ArrayList<>(), request1);
        depotLtc =  new Controller.LocationTagContent("Depot", "Saint-Pierre", "Michelle", "15:20", new Coordinate(45.741886, 4.8938003), new ArrayList<>(), request1);

    }

    @After
    public void after(){

    }

    @Test
    public void testDoCommand() {
        ArrayList<Controller.LocationTagContent> expLtcList = new ArrayList<>();
        expLtcList.add(newDeliveryLtc);
        expLtcList.add(newPickupLtc);
        expLtcList.add(depotLtc);
        mvcController = new MVCController();
        mvcController.getPlanningRequest().addRequest(request0);
        mvcController.getPlanningRequest().addRequest(request1);
        mvcController.getPlanningRequest().setDepot(depot);
        mvcController.getLtcList().add(newPickupLtc);
        mvcController.getLtcList().add(newDeliveryLtc);
        mvcController.getLtcList().add(depotLtc);
        swapOrderCommand = new SwapOrderCommand(0,1, mvcController.getLtcList());
        swapOrderCommand.doCommand(mvcController);

        Assert.assertEquals(expLtcList, mvcController.getLtcList());
    }

    @Test
    public void testUndoCommand() {
        ArrayList<Controller.LocationTagContent> expLtcList = new ArrayList<>();
        expLtcList.add(newDeliveryLtc);
        expLtcList.add(newPickupLtc);
        expLtcList.add(depotLtc);
        mvcController = new MVCController();
        mvcController.getPlanningRequest().addRequest(request0);
        mvcController.getPlanningRequest().addRequest(request1);
        mvcController.getPlanningRequest().setDepot(depot);
        mvcController.getLtcList().add(newPickupLtc);
        mvcController.getLtcList().add(newDeliveryLtc);
        mvcController.getLtcList().add(depotLtc);
        swapOrderCommand = new SwapOrderCommand(0,1, mvcController.getLtcList());
        swapOrderCommand.doCommand(mvcController);

        Assert.assertEquals(expLtcList, mvcController.getLtcList());
    }
}