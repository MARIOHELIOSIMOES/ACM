package br.gov.sp.saaemogimirim.ACM.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tb_ait")
public class AIT {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  private Long id;
    @Id
    private String timeCol;
    private float ait_1104a_1;
    private float ait_1104b_1;
    private float ait_1104c_1;
    private float ait_1109a_1;
    private float ait_1104a_2;
    private float ait_1104a_3;
    private float ait_1104a_4;

    public AIT() {
    }

    public AIT(String timeCol, float ait_1104a_1, float ait_1104b_1, float ait_1104c_1, float ait_1109a_1, float ait_1104a_2, float ait_1104a_3, float ait_1104a_4) {
        this.timeCol = timeCol;
        this.ait_1104a_1 = ait_1104a_1;
        this.ait_1104b_1 = ait_1104b_1;
        this.ait_1104c_1 = ait_1104c_1;
        this.ait_1109a_1 = ait_1109a_1;
        this.ait_1104a_2 = ait_1104a_2;
        this.ait_1104a_3 = ait_1104a_3;
        this.ait_1104a_4 = ait_1104a_4;
    }
/*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    */

    public String getTimeCol() {
        return timeCol;
    }

    public void setTimeCol(String timeCol) {
        this.timeCol = timeCol;
    }

    public float getAit_1104a_1() {
        return ait_1104a_1;
    }

    public void setAit_1104a_1(float ait_1104a_1) {
        this.ait_1104a_1 = ait_1104a_1;
    }

    public float getAit_1104b_1() {
        return ait_1104b_1;
    }

    public void setAit_1104b_1(float ait_1104b_1) {
        this.ait_1104b_1 = ait_1104b_1;
    }

    public float getAit_1104c_1() {
        return ait_1104c_1;
    }

    public void setAit_1104c_1(float ait_1104c_1) {
        this.ait_1104c_1 = ait_1104c_1;
    }

    public float getAit_1109a_1() {
        return ait_1109a_1;
    }

    public void setAit_1109a_1(float ait_1109a_1) {
        this.ait_1109a_1 = ait_1109a_1;
    }

    public float getAit_1104a_2() {
        return ait_1104a_2;
    }

    public void setAit_1104a_2(float ait_1104a_2) {
        this.ait_1104a_2 = ait_1104a_2;
    }

    public float getAit_1104a_3() {
        return ait_1104a_3;
    }

    public void setAit_1104a_3(float ait_1104a_3) {
        this.ait_1104a_3 = ait_1104a_3;
    }

    public float getAit_1104a_4() {
        return ait_1104a_4;
    }

    public void setAit_1104a_4(float ait_1104a_4) {
        this.ait_1104a_4 = ait_1104a_4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AIT ait = (AIT) o;
        return Float.compare(ait.ait_1104a_1, ait_1104a_1) == 0 && Float.compare(ait.ait_1104b_1, ait_1104b_1) == 0 && Float.compare(ait.ait_1104c_1, ait_1104c_1) == 0 && Float.compare(ait.ait_1109a_1, ait_1109a_1) == 0 && Float.compare(ait.ait_1104a_2, ait_1104a_2) == 0 && Float.compare(ait.ait_1104a_3, ait_1104a_3) == 0 && Float.compare(ait.ait_1104a_4, ait_1104a_4) == 0 && Objects.equals(timeCol, ait.timeCol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeCol, ait_1104a_1, ait_1104b_1, ait_1104c_1, ait_1109a_1, ait_1104a_2, ait_1104a_3, ait_1104a_4);
    }
}
