/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dream.nightclub.service;

import com.dream.nightclub.model.Cast;
import com.dream.nightclub.result.cast.CastDetailResult;

/**
 * キャスト情報関連Serviceクラス
 * 
 * @author masaya.tezuka
 */
public class CastService {

    /**
     * キャスト詳細情報取得処理
     * 
     * @param id
     * @return 
     */
    public CastDetailResult getCastDetail(Integer id) {
        // 実際はDAOにアクセスして結果を取得する
        Cast cast = new Cast();
        cast.setId(id);
        cast.setName("あかり");
        cast.setNameRoman("AKARI");

        CastDetailResult result = new CastDetailResult();
        result.setCast(cast);
        
        return result;
    }
    
}
