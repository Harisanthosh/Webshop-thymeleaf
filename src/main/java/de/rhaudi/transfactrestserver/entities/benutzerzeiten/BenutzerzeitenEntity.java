package de.rhaudi.transfactrestserver.entities.benutzerzeiten;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "BENUTZERZEITEN", schema = "TFWEB", catalog = "")
public class BenutzerzeitenEntity {



    private long bzId;
    private long bzMdId;
    private long bzBnIdAnmeldung;
    private Long bzBnIdAbmeldung;
    private long bzPpIdRessource;
    private long bzAsId;
    private Timestamp bzDatAnmeldung;
    private Timestamp bzDatAbmeldung;
    private long bzRuestzeitIst;
    private long bzBearbeitungszeitIst;
    private long bzBearbeitungszeitBnIst;
    private String bzUsercreated;
    private Timestamp bzDatecreated;
    private String bzUserchanged;
    private Timestamp bzDatechanged;
    private boolean bzNacharbeit;
    private String bzKommentar;
    private long bzProcessed;
    private long bzScrapped;
    private long bzLocked;
    private String bzSnKommentar;
    private long bzMaschinensatz;
    private long bzMitarbeitersatz;
    private double bzGemeinkostenfaktor;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bz_generator")
    @SequenceGenerator(name = "bz_generator", sequenceName = "BZ_SEQ")
    @Column(name = "BZ_ID", updatable = false, nullable = false)
    public long getBzId() {
        return bzId;
    }

    public void setBzId(long bzId) {
        this.bzId = bzId;
    }


    @Basic
    @Column(name = "BZ_MD_ID", nullable = false, precision = 0)
    public long getBzMdId() {
        return bzMdId;
    }

    public void setBzMdId(long bzMdId) {
        this.bzMdId = bzMdId;
    }


    @Basic
    @Column(name = "BZ_BN_ID_ANMELDUNG", nullable = true, precision = 0)
    public long getBzBnIdAnmeldung() {
        return bzBnIdAnmeldung;
    }

    public void setBzBnIdAnmeldung(long bzBnIdAnmeldung) {
        this.bzBnIdAnmeldung = bzBnIdAnmeldung;
    }

    @Basic
    @Column(name = "BZ_BN_ID_ABMELDUNG", nullable = true, precision = 0)
    public Long getBzBnIdAbmeldung() {
        return bzBnIdAbmeldung;
    }

    public void setBzBnIdAbmeldung(Long bzBnIdAbmeldung) {
        this.bzBnIdAbmeldung = bzBnIdAbmeldung;
    }

    @Basic
    @Column(name = "BZ_PP_ID_RESSOURCE", nullable = false, precision = 0)
    public long getBzPpIdRessource() {
        return bzPpIdRessource;
    }

    public void setBzPpIdRessource(long bzPpIdRessource) {
        this.bzPpIdRessource = bzPpIdRessource;
    }

    @Basic
    @Column(name = "BZ_AS_ID", nullable = false, precision = 0)
    public long getBzAsId() {
        return bzAsId;
    }

    public void setBzAsId(long bzAsId) {
        this.bzAsId = bzAsId;
    }

    @Basic
    @Column(name = "BZ_DAT_ANMELDUNG", nullable = false)
    public Timestamp getBzDatAnmeldung() {
        return bzDatAnmeldung;
    }

    public void setBzDatAnmeldung(Timestamp bzDatAnmeldung) {
        this.bzDatAnmeldung = bzDatAnmeldung;
    }

    @Basic
    @Column(name = "BZ_DAT_ABMELDUNG", nullable = true)
    public Timestamp getBzDatAbmeldung() {
        return bzDatAbmeldung;
    }

    public void setBzDatAbmeldung(Timestamp bzDatAbmeldung) {
        this.bzDatAbmeldung = bzDatAbmeldung;
    }

    @Basic
    @Column(name = "BZ_RUESTZEIT_IST", nullable = false, precision = 0)
    public long getBzRuestzeitIst() {
        return bzRuestzeitIst;
    }

    public void setBzRuestzeitIst(long bzRuestzeitIst) {
        this.bzRuestzeitIst = bzRuestzeitIst;
    }

    @Basic
    @Column(name = "BZ_BEARBEITUNGSZEIT_IST", nullable = false, precision = 0)
    public long getBzBearbeitungszeitIst() {
        return bzBearbeitungszeitIst;
    }

    public void setBzBearbeitungszeitIst(long bzBearbeitungszeitIst) {
        this.bzBearbeitungszeitIst = bzBearbeitungszeitIst;
    }

    @Basic
    @Column(name = "BZ_BEARBEITUNGSZEIT_BN_IST", nullable = false, precision = 0)
    public long getBzBearbeitungszeitBnIst() {
        return bzBearbeitungszeitBnIst;
    }

    public void setBzBearbeitungszeitBnIst(long bzBearbeitungszeitBnIst) {
        this.bzBearbeitungszeitBnIst = bzBearbeitungszeitBnIst;
    }

    @Basic
    @Column(name = "BZ_USERCREATED", nullable = false, length = 255)
    public String getBzUsercreated() {
        return bzUsercreated;
    }

    public void setBzUsercreated(String bzUsercreated) {
        this.bzUsercreated = bzUsercreated;
    }

