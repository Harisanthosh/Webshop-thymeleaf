package de.rhaudi.transfactrestserver.entities.chargen;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CHARGEN", schema = "TFWEB", catalog = "")
public class ChargenEntity {
    private long chId;
    private long chFbId;
    private long chStueckzahl;
    private Timestamp chStartdate;
    private Long chXFaktor;
    private Long chPpIdLosstatus;
    private String chKommentar;
    private String chUsercreated;
    private Timestamp chDatecreated;
    private String chUserchanged;
    private Timestamp chDatechanged;
    private boolean chMultiAs;
    private String chNr;
    private Long chLfdNr;
    private boolean chBulkTracking;
    private Long chScrapCount;
    private boolean chMarked;
    private Timestamp chCurrentDate;
    private Time chDateBt;
    private ChargenEntity chargenByChChId;
    private ChargenEntity chargenByChChIdVerknuepfung;
    private ChargenEntity chargenByChChIdVerknuepfung2;

    @Id
    @Column(name = "CH_ID", nullable = false, precision = 0)
    public long getChId() {
        return chId;
    }

    public void setChId(long chId) {
        this.chId = chId;
    }

    @Basic
    @Column(name = "CH_FB_ID", nullable = false, precision = 0)
    public long getChFbId() {
        return chFbId;
    }

    public void setChFbId(long chFbId) {
        this.chFbId = chFbId;
    }

    @Basic
    @Column(name = "CH_STUECKZAHL", nullable = false, precision = 0)
    public long getChStueckzahl() {
        return chStueckzahl;
    }

    public void setChStueckzahl(long chStueckzahl) {
        this.chStueckzahl = chStueckzahl;
    }

    @Basic
    @Column(name = "CH_STARTDATE", nullable = true)
    public Timestamp getChStartdate() {
        return chStartdate;
    }

    public void setChStartdate(Timestamp chStartdate) {
        this.chStartdate = chStartdate;
    }

    @Basic
    @Column(name = "CH_X_FAKTOR", nullable = true, precision = 0)
    public Long getChXFaktor() {
        return chXFaktor;
    }

    public void setChXFaktor(Long chXFaktor) {
        this.chXFaktor = chXFaktor;
    }

    @Basic
    @Column(name = "CH_PP_ID_LOSSTATUS", nullable = true, precision = 0)
    public Long getChPpIdLosstatus() {
        return chPpIdLosstatus;
    }

    public void setChPpIdLosstatus(Long chPpIdLosstatus) {
        this.chPpIdLosstatus = chPpIdLosstatus;
    }

    @Basic
    @Column(name = "CH_KOMMENTAR", nullable = true, length = 4000)
    public String getChKommentar() {
        return chKommentar;
    }

    public void setChKommentar(String chKommentar) {
        this.chKommentar = chKommentar;
    }

    @Basic
    @Column(name = "CH_USERCREATED", nullable = false, length = 255)
    public String getChUsercreated() {
        return chUsercreated;
    }

    public void setChUsercreated(String chUsercreated) {
        this.chUsercreated = chUsercreated;
    }

    @Basic
    @Column(name = "CH_DATECREATED", nullable = false)
    public Timestamp getChDatecreated() {
        return chDatecreated;
    }

    public void setChDatecreated(Timestamp chDatecreated) {
        this.chDatecreated = chDatecreated;
    }

    @Basic
    @Column(name = "CH_USERCHANGED", nullable = true, length = 255)
    public String getChUserchanged() {
        return chUserchanged;
    }

    public void setChUserchanged(String chUserchanged) {
        this.chUserchanged = chUserchanged;
    }

    @Basic
    @Column(name = "CH_DATECHANGED", nullable = true)
    public Timestamp getChDatechanged() {
        return chDatechanged;
    }

    public void setChDatechanged(Timestamp chDatechanged) {
        this.chDatechanged = chDatechanged;
    }

    @Basic
    @Column(name = "CH_MULTI_AS", nullable = false, precision = 0)
    public boolean isChMultiAs() {
        return chMultiAs;
    }

    public void setChMultiAs(boolean chMultiAs) {
        this.chMultiAs = chMultiAs;
    }

    @Basic
    @Column(name = "CH_NR", nullable = true, length = 255)
    public String getChNr() {
        return chNr;
    }

    public void setChNr(String chNr) {
        this.chNr = chNr;
    }

