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
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gagarine Yaikhom <g.yaikhom@har.mrc.ac.uk>
 */
@Entity
@Table(name = "animal_overview", catalog = "phenodcc_overviews", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnimalOverview.findAll", query = "SELECT a FROM AnimalOverview a"),
    @NamedQuery(name = "AnimalOverview.findByAnimalId", query = "SELECT a FROM AnimalOverview a WHERE a.animalId = :animalId"),
    @NamedQuery(name = "AnimalOverview.findByAnimalIds", query = "SELECT a FROM AnimalOverview a WHERE a.animalId IN :animalIds"),
    @NamedQuery(name = "AnimalOverview.findByAnimalName", query = "SELECT a FROM AnimalOverview a WHERE a.animalName = :animalName"),
    @NamedQuery(name = "AnimalOverview.findByCohortName", query = "SELECT a FROM AnimalOverview a WHERE a.cohortName = :cohortName"),
    @NamedQuery(name = "AnimalOverview.findByCohortId", query = "SELECT a FROM AnimalOverview a WHERE a.cohortId = :cohortId"),
    @NamedQuery(name = "AnimalOverview.findBySex", query = "SELECT a FROM AnimalOverview a WHERE a.sex = :sex"),
    @NamedQuery(name = "AnimalOverview.findByDob", query = "SELECT a FROM AnimalOverview a WHERE a.dob = :dob"),
    @NamedQuery(name = "AnimalOverview.findByCentreId", query = "SELECT a FROM AnimalOverview a WHERE a.centreId = :centreId"),
    @NamedQuery(name = "AnimalOverview.findByShortName", query = "SELECT a FROM AnimalOverview a WHERE a.shortName = :shortName"),
    @NamedQuery(name = "AnimalOverview.findByStrain", query = "SELECT a FROM AnimalOverview a WHERE a.strain = :strain"),
    @NamedQuery(name = "AnimalOverview.findByStrainName", query = "SELECT a FROM AnimalOverview a WHERE a.strainName = :strainName"),
    @NamedQuery(name = "AnimalOverview.findByHomozygous", query = "SELECT a FROM AnimalOverview a WHERE a.homozygous = :homozygous"),
    @NamedQuery(name = "AnimalOverview.findByGenotypeId", query = "SELECT a FROM AnimalOverview a WHERE a.genotypeId = :genotypeId"),
    @NamedQuery(name = "AnimalOverview.findByGenotype", query = "SELECT a FROM AnimalOverview a WHERE a.genotype = :genotype"),
    @NamedQuery(name = "AnimalOverview.findByPipeline", query = "SELECT a FROM AnimalOverview a WHERE a.pipeline = :pipeline"),
    @NamedQuery(name = "AnimalOverview.findByLitter", query = "SELECT a FROM AnimalOverview a WHERE a.litter = :litter"),
    @NamedQuery(name = "AnimalOverview.findByTrackerId", query = "SELECT a FROM AnimalOverview a WHERE a.trackerId = :trackerId")})
public class AnimalOverview implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "animal_id", nullable = false)
    private Long animalId;
    @Column(name = "animal_name", length = 255)
    private String animalName;
    @Column(name = "cohort_name", length = 45)
    private String cohortName;
    @Column(name = "cohort_id", length = 45)
    private String cohortId;
    @Column(length = 45)
    private String sex;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    @Column(name = "centre_id")
    private BigInteger centreId;
    @Column(name = "short_name", length = 45)
    private String shortName;
    private BigInteger strain;
    @Column(name = "strain_name", length = 45)
    private String strainName;
    private Integer homozygous;
    @Column(name = "genotype_id")
    private BigInteger genotypeId;
    @Column(length = 255)
    private String genotype;
    @Column(length = 45)
    private String pipeline;
    @Column(length = 45)
    private String litter;
    @Column(name = "tracker_id")
    private Integer trackerId;

    public AnimalOverview() {
    }

    public AnimalOverview(Long animalId) {
        this.animalId = animalId;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public String getCohortId() {
        return cohortId;
    }

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public BigInteger getCentreId() {
        return centreId;
    }

    public void setCentreId(BigInteger centreId) {
        this.centreId = centreId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public BigInteger getStrain() {
        return strain;
    }

    public void setStrain(BigInteger strain) {
        this.strain = strain;
    }

    public String getStrainName() {
        return strainName;
    }

    public void setStrainName(String strainName) {
        this.strainName = strainName;
    }

    public Integer getHomozygous() {
        return homozygous;
    }

    public void setHomozygous(Integer homozygous) {
        this.homozygous = homozygous;
    }

    public BigInteger getGenotypeId() {
        return genotypeId;
    }

    public void setGenotypeId(BigInteger genotypeId) {
        this.genotypeId = genotypeId;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public String getLitter() {
        return litter;
    }

    public void setLitter(String litter) {
        this.litter = litter;
    }

    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }
}
