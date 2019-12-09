package de.rhaudi.transfactrestserver.entities.vwcheckliste;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "VW_CHECKLISTE", schema = "TFWEB", catalog = "")
public class VwChecklisteEntity {
    private String cwTyp;
    private Boolean alIsMandatory;
    private Long alIsBoolean;
    private Integer alPosition;
    private String cwCwValue;
    private Long cwCwId;
    private Long cwEditErlaubt;
    private Integer alId;
    private String cwPpName;
    private String alAnweisung;
    private String cwAuto;
    private Integer asId;
    private String cwUsercreated;
    private Time cwDatecreated;
    private String lastUserchanged;
    private Time lastDatechanged;
    private String cwCwValueClob;
    private String cwStyleName;
    private String cwStyle;
    private String cwGruppe;

    @Basic
    @Column(name = "CW_TYP", nullable = true, length = 4000)
    public String getCwTyp() {
        return cwTyp;
    }

    public void setCwTyp(String cwTyp) {
        this.cwTyp = cwTyp;
    }

    @Basic
    @Column(name = "AL_IS_MANDATORY", nullable = true, precision = 0)
    public Boolean getAlIsMandatory() {
        return alIsMandatory;
    }

    public void setAlIsMandatory(Boolean alIsMandatory) {
        this.alIsMandatory = alIsMandatory;
    }

    @Basic
    @Column(name = "AL_IS_BOOLEAN", nullable = true, precision = 0)
    public Long getAlIsBoolean() {
        return alIsBoolean;
    }

    public void setAlIsBoolean(Long alIsBoolean) {
        this.alIsBoolean = alIsBoolean;
    }

    @Basic
    @Column(name = "AL_POSITION", nullable = true, precision = 0)
    public Integer getAlPosition() {
        return alPosition;
    }

    public void setAlPosition(Integer alPosition) {
        this.alPosition = alPosition;
    }

    @Basic
    @Column(name = "CW_CW_VALUE", nullable = true, length = 4000)
    public String getCwCwValue() {
        return cwCwValue;
    }

    public void setCwCwValue(String cwCwValue) {
        this.cwCwValue = cwCwValue;
    }

    @Id
    @Column(name = "CW_CW_ID", nullable = true, precision = 0)
    public Long getCwCwId() {
        return cwCwId;
    }

    public void setCwCwId(Long cwCwId) {
        this.cwCwId = cwCwId;
    }

    @Basic
    @Column(name = "CW_EDIT_ERLAUBT", nullable = true, precision = 0)
    public Long getCwEditErlaubt() {
        return cwEditErlaubt;
    }

    public void setCwEditErlaubt(Long cwEditErlaubt) {
        this.cwEditErlaubt = cwEditErlaubt;
    }

    @Basic
    @Column(name = "AL_ID", nullable = true, precision = 0)
    public Integer getAlId() {
        return alId;
    }

    public void setAlId(Integer alId) {
        this.alId = alId;
    }

    @Basic
    @Column(name = "CW_PP_NAME", nullable = true, length = 255)
    public String getCwPpName() {
        return cwPpName;
    }

    public void setCwPpName(String cwPpName) {
        this.cwPpName = cwPpName;
    }

    @Basic
    @Column(name = "AL_ANWEISUNG", nullable = true, length = 4000)
    public String getAlAnweisung() {
        return alAnweisung;
    }

    public void setAlAnweisung(String alAnweisung) {
        this.alAnweisung = alAnweisung;
    }

    @Basic
    @Column(name = "CW_AUTO", nullable = true, length = 255)
    public String getCwAuto() {
        return cwAuto;
    }

    public void setCwAuto(String cwAuto) {
        this.cwAuto = cwAuto;
    }

    @Basic
    @Column(name = "AS_ID", nullable = true, precision = 0)
    public Integer getAsId() {
        return asId;
    }

    public void setAsId(Integer asId) {
        this.asId = asId;
    }

