package de.rhaudi.transfactrestserver.entities.belegepositionen;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "BELEGEPOSITIONEN", schema = "TFWEB", catalog = "")
public class BelegepositionenEntity {
    private long posId;
    private int posMdId;
    private Integer posPosId;
    private int posBelId;
    private int posPosition;
    private String posNr;
    private int posArtId;
    private String posArtBeschreibung;
    private String posArtBeschreibung2;
    private long posMenge;
    private Integer posPpIdEinheit;
    private long posEinzelpreis;
    private int posPpIdMwst;
    private Timestamp posLieferterminSoll;
    private Timestamp posLieferterminIst;
    private Integer posPpIdKostentraeger;
    private Integer posPpIdKostenstelle;
    private Integer posPpIdProjekt;
    private Long posEinzelgewicht;
    private boolean posAlternativ;
    private String posUsercreated;
    private Timestamp posDatecreated;
    private String posUserchanged;
    private Timestamp posDatechanged;
    private String posLangtext;
    private long posMwstbetrag;
    private Long posRestmenge;
    private Long posLgId;
    private Integer posVpeId;
    private Timestamp posVerfallsdatumVon;
    private Timestamp posVerfallsdatumBis;
    private String posChNrExt;
    private Timestamp posLieferterminWunsch;
    private String posXml;
    private long posPreisOrig;
    private long posProzRabatt;
    private int posVpeIdPreis;
    private Long posPreisMenge;
    private String posReferenznrKunde;
    private String posArtNrExt;
    private String posKommentar;
    private Integer posPeIdObjekt;
    private Integer posPrId;
    private boolean posRepeatProcess;
    private Integer posPpIdLfqual;
    private boolean posPreisNichtBindend;
    private Integer posPpIdAuftragsart;
    private Integer posBgrpId;
    private Integer posPosIdProvision;
    private long posAbsRabatt1;
    private long posAbsRabatt2;
    private boolean posIsAbsRabatt;
    private String posArtBeschreibungExt;
    private Integer posPpIdBkonto;
    private boolean posLagergefuehrt;
    private Timestamp posAuftragseingangWunsch;


    @Id
    @Column(name = "POS_ID", nullable = false, precision = 0)
    public long getPosId() {
        return posId;
    }

    public void setPosId(long posId) {
        this.posId = posId;
    }

    @Basic
    @Column(name = "POS_MD_ID", nullable = false, precision = 0)
    public int getPosMdId() {
        return posMdId;
    }

    public void setPosMdId(int posMdId) {
        this.posMdId = posMdId;
    }

    @Basic
    @Column(name = "POS_POS_ID", nullable = true, precision = 0)
    public Integer getPosPosId() {
        return posPosId;
    }

    public void setPosPosId(Integer posPosId) {
        this.posPosId = posPosId;
    }

    @Basic
    @Column(name = "POS_BEL_ID", nullable = false, precision = 0)
    public int getPosBelId() {
        return posBelId;
    }

    public void setPosBelId(int posBelId) {
        this.posBelId = posBelId;
    }

    @Basic
    @Column(name = "POS_POSITION", nullable = false, precision = 0)
    public int getPosPosition() {
        return posPosition;
    }

    public void setPosPosition(int posPosition) {
        this.posPosition = posPosition;
    }

    @Basic
    @Column(name = "POS_NR", nullable = false, length = 255)
    public String getPosNr() {
        return posNr;
    }

    public void setPosNr(String posNr) {
        this.posNr = posNr;
    }

    @Basic
    @Column(name = "POS_ART_ID", nullable = false, precision = 0)
    public int getPosArtId() {
        return posArtId;
    }

    public void setPosArtId(int posArtId) {
        this.posArtId = posArtId;
    }

    @Basic
    @Column(name = "POS_ART_BESCHREIBUNG", nullable = true, length = 255)
    public String getPosArtBeschreibung() {
        return posArtBeschreibung;
    }

    public void setPosArtBeschreibung(String posArtBeschreibung) {
        this.posArtBeschreibung = posArtBeschreibung;
    }

