/*
 * Copyright 2012 Medical Research Council Harwell.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mousephenotype.dcc.entities.overviews;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gagarine Yaikhom <g.yaikhom@har.mrc.ac.uk>
 */
@Entity
@Table(name = "genotype", catalog = "phenodcc_overviews", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genotype.findAll", query = "SELECT g FROM Genotype g"),
    @NamedQuery(name = "Genotype.findByGenotypeId", query = "SELECT g FROM Genotype g WHERE g.genotypeId = :genotypeId"),
    @NamedQuery(name = "Genotype.findByGenotype", query = "SELECT g FROM Genotype g WHERE g.genotype = :genotype"),
    @NamedQuery(name = "Genotype.findBySource", query = "SELECT g FROM Genotype g WHERE g.source = :source"),
    @NamedQuery(name = "Genotype.findByAlleleName", query = "SELECT g FROM Genotype g WHERE g.alleleName = :alleleName"),
    @NamedQuery(name = "Genotype.findByAlleleType", query = "SELECT g FROM Genotype g WHERE g.alleleType = :alleleType"),
    @NamedQuery(name = "Genotype.findByGeneId", query = "SELECT g FROM Genotype g WHERE g.geneId = :geneId"),
    @NamedQuery(name = "Genotype.findByGeneName", query = "SELECT g FROM Genotype g WHERE g.geneName = :geneName"),
    @NamedQuery(name = "Genotype.findByGeneSymbol", query = "SELECT g FROM Genotype g WHERE g.geneSymbol = :geneSymbol"),
    @NamedQuery(name = "Genotype.findByDefinativeName", query = "SELECT g FROM Genotype g WHERE g.definativeName = :definativeName"),
    @NamedQuery(name = "Genotype.findByEmmaId", query = "SELECT g FROM Genotype g WHERE g.emmaId = :emmaId"),
    @NamedQuery(name = "Genotype.findByKompId", query = "SELECT g FROM Genotype g WHERE g.kompId = :kompId"),
    @NamedQuery(name = "Genotype.findByJaxId", query = "SELECT g FROM Genotype g WHERE g.jaxId = :jaxId"),
    @NamedQuery(name = "Genotype.findByInternationalStrainName", query = "SELECT g FROM Genotype g WHERE g.internationalStrainName = :internationalStrainName"),
    @NamedQuery(name = "Genotype.findByEnsemblId", query = "SELECT g FROM Genotype g WHERE g.ensemblId = :ensemblId"),
    @NamedQuery(name = "Genotype.findByShowThis", query = "SELECT g FROM Genotype g WHERE g.showThis = :showThis"),
    @NamedQuery(name = "Genotype.findByAlleleId", query = "SELECT g FROM Genotype g WHERE g.alleleId = :alleleId"),
    @NamedQuery(name = "Genotype.findByEpdId", query = "SELECT g FROM Genotype g WHERE g.epdId = :epdId"),
    @NamedQuery(name = "Genotype.findByStocklistId", query = "SELECT g FROM Genotype g WHERE g.stocklistId = :stocklistId"),
    @NamedQuery(name = "Genotype.findByHTGTprojectid", query = "SELECT g FROM Genotype g WHERE g.hTGTprojectid = :hTGTprojectid"),
    @NamedQuery(name = "Genotype.findByCentreId", query = "SELECT g FROM Genotype g WHERE g.centreId = :centreId"),
    @NamedQuery(name = "Genotype.findByStrainId", query = "SELECT g FROM Genotype g WHERE g.strainId = :strainId"),
    @NamedQuery(name = "Genotype.findByMGIstrainid", query = "SELECT g FROM Genotype g WHERE g.mGIstrainid = :mGIstrainid"),
    @NamedQuery(name = "Genotype.findByPaId", query = "SELECT g FROM Genotype g WHERE g.paId = :paId"),
    @NamedQuery(name = "Genotype.findByMiId", query = "SELECT g FROM Genotype g WHERE g.miId = :miId"),
    @NamedQuery(name = "Genotype.findByPpId", query = "SELECT g FROM Genotype g WHERE g.ppId = :ppId")})