    @Basic
    @Column(name = "CW_USERCREATED", nullable = true, length = 255)
    public String getCwUsercreated() {
        return cwUsercreated;
    }

    public void setCwUsercreated(String cwUsercreated) {
        this.cwUsercreated = cwUsercreated;
    }

    @Basic
    @Column(name = "CW_DATECREATED", nullable = true)
    public Time getCwDatecreated() {
        return cwDatecreated;
    }

    public void setCwDatecreated(Time cwDatecreated) {
        this.cwDatecreated = cwDatecreated;
    }

    @Basic
    @Column(name = "LAST_USERCHANGED", nullable = true, length = 255)
    public String getLastUserchanged() {
        return lastUserchanged;
    }

    public void setLastUserchanged(String lastUserchanged) {
        this.lastUserchanged = lastUserchanged;
    }

    @Basic
    @Column(name = "LAST_DATECHANGED", nullable = true)
    public Time getLastDatechanged() {
        return lastDatechanged;
    }

    public void setLastDatechanged(Time lastDatechanged) {
        this.lastDatechanged = lastDatechanged;
    }

    @Basic
    @Column(name = "CW_CW_VALUE_CLOB", nullable = true)
    public String getCwCwValueClob() {
        return cwCwValueClob;
    }

    public void setCwCwValueClob(String cwCwValueClob) {
        this.cwCwValueClob = cwCwValueClob;
    }

    @Basic
    @Column(name = "CW_STYLE_NAME", nullable = true, length = 255)
    public String getCwStyleName() {
        return cwStyleName;
    }

    public void setCwStyleName(String cwStyleName) {
        this.cwStyleName = cwStyleName;
    }

    @Basic
    @Column(name = "CW_STYLE", nullable = true, length = 255)
    public String getCwStyle() {
        return cwStyle;
    }

    public void setCwStyle(String cwStyle) {
        this.cwStyle = cwStyle;
    }

    @Basic
    @Column(name = "CW_GRUPPE", nullable = true, length = 255)
    public String getCwGruppe() {
        return cwGruppe;
    }

    public void setCwGruppe(String cwGruppe) {
        this.cwGruppe = cwGruppe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VwChecklisteEntity that = (VwChecklisteEntity) o;
        return Objects.equals(cwTyp, that.cwTyp) &&
                Objects.equals(alIsMandatory, that.alIsMandatory) &&
                Objects.equals(alIsBoolean, that.alIsBoolean) &&
                Objects.equals(alPosition, that.alPosition) &&
                Objects.equals(cwCwValue, that.cwCwValue) &&
                Objects.equals(cwCwId, that.cwCwId) &&
                Objects.equals(cwEditErlaubt, that.cwEditErlaubt) &&
                Objects.equals(alId, that.alId) &&
                Objects.equals(cwPpName, that.cwPpName) &&
                Objects.equals(alAnweisung, that.alAnweisung) &&
                Objects.equals(cwAuto, that.cwAuto) &&
                Objects.equals(asId, that.asId) &&
                Objects.equals(cwUsercreated, that.cwUsercreated) &&
                Objects.equals(cwDatecreated, that.cwDatecreated) &&
                Objects.equals(lastUserchanged, that.lastUserchanged) &&
                Objects.equals(lastDatechanged, that.lastDatechanged) &&
                Objects.equals(cwCwValueClob, that.cwCwValueClob) &&
                Objects.equals(cwStyleName, that.cwStyleName) &&
                Objects.equals(cwStyle, that.cwStyle) &&
                Objects.equals(cwGruppe, that.cwGruppe);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cwTyp, alIsMandatory, alIsBoolean, alPosition, cwCwValue, cwCwId, cwEditErlaubt, alId, cwPpName, alAnweisung, cwAuto, asId, cwUsercreated, cwDatecreated, lastUserchanged, lastDatechanged, cwCwValueClob, cwStyleName, cwStyle, cwGruppe);
    }
}