    @Basic
    @Column(name = "POS_ART_BESCHREIBUNG2", nullable = true, length = 4000)
    public String getPosArtBeschreibung2() {
        return posArtBeschreibung2;
    }

    public void setPosArtBeschreibung2(String posArtBeschreibung2) {
        this.posArtBeschreibung2 = posArtBeschreibung2;
    }

    @Basic
    @Column(name = "POS_MENGE", nullable = false, precision = 0)
    public long getPosMenge() {
        return posMenge;
    }

    public void setPosMenge(long posMenge) {
        this.posMenge = posMenge;
    }

    @Basic
    @Column(name = "POS_PP_ID_EINHEIT", nullable = true, precision = 0)
    public Integer getPosPpIdEinheit() {
        return posPpIdEinheit;
    }

    public void setPosPpIdEinheit(Integer posPpIdEinheit) {
        this.posPpIdEinheit = posPpIdEinheit;
    }

    @Basic
    @Column(name = "POS_EINZELPREIS", nullable = false, precision = 0)
    public long getPosEinzelpreis() {
        return posEinzelpreis;
    }

    public void setPosEinzelpreis(long posEinzelpreis) {
        this.posEinzelpreis = posEinzelpreis;
    }

    @Basic
    @Column(name = "POS_PP_ID_MWST", nullable = false, precision = 0)
    public int getPosPpIdMwst() {
        return posPpIdMwst;
    }

    public void setPosPpIdMwst(int posPpIdMwst) {
        this.posPpIdMwst = posPpIdMwst;
    }

    @Basic
    @Column(name = "POS_LIEFERTERMIN_SOLL", nullable = true)
    public Timestamp getPosLieferterminSoll() {
        return posLieferterminSoll;
    }

    public void setPosLieferterminSoll(Timestamp posLieferterminSoll) {
        this.posLieferterminSoll = posLieferterminSoll;
    }

    @Basic
    @Column(name = "POS_LIEFERTERMIN_IST", nullable = true)
    public Timestamp getPosLieferterminIst() {
        return posLieferterminIst;
    }

    public void setPosLieferterminIst(Timestamp posLieferterminIst) {
        this.posLieferterminIst = posLieferterminIst;
    }

    @Basic
    @Column(name = "POS_PP_ID_KOSTENTRAEGER", nullable = true, precision = 0)
    public Integer getPosPpIdKostentraeger() {
        return posPpIdKostentraeger;
    }

    public void setPosPpIdKostentraeger(Integer posPpIdKostentraeger) {
        this.posPpIdKostentraeger = posPpIdKostentraeger;
    }

    @Basic
    @Column(name = "POS_PP_ID_KOSTENSTELLE", nullable = true, precision = 0)
    public Integer getPosPpIdKostenstelle() {
        return posPpIdKostenstelle;
    }

    public void setPosPpIdKostenstelle(Integer posPpIdKostenstelle) {
        this.posPpIdKostenstelle = posPpIdKostenstelle;
    }

    @Basic
    @Column(name = "POS_PP_ID_PROJEKT", nullable = true, precision = 0)
    public Integer getPosPpIdProjekt() {
        return posPpIdProjekt;
    }

    public void setPosPpIdProjekt(Integer posPpIdProjekt) {
        this.posPpIdProjekt = posPpIdProjekt;
    }

    @Basic
    @Column(name = "POS_EINZELGEWICHT", nullable = true, precision = 0)
    public Long getPosEinzelgewicht() {
        return posEinzelgewicht;
    }

    public void setPosEinzelgewicht(Long posEinzelgewicht) {
        this.posEinzelgewicht = posEinzelgewicht;
    }

    @Basic
    @Column(name = "POS_ALTERNATIV", nullable = false, precision = 0)
    public boolean isPosAlternativ() {
        return posAlternativ;
    }

    public void setPosAlternativ(boolean posAlternativ) {
        this.posAlternativ = posAlternativ;
    }

    @Basic
    @Column(name = "POS_USERCREATED", nullable = false, length = 255)
    public String getPosUsercreated() {
        return posUsercreated;
    }

