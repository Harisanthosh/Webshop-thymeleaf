package de.rhaudi.transfactrestserver.entities.fabaum;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "FABAUM", schema = "TFWEB", catalog = "")
public class FabaumEntity {
    private long fbId;
    private Time fbEinsteuerdat;
    private long fbLevel;
    private Long fbXFaktor;
    private Long fbXFaktorBer;
    private long fbStueckzahl;
    private Long fbStueckzahlEingesteuert;
    private Long fbOptLosgroesse;
    private long fbMenge;
    private long fbTimeGesamt;
    private long fbTimeIntern;
    private long fbTimeExtern;
    private Long fbAbsTime;
    private Time fbDateBt;
    private String fbUsercreated;
    private Time fbDatecreated;
    private String fbUserchanged;
    private Time fbDatechanged;
    private boolean fbVisible;
    private String fbKommentar;
    private boolean fbFertigungssteuerung;
    private boolean fbVisibleFa;
    private Boolean fbDepFlag;
    private long fbArtId;

    @Id
    @Column(name = "FB_ID", nullable = false, precision = 0)
    public long getFbId() {
        return fbId;
    }

    public void setFbId(long fbId) {
        this.fbId = fbId;
    }

    @Basic
    @Column(name = "FB_EINSTEUERDAT", nullable = true)
    public Time getFbEinsteuerdat() {
        return fbEinsteuerdat;
    }

    public void setFbEinsteuerdat(Time fbEinsteuerdat) {
        this.fbEinsteuerdat = fbEinsteuerdat;
    }

    @Basic
    @Column(name = "FB_LEVEL", nullable = false, precision = 0)
    public long getFbLevel() {
        return fbLevel;
    }

    public void setFbLevel(long fbLevel) {
        this.fbLevel = fbLevel;
    }

    @Basic
    @Column(name = "FB_X_FAKTOR", nullable = true, precision = 0)
    public Long getFbXFaktor() {
        return fbXFaktor;
    }

    public void setFbXFaktor(Long fbXFaktor) {
        this.fbXFaktor = fbXFaktor;
    }

    @Basic
    @Column(name = "FB_X_FAKTOR_BER", nullable = true, precision = 0)
    public Long getFbXFaktorBer() {
        return fbXFaktorBer;
    }

    public void setFbXFaktorBer(Long fbXFaktorBer) {
        this.fbXFaktorBer = fbXFaktorBer;
    }

    @Basic
    @Column(name = "FB_STUECKZAHL", nullable = false, precision = 0)
    public long getFbStueckzahl() {
        return fbStueckzahl;
    }

    public void setFbStueckzahl(long fbStueckzahl) {
        this.fbStueckzahl = fbStueckzahl;
    }

    @Basic
    @Column(name = "FB_STUECKZAHL_EINGESTEUERT", nullable = true, precision = 0)
    public Long getFbStueckzahlEingesteuert() {
        return fbStueckzahlEingesteuert;
    }

    public void setFbStueckzahlEingesteuert(Long fbStueckzahlEingesteuert) {
        this.fbStueckzahlEingesteuert = fbStueckzahlEingesteuert;
    }

    @Basic
    @Column(name = "FB_OPT_LOSGROESSE", nullable = true, precision = 0)
    public Long getFbOptLosgroesse() {
        return fbOptLosgroesse;
    }

    public void setFbOptLosgroesse(Long fbOptLosgroesse) {
        this.fbOptLosgroesse = fbOptLosgroesse;
    }

    @Basic
    @Column(name = "FB_MENGE", nullable = false, precision = 0)
    public long getFbMenge() {
        return fbMenge;
    }

    public void setFbMenge(long fbMenge) {
        this.fbMenge = fbMenge;
    }

    @Basic
    @Column(name = "FB_TIME_GESAMT", nullable = false, precision = 0)
    public long getFbTimeGesamt() {
        return fbTimeGesamt;
    }

    public void setFbTimeGesamt(long fbTimeGesamt) {
        this.fbTimeGesamt = fbTimeGesamt;
    }

    @Basic
    @Column(name = "FB_TIME_INTERN", nullable = false, precision = 0)
    public long getFbTimeIntern() {
        return fbTimeIntern;
    }

    public void setFbTimeIntern(long fbTimeIntern) {
        this.fbTimeIntern = fbTimeIntern;
    }

    @Basic
    @Column(name = "FB_TIME_EXTERN", nullable = false, precision = 0)
    public long getFbTimeExtern() {
        return fbTimeExtern;
    }

    public void setFbTimeExtern(long fbTimeExtern) {
        this.fbTimeExtern = fbTimeExtern;
    }

    @Basic
    @Column(name = "FB_ABS_TIME", nullable = true, precision = 0)
    public Long getFbAbsTime() {
        return fbAbsTime;
    }

    public void setFbAbsTime(Long fbAbsTime) {
        this.fbAbsTime = fbAbsTime;
    }

    @Basic
    @Column(name = "FB_DATE_BT", nullable = true)
    public Time getFbDateBt() {
        return fbDateBt;
    }

