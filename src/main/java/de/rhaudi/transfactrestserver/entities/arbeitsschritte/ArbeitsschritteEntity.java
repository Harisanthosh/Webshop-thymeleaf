package de.rhaudi.transfactrestserver.entities.arbeitsschritte;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ARBEITSSCHRITTE", schema = "TFWEB", catalog = "")
public class ArbeitsschritteEntity {
    private long asId;
    private long asPosition;
    private long asRuestzeit;
    private long asBearbeitungszeit;
    private Integer asStapelgroesse;
    private Timestamp asDatAnmeldung;
    private Timestamp asDatAbmeldung;
    private Timestamp asDatAnmeldungSoll;
    private Timestamp asDatAbmeldungSoll;
    private String asAnweisung;
    private boolean asAdminFlag;
    private boolean asGefertigt;
    private String asUsercreated;
    private Timestamp asDatecreated;
    private String asUserchanged;
    private Timestamp asDatechanged;
    private boolean asOberschritt;
    private long asBearbeitungszeitBn;
    private Long asAusschussValue;
    private String asAusschussKommentar;
    private boolean asExtern;
    private long asAnzahlMitarbeiter;
    private Long asChId;
    private boolean asAddon;
    private boolean asQuickAbmldg;
    private boolean asOnceARevision;
    private boolean asOnceAFa;
    private String asMainlabel;
    private Long asIntime;
    private Long asAnzSubs;
    private boolean asCurrentSection;
    private long asAddWaitingTime;
    private String asProgram;
    private boolean asIgnoreX;
    private boolean asAutoStop;
    private Timestamp asDatProg;
    private Timestamp asDatProgDatBer;
    private Integer asArtId;
    private Timestamp asDatAnmeldungSollFein;
    private Timestamp asDatAbmeldungSollFein;
    private boolean asBulkTracking;
    private long asBearbeitungszeitTme;
    private long asMinQtyDlz;
    private boolean asRetrograd;
    private boolean asDisableResPreselect;
    private Timestamp asDatManuellTermin;
    private Boolean asManuellTyp;
    private long asInput;
    private long asOutput;
    private long asPpIdAstyp;
    private Long asBnIdAnmeldung;
    private Long asBnIdAbmeldung;
    private Long asPpIdRessource;


    @Basic
    @Column(name = "AS_PP_ID_ASTYP", nullable = false, precision = 0)
    public long getAsPpIdAstyp() {
        return asPpIdAstyp;
    }

    public void setAsPpIdAstyp(long asPpIdRessourcePrio) {
        this.asPpIdAstyp = asPpIdRessourcePrio;
    }

    @Id
    @Column(name = "AS_ID", nullable = false, precision = 0)
    public long getAsId() {
        return asId;
    }

    public void setAsId(long asId) {
        this.asId = asId;
    }

    @Basic
    @Column(name = "AS_POSITION", nullable = false, precision = 0)
    public long getAsPosition() {
        return asPosition;
    }

    public void setAsPosition(long asPosition) {
        this.asPosition = asPosition;
    }

    @Basic
    @Column(name = "AS_RUESTZEIT", nullable = false, precision = 0)
    public long getAsRuestzeit() {
        return asRuestzeit;
    }

    public void setAsRuestzeit(long asRuestzeit) {
        this.asRuestzeit = asRuestzeit;
    }

    @Basic
    @Column(name = "AS_BEARBEITUNGSZEIT", nullable = false, precision = 0)
    public long getAsBearbeitungszeit() {
        return asBearbeitungszeit;
    }

    public void setAsBearbeitungszeit(long asBearbeitungszeit) {
        this.asBearbeitungszeit = asBearbeitungszeit;
    }

    @Basic
    @Column(name = "AS_STAPELGROESSE", nullable = true, precision = 0)
    public Integer getAsStapelgroesse() {
        return asStapelgroesse;
    }

    public void setAsStapelgroesse(Integer asStapelgroesse) {
        this.asStapelgroesse = asStapelgroesse;
    }


    @Basic
    @Column(name = "AS_DAT_ANMELDUNG", nullable = true)
    public Timestamp getAsDatAnmeldung() {
        return asDatAnmeldung;
    }

    public void setAsDatAnmeldung(Timestamp asDatAnmeldung) {
        this.asDatAnmeldung = asDatAnmeldung;
    }

    @Basic
    @Column(name = "AS_DAT_ABMELDUNG", nullable = true)
    public Timestamp getAsDatAbmeldung() {
        return asDatAbmeldung;
    }