    public void setPosUsercreated(String posUsercreated) {
        this.posUsercreated = posUsercreated;
    }

    @Basic
    @Column(name = "POS_DATECREATED", nullable = false)
    public Timestamp getPosDatecreated() {
        return posDatecreated;
    }

    public void setPosDatecreated(Timestamp posDatecreated) {
        this.posDatecreated = posDatecreated;
    }

    @Basic
    @Column(name = "POS_USERCHANGED", nullable = true, length = 255)
    public String getPosUserchanged() {
        return posUserchanged;
    }

    public void setPosUserchanged(String posUserchanged) {
        this.posUserchanged = posUserchanged;
    }

    @Basic
    @Column(name = "POS_DATECHANGED", nullable = true)
    public Timestamp getPosDatechanged() {
        return posDatechanged;
    }

    public void setPosDatechanged(Timestamp posDatechanged) {
        this.posDatechanged = posDatechanged;
    }

    @Basic
    @Column(name = "POS_LANGTEXT", nullable = true)
    public String getPosLangtext() {
        return posLangtext;
    }

    public void setPosLangtext(String posLangtext) {
        this.posLangtext = posLangtext;
    }

    @Basic
    @Column(name = "POS_MWSTBETRAG", nullable = false, precision = 0)
    public long getPosMwstbetrag() {
        return posMwstbetrag;
    }

    public void setPosMwstbetrag(long posMwstbetrag) {
        this.posMwstbetrag = posMwstbetrag;
    }

    @Basic
    @Column(name = "POS_RESTMENGE", nullable = true, precision = 0)
    public Long getPosRestmenge() {
        return posRestmenge;
    }

    public void setPosRestmenge(Long posRestmenge) {
        this.posRestmenge = posRestmenge;
    }

    @Basic
    @Column(name = "POS_LG_ID", nullable = true, precision = 0)
    public Long getPosLgId() {
        return posLgId;
    }

    public void setPosLgId(Long posLgId) {
        this.posLgId = posLgId;
    }

    @Basic
    @Column(name = "POS_VPE_ID", nullable = true, precision = 0)
    public Integer getPosVpeId() {
        return posVpeId;
    }

    public void setPosVpeId(Integer posVpeId) {
        this.posVpeId = posVpeId;
    }

    @Basic
    @Column(name = "POS_VERFALLSDATUM_VON", nullable = true)
    public Timestamp getPosVerfallsdatumVon() {
        return posVerfallsdatumVon;
    }

    public void setPosVerfallsdatumVon(Timestamp posVerfallsdatumVon) {
        this.posVerfallsdatumVon = posVerfallsdatumVon;
    }

    @Basic
    @Column(name = "POS_VERFALLSDATUM_BIS", nullable = true)
    public Timestamp getPosVerfallsdatumBis() {
        return posVerfallsdatumBis;
    }

    public void setPosVerfallsdatumBis(Timestamp posVerfallsdatumBis) {
        this.posVerfallsdatumBis = posVerfallsdatumBis;
    }

    @Basic
    @Column(name = "POS_CH_NR_EXT", nullable = true, length = 255)
    public String getPosChNrExt() {
        return posChNrExt;
    }

    public void setPosChNrExt(String posChNrExt) {
        this.posChNrExt = posChNrExt;
    }

    @Basic
    @Column(name = "POS_LIEFERTERMIN_WUNSCH", nullable = true)
    public Timestamp getPosLieferterminWunsch() {
        return posLieferterminWunsch;
    }

    public void setPosLieferterminWunsch(Timestamp posLieferterminWunsch) {
        this.posLieferterminWunsch = posLieferterminWunsch;
    }

    @Basic
    @Column(name = "POS_XML", nullable = true)
    public String getPosXml() {
        return posXml;
    }

    public void setPosXml(String posXml) {
        this.posXml = posXml;
    }

    @Basic
    @Column(name = "POS_PREIS_ORIG", nullable = false, precision = 0)
    public long getPosPreisOrig() {
        return posPreisOrig;
    }

