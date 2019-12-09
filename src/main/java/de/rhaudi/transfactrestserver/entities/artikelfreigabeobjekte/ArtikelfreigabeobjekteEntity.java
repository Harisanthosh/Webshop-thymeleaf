package de.rhaudi.transfactrestserver.entities.artikelfreigabeobjekte;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "ARTIKELFREIGABEOBJEKTE", schema = "TFWEB", catalog = "")
public class ArtikelfreigabeobjekteEntity {
    private long afoId;
    private String afoName;
    private int afoRevision;
    private String afoBezeichnung;
    private String afoKommentar;
    private Time afoDatFreigabe;
    private String afoUsercreated;
    private Time afoDatecreated;
    private String afoUserchanged;
    private Time afoDatechanged;
    private Long afoAsId;
    private Time afoDatFreigabe0;
    private String afoIniparam;
    private Long afoArtId;
    private Time afoDatFreigabe1;
    private boolean afoInactive;
    private Time afoDatApplyfrom;

    @Id
    @Column(name = "AFO_ID")
    public long getAfoId() {
        return afoId;
    }

    public void setAfoId(long afoId) {
        this.afoId = afoId;
    }

    @Basic
    @Column(name = "AFO_NAME")
    public String getAfoName() {
        return afoName;
    }

    public void setAfoName(String afoName) {
        this.afoName = afoName;
    }

    @Basic
    @Column(name = "AFO_REVISION")
    public int getAfoRevision() {
        return afoRevision;
    }

    public void setAfoRevision(int afoRevision) {
        this.afoRevision = afoRevision;
    }

    @Basic
    @Column(name = "AFO_BEZEICHNUNG")
    public String getAfoBezeichnung() {
        return afoBezeichnung;
    }

    public void setAfoBezeichnung(String afoBezeichnung) {
        this.afoBezeichnung = afoBezeichnung;
    }

    @Basic
    @Column(name = "AFO_KOMMENTAR")
    public String getAfoKommentar() {
        return afoKommentar;
    }

    public void setAfoKommentar(String afoKommentar) {
        this.afoKommentar = afoKommentar;
    }

    @Basic
    @Column(name = "AFO_DAT_FREIGABE")
    public Time getAfoDatFreigabe() {
        return afoDatFreigabe;
    }

    public void setAfoDatFreigabe(Time afoDatFreigabe) {
        this.afoDatFreigabe = afoDatFreigabe;
    }

    @Basic
    @Column(name = "AFO_USERCREATED")
    public String getAfoUsercreated() {
        return afoUsercreated;
    }

    public void setAfoUsercreated(String afoUsercreated) {
        this.afoUsercreated = afoUsercreated;
    }

    @Basic
    @Column(name = "AFO_DATECREATED")
    public Time getAfoDatecreated() {
        return afoDatecreated;
    }

    public void setAfoDatecreated(Time afoDatecreated) {
        this.afoDatecreated = afoDatecreated;
    }

    @Basic
    @Column(name = "AFO_USERCHANGED")
    public String getAfoUserchanged() {
        return afoUserchanged;
    }

    public void setAfoUserchanged(String afoUserchanged) {
        this.afoUserchanged = afoUserchanged;
    }

    @Basic
    @Column(name = "AFO_DATECHANGED")
    public Time getAfoDatechanged() {
        return afoDatechanged;
    }

    public void setAfoDatechanged(Time afoDatechanged) {
        this.afoDatechanged = afoDatechanged;
    }

    @Basic
    @Column(name = "AFO_AS_ID")
    public Long getAfoAsId() {
        return afoAsId;
    }

    public void setAfoAsId(Long afoAsId) {
        this.afoAsId = afoAsId;
    }

    @Basic
    @Column(name = "AFO_DAT_FREIGABE0")
    public Time getAfoDatFreigabe0() {
        return afoDatFreigabe0;
    }

    public void setAfoDatFreigabe0(Time afoDatFreigabe0) {
        this.afoDatFreigabe0 = afoDatFreigabe0;
    }

    @Basic
    @Column(name = "AFO_INIPARAM")
    public String getAfoIniparam() {
        return afoIniparam;
    }

    public void setAfoIniparam(String afoIniparam) {
        this.afoIniparam = afoIniparam;
    }

    @Basic
    @Column(name = "AFO_ART_ID")
    public Long getAfoArtId() {
        return afoArtId;
    }

    public void setAfoArtId(Long afoArtId) {
        this.afoArtId = afoArtId;
    }