    public void setAsDatAbmeldung(Timestamp asDatAbmeldung) {
        this.asDatAbmeldung = asDatAbmeldung;
    }

    @Basic
    @Column(name = "AS_DAT_ANMELDUNG_SOLL", nullable = true)
    public Timestamp getAsDatAnmeldungSoll() {
        return asDatAnmeldungSoll;
    }

    public void setAsDatAnmeldungSoll(Timestamp asDatAnmeldungSoll) {
        this.asDatAnmeldungSoll = asDatAnmeldungSoll;
    }

    @Basic
    @Column(name = "AS_DAT_ABMELDUNG_SOLL", nullable = true)
    public Timestamp getAsDatAbmeldungSoll() {
        return asDatAbmeldungSoll;
    }

    public void setAsDatAbmeldungSoll(Timestamp asDatAbmeldungSoll) {
        this.asDatAbmeldungSoll = asDatAbmeldungSoll;
    }

    @Basic
    @Column(name = "AS_ANWEISUNG", nullable = true, length = 4000)
    public String getAsAnweisung() {
        return asAnweisung;
    }

    public void setAsAnweisung(String asAnweisung) {
        this.asAnweisung = asAnweisung;
    }

    @Basic
    @Column(name = "AS_ADMIN_FLAG", nullable = false, precision = 0)
    public boolean isAsAdminFlag() {
        return asAdminFlag;
    }

    public void setAsAdminFlag(boolean asAdminFlag) {
        this.asAdminFlag = asAdminFlag;
    }

    @Basic
    @Column(name = "AS_GEFERTIGT", nullable = false, precision = 0)
    public boolean isAsGefertigt() {
        return asGefertigt;
    }

    public void setAsGefertigt(boolean asGefertigt) {
        this.asGefertigt = asGefertigt;
    }

    @Basic
    @Column(name = "AS_USERCREATED", nullable = false, length = 255)
    public String getAsUsercreated() {
        return asUsercreated;
    }

    public void setAsUsercreated(String asUsercreated) {
        this.asUsercreated = asUsercreated;
    }

    @Basic
    @Column(name = "AS_DATECREATED", nullable = false)
    public Timestamp getAsDatecreated() {
        return asDatecreated;
    }

    public void setAsDatecreated(Timestamp asDatecreated) {
        this.asDatecreated = asDatecreated;
    }

    @Basic
    @Column(name = "AS_USERCHANGED", nullable = true, length = 255)
    public String getAsUserchanged() {
        return asUserchanged;
    }

    public void setAsUserchanged(String asUserchanged) {
        this.asUserchanged = asUserchanged;
    }

    @Basic
    @Column(name = "AS_DATECHANGED", nullable = true)
    public Timestamp getAsDatechanged() {
        return asDatechanged;
    }

    public void setAsDatechanged(Timestamp asDatechanged) {
        this.asDatechanged = asDatechanged;
    }

    @Basic
    @Column(name = "AS_OBERSCHRITT", nullable = false, precision = 0)
    public boolean isAsOberschritt() {
        return asOberschritt;
    }

    public void setAsOberschritt(boolean asOberschritt) {
        this.asOberschritt = asOberschritt;
    }

    @Basic
    @Column(name = "AS_BEARBEITUNGSZEIT_BN", nullable = false, precision = 0)
    public long getAsBearbeitungszeitBn() {
        return asBearbeitungszeitBn;
    }

    public void setAsBearbeitungszeitBn(long asBearbeitungszeitBn) {
        this.asBearbeitungszeitBn = asBearbeitungszeitBn;
    }

    @Basic
    @Column(name = "AS_AUSSCHUSS_VALUE", nullable = true, precision = 0)
    public Long getAsAusschussValue() {
        return asAusschussValue;
    }

    public void setAsAusschussValue(Long asAusschussValue) {
        this.asAusschussValue = asAusschussValue;
    }

    @Basic
    @Column(name = "AS_AUSSCHUSS_KOMMENTAR", nullable = true, length = 4000)
    public String getAsAusschussKommentar() {
        return asAusschussKommentar;
    }

    public void setAsAusschussKommentar(String asAusschussKommentar) {
        this.asAusschussKommentar = asAusschussKommentar;
    }

    @Basic
    @Column(name = "AS_EXTERN", nullable = false, precision = 0)
    public boolean isAsExtern() {
        return asExtern;
    }

    public void setAsExtern(boolean asExtern) {
        this.asExtern = asExtern;
    }

    @Basic
    @Column(name = "AS_ANZAHL_MITARBEITER", nullable = false, precision = 0)
    public long getAsAnzahlMitarbeiter() {
        return asAnzahlMitarbeiter;
    }