    public void setPosPreisOrig(long posPreisOrig) {
        this.posPreisOrig = posPreisOrig;
    }

    @Basic
    @Column(name = "POS_PROZ_RABATT", nullable = false, precision = 0)
    public long getPosProzRabatt() {
        return posProzRabatt;
    }

    public void setPosProzRabatt(long posProzRabatt) {
        this.posProzRabatt = posProzRabatt;
    }

    @Basic
    @Column(name = "POS_VPE_ID_PREIS", nullable = false, precision = 0)
    public int getPosVpeIdPreis() {
        return posVpeIdPreis;
    }

    public void setPosVpeIdPreis(int posVpeIdPreis) {
        this.posVpeIdPreis = posVpeIdPreis;
    }

    @Basic
    @Column(name = "POS_PREIS_MENGE", nullable = true, precision = 0)
    public Long getPosPreisMenge() {
        return posPreisMenge;
    }

    public void setPosPreisMenge(Long posPreisMenge) {
        this.posPreisMenge = posPreisMenge;
    }

    @Basic
    @Column(name = "POS_REFERENZNR_KUNDE", nullable = true, length = 255)
    public String getPosReferenznrKunde() {
        return posReferenznrKunde;
    }

    public void setPosReferenznrKunde(String posReferenznrKunde) {
        this.posReferenznrKunde = posReferenznrKunde;
    }

    @Basic
    @Column(name = "POS_ART_NR_EXT", nullable = true, length = 255)
    public String getPosArtNrExt() {
        return posArtNrExt;
    }

    public void setPosArtNrExt(String posArtNrExt) {
        this.posArtNrExt = posArtNrExt;
    }

    @Basic
    @Column(name = "POS_KOMMENTAR", nullable = true)
    public String getPosKommentar() {
        return posKommentar;
    }

    public void setPosKommentar(String posKommentar) {
        this.posKommentar = posKommentar;
    }

    @Basic
    @Column(name = "POS_PE_ID_OBJEKT", nullable = true, precision = 0)
    public Integer getPosPeIdObjekt() {
        return posPeIdObjekt;
    }

    public void setPosPeIdObjekt(Integer posPeIdObjekt) {
        this.posPeIdObjekt = posPeIdObjekt;
    }

    @Basic
    @Column(name = "POS_PR_ID", nullable = true, precision = 0)
    public Integer getPosPrId() {
        return posPrId;
    }

    public void setPosPrId(Integer posPrId) {
        this.posPrId = posPrId;
    }

    @Basic
    @Column(name = "POS_REPEAT_PROCESS", nullable = false, precision = 0)
    public boolean isPosRepeatProcess() {
        return posRepeatProcess;
    }

    public void setPosRepeatProcess(boolean posRepeatProcess) {
        this.posRepeatProcess = posRepeatProcess;
    }

    @Basic
    @Column(name = "POS_PP_ID_LFQUAL", nullable = true, precision = 0)
    public Integer getPosPpIdLfqual() {
        return posPpIdLfqual;
    }

    public void setPosPpIdLfqual(Integer posPpIdLfqual) {
        this.posPpIdLfqual = posPpIdLfqual;
    }

    @Basic
    @Column(name = "POS_PREIS_NICHT_BINDEND", nullable = false, precision = 0)
    public boolean isPosPreisNichtBindend() {
        return posPreisNichtBindend;
    }

    public void setPosPreisNichtBindend(boolean posPreisNichtBindend) {
        this.posPreisNichtBindend = posPreisNichtBindend;
    }

    @Basic
    @Column(name = "POS_PP_ID_AUFTRAGSART", nullable = true, precision = 0)
    public Integer getPosPpIdAuftragsart() {
        return posPpIdAuftragsart;
    }

    public void setPosPpIdAuftragsart(Integer posPpIdAuftragsart) {
        this.posPpIdAuftragsart = posPpIdAuftragsart;
    }

    @Basic
    @Column(name = "POS_BGRP_ID", nullable = true, precision = 0)
    public Integer getPosBgrpId() {
        return posBgrpId;
    }

