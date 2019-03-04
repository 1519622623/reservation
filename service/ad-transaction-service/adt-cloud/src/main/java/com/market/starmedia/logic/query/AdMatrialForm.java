package com.market.starmedia.logic.query;

import com.market.starmedia.logic.pojo.AdScheduleSw;
import com.market.starmedia.logic.pojo.MaterialInfo;

public class AdMatrialForm {

    private AdScheduleSw ad;
    private MaterialInfo material;

    public AdScheduleSw getAd () {
        return ad;
    }

    public void setAd (AdScheduleSw ad) {
        this.ad = ad;
    }

    public MaterialInfo getMaterial () {
        return material;
    }

    public void setMaterial (MaterialInfo material) {
        this.material = material;
    }
}