    public void setAsAnzahlMitarbeiter(long asAnzahlMitarbeiter) {
        this.asAnzahlMitarbeiter = asAnzahlMitarbeiter;
    }

    @Basic
    @Column(name = "AS_CH_ID", nullable = true, precision = 0)
    public Long getAsChId() {
        return asChId;
    }

    public void setAsChId(Long asChId) {
        this.asChId = asChId;
    }

    @Basic
    @Column(name = "AS_ADDON", nullable = false, precision = 0)
    public boolean isAsAddon() {
        return asAddon;
    }

    public void setAsAddon(boolean asAddon) {
        this.asAddon = asAddon;
    }

    @Basic
    @Column(name = "AS_QUICK_ABMLDG", nullable = false, precision = 0)
    public boolean isAsQuickAbmldg() {
        return asQuickAbmldg;
    }

    public void setAsQuickAbmldg(boolean asQuickAbmldg) {
        this.asQuickAbmldg = asQuickAbmldg;
    }

    @Basic
    @Column(name = "AS_ONCE_A_REVISION", nullable = false, precision = 0)
    public boolean isAsOnceARevision() {
        return asOnceARevision;
    }

    public void setAsOnceARevision(boolean asOnceARevision) {
        this.asOnceARevision = asOnceARevision;
    }

    @Basic
    @Column(name = "AS_ONCE_A_FA", nullable = false, precision = 0)
    public boolean isAsOnceAFa() {
        return asOnceAFa;
    }

    public void setAsOnceAFa(boolean asOnceAFa) {
        this.asOnceAFa = asOnceAFa;
    }

    @Basic
    @Column(name = "AS_MAINLABEL", nullable = true, length = 255)
    public String getAsMainlabel() {
        return asMainlabel;
    }

    public void setAsMainlabel(String asMainlabel) {
        this.asMainlabel = asMainlabel;
    }

    @Basic
    @Column(name = "AS_INTIME", nullable = true, precision = 0)
    public Long getAsIntime() {
        return asIntime;
    }

    public void setAsIntime(Long asIntime) {
        this.asIntime = asIntime;
    }

    @Basic
    @Column(name = "AS_ANZ_SUBS", nullable = true, precision = 0)
    public Long getAsAnzSubs() {
        return asAnzSubs;
    }

    public void setAsAnzSubs(Long asAnzSubs) {
        this.asAnzSubs = asAnzSubs;
    }

    @Basic
    @Column(name = "AS_CURRENT_SECTION", nullable = false, precision = 0)
    public boolean isAsCurrentSection() {
        return asCurrentSection;
    }

    public void setAsCurrentSection(boolean asCurrentSection) {
        this.asCurrentSection = asCurrentSection;
    }

    @Basic
    @Column(name = "AS_ADD_WAITING_TIME", nullable = false, precision = 0)
    public long getAsAddWaitingTime() {
        return asAddWaitingTime;
    }

    public void setAsAddWaitingTime(long asAddWaitingTime) {
        this.asAddWaitingTime = asAddWaitingTime;
    }

    @Basic
    @Column(name = "AS_PROGRAM", nullable = true, length = 255)
    public String getAsProgram() {
        return asProgram;
    }

    public void setAsProgram(String asProgram) {
        this.asProgram = asProgram;
    }

    @Basic
    @Column(name = "AS_IGNORE_X", nullable = false, precision = 0)
    public boolean isAsIgnoreX() {
        return asIgnoreX;
    }

    public void setAsIgnoreX(boolean asIgnoreX) {
        this.asIgnoreX = asIgnoreX;
    }

    @Basic
    @Column(name = "AS_AUTO_STOP", nullable = false, precision = 0)
    public boolean isAsAutoStop() {
        return asAutoStop;
    }

    public void setAsAutoStop(boolean asAutoStop) {
        this.asAutoStop = asAutoStop;
    }

    @Basic
    @Column(name = "AS_DAT_PROG", nullable = true)
    public Timestamp getAsDatProg() {
        return asDatProg;
    }

    public void setAsDatProg(Timestamp asDatProg) {
        this.asDatProg = asDatProg;
    }

    @Basic
    @Column(name = "AS_DAT_PROG_DAT_BER", nullable = true)
    public Timestamp getAsDatProgDatBer() {
        return asDatProgDatBer;
    }

    public void setAsDatProgDatBer(Timestamp asDatProgDatBer) {
        this.asDatProgDatBer = asDatProgDatBer;
    }