    @Basic
    @Column(name = "BZ_DATECREATED", nullable = false)
    public Timestamp getBzDatecreated() {
        return bzDatecreated;
    }

    public void setBzDatecreated(Timestamp bzDatecreated) {
        this.bzDatecreated = bzDatecreated;
    }

    @Basic
    @Column(name = "BZ_USERCHANGED", nullable = true, length = 255)
    public String getBzUserchanged() {
        return bzUserchanged;
    }

    public void setBzUserchanged(String bzUserchanged) {
        this.bzUserchanged = bzUserchanged;
    }

    @Basic
    @Column(name = "BZ_DATECHANGED", nullable = true)
    public Timestamp getBzDatechanged() {
        return bzDatechanged;
    }

    public void setBzDatechanged(Timestamp bzDatechanged) {
        this.bzDatechanged = bzDatechanged;
    }

    @Basic
    @Column(name = "BZ_NACHARBEIT", nullable = false, precision = 0)
    public boolean isBzNacharbeit() {
        return bzNacharbeit;
    }

    public void setBzNacharbeit(boolean bzNacharbeit) {
        this.bzNacharbeit = bzNacharbeit;
    }

    @Basic
    @Column(name = "BZ_KOMMENTAR", nullable = true, length = 4000)
    public String getBzKommentar() {
        return bzKommentar;
    }

    public void setBzKommentar(String bzKommentar) {
        this.bzKommentar = bzKommentar;
    }

    @Basic
    @Column(name = "BZ_PROCESSED", nullable = false, precision = 0)
    public long getBzProcessed() {
        return bzProcessed;
    }

    public void setBzProcessed(long bzProcessed) {
        this.bzProcessed = bzProcessed;
    }

    @Basic
    @Column(name = "BZ_SCRAPPED", nullable = false, precision = 0)
    public long getBzScrapped() {
        return bzScrapped;
    }

    public void setBzScrapped(long bzScrapped) {
        this.bzScrapped = bzScrapped;
    }

    @Basic
    @Column(name = "BZ_LOCKED", nullable = false, precision = 0)
    public long getBzLocked() {
        return bzLocked;
    }

    public void setBzLocked(long bzLocked) {
        this.bzLocked = bzLocked;
    }

    @Basic
    @Column(name = "BZ_SN_KOMMENTAR", nullable = true, length = 255)
    public String getBzSnKommentar() {
        return bzSnKommentar;
    }

    public void setBzSnKommentar(String bzSnKommentar) {
        this.bzSnKommentar = bzSnKommentar;
    }

    @Basic
    @Column(name = "BZ_MASCHINENSATZ", nullable = false, precision = 0)
    public long getBzMaschinensatz() {
        return bzMaschinensatz;
    }

    public void setBzMaschinensatz(long bzMaschinensatz) {
        this.bzMaschinensatz = bzMaschinensatz;
    }

    @Basic
    @Column(name = "BZ_MITARBEITERSATZ", nullable = false, precision = 0)
    public long getBzMitarbeitersatz() {
        return bzMitarbeitersatz;
    }

    public void setBzMitarbeitersatz(long bzMitarbeitersatz) {
        this.bzMitarbeitersatz = bzMitarbeitersatz;
    }

    @Basic
    @Column(name = "BZ_GEMEINKOSTENFAKTOR", nullable = false, precision = 0)
    public double getBzGemeinkostenfaktor() {
        return bzGemeinkostenfaktor;
    }

    public void setBzGemeinkostenfaktor(double bzGemeinkostenfaktor) {
        this.bzGemeinkostenfaktor = bzGemeinkostenfaktor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BenutzerzeitenEntity that = (BenutzerzeitenEntity) o;
        return bzId == that.bzId &&
                bzRuestzeitIst == that.bzRuestzeitIst &&
                bzBearbeitungszeitIst == that.bzBearbeitungszeitIst &&
                bzBearbeitungszeitBnIst == that.bzBearbeitungszeitBnIst &&
                bzNacharbeit == that.bzNacharbeit &&
                bzProcessed == that.bzProcessed &&
                bzScrapped == that.bzScrapped &&
                bzLocked == that.bzLocked &&
                bzMaschinensatz == that.bzMaschinensatz &&
                bzMitarbeitersatz == that.bzMitarbeitersatz &&
                bzGemeinkostenfaktor == that.bzGemeinkostenfaktor &&
                Objects.equals(bzDatAnmeldung, that.bzDatAnmeldung) &&
                Objects.equals(bzDatAbmeldung, that.bzDatAbmeldung) &&
                Objects.equals(bzUsercreated, that.bzUsercreated) &&
                Objects.equals(bzDatecreated, that.bzDatecreated) &&
                Objects.equals(bzUserchanged, that.bzUserchanged) &&
                Objects.equals(bzDatechanged, that.bzDatechanged) &&
                Objects.equals(bzKommentar, that.bzKommentar) &&
                Objects.equals(bzSnKommentar, that.bzSnKommentar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bzId, bzDatAnmeldung, bzDatAbmeldung, bzRuestzeitIst, bzBearbeitungszeitIst, bzBearbeitungszeitBnIst, bzUsercreated, bzDatecreated, bzUserchanged, bzDatechanged, bzNacharbeit, bzKommentar, bzProcessed, bzScrapped, bzLocked, bzSnKommentar, bzMaschinensatz, bzMitarbeitersatz, bzGemeinkostenfaktor);
    }
}