    public void setPosBgrpId(Integer posBgrpId) {
        this.posBgrpId = posBgrpId;
    }

    @Basic
    @Column(name = "POS_POS_ID_PROVISION", nullable = true, precision = 0)
    public Integer getPosPosIdProvision() {
        return posPosIdProvision;
    }

    public void setPosPosIdProvision(Integer posPosIdProvision) {
        this.posPosIdProvision = posPosIdProvision;
    }

    @Basic
    @Column(name = "POS_ABS_RABATT1", nullable = false, precision = 0)
    public long getPosAbsRabatt1() {
        return posAbsRabatt1;
    }

    public void setPosAbsRabatt1(long posAbsRabatt1) {
        this.posAbsRabatt1 = posAbsRabatt1;
    }

    @Basic
    @Column(name = "POS_ABS_RABATT2", nullable = false, precision = 0)
    public long getPosAbsRabatt2() {
        return posAbsRabatt2;
    }

    public void setPosAbsRabatt2(long posAbsRabatt2) {
        this.posAbsRabatt2 = posAbsRabatt2;
    }

    @Basic
    @Column(name = "POS_IS_ABS_RABATT", nullable = false, precision = 0)
    public boolean isPosIsAbsRabatt() {
        return posIsAbsRabatt;
    }

    public void setPosIsAbsRabatt(boolean posIsAbsRabatt) {
        this.posIsAbsRabatt = posIsAbsRabatt;
    }

    @Basic
    @Column(name = "POS_ART_BESCHREIBUNG_EXT", nullable = true, length = 255)
    public String getPosArtBeschreibungExt() {
        return posArtBeschreibungExt;
    }

    public void setPosArtBeschreibungExt(String posArtBeschreibungExt) {
        this.posArtBeschreibungExt = posArtBeschreibungExt;
    }

    @Basic
    @Column(name = "POS_PP_ID_BKONTO", nullable = true, precision = 0)
    public Integer getPosPpIdBkonto() {
        return posPpIdBkonto;
    }

    public void setPosPpIdBkonto(Integer posPpIdBkonto) {
        this.posPpIdBkonto = posPpIdBkonto;
    }

    @Basic
    @Column(name = "POS_LAGERGEFUEHRT", nullable = false, precision = 0)
    public boolean isPosLagergefuehrt() {
        return posLagergefuehrt;
    }

    public void setPosLagergefuehrt(boolean posLagergefuehrt) {
        this.posLagergefuehrt = posLagergefuehrt;
    }

    @Basic
    @Column(name = "POS_AUFTRAGSEINGANG_WUNSCH", nullable = true)
    public Timestamp getPosAuftragseingangWunsch() {
        return posAuftragseingangWunsch;
    }

