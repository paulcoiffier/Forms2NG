package com.mobissime.forms.dao;

import com.mobissime.forms.config.props;
import com.mobissime.forms.objects.*;
import com.mobissime.forms.pojos.FormsStats;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Coiffier on 11/12/2014 OO:24
 */
public class FormsDao {

    /**
     * Lsite des blocks pour un FORM
     */
    public static List<Block> getListOfBlocksForForms(String formsName) {

        try {
            JAXBContext jc = JAXBContext.newInstance(Module.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Module mod = (Module) unmarshaller.unmarshal(new File(props.formsPath + formsName + "_fmb.xml"));
            FormModule form = (FormModule) mod.getFormModule();
            System.out.println(form.getComment());
            List<Object> lst = form.getCoordinateOrAlertOrAttachedLibrary();
            List<Block> listOfBlocks = new ArrayList<Block>();

            for (int i = 0; i < lst.size(); i++) {

                try {
                    Block blk = (Block) lst.get(i);
                    listOfBlocks.add(blk);
                } catch (Exception e) {
                }
            }

            return listOfBlocks;

        } catch (Exception e) {
            System.out.println("Erreur : " + e.toString());
        }

        return null;
    }

    public static List<Trigger> getListOfTriggersForBlock(String formsName, String blocName) {

        try {
            JAXBContext jc = JAXBContext.newInstance(Module.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Module mod = (Module) unmarshaller.unmarshal(new File(props.formsPath + formsName + "_fmb.xml"));
            FormModule form = (FormModule) mod.getFormModule();
            List<Object> lst = form.getCoordinateOrAlertOrAttachedLibrary();
            List<Trigger> listOfTriggers = new ArrayList<Trigger>();

            for (int i = 0; i < lst.size(); i++) {

                try {
                    Block blk = (Block) lst.get(i);
                    if (blk.getName().equals(blocName)) {
                        for (Object o : blk.getDataSourceArgumentOrDataSourceColumnOrItem()) {
                            if ("class com.mobissime.forms.objects.Trigger".equals(o.getClass().toString())) {
                                Trigger trigger = (Trigger) o;
                                listOfTriggers.add(trigger);
                            }
                        }
                        break;
                    }
                } catch (Exception e) {
                    //System.out.println("erreur");
                }
            }

            return listOfTriggers;

        } catch (Exception e) {
            System.out.println("Erreur : " + e.toString());
        }

        return null;
    }

    public static List<Canvas> getListOfCanevasForForms(String formsName) {

        try {
            JAXBContext jc = JAXBContext.newInstance(Module.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Module mod = (Module) unmarshaller.unmarshal(new File(props.formsPath + formsName + "_fmb.xml"));
            FormModule form = (FormModule) mod.getFormModule();
            List<Object> lst = form.getCoordinateOrAlertOrAttachedLibrary();
            List<Canvas> listOfCanvas = new ArrayList<Canvas>();

            for (int i = 0; i < lst.size(); i++) {

                try {
                    Canvas cvs = (Canvas) lst.get(i);
                    listOfCanvas.add(cvs);
                } catch (Exception e) {
                    //System.out.println("erreur");
                }
            }
            return listOfCanvas;

        } catch (Exception e) {
            System.out.println("Erreur : " + e.toString());
        }
        return null;
    }

    public static FormsStats getFormsStats(String formsName) {

        FormsStats frmStat = new FormsStats();

        try {

            JAXBContext jc = JAXBContext.newInstance(Module.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Module mod = (Module) unmarshaller.unmarshal(new File(props.formsPath + formsName + "_fmb.xml"));
            FormModule form = (FormModule) mod.getFormModule();
            System.out.println(form.getComment());
            List<Object> lst = form.getCoordinateOrAlertOrAttachedLibrary();
            List<Block> listOfBlocks = new ArrayList<Block>();

            for (int i = 0; i < lst.size(); i++) {

                try {
                    Block blk = (Block) lst.get(i);
                    listOfBlocks.add(blk);
                } catch (Exception e) {
                    //System.out.println("erreur");
                }
            }

            List<Trigger> listOfTriggers = new ArrayList<Trigger>();
            List<Item> listOfItems = new ArrayList<Item>();

            /** Pour chaque block */
            for (Block blk : listOfBlocks) {

                for (Object o : blk.getDataSourceArgumentOrDataSourceColumnOrItem()) {

                    if ("class com.mobissime.forms.objects.Item".equals(o.getClass().toString())) {
                        Item item = (Item) o;
                        listOfItems.add(item);
                    } else if ("class com.mobissime.forms.objects.Trigger".equals(o.getClass().toString())) {
                        Trigger trigger = (Trigger) o;
                        listOfTriggers.add(trigger);
                    } else {
                        //System.out.println("Type : " + o.getClass().toString());
                    }
                }

                frmStat.setNumberOfItems(listOfItems.size());
                frmStat.setNumberOfTriggers(listOfTriggers.size());
            }
            /** Nombre de blocks */
            frmStat.setNumberOfBlocks(listOfBlocks.size());

        } catch (Exception e) {

            e.printStackTrace();

        }

        return frmStat;
    }
}