    public void setFbDateBt(Time fbDateBt) {
        this.fbDateBt = fbDateBt;
    }

    @Basic
    @Column(name = "FB_USERCREATED", nullable = true, length = 255)
    public String getFbUsercreated() {
        return fbUsercreated;
    }

    public void setFbUsercreated(String fbUsercreated) {
        this.fbUsercreated = fbUsercreated;
    }

    @Basic
    @Column(name = "FB_DATECREATED", nullable = true)
    public Time getFbDatecreated() {
        return fbDatecreated;
    }

    public void setFbDatecreated(Time fbDatecreated) {
        this.fbDatecreated = fbDatecreated;
    }

    @Basic
    @Column(name = "FB_USERCHANGED", nullable = true, length = 255)
    public String getFbUserchanged() {
        return fbUserchanged;
    }

    public void setFbUserchanged(String fbUserchanged) {
        this.fbUserchanged = fbUserchanged;
    }

    @Basic
    @Column(name = "FB_DATECHANGED", nullable = true)
    public Time getFbDatechanged() {
        return fbDatechanged;
    }

    public void setFbDatechanged(Time fbDatechanged) {
        this.fbDatechanged = fbDatechanged;
    }

    @Basic
    @Column(name = "FB_VISIBLE", nullable = false, precision = 0)
    public boolean isFbVisible() {
        return fbVisible;
    }

    public void setFbVisible(boolean fbVisible) {
        this.fbVisible = fbVisible;
    }

    @Basic
    @Column(name = "FB_KOMMENTAR", nullable = true, length = 4000)
    public String getFbKommentar() {
        return fbKommentar;
    }

    public void setFbKommentar(String fbKommentar) {
        this.fbKommentar = fbKommentar;
    }

    @Basic
    @Column(name = "FB_FERTIGUNGSSTEUERUNG", nullable = false, precision = 0)
    public boolean isFbFertigungssteuerung() {
        return fbFertigungssteuerung;
    }

    public void setFbFertigungssteuerung(boolean fbFertigungssteuerung) {
        this.fbFertigungssteuerung = fbFertigungssteuerung;
    }

    @Basic
    @Column(name = "FB_VISIBLE_FA", nullable = false, precision = 0)
    public boolean isFbVisibleFa() {
        return fbVisibleFa;
    }

    public void setFbVisibleFa(boolean fbVisibleFa) {
        this.fbVisibleFa = fbVisibleFa;
    }

    @Basic
    @Column(name = "FB_DEP_FLAG", nullable = true, precision = 0)
    public Boolean getFbDepFlag() {
        return fbDepFlag;
    }

    public void setFbDepFlag(Boolean fbDepFlag) {
        this.fbDepFlag = fbDepFlag;
    }

    @Basic
    @Column(name = "FB_ART_ID", nullable = false, precision = 0)
    public long getFbArtId() {
        return fbArtId;
    }

    public void setFbArtId(long fbArtId) {
        this.fbArtId = fbArtId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FabaumEntity that = (FabaumEntity) o;
        return fbId == that.fbId &&
                fbLevel == that.fbLevel &&
                fbStueckzahl == that.fbStueckzahl &&
                fbMenge == that.fbMenge &&
                fbTimeGesamt == that.fbTimeGesamt &&
                fbTimeIntern == that.fbTimeIntern &&
                fbTimeExtern == that.fbTimeExtern &&
                fbVisible == that.fbVisible &&
                fbFertigungssteuerung == that.fbFertigungssteuerung &&
                fbVisibleFa == that.fbVisibleFa &&
                fbArtId == that.fbArtId &&
                Objects.equals(fbEinsteuerdat, that.fbEinsteuerdat) &&
                Objects.equals(fbXFaktor, that.fbXFaktor) &&
                Objects.equals(fbXFaktorBer, that.fbXFaktorBer) &&
                Objects.equals(fbStueckzahlEingesteuert, that.fbStueckzahlEingesteuert) &&
                Objects.equals(fbOptLosgroesse, that.fbOptLosgroesse) &&
                Objects.equals(fbAbsTime, that.fbAbsTime) &&
                Objects.equals(fbDateBt, that.fbDateBt) &&
                Objects.equals(fbUsercreated, that.fbUsercreated) &&
                Objects.equals(fbDatecreated, that.fbDatecreated) &&
                Objects.equals(fbUserchanged, that.fbUserchanged) &&
                Objects.equals(fbDatechanged, that.fbDatechanged) &&
                Objects.equals(fbKommentar, that.fbKommentar) &&
                Objects.equals(fbDepFlag, that.fbDepFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fbId, fbEinsteuerdat, fbLevel, fbXFaktor, fbXFaktorBer, fbStueckzahl, fbStueckzahlEingesteuert, fbOptLosgroesse, fbMenge, fbTimeGesamt, fbTimeIntern, fbTimeExtern, fbAbsTime, fbDateBt, fbUsercreated, fbDatecreated, fbUserchanged, fbDatechanged, fbVisible, fbKommentar, fbFertigungssteuerung, fbVisibleFa, fbDepFlag, fbArtId);
    }


}