    @Basic
    @Column(name = "AS_ART_ID", nullable = true, precision = 0)
    public Integer getAsArtId() {
        return asArtId;
    }

    public void setAsArtId(Integer asArtId) {
        this.asArtId = asArtId;
    }

    @Basic
    @Column(name = "AS_DAT_ANMELDUNG_SOLL_FEIN", nullable = true)
    public Timestamp getAsDatAnmeldungSollFein() {
        return asDatAnmeldungSollFein;
    }

    public void setAsDatAnmeldungSollFein(Timestamp asDatAnmeldungSollFein) {
        this.asDatAnmeldungSollFein = asDatAnmeldungSollFein;
    }

    @Basic
    @Column(name = "AS_DAT_ABMELDUNG_SOLL_FEIN", nullable = true)
    public Timestamp getAsDatAbmeldungSollFein() {
        return asDatAbmeldungSollFein;
    }

    public void setAsDatAbmeldungSollFein(Timestamp asDatAbmeldungSollFein) {
        this.asDatAbmeldungSollFein = asDatAbmeldungSollFein;
    }

    @Basic
    @Column(name = "AS_BULK_TRACKING", nullable = false, precision = 0)
    public boolean isAsBulkTracking() {
        return asBulkTracking;
    }

    public void setAsBulkTracking(boolean asBulkTracking) {
        this.asBulkTracking = asBulkTracking;
    }

    @Basic
    @Column(name = "AS_BEARBEITUNGSZEIT_TME", nullable = false, precision = 0)
    public long getAsBearbeitungszeitTme() {
        return asBearbeitungszeitTme;
    }

    public void setAsBearbeitungszeitTme(long asBearbeitungszeitTme) {
        this.asBearbeitungszeitTme = asBearbeitungszeitTme;
    }

    @Basic
    @Column(name = "AS_MIN_QTY_DLZ", nullable = false, precision = 0)
    public long getAsMinQtyDlz() {
        return asMinQtyDlz;
    }

    public void setAsMinQtyDlz(long asMinQtyDlz) {
        this.asMinQtyDlz = asMinQtyDlz;
    }

    @Basic
    @Column(name = "AS_RETROGRAD", nullable = false, precision = 0)
    public boolean isAsRetrograd() {
        return asRetrograd;
    }

    public void setAsRetrograd(boolean asRetrograd) {
        this.asRetrograd = asRetrograd;
    }

    @Basic
    @Column(name = "AS_DISABLE_RES_PRESELECT", nullable = false, precision = 0)
    public boolean isAsDisableResPreselect() {
        return asDisableResPreselect;
    }

    public void setAsDisableResPreselect(boolean asDisableResPreselect) {
        this.asDisableResPreselect = asDisableResPreselect;
    }


    @Basic
    @Column(name = "AS_PP_ID_RESSOURCE")
    public Long getAsPpIdRessource() {
        return asPpIdRessource;
    }

    public void setAsPpIdRessource(Long asPpIdRessource) {
        this.asPpIdRessource = asPpIdRessource;
    }

    @Basic
    @Column(name = "AS_BN_ID_ABMELDUNG")
    public Long getAsBnIdAbmeldung() {
        return asBnIdAbmeldung;
    }

    public void setAsBnIdAbmeldung(Long asBnIdAbmeldung) {
        this.asBnIdAbmeldung = asBnIdAbmeldung;
    }


    @Basic
    @Column(name = "AS_BN_ID_ANMELDUNG")
    public Long getAsBnIdAnmeldung() {
        return asBnIdAnmeldung;
    }

    public void setAsBnIdAnmeldung(Long asBnIdAnmeldung) {
        this.asBnIdAnmeldung = asBnIdAnmeldung;
    }


    @Basic
    @Column(name = "AS_DAT_MANUELL_TERMIN", nullable = true)
    public Timestamp getAsDatManuellTermin() {
        return asDatManuellTermin;
    }

    public void setAsDatManuellTermin(Timestamp asDatManuellTermin) {
        this.asDatManuellTermin = asDatManuellTermin;
    }

    @Basic
    @Column(name = "AS_MANUELL_TYP", nullable = true, precision = 0)
    public Boolean getAsManuellTyp() {
        return asManuellTyp;
    }

    public void setAsManuellTyp(Boolean asManuellTyp) {
        this.asManuellTyp = asManuellTyp;
    }

    @Basic
    @Column(name = "AS_INPUT", nullable = false, precision = 0)
    public long getAsInput() {
        return asInput;
    }

