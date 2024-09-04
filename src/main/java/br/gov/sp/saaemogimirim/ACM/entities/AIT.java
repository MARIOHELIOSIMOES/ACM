package br.gov.sp.saaemogimirim.ACM.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="tb_ait")
public class AIT {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  private Long id;
    @Id
    @Column(name="TIME_COL")
    private LocalDateTime timeCol;
    @Column(name="MSEC_COL")
    private Integer msecCol;
    @Column(name="LOCAL_COL")
    private LocalDateTime localCol;
    @Column(name="USER_COL")
    private String userCol;
    @Column(name="REASON_COL")
    private String reasonCol;
    @Column(name="AIT_1104A_1")
    private float ait_1104a_1;
    @Column(name="AIT_1104B_1")
    private float ait_1104b_1;
    @Column(name="AIT_1104C_1")
    private float ait_1104c_1;

    @Column(name="AIT_1109A_1")
    private float ait_1109a_1;
    @Column(name="AIT_1109A_2")
    private float ait_1109a_2;
    @Column(name="AIT_1109A_3")
    private float ait_1109a_3;
    @Column(name="AIT_1109A_4")
    private float ait_1109a_4;

    public AIT() {
    }

    public AIT(LocalDateTime timeCol, Integer msecCol, LocalDateTime localCol, String userCol, String reasonCol, float ait_1104a_1, float ait_1104b_1, float ait_1104c_1, float ait_1109a_1, float ait_1109a_2, float ait_1109a_3, float ait_1109a_4) {
        this.timeCol = timeCol;
        this.msecCol = msecCol;
        this.localCol = localCol;
        this.userCol = userCol;
        this.reasonCol = reasonCol;
        this.ait_1104a_1 = ait_1104a_1;
        this.ait_1104b_1 = ait_1104b_1;
        this.ait_1104c_1 = ait_1104c_1;
        this.ait_1109a_1 = ait_1109a_1;
        this.ait_1109a_2 = ait_1109a_2;
        this.ait_1109a_3 = ait_1109a_3;
        this.ait_1109a_4 = ait_1109a_4;
    }

  /*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    */

    public LocalDateTime getTimeCol() {
        return timeCol;
    }

    public void setTimeCol(LocalDateTime timeCol) {
        this.timeCol = timeCol;
    }

    public Integer getMsecCol() {
        return msecCol;
    }

    public void setMsecCol(Integer msecCol) {
        this.msecCol = msecCol;
    }

    public LocalDateTime getLocalCol() {
        return localCol;
    }

    public void setLocalCol(LocalDateTime localCol) {
        this.localCol = localCol;
    }

    public String getUserCol() {
        return userCol;
    }

    public void setUserCol(String userCol) {
        this.userCol = userCol;
    }

    public String getReasonCol() {
        return reasonCol;
    }

    public void setReasonCol(String reasonCol) {
        this.reasonCol = reasonCol;
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

    public float getAit_1109a_2() {
        return ait_1109a_2;
    }

    public void setAit_1109a_2(float ait_1109a_2) {
        this.ait_1109a_2 = ait_1109a_2;
    }

    public float getAit_1109a_3() {
        return ait_1109a_3;
    }

    public void setAit_1109a_3(float ait_1109a_3) {
        this.ait_1109a_3 = ait_1109a_3;
    }

    public float getAit_1109a_4() {
        return ait_1109a_4;
    }

    public void setAit_1109a_4(float ait_1109a_4) {
        this.ait_1109a_4 = ait_1109a_4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AIT ait = (AIT) o;
        return Float.compare(ait.ait_1104a_1, ait_1104a_1) == 0 && Float.compare(ait.ait_1104b_1, ait_1104b_1) == 0 && Float.compare(ait.ait_1104c_1, ait_1104c_1) == 0 && Float.compare(ait.ait_1109a_1, ait_1109a_1) == 0 && Float.compare(ait.ait_1109a_2, ait_1109a_2) == 0 && Float.compare(ait.ait_1109a_3, ait_1109a_3) == 0 && Float.compare(ait.ait_1109a_4, ait_1109a_4) == 0 && Objects.equals(timeCol, ait.timeCol) && Objects.equals(msecCol, ait.msecCol) && Objects.equals(localCol, ait.localCol) && Objects.equals(userCol, ait.userCol) && Objects.equals(reasonCol, ait.reasonCol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeCol, msecCol, localCol, userCol, reasonCol, ait_1104a_1, ait_1104b_1, ait_1104c_1, ait_1109a_1, ait_1109a_2, ait_1109a_3, ait_1109a_4);
    }
}
