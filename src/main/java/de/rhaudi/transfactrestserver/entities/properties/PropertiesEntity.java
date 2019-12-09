package de.rhaudi.transfactrestserver.entities.properties;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PROPERTIES", schema = "TFWEB", catalog = "")
public class PropertiesEntity {
    private long ppId;
    private String ppName;
    private String ppValue;
    private int ppSort;
    private String ppKommentar;
    private String ppUsercreated;
    private Time ppDatecreated;
    private String ppUserchanged;
    private Time ppDatechanged;
    private String ppShortname;
    private boolean ppDefault;
    private String ppValue2;
    private String ppValue3;
    private String ppValue4;
    private boolean ppSelectable;
    private Time ppLastactiondate;
    private String ppValue5;
    private String ppLongtext;
    private String ppValue6;
    private Long ppValueNumber;
    private boolean ppFlag;
    private Long ppValueNumber2;
    private String ppValue7;
    private String ppValue8;
    private String ppValue9;
    private String ppValue10;
    private boolean ppFlag2;

    @Id
    @Column(name = "PP_ID", nullable = false, precision = 0)
    public long getPpId() {
        return ppId;
    }

    public void setPpId(long ppId) {
        this.ppId = ppId;
    }

    @Basic
    @Column(name = "PP_NAME", nullable = false, length = 255)
    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName;
    }

    @Basic
    @Column(name = "PP_VALUE", nullable = false, length = 4000)
    public String getPpValue() {
        return ppValue;
    }

    public void setPpValue(String ppValue) {
        this.ppValue = ppValue;
    }

    @Basic
    @Column(name = "PP_SORT", nullable = false, precision = 0)
    public int getPpSort() {
        return ppSort;
    }

    public void setPpSort(int ppSort) {
        this.ppSort = ppSort;
    }

    @Basic
    @Column(name = "PP_KOMMENTAR", nullable = true, length = 4000)
    public String getPpKommentar() {
        return ppKommentar;
    }

    public void setPpKommentar(String ppKommentar) {
        this.ppKommentar = ppKommentar;
    }

    @Basic
    @Column(name = "PP_USERCREATED", nullable = false, length = 255)
    public String getPpUsercreated() {
        return ppUsercreated;
    }

    public void setPpUsercreated(String ppUsercreated) {
        this.ppUsercreated = ppUsercreated;
    }

    @Basic
    @Column(name = "PP_DATECREATED", nullable = false)
    public Time getPpDatecreated() {
        return ppDatecreated;
    }

    public void setPpDatecreated(Time ppDatecreated) {
        this.ppDatecreated = ppDatecreated;
    }

    @Basic
    @Column(name = "PP_USERCHANGED", nullable = true, length = 255)
    public String getPpUserchanged() {
        return ppUserchanged;
    }

    public void setPpUserchanged(String ppUserchanged) {
        this.ppUserchanged = ppUserchanged;
    }

    @Basic
    @Column(name = "PP_DATECHANGED", nullable = true)
    public Time getPpDatechanged() {
        return ppDatechanged;
    }

    public void setPpDatechanged(Time ppDatechanged) {
        this.ppDatechanged = ppDatechanged;
    }

    @Basic
    @Column(name = "PP_SHORTNAME", nullable = true, length = 255)
    public String getPpShortname() {
        return ppShortname;
    }

    public void setPpShortname(String ppShortname) {
        this.ppShortname = ppShortname;
    }

    @Basic
    @Column(name = "PP_DEFAULT", nullable = false, precision = 0)
    public boolean isPpDefault() {
        return ppDefault;
    }

    public void setPpDefault(boolean ppDefault) {
        this.ppDefault = ppDefault;
    }

    @Basic
    @Column(name = "PP_VALUE2", nullable = true, length = 255)
    public String getPpValue2() {
        return ppValue2;
    }

    public void setPpValue2(String ppValue2) {
        this.ppValue2 = ppValue2;
    }

    @Basic
    @Column(name = "PP_VALUE3", nullable = true, length = 255)
    public String getPpValue3() {
        return ppValue3;
    }

    public void setPpValue3(String ppValue3) {
        this.ppValue3 = ppValue3;
    }

    @Basic
    @Column(name = "PP_VALUE4", nullable = true, length = 255)
    public String getPpValue4() {
        return ppValue4;
    }

    public void setPpValue4(String ppValue4) {
        this.ppValue4 = ppValue4;
    }

    @Basic
    @Column(name = "PP_SELECTABLE", nullable = false, precision = 0)
    public boolean isPpSelectable() {
        return ppSelectable;
    }

    public void setPpSelectable(boolean ppSelectable) {
        this.ppSelectable = ppSelectable;
    }

    @Basic
    @Column(name = "PP_LASTACTIONDATE", nullable = true)
    public Time getPpLastactiondate() {
        return ppLastactiondate;
    }

    public void setPpLastactiondate(Time ppLastactiondate) {
        this.ppLastactiondate = ppLastactiondate;
    }

    @Basic
    @Column(name = "PP_VALUE5", nullable = true, length = 255)
    public String getPpValue5() {
        return ppValue5;
    }

    public void setPpValue5(String ppValue5) {
        this.ppValue5 = ppValue5;
    }

    @Basic
    @Column(name = "PP_LONGTEXT", nullable = true, length = 4000)
    public String getPpLongtext() {
        return ppLongtext;
    }

    public void setPpLongtext(String ppLongtext) {
        this.ppLongtext = ppLongtext;
    }

    @Basic
    @Column(name = "PP_VALUE6", nullable = true, length = 255)
    public String getPpValue6() {
        return ppValue6;
    }

    public void setPpValue6(String ppValue6) {
        this.ppValue6 = ppValue6;
    }

    @Basic
    @Column(name = "PP_VALUE_NUMBER", nullable = true, precision = 0)
    public Long getPpValueNumber() {
        return ppValueNumber;
    }

    public void setPpValueNumber(Long ppValueNumber) {
        this.ppValueNumber = ppValueNumber;
    }

    @Basic
    @Column(name = "PP_FLAG", nullable = false, precision = 0)
    public boolean isPpFlag() {
        return ppFlag;
    }

    public void setPpFlag(boolean ppFlag) {
        this.ppFlag = ppFlag;
    }

    @Basic
    @Column(name = "PP_VALUE_NUMBER2", nullable = true, precision = 0)
    public Long getPpValueNumber2() {
        return ppValueNumber2;
    }

    public void setPpValueNumber2(Long ppValueNumber2) {
        this.ppValueNumber2 = ppValueNumber2;
    }

    @Basic
    @Column(name = "PP_VALUE7", nullable = true, length = 255)
    public String getPpValue7() {
        return ppValue7;
    }

    public void setPpValue7(String ppValue7) {
        this.ppValue7 = ppValue7;
    }

    @Basic
    @Column(name = "PP_VALUE8", nullable = true, length = 255)
    public String getPpValue8() {
        return ppValue8;
    }

    public void setPpValue8(String ppValue8) {
        this.ppValue8 = ppValue8;
    }

    @Basic
    @Column(name = "PP_VALUE9", nullable = true, length = 255)
    public String getPpValue9() {
        return ppValue9;
    }

    public void setPpValue9(String ppValue9) {
        this.ppValue9 = ppValue9;
    }

    @Basic
    @Column(name = "PP_VALUE10", nullable = true, length = 255)
    public String getPpValue10() {
        return ppValue10;
    }

    public void setPpValue10(String ppValue10) {
        this.ppValue10 = ppValue10;
    }

    @Basic
    @Column(name = "PP_FLAG2", nullable = false, precision = 0)
    public boolean isPpFlag2() {
        return ppFlag2;
    }

    public void setPpFlag2(boolean ppFlag2) {
        this.ppFlag2 = ppFlag2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertiesEntity that = (PropertiesEntity) o;
        return ppId == that.ppId &&
                ppSort == that.ppSort &&
                ppDefault == that.ppDefault &&
                ppSelectable == that.ppSelectable &&
                ppFlag == that.ppFlag &&
                ppFlag2 == that.ppFlag2 &&
                Objects.equals(ppName, that.ppName) &&
                Objects.equals(ppValue, that.ppValue) &&
                Objects.equals(ppKommentar, that.ppKommentar) &&
                Objects.equals(ppUsercreated, that.ppUsercreated) &&
                Objects.equals(ppDatecreated, that.ppDatecreated) &&
                Objects.equals(ppUserchanged, that.ppUserchanged) &&
                Objects.equals(ppDatechanged, that.ppDatechanged) &&
                Objects.equals(ppShortname, that.ppShortname) &&
                Objects.equals(ppValue2, that.ppValue2) &&
                Objects.equals(ppValue3, that.ppValue3) &&
                Objects.equals(ppValue4, that.ppValue4) &&
                Objects.equals(ppLastactiondate, that.ppLastactiondate) &&
                Objects.equals(ppValue5, that.ppValue5) &&
                Objects.equals(ppLongtext, that.ppLongtext) &&
                Objects.equals(ppValue6, that.ppValue6) &&
                Objects.equals(ppValueNumber, that.ppValueNumber) &&
                Objects.equals(ppValueNumber2, that.ppValueNumber2) &&
                Objects.equals(ppValue7, that.ppValue7) &&
                Objects.equals(ppValue8, that.ppValue8) &&
                Objects.equals(ppValue9, that.ppValue9) &&
                Objects.equals(ppValue10, that.ppValue10);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ppId, ppName, ppValue, ppSort, ppKommentar, ppUsercreated, ppDatecreated, ppUserchanged, ppDatechanged, ppShortname, ppDefault, ppValue2, ppValue3, ppValue4, ppSelectable, ppLastactiondate, ppValue5, ppLongtext, ppValue6, ppValueNumber, ppFlag, ppValueNumber2, ppValue7, ppValue8, ppValue9, ppValue10, ppFlag2);
    }


}