    @Basic
    @Column(name = "AFO_DAT_FREIGABE1")
    public Time getAfoDatFreigabe1() {
        return afoDatFreigabe1;
    }

    public void setAfoDatFreigabe1(Time afoDatFreigabe1) {
        this.afoDatFreigabe1 = afoDatFreigabe1;
    }

    @Basic
    @Column(name = "AFO_INACTIVE")
    public boolean isAfoInactive() {
        return afoInactive;
    }

    public void setAfoInactive(boolean afoInactive) {
        this.afoInactive = afoInactive;
    }

    @Basic
    @Column(name = "AFO_DAT_APPLYFROM")
    public Time getAfoDatApplyfrom() {
        return afoDatApplyfrom;
    }

    public void setAfoDatApplyfrom(Time afoDatApplyfrom) {
        this.afoDatApplyfrom = afoDatApplyfrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtikelfreigabeobjekteEntity that = (ArtikelfreigabeobjekteEntity) o;

        if (afoId != that.afoId) return false;
        if (afoRevision != that.afoRevision) return false;
        if (afoInactive != that.afoInactive) return false;
        if (afoName != null ? !afoName.equals(that.afoName) : that.afoName != null) return false;
        if (afoBezeichnung != null ? !afoBezeichnung.equals(that.afoBezeichnung) : that.afoBezeichnung != null)
            return false;
        if (afoKommentar != null ? !afoKommentar.equals(that.afoKommentar) : that.afoKommentar != null) return false;
        if (afoDatFreigabe != null ? !afoDatFreigabe.equals(that.afoDatFreigabe) : that.afoDatFreigabe != null)
            return false;
        if (afoUsercreated != null ? !afoUsercreated.equals(that.afoUsercreated) : that.afoUsercreated != null)
            return false;
        if (afoDatecreated != null ? !afoDatecreated.equals(that.afoDatecreated) : that.afoDatecreated != null)
            return false;
        if (afoUserchanged != null ? !afoUserchanged.equals(that.afoUserchanged) : that.afoUserchanged != null)
            return false;
        if (afoDatechanged != null ? !afoDatechanged.equals(that.afoDatechanged) : that.afoDatechanged != null)
            return false;
        if (afoAsId != null ? !afoAsId.equals(that.afoAsId) : that.afoAsId != null) return false;
        if (afoDatFreigabe0 != null ? !afoDatFreigabe0.equals(that.afoDatFreigabe0) : that.afoDatFreigabe0 != null)
            return false;
        if (afoIniparam != null ? !afoIniparam.equals(that.afoIniparam) : that.afoIniparam != null) return false;
        if (afoArtId != null ? !afoArtId.equals(that.afoArtId) : that.afoArtId != null) return false;
        if (afoDatFreigabe1 != null ? !afoDatFreigabe1.equals(that.afoDatFreigabe1) : that.afoDatFreigabe1 != null)
            return false;
        if (afoDatApplyfrom != null ? !afoDatApplyfrom.equals(that.afoDatApplyfrom) : that.afoDatApplyfrom != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (afoId ^ (afoId >>> 32));
        result = 31 * result + (afoName != null ? afoName.hashCode() : 0);
        result = 31 * result + afoRevision;
        result = 31 * result + (afoBezeichnung != null ? afoBezeichnung.hashCode() : 0);
        result = 31 * result + (afoKommentar != null ? afoKommentar.hashCode() : 0);
        result = 31 * result + (afoDatFreigabe != null ? afoDatFreigabe.hashCode() : 0);
        result = 31 * result + (afoUsercreated != null ? afoUsercreated.hashCode() : 0);
        result = 31 * result + (afoDatecreated != null ? afoDatecreated.hashCode() : 0);
        result = 31 * result + (afoUserchanged != null ? afoUserchanged.hashCode() : 0);
        result = 31 * result + (afoDatechanged != null ? afoDatechanged.hashCode() : 0);
        result = 31 * result + (afoAsId != null ? afoAsId.hashCode() : 0);
        result = 31 * result + (afoDatFreigabe0 != null ? afoDatFreigabe0.hashCode() : 0);
        result = 31 * result + (afoIniparam != null ? afoIniparam.hashCode() : 0);
        result = 31 * result + (afoArtId != null ? afoArtId.hashCode() : 0);
        result = 31 * result + (afoDatFreigabe1 != null ? afoDatFreigabe1.hashCode() : 0);
        result = 31 * result + (afoInactive ? 1 : 0);
        result = 31 * result + (afoDatApplyfrom != null ? afoDatApplyfrom.hashCode() : 0);
        return result;
    }
}
