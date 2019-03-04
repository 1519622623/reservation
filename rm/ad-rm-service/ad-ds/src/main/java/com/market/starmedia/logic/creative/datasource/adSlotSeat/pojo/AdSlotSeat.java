package com.market.starmedia.logic.creative.datasource.adSlotSeat.pojo;

import java.util.Date;

public class AdSlotSeat {
    private Long seat_id;

    private String seat_name;

    private Integer seat_index;

    private Long slot_id;

    private Byte is_open;

    private Date update_time;

    private String additional;

    public Long getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Long seat_id) {
        this.seat_id = seat_id;
    }

    public String getSeat_name() {
        return seat_name;
    }

    public void setSeat_name(String seat_name) {
        this.seat_name = seat_name;
    }

    public Integer getSeat_index() {
        return seat_index;
    }

    public void setSeat_index(Integer seat_index) {
        this.seat_index = seat_index;
    }

    public Long getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(Long slot_id) {
        this.slot_id = slot_id;
    }

    public Byte getIs_open() {
        return is_open;
    }

    public void setIs_open(Byte is_open) {
        this.is_open = is_open;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}