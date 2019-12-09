package de.rhaudi.transfactrestserver.entities.clwerte;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "CLWERTE", schema = "TFWEB", catalog = "")
public class ClwerteEntity {
    private long cwId;
    private long cwAsId;
    private long cwMdId;
    private long cwAlId;
    private String cwValue;
    private String cwUsercreated;
    private Time cwDatecreated;
    private String cwUserchanged;
    private Time cwDatechanged;
    private Long cwLfdNr;
    //private long cwBzId;
    private String cwValueClob;
    private Time cwValueDate;

//@GeneratedValue(strategy = GenerationType.IDENTITY)
//@SequenceGenerator(name="cwid_generator", sequenceName = "CW_SEQ", initialValue=87660 , allocationSize=1)

    @Id
    @Column(name = "CW_ID", nullable = false)
    public long getCwId() {
        return cwId;
    }

    public void setCwId(long cwId) {
        this.cwId = cwId;
    }

    @Basic
    @Column(name = "CW_AS_ID")
    public long getCwAsId() {
        return cwAsId;
    }

    public void setCwAsId(long cwAsId) {
        this.cwAsId = cwAsId;
    }

    @Basic
    @Column(name = "CW_AL_ID")
    public long getCwAlId() {
        return cwAlId;
    }

    public void setCwAlId(long cwAlId) {
        this.cwAlId = cwAlId;
    }

    @Basic
    @Column(name = "CW_MD_ID")
    public long getCwMdId() {
        return cwMdId;
    }

    public void setCwMdId(long cwMdId) {
        this.cwMdId = cwMdId;
    }

    // @Basic
    // @Column(name = "CW_BZ_ID")
    // public long getCwBzId() {
    //     return cwBzId;
    // }

    // public void setCwBzId(long cwBzId) {
    //     this.cwBzId = cwBzId;
    // }


    @Basic
    @Column(name = "CW_VALUE")
    public String getCwValue() {
        return cwValue;
    }

    public void setCwValue(String cwValue) {
        this.cwValue = cwValue;
    }

    @Basic
    @Column(name = "CW_USERCREATED")
    public String getCwUsercreated() {
        return cwUsercreated;
    }

    public void setCwUsercreated(String cwUsercreated) {
        this.cwUsercreated = cwUsercreated;
    }

    @Basic
    @Column(name = "CW_DATECREATED")
    public Time getCwDatecreated() {
        return cwDatecreated;
    }

    public void setCwDatecreated(Time cwDatecreated) {
        this.cwDatecreated = cwDatecreated;
    }

    @Basic
    @Column(name = "CW_USERCHANGED")
    public String getCwUserchanged() {
        return cwUserchanged;
    }

    public void setCwUserchanged(String cwUserchanged) {
        this.cwUserchanged = cwUserchanged;
    }

    @Basic
    @Column(name = "CW_DATECHANGED")
    public Time getCwDatechanged() {
        return cwDatechanged;
    }

    public void setCwDatechanged(Time cwDatechanged) {
        this.cwDatechanged = cwDatechanged;
    }

    @Basic
    @Column(name = "CW_LFD_NR")
    public Long getCwLfdNr() {
        return cwLfdNr;
    }

    public void setCwLfdNr(Long cwLfdNr) {
        this.cwLfdNr = cwLfdNr;
    }

    @Basic
    @Column(name = "CW_VALUE_CLOB")
    public String getCwValueClob() {
        return cwValueClob;
    }

    public void setCwValueClob(String cwValueClob) {
        this.cwValueClob = cwValueClob;
    }

    @Basic
    @Column(name = "CW_VALUE_DATE")
    public Time getCwValueDate() {
        return cwValueDate;
    }

    public void setCwValueDate(Time cwValueDate) {
        this.cwValueDate = cwValueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClwerteEntity that = (ClwerteEntity) o;

        if (cwId != that.cwId) return false;
        if (cwAsId != that.cwAsId) return false;
        if (cwAlId != that.cwAlId) return false;
        if (cwValue != null ? !cwValue.equals(that.cwValue) : that.cwValue != null) return false;
        if (cwUsercreated != null ? !cwUsercreated.equals(that.cwUsercreated) : that.cwUsercreated != null)
            return false;
        if (cwDatecreated != null ? !cwDatecreated.equals(that.cwDatecreated) : that.cwDatecreated != null)
            return false;
        if (cwUserchanged != null ? !cwUserchanged.equals(that.cwUserchanged) : that.cwUserchanged != null)
            return false;
        if (cwDatechanged != null ? !cwDatechanged.equals(that.cwDatechanged) : that.cwDatechanged != null)
            return false;
        if (cwLfdNr != null ? !cwLfdNr.equals(that.cwLfdNr) : that.cwLfdNr != null) return false;
        if (cwValueClob != null ? !cwValueClob.equals(that.cwValueClob) : that.cwValueClob != null) return false;
        if (cwValueDate != null ? !cwValueDate.equals(that.cwValueDate) : that.cwValueDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cwId ^ (cwId >>> 32));
        result = 31 * result + (int) (cwAsId ^ (cwAsId >>> 32));
        result = 31 * result + (int) (cwAlId ^ (cwAlId >>> 32));
        result = 31 * result + (cwValue != null ? cwValue.hashCode() : 0);
        result = 31 * result + (cwUsercreated != null ? cwUsercreated.hashCode() : 0);
        result = 31 * result + (cwDatecreated != null ? cwDatecreated.hashCode() : 0);
        result = 31 * result + (cwUserchanged != null ? cwUserchanged.hashCode() : 0);
        result = 31 * result + (cwDatechanged != null ? cwDatechanged.hashCode() : 0);
        result = 31 * result + (cwLfdNr != null ? cwLfdNr.hashCode() : 0);
        result = 31 * result + (cwValueClob != null ? cwValueClob.hashCode() : 0);
        result = 31 * result + (cwValueDate != null ? cwValueDate.hashCode() : 0);
        return result;
    }
}