    public void setPosAuftragseingangWunsch(Timestamp posAuftragseingangWunsch) {
        this.posAuftragseingangWunsch = posAuftragseingangWunsch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelegepositionenEntity that = (BelegepositionenEntity) o;
        return posId == that.posId &&
                posMdId == that.posMdId &&
                posBelId == that.posBelId &&
                posPosition == that.posPosition &&
                posArtId == that.posArtId &&
                posMenge == that.posMenge &&
                posEinzelpreis == that.posEinzelpreis &&
                posPpIdMwst == that.posPpIdMwst &&
                posAlternativ == that.posAlternativ &&
                posMwstbetrag == that.posMwstbetrag &&
                posPreisOrig == that.posPreisOrig &&
                posProzRabatt == that.posProzRabatt &&
                posVpeIdPreis == that.posVpeIdPreis &&
                posRepeatProcess == that.posRepeatProcess &&
                posPreisNichtBindend == that.posPreisNichtBindend &&
                posAbsRabatt1 == that.posAbsRabatt1 &&
                posAbsRabatt2 == that.posAbsRabatt2 &&
                posIsAbsRabatt == that.posIsAbsRabatt &&
                posLagergefuehrt == that.posLagergefuehrt &&
                Objects.equals(posPosId, that.posPosId) &&
                Objects.equals(posNr, that.posNr) &&
                Objects.equals(posArtBeschreibung, that.posArtBeschreibung) &&
                Objects.equals(posArtBeschreibung2, that.posArtBeschreibung2) &&
                Objects.equals(posPpIdEinheit, that.posPpIdEinheit) &&
                Objects.equals(posLieferterminSoll, that.posLieferterminSoll) &&
                Objects.equals(posLieferterminIst, that.posLieferterminIst) &&
                Objects.equals(posPpIdKostentraeger, that.posPpIdKostentraeger) &&
                Objects.equals(posPpIdKostenstelle, that.posPpIdKostenstelle) &&
                Objects.equals(posPpIdProjekt, that.posPpIdProjekt) &&
                Objects.equals(posEinzelgewicht, that.posEinzelgewicht) &&
                Objects.equals(posUsercreated, that.posUsercreated) &&
                Objects.equals(posDatecreated, that.posDatecreated) &&
                Objects.equals(posUserchanged, that.posUserchanged) &&
                Objects.equals(posDatechanged, that.posDatechanged) &&
                Objects.equals(posLangtext, that.posLangtext) &&
                Objects.equals(posRestmenge, that.posRestmenge) &&
                Objects.equals(posLgId, that.posLgId) &&
                Objects.equals(posVpeId, that.posVpeId) &&
                Objects.equals(posVerfallsdatumVon, that.posVerfallsdatumVon) &&
                Objects.equals(posVerfallsdatumBis, that.posVerfallsdatumBis) &&
                Objects.equals(posChNrExt, that.posChNrExt) &&
                Objects.equals(posLieferterminWunsch, that.posLieferterminWunsch) &&
                Objects.equals(posXml, that.posXml) &&
                Objects.equals(posPreisMenge, that.posPreisMenge) &&
                Objects.equals(posReferenznrKunde, that.posReferenznrKunde) &&
                Objects.equals(posArtNrExt, that.posArtNrExt) &&
                Objects.equals(posKommentar, that.posKommentar) &&
                Objects.equals(posPeIdObjekt, that.posPeIdObjekt) &&
                Objects.equals(posPrId, that.posPrId) &&
                Objects.equals(posPpIdLfqual, that.posPpIdLfqual) &&
                Objects.equals(posPpIdAuftragsart, that.posPpIdAuftragsart) &&
                Objects.equals(posBgrpId, that.posBgrpId) &&
                Objects.equals(posPosIdProvision, that.posPosIdProvision) &&
                Objects.equals(posArtBeschreibungExt, that.posArtBeschreibungExt) &&
                Objects.equals(posPpIdBkonto, that.posPpIdBkonto) &&
                Objects.equals(posAuftragseingangWunsch, that.posAuftragseingangWunsch);
    }

    @Override
    public int hashCode() {

        return Objects.hash(posId, posMdId, posPosId, posBelId, posPosition, posNr, posArtId, posArtBeschreibung, posArtBeschreibung2, posMenge, posPpIdEinheit, posEinzelpreis, posPpIdMwst, posLieferterminSoll, posLieferterminIst, posPpIdKostentraeger, posPpIdKostenstelle, posPpIdProjekt, posEinzelgewicht, posAlternativ, posUsercreated, posDatecreated, posUserchanged, posDatechanged, posLangtext, posMwstbetrag, posRestmenge, posLgId, posVpeId, posVerfallsdatumVon, posVerfallsdatumBis, posChNrExt, posLieferterminWunsch, posXml, posPreisOrig, posProzRabatt, posVpeIdPreis, posPreisMenge, posReferenznrKunde, posArtNrExt, posKommentar, posPeIdObjekt, posPrId, posRepeatProcess, posPpIdLfqual, posPreisNichtBindend, posPpIdAuftragsart, posBgrpId, posPosIdProvision, posAbsRabatt1, posAbsRabatt2, posIsAbsRabatt, posArtBeschreibungExt, posPpIdBkonto, posLagergefuehrt, posAuftragseingangWunsch);
    }


}
