package de.rhaudi.transfactrestserver.entities.ascheckliste;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "ASCHECKLISTE", schema = "TFWEB", catalog = "")
public class AschecklisteEntity {
    private long alId;
    private Long alAfoId;
    private long alPpIdCltyp;
    private int alPosition;
    private boolean alIsBoolean;
    private boolean alIsMandatory;
    private String alUsercreated;
    private Time alDatecreated;
    private String alUserchanged;
    private Time alDatechanged;
    private String alAnweisung;
    private boolean alUserspecific;

    @Id
    @Column(name = "AL_ID")
    public long getAlId() {
        return alId;
    }

    public void setAlId(long alId) {
        this.alId = alId;
    }

    @Basic
    @Column(name = "AL_AFO_ID")
    public Long getAlAfoId() {
        return alAfoId;
    }

    public void setAlAfoId(Long alAfoId) {
        this.alAfoId = alAfoId;
    }

    @Basic
    @Column(name = "AL_PP_ID_CLTYP")
    public long getAlPpIdCltyp() {
        return alPpIdCltyp;
    }

    public void setAlPpIdCltyp(long alPpIdCltyp) {
        this.alPpIdCltyp = alPpIdCltyp;
    }

    @Basic
    @Column(name = "AL_POSITION")
    public int getAlPosition() {
        return alPosition;
    }

    public void setAlPosition(int alPosition) {
        this.alPosition = alPosition;
    }

    @Basic
    @Column(name = "AL_IS_BOOLEAN")
    public boolean isAlIsBoolean() {
        return alIsBoolean;
    }

    public void setAlIsBoolean(boolean alIsBoolean) {
        this.alIsBoolean = alIsBoolean;
    }

    @Basic
    @Column(name = "AL_IS_MANDATORY")
    public boolean isAlIsMandatory() {
        return alIsMandatory;
    }

    public void setAlIsMandatory(boolean alIsMandatory) {
        this.alIsMandatory = alIsMandatory;
    }

    @Basic
    @Column(name = "AL_USERCREATED")
    public String getAlUsercreated() {
        return alUsercreated;
    }

    public void setAlUsercreated(String alUsercreated) {
        this.alUsercreated = alUsercreated;
    }

    @Basic
    @Column(name = "AL_DATECREATED")
    public Time getAlDatecreated() {
        return alDatecreated;
    }

    public void setAlDatecreated(Time alDatecreated) {
        this.alDatecreated = alDatecreated;
    }

    @Basic
    @Column(name = "AL_USERCHANGED")
    public String getAlUserchanged() {
        return alUserchanged;
    }

    public void setAlUserchanged(String alUserchanged) {
        this.alUserchanged = alUserchanged;
    }

    @Basic
    @Column(name = "AL_DATECHANGED")
    public Time getAlDatechanged() {
        return alDatechanged;
    }

    public void setAlDatechanged(Time alDatechanged) {
        this.alDatechanged = alDatechanged;
    }

    @Basic
    @Column(name = "AL_ANWEISUNG")
    public String getAlAnweisung() {
        return alAnweisung;
    }

    public void setAlAnweisung(String alAnweisung) {
        this.alAnweisung = alAnweisung;
    }

    @Basic
    @Column(name = "AL_USERSPECIFIC")
    public boolean isAlUserspecific() {
        return alUserspecific;
    }

    public void setAlUserspecific(boolean alUserspecific) {
        this.alUserspecific = alUserspecific;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AschecklisteEntity that = (AschecklisteEntity) o;

        if (alId != that.alId) return false;
        if (alPpIdCltyp != that.alPpIdCltyp) return false;
        if (alPosition != that.alPosition) return false;
        if (alIsBoolean != that.alIsBoolean) return false;
        if (alIsMandatory != that.alIsMandatory) return false;
        if (alUserspecific != that.alUserspecific) return false;
        if (alAfoId != null ? !alAfoId.equals(that.alAfoId) : that.alAfoId != null) return false;
        if (alUsercreated != null ? !alUsercreated.equals(that.alUsercreated) : that.alUsercreated != null)
            return false;
        if (alDatecreated != null ? !alDatecreated.equals(that.alDatecreated) : that.alDatecreated != null)
            return false;
        if (alUserchanged != null ? !alUserchanged.equals(that.alUserchanged) : that.alUserchanged != null)
            return false;
        if (alDatechanged != null ? !alDatechanged.equals(that.alDatechanged) : that.alDatechanged != null)
            return false;
        if (alAnweisung != null ? !alAnweisung.equals(that.alAnweisung) : that.alAnweisung != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (alId ^ (alId >>> 32));
        result = 31 * result + (alAfoId != null ? alAfoId.hashCode() : 0);
        result = 31 * result + (int) (alPpIdCltyp ^ (alPpIdCltyp >>> 32));
        result = 31 * result + alPosition;
        result = 31 * result + (alIsBoolean ? 1 : 0);
        result = 31 * result + (alIsMandatory ? 1 : 0);
        result = 31 * result + (alUsercreated != null ? alUsercreated.hashCode() : 0);
        result = 31 * result + (alDatecreated != null ? alDatecreated.hashCode() : 0);
        result = 31 * result + (alUserchanged != null ? alUserchanged.hashCode() : 0);
        result = 31 * result + (alDatechanged != null ? alDatechanged.hashCode() : 0);
        result = 31 * result + (alAnweisung != null ? alAnweisung.hashCode() : 0);
        result = 31 * result + (alUserspecific ? 1 : 0);
        return result;
    }
}
