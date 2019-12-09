package de.rhaudi.transfactrestserver.entities.artikel;

import javax.persistence.*;
import java.sql.Time;
import java.lang.Object;
import java.util.Objects;

@Entity
@Table(name = "ARTIKEL", schema = "TFWEB", catalog = "")
public class ArtikelEntity {
    private long artId;
    private long artPpIdArtikelart;
    private long artPpIdArtikelgrp;
    private long artMdId;
    private long artPeId;
    private String artNr;
    private String artNrRef;
    private long artLfdNr;
    private String artBeschreibung;
    private String artBeschreibung2;
    private String artMatchcode;
    private int artOptLosgroesse;
    private long artIxFaktor;
    private long artMindestbestand;
    private String artZeichnungsnr;
    private boolean artDoCopy;
    private boolean artAutoFreigabe;
    private String artKommentar;
    private String artAlternative;
    private String artSnStartvalue;
    private Long artYield;
    private String artQuelle;
    private String artUsercreated;
    private Time artDatecreated;
    private String artUserchanged;
    private Time artDatechanged;
    private String artEancode;
    private int artOptLosgroesse2;
    private boolean artInactive;
    private long artBeschaffungszeit;
    private String artLangtext;
    private String artNrExtern;
    private String artRegexp;
    private String artHinweistext;
    private String artUrsprungsland;
    private boolean artAutoEinst;
    private boolean artBulktracking;
    private boolean artItar;
    private boolean artVollstSntrackingLager;
    private boolean artInventarpflichtig;

    @Id
    @Column(name = "ART_ID", nullable = false, precision = 0)
    public long getArtId() {
        return artId;
    }

    public void setArtId(long artId) {
        this.artId = artId;
    }
    
    @Basic
    @Column(name = "ART_PP_ID_ARTIKELART", nullable = false, precision = 0)
    public long getArtPpIdArtikelart() {
        return artPpIdArtikelart;
    }

    public void setArtPpIdArtikelart(long artPpIdArtikelart) {
        this.artPpIdArtikelart = artPpIdArtikelart;
    }
    
    @Basic
    @Column(name = "ART_PP_ID_ARTIKELGRUPPE", nullable = false, precision = 0)
    public long getArtPpIdArtikelgrp() {
        return artPpIdArtikelgrp;
    }

    public void setArtPpIdArtikelgrp(long artPpIdArtikelgrp) {
        this.artPpIdArtikelgrp = artPpIdArtikelgrp;
    }
    
    @Basic
    @Column(name = "ART_MD_ID", nullable = false, precision = 0)
    public long getArtMdId() {
        return artMdId;
    }

    public void setArtMdId(long artMdId) {
        this.artMdId = artMdId;
    }
    
    @Basic
    @Column(name = "ART_PE_ID", nullable = false, precision = 0)
    public long getArtPeId() {
        return artPeId;
    }

    public void setArtPeId(long artPeId) {
        this.artPeId = artPeId;
    }

    @Basic
    @Column(name = "ART_NR", nullable = false, length = 255)
    public String getArtNr() {
        return artNr;
    }

    public void setArtNr(String artNr) {
        this.artNr = artNr;
    }

    @Basic
    @Column(name = "ART_NR_REF", nullable = true, length = 255)
    public String getArtNrRef() {
        return artNrRef;
    }

    public void setArtNrRef(String artNrRef) {
        this.artNrRef = artNrRef;
    }

    @Basic
    @Column(name = "ART_LFD_NR", nullable = false, precision = 0)
    public long getArtLfdNr() {
        return artLfdNr;
    }

    public void setArtLfdNr(long artLfdNr) {
        this.artLfdNr = artLfdNr;
    }

    @Basic
    @Column(name = "ART_BESCHREIBUNG", nullable = true, length = 255)
    public String getArtBeschreibung() {
        return artBeschreibung;
    }

    public void setArtBeschreibung(String artBeschreibung) {
        this.artBeschreibung = artBeschreibung;
    }

    @Basic
    @Column(name = "ART_BESCHREIBUNG2", nullable = true, length = 4000)
    public String getArtBeschreibung2() {
        return artBeschreibung2;
    }

