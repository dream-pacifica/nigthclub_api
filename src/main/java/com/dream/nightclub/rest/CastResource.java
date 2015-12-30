/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dream.nightclub.rest;

import com.dream.nightclub.model.Cast;
import com.dream.nightclub.response.cast.CastDetailResponse;
import com.dream.nightclub.result.cast.CastDetailResult;
import com.dream.nightclub.service.CastService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import net.arnx.jsonic.JSON;
import org.apache.log4j.Logger;

/**
 * キャスト情報関連Resourceクラス
 *
 * @author masaya.tezuka
 */
@Path("cast")
public class CastResource {

    Logger logger = Logger.getLogger(CastResource.class);
    
    @Context
    private UriInfo context;

    private final CastService service = new CastService();
    
    /**
     * Creates a new instance of CastResource
     */
    public CastResource() {
    }

    /**
     * キャスト詳細情報取得
     * 
     * @param id
     * @return 
     */
    @GET
    @Path("detail/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCastDetail(@PathParam("id") Integer id) {
        logger.info("getCastDetail start");
        
        CastDetailResult result = service.getCastDetail(id);
        Cast cast = result.getCast();
        
        // レスポンス作成
        CastDetailResponse response = new CastDetailResponse();
        response.setStatusCode("200");
        response.setMessageDetail("正常終了");
        // TODO responseに一括でセットできるようにする
        response.setId(cast.getId());
        response.setName(cast.getName());
        response.setNameRoman(cast.getNameRoman());
        
        String returnJson = JSON.encode(response);

        logger.info("getCastDetail end");
        
        return returnJson;
    }
    
}
