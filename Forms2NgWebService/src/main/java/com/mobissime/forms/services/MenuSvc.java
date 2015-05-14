package com.mobissime.forms.services;

import com.mobissime.forms.config.props;
import com.mobissime.forms.pojos.MenuEntry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Coiffier on 11/12/2014 00:06.
 */
@Path("menu")
public class MenuSvc {

    /**
     * Génération du menu pour avoir la liste des FORMS
     *
     * @return Liste JSON avec le nom des FORMS/XML contenues dans le répertoires source
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MenuEntry> getMenuListe() {
        List<MenuEntry> liste = new ArrayList<MenuEntry>();
        System.out.println("Processing getMenuListe | List<MenuEntry>");

        File folder = new File(props.formsPath);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("Fichier : " + listOfFiles[i].getName());
                String fileName = listOfFiles[i].getName();
                fileName = fileName.replace("_fmb.xml", "");

                MenuEntry menuEntry = new MenuEntry();
                menuEntry.setFormsName(fileName);
                liste.add(menuEntry);
            }
        }

        return liste;
    }
}