    public void setArtBeschreibung2(String artBeschreibung2) {
        this.artBeschreibung2 = artBeschreibung2;
    }

    @Basic
    @Column(name = "ART_MATCHCODE", nullable = true, length = 255)
    public String getArtMatchcode() {
        return artMatchcode;
    }

    public void setArtMatchcode(String artMatchcode) {
        this.artMatchcode = artMatchcode;
    }

    @Basic
    @Column(name = "ART_OPT_LOSGROESSE", nullable = false, precision = 0)
    public int getArtOptLosgroesse() {
        return artOptLosgroesse;
    }

    public void setArtOptLosgroesse(int artOptLosgroesse) {
        this.artOptLosgroesse = artOptLosgroesse;
    }

    @Basic
    @Column(name = "ART_IX_FAKTOR", nullable = false, precision = 0)
    public long getArtIxFaktor() {
        return artIxFaktor;
    }

    public void setArtIxFaktor(long artIxFaktor) {
        this.artIxFaktor = artIxFaktor;
    }

    @Basic
    @Column(name = "ART_MINDESTBESTAND", nullable = false, precision = 0)
    public long getArtMindestbestand() {
        return artMindestbestand;
    }

    public void setArtMindestbestand(long artMindestbestand) {
        this.artMindestbestand = artMindestbestand;
    }

    @Basic
    @Column(name = "ART_ZEICHNUNGSNR", nullable = true, length = 255)
    public String getArtZeichnungsnr() {
        return artZeichnungsnr;
    }

    public void setArtZeichnungsnr(String artZeichnungsnr) {
        this.artZeichnungsnr = artZeichnungsnr;
    }

    @Basic
    @Column(name = "ART_DO_COPY", nullable = false, precision = 0)
    public boolean isArtDoCopy() {
        return artDoCopy;
    }

    public void setArtDoCopy(boolean artDoCopy) {
        this.artDoCopy = artDoCopy;
    }

    @Basic
    @Column(name = "ART_AUTO_FREIGABE", nullable = false, precision = 0)
    public boolean isArtAutoFreigabe() {
        return artAutoFreigabe;
    }

    public void setArtAutoFreigabe(boolean artAutoFreigabe) {
        this.artAutoFreigabe = artAutoFreigabe;
    }

    @Basic
    @Column(name = "ART_KOMMENTAR", nullable = true, length = 4000)
    public String getArtKommentar() {
        return artKommentar;
    }

    public void setArtKommentar(String artKommentar) {
        this.artKommentar = artKommentar;
    }

    @Basic
    @Column(name = "ART_ALTERNATIVE", nullable = true, length = 255)
    public String getArtAlternative() {
        return artAlternative;
    }

    public void setArtAlternative(String artAlternative) {
        this.artAlternative = artAlternative;
    }

    @Basic
    @Column(name = "ART_SN_STARTVALUE", nullable = true, length = 255)
    public String getArtSnStartvalue() {
        return artSnStartvalue;
    }

    public void setArtSnStartvalue(String artSnStartvalue) {
        this.artSnStartvalue = artSnStartvalue;
    }

    @Basic
    @Column(name = "ART_YIELD", nullable = true, precision = 0)
    public Long getArtYield() {
        return artYield;
    }

    public void setArtYield(Long artYield) {
        this.artYield = artYield;
    }

    @Basic
    @Column(name = "ART_QUELLE", nullable = false, length = 255)
    public String getArtQuelle() {
        return artQuelle;
    }

    public void setArtQuelle(String artQuelle) {
        this.artQuelle = artQuelle;
    }

    @Basic
    @Column(name = "ART_USERCREATED", nullable = true, length = 255)
    public String getArtUsercreated() {
        return artUsercreated;
    }

    public void setArtUsercreated(String artUsercreated) {
        this.artUsercreated = artUsercreated;
    }

    @Basic
    @Column(name = "ART_DATECREATED", nullable = true)
    public Time getArtDatecreated() {
        return artDatecreated;
    }

    public void setArtDatecreated(Time artDatecreated) {
        this.artDatecreated = artDatecreated;
    }

