package com.mobissime.forms.dao;

import com.mobissime.forms.config.props;
import com.mobissime.forms.objects.Block;
import com.mobissime.forms.objects.FormModule;
import com.mobissime.forms.objects.Module;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulcoiffier on 11/12/2014.
 */
public class BlockDao {

    public static Block getBlock(String formsName, String blockName) {
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
                    if (blk.getName().equals(blockName)) {
                        return blk;
                    }

                } catch (Exception e) {
                }
            }

        } catch (Exception e) {
            System.out.println("Erreur : " + e.toString());
        }

        return null;
    }
}
