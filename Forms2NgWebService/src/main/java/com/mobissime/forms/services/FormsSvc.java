package com.mobissime.forms.services;

import com.mobissime.forms.dao.FormsDao;
import com.mobissime.forms.objects.Block;
import com.mobissime.forms.objects.Canvas;
import com.mobissime.forms.objects.Trigger;
import com.mobissime.forms.pojos.FormsStats;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Paul Coiffier on 10/12/2014 at 23:33
 */
@Path("forms")
public class FormsSvc {

    private FormsDao formsDao = new FormsDao();

    /*@GET
    @Path("/{i}")
    @Produces(MediaType.APPLICATION_JSON)
    public Block getBlockListe(@PathParam("i") String formsName) {
        System.out.println("Processing : " + formsName);
        Block blk = new Block();
        return blk;
    }*/

    @GET
    @Path("/stats/{i}")
    @Produces(MediaType.APPLICATION_JSON)
    public FormsStats getStatsListe(@PathParam("i") String formsName) {
        System.out.println("Processing stats : " + formsName);
        FormsStats formsStats = formsDao.getFormsStats(formsName);
        formsStats.setNumberOfCanvas(formsDao.getListOfCanevasForForms(formsName).size());
        return formsStats;
    }

    @GET
    @Path("/canvas/{i}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Canvas> getCanvasListe(@PathParam("i") String formsName) {
        System.out.println("Processing canvas : " + formsName);
        List<Canvas> listOfCanvas = formsDao.getListOfCanevasForForms(formsName);
        return listOfCanvas;
    }


    @GET
    @Path("/blocks/{i}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Block> getBlocksForForms(@PathParam("i") String formsName) {
        System.out.println("Processing Blocks : " + formsName);
        List<Block> listOfBlocks = formsDao.getListOfBlocksForForms(formsName);
        for(Block blk : listOfBlocks){
            /** Calcul nombre de triggers par Block */
            List<Trigger> listOfTriggers = formsDao.getListOfTriggersForBlock(formsName, blk.getName());
            blk.setNumberOfTriggers(listOfTriggers.size());
        }
        return listOfBlocks;
    }

    /*@GET
    @Path("/triggerscountforblock/{e}/{b}")
    public int getTriggersCountForForms(@PathParam("e") String formsName, @PathParam("b") String blockName) {
        System.out.println("Processing triggerscountforblock : " + formsName);
        List<Trigger> listOfTriggers = formsDao.getListOfTriggersForBlock(formsName, blockName);
        return listOfTriggers.size();
    }*/

    @GET
    @Path("/triggersforblock/{e}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Trigger> getTriggersForForms(@PathParam("e") String formsName, @PathParam("b") String blockName) {
        System.out.println("Processing triggersforblock : " + formsName);
        List<Trigger> listOfTriggers = formsDao.getListOfTriggersForBlock(formsName, blockName);
        for(Trigger trg : listOfTriggers){
            String codePlSql = trg.getTriggerText();
            codePlSql = codePlSql.replace("&#10;","<br />");
            trg.setTriggerText(codePlSql);
        }
        return listOfTriggers;
    }
}