    @Basic
    @Column(name = "ART_USERCHANGED", nullable = true, length = 255)
    public String getArtUserchanged() {
        return artUserchanged;
    }

    public void setArtUserchanged(String artUserchanged) {
        this.artUserchanged = artUserchanged;
    }

    @Basic
    @Column(name = "ART_DATECHANGED", nullable = true)
    public Time getArtDatechanged() {
        return artDatechanged;
    }

    public void setArtDatechanged(Time artDatechanged) {
        this.artDatechanged = artDatechanged;
    }

    @Basic
    @Column(name = "ART_EANCODE", nullable = true, length = 255)
    public String getArtEancode() {
        return artEancode;
    }

    public void setArtEancode(String artEancode) {
        this.artEancode = artEancode;
    }

    @Basic
    @Column(name = "ART_OPT_LOSGROESSE2", nullable = false, precision = 0)
    public int getArtOptLosgroesse2() {
        return artOptLosgroesse2;
    }

    public void setArtOptLosgroesse2(int artOptLosgroesse2) {
        this.artOptLosgroesse2 = artOptLosgroesse2;
    }

    @Basic
    @Column(name = "ART_INACTIVE", nullable = false, precision = 0)
    public boolean isArtInactive() {
        return artInactive;
    }

    public void setArtInactive(boolean artInactive) {
        this.artInactive = artInactive;
    }

    @Basic
    @Column(name = "ART_BESCHAFFUNGSZEIT", nullable = false, precision = 0)
    public long getArtBeschaffungszeit() {
        return artBeschaffungszeit;
    }

    public void setArtBeschaffungszeit(long artBeschaffungszeit) {
        this.artBeschaffungszeit = artBeschaffungszeit;
    }

    @Basic
    @Column(name = "ART_LANGTEXT", nullable = true)
    public String getArtLangtext() {
        return artLangtext;
    }

    public void setArtLangtext(String artLangtext) {
        this.artLangtext = artLangtext;
    }

    @Basic
    @Column(name = "ART_NR_EXTERN", nullable = true, length = 4000)
    public String getArtNrExtern() {
        return artNrExtern;
    }

    public void setArtNrExtern(String artNrExtern) {
        this.artNrExtern = artNrExtern;
    }

    @Basic
    @Column(name = "ART_REGEXP", nullable = true, length = 4000)
    public String getArtRegexp() {
        return artRegexp;
    }

    public void setArtRegexp(String artRegexp) {
        this.artRegexp = artRegexp;
    }

    @Basic
    @Column(name = "ART_HINWEISTEXT", nullable = true)
    public String getArtHinweistext() {
        return artHinweistext;
    }

    public void setArtHinweistext(String artHinweistext) {
        this.artHinweistext = artHinweistext;
    }

    @Basic
    @Column(name = "ART_URSPRUNGSLAND", nullable = true, length = 2)
    public String getArtUrsprungsland() {
        return artUrsprungsland;
    }

    public void setArtUrsprungsland(String artUrsprungsland) {
        this.artUrsprungsland = artUrsprungsland;
    }

    @Basic
    @Column(name = "ART_AUTO_EINST", nullable = false, precision = 0)
    public boolean isArtAutoEinst() {
        return artAutoEinst;
    }

    public void setArtAutoEinst(boolean artAutoEinst) {
        this.artAutoEinst = artAutoEinst;
    }

    @Basic
    @Column(name = "ART_BULKTRACKING", nullable = false, precision = 0)
    public boolean isArtBulktracking() {
        return artBulktracking;
    }

    public void setArtBulktracking(boolean artBulktracking) {
        this.artBulktracking = artBulktracking;
    }

    @Basic
    @Column(name = "ART_ITAR", nullable = false, precision = 0)
    public boolean isArtItar() {
        return artItar;
    }

    public void setArtItar(boolean artItar) {
        this.artItar = artItar;
    }

    @Basic
    @Column(name = "ART_VOLLST_SNTRACKING_LAGER", nullable = false, precision = 0)
    public boolean isArtVollstSntrackingLager() {
        return artVollstSntrackingLager;
    }