    @Basic
    @Column(name = "CH_LFD_NR", nullable = true, precision = 0)
    public Long getChLfdNr() {
        return chLfdNr;
    }

    public void setChLfdNr(Long chLfdNr) {
        this.chLfdNr = chLfdNr;
    }

    @Basic
    @Column(name = "CH_BULK_TRACKING", nullable = false, precision = 0)
    public boolean isChBulkTracking() {
        return chBulkTracking;
    }

    public void setChBulkTracking(boolean chBulkTracking) {
        this.chBulkTracking = chBulkTracking;
    }

    @Basic
    @Column(name = "CH_SCRAP_COUNT", nullable = true, precision = 0)
    public Long getChScrapCount() {
        return chScrapCount;
    }

    public void setChScrapCount(Long chScrapCount) {
        this.chScrapCount = chScrapCount;
    }

    @Basic
    @Column(name = "CH_MARKED", nullable = false, precision = 0)
    public boolean isChMarked() {
        return chMarked;
    }

    public void setChMarked(boolean chMarked) {
        this.chMarked = chMarked;
    }

    @Basic
    @Column(name = "CH_CURRENT_DATE", nullable = false)
    public Timestamp getChCurrentDate() {
        return chCurrentDate;
    }

    public void setChCurrentDate(Timestamp chCurrentDate) {
        this.chCurrentDate = chCurrentDate;
    }

    @Basic
    @Column(name = "CH_DATE_BT", nullable = true)
    public Time getChDateBt() {
        return chDateBt;
    }

    public void setChDateBt(Time chDateBt) {
        this.chDateBt = chDateBt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargenEntity that = (ChargenEntity) o;
        return chId == that.chId &&
                chFbId == that.chFbId &&
                chStueckzahl == that.chStueckzahl &&
                chMultiAs == that.chMultiAs &&
                chBulkTracking == that.chBulkTracking &&
                chMarked == that.chMarked &&
                Objects.equals(chStartdate, that.chStartdate) &&
                Objects.equals(chXFaktor, that.chXFaktor) &&
                Objects.equals(chPpIdLosstatus, that.chPpIdLosstatus) &&
                Objects.equals(chKommentar, that.chKommentar) &&
                Objects.equals(chUsercreated, that.chUsercreated) &&
                Objects.equals(chDatecreated, that.chDatecreated) &&
                Objects.equals(chUserchanged, that.chUserchanged) &&
                Objects.equals(chDatechanged, that.chDatechanged) &&
                Objects.equals(chNr, that.chNr) &&
                Objects.equals(chLfdNr, that.chLfdNr) &&
                Objects.equals(chScrapCount, that.chScrapCount) &&
                Objects.equals(chCurrentDate, that.chCurrentDate) &&
                Objects.equals(chDateBt, that.chDateBt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(chId, chFbId, chStueckzahl, chStartdate, chXFaktor, chPpIdLosstatus, chKommentar, chUsercreated, chDatecreated, chUserchanged, chDatechanged, chMultiAs, chNr, chLfdNr, chBulkTracking, chScrapCount, chMarked, chCurrentDate, chDateBt);
    }

    @ManyToOne
    @JoinColumn(name = "CH_CH_ID", referencedColumnName = "CH_ID")
    public ChargenEntity getChargenByChChId() {
        return chargenByChChId;
    }

    public void setChargenByChChId(ChargenEntity chargenByChChId) {
        this.chargenByChChId = chargenByChChId;
    }

    @ManyToOne
    @JoinColumn(name = "CH_CH_ID_VERKNUEPFUNG", referencedColumnName = "CH_ID")
    public ChargenEntity getChargenByChChIdVerknuepfung() {
        return chargenByChChIdVerknuepfung;
    }

    public void setChargenByChChIdVerknuepfung(ChargenEntity chargenByChChIdVerknuepfung) {
        this.chargenByChChIdVerknuepfung = chargenByChChIdVerknuepfung;
    }

    @ManyToOne
    @JoinColumn(name = "CH_CH_ID_VERKNUEPFUNG2", referencedColumnName = "CH_ID")
    public ChargenEntity getChargenByChChIdVerknuepfung2() {
        return chargenByChChIdVerknuepfung2;
    }

    public void setChargenByChChIdVerknuepfung2(ChargenEntity chargenByChChIdVerknuepfung2) {
        this.chargenByChChIdVerknuepfung2 = chargenByChChIdVerknuepfung2;
    }
}
