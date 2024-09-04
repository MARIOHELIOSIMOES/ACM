package br.gov.sp.saaemogimirim.ACM.dto;

import br.gov.sp.saaemogimirim.ACM.entities.AIT;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class AIT_DTO {
    private LocalDateTime timeCol;
    private float ait_1104a_1;
    private float ait_1104b_1;
    private float ait_1104c_1;
    private float ait_1109a_1;
    private float ait_1109a_2;
    private float ait_1109a_3;
    private float ait_1109a_4;

    public AIT_DTO() {
    }

    public AIT_DTO(AIT ait) {
        this.timeCol = ait.getTimeCol();
        this.ait_1104a_1 = ait.getAit_1104a_1();
        this.ait_1104b_1 = ait.getAit_1104b_1();
        this.ait_1104c_1 = ait.getAit_1104c_1();
        this.ait_1109a_1 = ait.getAit_1109a_1();
        this.ait_1109a_2 = ait.getAit_1109a_2();
        this.ait_1109a_3 = ait.getAit_1109a_3();
        this.ait_1109a_4 = ait.getAit_1109a_4();
    }

    public LocalDateTime getTimeCol() {
        return timeCol;
    }

    public float getAit_1104a_1() {
        return ait_1104a_1;
    }

    public float getAit_1104b_1() {
        return ait_1104b_1;
    }

    public float getAit_1104c_1() {
        return ait_1104c_1;
    }

    public float getAit_1109a_1() {
        return ait_1109a_1;
    }

    public float getAit_1109a_2() {
        return ait_1109a_2;
    }

    public float getAit_1109a_3() {
        return ait_1109a_3;
    }

    public float getAit_1109a_4() {
        return ait_1109a_4;
    }
}