    public void setArtVollstSntrackingLager(boolean artVollstSntrackingLager) {
        this.artVollstSntrackingLager = artVollstSntrackingLager;
    }

    @Basic
    @Column(name = "ART_INVENTARPFLICHTIG", nullable = false, precision = 0)
    public boolean isArtInventarpflichtig() {
        return artInventarpflichtig;
    }

    public void setArtInventarpflichtig(boolean artInventarpflichtig) {
        this.artInventarpflichtig = artInventarpflichtig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtikelEntity that = (ArtikelEntity) o;
        return artId == that.artId &&
        		artPpIdArtikelart == that.artPpIdArtikelart &&
        		artPpIdArtikelgrp == that.artPpIdArtikelgrp &&
        		artMdId == that.artMdId &&
        		artPeId == that.artPeId &&
                artLfdNr == that.artLfdNr &&
                artOptLosgroesse == that.artOptLosgroesse &&
                artIxFaktor == that.artIxFaktor &&
                artMindestbestand == that.artMindestbestand &&
                artDoCopy == that.artDoCopy &&
                artAutoFreigabe == that.artAutoFreigabe &&
                artOptLosgroesse2 == that.artOptLosgroesse2 &&
                artInactive == that.artInactive &&
                artBeschaffungszeit == that.artBeschaffungszeit &&
                artAutoEinst == that.artAutoEinst &&
                artBulktracking == that.artBulktracking &&
                artItar == that.artItar &&
                artVollstSntrackingLager == that.artVollstSntrackingLager &&
                artInventarpflichtig == that.artInventarpflichtig &&
                Objects.equals(artId, that.artId) &&
                Objects.equals(artNr, that.artNr) &&
                Objects.equals(artPpIdArtikelart, that.artPpIdArtikelart) &&
                Objects.equals(artPpIdArtikelgrp, that.artPpIdArtikelgrp) &&
                Objects.equals(artMdId, that.artMdId) &&
                Objects.equals(artPeId, that.artPeId) &&
                Objects.equals(artNrRef, that.artNrRef) &&
                Objects.equals(artBeschreibung, that.artBeschreibung) &&
                Objects.equals(artBeschreibung2, that.artBeschreibung2) &&
                Objects.equals(artMatchcode, that.artMatchcode) &&
                Objects.equals(artZeichnungsnr, that.artZeichnungsnr) &&
                Objects.equals(artKommentar, that.artKommentar) &&
                Objects.equals(artAlternative, that.artAlternative) &&
                Objects.equals(artSnStartvalue, that.artSnStartvalue) &&
                Objects.equals(artYield, that.artYield) &&
                Objects.equals(artQuelle, that.artQuelle) &&
                Objects.equals(artUsercreated, that.artUsercreated) &&
                Objects.equals(artDatecreated, that.artDatecreated) &&
                Objects.equals(artUserchanged, that.artUserchanged) &&
                Objects.equals(artDatechanged, that.artDatechanged) &&
                Objects.equals(artEancode, that.artEancode) &&
                Objects.equals(artLangtext, that.artLangtext) &&
                Objects.equals(artNrExtern, that.artNrExtern) &&
                Objects.equals(artRegexp, that.artRegexp) &&
                Objects.equals(artHinweistext, that.artHinweistext) &&
                Objects.equals(artUrsprungsland, that.artUrsprungsland);
    }

    @Override
    public int hashCode() {

        return Objects.hash(artId, artPpIdArtikelart, artPpIdArtikelgrp, artMdId, artPeId, artNr, artNrRef, artLfdNr, artBeschreibung, artBeschreibung2, artMatchcode, artOptLosgroesse, artIxFaktor, artMindestbestand, artZeichnungsnr, artDoCopy, artAutoFreigabe, artKommentar, artAlternative, artSnStartvalue, artYield, artQuelle, artUsercreated, artDatecreated, artUserchanged, artDatechanged, artEancode, artOptLosgroesse2, artInactive, artBeschaffungszeit, artLangtext, artNrExtern, artRegexp, artHinweistext, artUrsprungsland, artAutoEinst, artBulktracking, artItar, artVollstSntrackingLager, artInventarpflichtig);
    }


}
