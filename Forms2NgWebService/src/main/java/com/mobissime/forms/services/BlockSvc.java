package com.mobissime.forms.services;

import com.mobissime.forms.dao.BlockDao;
import com.mobissime.forms.dao.FormsDao;
import com.mobissime.forms.objects.Block;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Paul Coiffier on 11/12/2014.
 */
@Path("blocks")
public class BlockSvc {

    private BlockDao blockDao = new BlockDao();

    @GET
    @Path("/{f}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Block getBlock(@PathParam("f") String formsName, @PathParam("b") String blockName) {
        System.out.println("Processing block : " + blockName);
        Block blk = blockDao.getBlock(formsName, blockName);
        return blk;
    }
}