    public void setAsInput(long asInput) {
        this.asInput = asInput;
    }

    @Basic
    @Column(name = "AS_OUTPUT", nullable = false, precision = 0)
    public long getAsOutput() {
        return asOutput;
    }

    public void setAsOutput(long asOutput) {
        this.asOutput = asOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArbeitsschritteEntity that = (ArbeitsschritteEntity) o;
        return asId == that.asId &&
                asPosition == that.asPosition &&
                asRuestzeit == that.asRuestzeit &&
                asBearbeitungszeit == that.asBearbeitungszeit &&
                asAdminFlag == that.asAdminFlag &&
                asGefertigt == that.asGefertigt &&
                asOberschritt == that.asOberschritt &&
                asBearbeitungszeitBn == that.asBearbeitungszeitBn &&
                asExtern == that.asExtern &&
                asAnzahlMitarbeiter == that.asAnzahlMitarbeiter &&
                asAddon == that.asAddon &&
                asQuickAbmldg == that.asQuickAbmldg &&
                asOnceARevision == that.asOnceARevision &&
                asOnceAFa == that.asOnceAFa &&
                asCurrentSection == that.asCurrentSection &&
                asAddWaitingTime == that.asAddWaitingTime &&
                asIgnoreX == that.asIgnoreX &&
                asAutoStop == that.asAutoStop &&
                asBulkTracking == that.asBulkTracking &&
                asBearbeitungszeitTme == that.asBearbeitungszeitTme &&
                asMinQtyDlz == that.asMinQtyDlz &&
                asRetrograd == that.asRetrograd &&
                asDisableResPreselect == that.asDisableResPreselect &&
                asInput == that.asInput &&
                asOutput == that.asOutput &&
                Objects.equals(asStapelgroesse, that.asStapelgroesse) &&
                Objects.equals(asDatAnmeldung, that.asDatAnmeldung) &&
                Objects.equals(asDatAbmeldung, that.asDatAbmeldung) &&
                Objects.equals(asDatAnmeldungSoll, that.asDatAnmeldungSoll) &&
                Objects.equals(asDatAbmeldungSoll, that.asDatAbmeldungSoll) &&
                Objects.equals(asAnweisung, that.asAnweisung) &&
                Objects.equals(asUsercreated, that.asUsercreated) &&
                Objects.equals(asDatecreated, that.asDatecreated) &&
                Objects.equals(asUserchanged, that.asUserchanged) &&
                Objects.equals(asDatechanged, that.asDatechanged) &&
                Objects.equals(asAusschussValue, that.asAusschussValue) &&
                Objects.equals(asAusschussKommentar, that.asAusschussKommentar) &&
                Objects.equals(asChId, that.asChId) &&
                Objects.equals(asMainlabel, that.asMainlabel) &&
                Objects.equals(asIntime, that.asIntime) &&
                Objects.equals(asAnzSubs, that.asAnzSubs) &&
                Objects.equals(asProgram, that.asProgram) &&
                Objects.equals(asDatProg, that.asDatProg) &&
                Objects.equals(asDatProgDatBer, that.asDatProgDatBer) &&
                Objects.equals(asArtId, that.asArtId) &&
                Objects.equals(asDatAnmeldungSollFein, that.asDatAnmeldungSollFein) &&
                Objects.equals(asDatAbmeldungSollFein, that.asDatAbmeldungSollFein) &&
                Objects.equals(asDatManuellTermin, that.asDatManuellTermin) &&
                Objects.equals(asManuellTyp, that.asManuellTyp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(asId, asPosition, asRuestzeit, asBearbeitungszeit, asStapelgroesse, asDatAnmeldung, asDatAbmeldung, asDatAnmeldungSoll, asDatAbmeldungSoll, asAnweisung, asAdminFlag, asGefertigt, asUsercreated, asDatecreated, asUserchanged, asDatechanged, asOberschritt, asBearbeitungszeitBn, asAusschussValue, asAusschussKommentar, asExtern, asAnzahlMitarbeiter, asChId, asAddon, asQuickAbmldg, asOnceARevision, asOnceAFa, asMainlabel, asIntime, asAnzSubs, asCurrentSection, asAddWaitingTime, asProgram, asIgnoreX, asAutoStop, asDatProg, asDatProgDatBer, asArtId, asDatAnmeldungSollFein, asDatAbmeldungSollFein, asBulkTracking, asBearbeitungszeitTme, asMinQtyDlz, asRetrograd, asDisableResPreselect, asDatManuellTermin, asManuellTyp, asInput, asOutput);
    }

}