public class Genotype implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "genotype_id", nullable = false)
    private Integer genotypeId;
    @Column(length = 255)
    private String genotype;
    @Column(length = 255)
    private String source;
    @Column(name = "allele_name", length = 255)
    private String alleleName;
    @Column(name = "allele_type", length = 255)
    private String alleleType;
    @Column(name = "gene_id", length = 255)
    private String geneId;
    @Column(name = "gene_name", length = 255)
    private String geneName;
    @Column(name = "gene_symbol", length = 255)
    private String geneSymbol;
    @Column(name = "definative_name", length = 255)
    private String definativeName;
    @Column(name = "emma_id", length = 15)
    private String emmaId;
    @Column(name = "komp_id", length = 15)
    private String kompId;
    @Column(name = "jax_id", length = 15)
    private String jaxId;
    @Column(name = "international_strain_name", length = 512)
    private String internationalStrainName;
    @Column(name = "ensembl_id", length = 255)
    private String ensemblId;
    @Column(name = "show_this")
    private Boolean showThis;
    @Column(name = "allele_id", length = 15)
    private String alleleId;
    @Column(name = "epd_id", length = 45)
    private String epdId;
    @Column(name = "stocklist_id", length = 15)
    private String stocklistId;
    @Column(name = "HTGT_project_id", length = 15)
    private String hTGTprojectid;
    @Column(name = "centre_id")
    private Integer centreId;
    @Column(name = "strain_id")
    private Integer strainId;
    @Column(name = "MGI_strain_id", length = 45)
    private String mGIstrainid;
    @Basic(optional = false)
    @Column(name = "pa_id")
    private int paId;
    @Basic(optional = false)
    @Column(name = "mi_id")
    private int miId;
    @Basic(optional = false)
    @Column(name = "pp_id")
    private int ppId;

    public Genotype() {
    }

    public Genotype(Integer genotypeId) {
        this.genotypeId = genotypeId;
    }

    public Integer getGenotypeId() {
        return genotypeId;
    }

    public void setGenotypeId(Integer genotypeId) {
        this.genotypeId = genotypeId;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAlleleName() {
        return alleleName;
    }

    public void setAlleleName(String alleleName) {
        this.alleleName = alleleName;
    }

    public String getAlleleType() {
        return alleleType;
    }

    public void setAlleleType(String alleleType) {
        this.alleleType = alleleType;
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    public String getGeneSymbol() {
        return geneSymbol;
    }

    public void setGeneSymbol(String geneSymbol) {
        this.geneSymbol = geneSymbol;
    }

    public String getDefinativeName() {
        return definativeName;
    }

    public void setDefinativeName(String definativeName) {
        this.definativeName = definativeName;
    }

    public String getEmmaId() {
        return emmaId;
    }

    public void setEmmaId(String emmaId) {
        this.emmaId = emmaId;
    }

    public String getKompId() {
        return kompId;
    }

    public void setKompId(String kompId) {
        this.kompId = kompId;
    }

    public String getJaxId() {
        return jaxId;
    }

    public void setJaxId(String jaxId) {
        this.jaxId = jaxId;
    }

    public String getInternationalStrainName() {
        return internationalStrainName;
    }

    public void setInternationalStrainName(String internationalStrainName) {
        this.internationalStrainName = internationalStrainName;
    }

    public String getEnsemblId() {
        return ensemblId;
    }

    public void setEnsemblId(String ensemblId) {
        this.ensemblId = ensemblId;
    }

    public Boolean getShowThis() {
        return showThis;
    }

    public void setShowThis(Boolean showThis) {
        this.showThis = showThis;
    }

    public String getAlleleId() {
        return alleleId;
    }

    public void setAlleleId(String alleleId) {
        this.alleleId = alleleId;
    }

    public String getEpdId() {
        return epdId;
    }

    public void setEpdId(String epdId) {
        this.epdId = epdId;
    }

    public String getStocklistId() {
        return stocklistId;
    }

    public void setStocklistId(String stocklistId) {
        this.stocklistId = stocklistId;
    }

    public String getHTGTprojectid() {
        return hTGTprojectid;
    }

    public void setHTGTprojectid(String hTGTprojectid) {
        this.hTGTprojectid = hTGTprojectid;
    }

    public Integer getCentreId() {
        return centreId;
    }

    public void setCentreId(Integer centreId) {
        this.centreId = centreId;
    }

    public Integer getStrainId() {
        return strainId;
    }

    public void setStrainId(Integer strainId) {
        this.strainId = strainId;
    }

    public String getMGIstrainid() {
        return mGIstrainid;
    }

    public void setMGIstrainid(String mGIstrainid) {
        this.mGIstrainid = mGIstrainid;
    }

    public int getPaId() {
        return paId;
}

    public void setPaId(int paId) {
        this.paId = paId;
    }

    public int getMiId() {
        return miId;
    }

    public void setMiId(int miId) {
        this.miId = miId;
    }

    public int getPpId() {
        return ppId;
    }

    public void setPpId(int ppId) {
        this.ppId = ppId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genotypeId != null ? genotypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genotype)) {
            return false;
        }
        Genotype other = (Genotype) object;
        if ((this.genotypeId == null && other.genotypeId != null) || (this.genotypeId != null && !this.genotypeId.equals(other.genotypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mousephenotype.dcc.entity.temp.Genotype[ genotypeId=" + genotypeId + " ]";
    }
}
