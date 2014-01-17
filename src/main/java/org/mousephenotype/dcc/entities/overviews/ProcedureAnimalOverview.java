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
@Table(name = "procedure_animal_overview", catalog = "phenodcc_overviews", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcedureAnimalOverview.findAll", query = "SELECT p FROM ProcedureAnimalOverview p"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByProcedureAnimalOverviewId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.procedureAnimalOverviewId = :procedureAnimalOverviewId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByAnimalId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.animalId = :animalId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByAnimalName", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.animalName = :animalName"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByProcedureOccurrenceId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.procedureOccurrenceId = :procedureOccurrenceId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByCentreId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.centreId = :centreId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByShortName", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.shortName = :shortName"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByGenotypeId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.genotypeId = :genotypeId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByGenotype", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.genotype = :genotype"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByStrainId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.strainId = :strainId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByStrain", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.strain = :strain"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByZygosity", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.zygosity = :zygosity"),
    @NamedQuery(name = "ProcedureAnimalOverview.findBySex", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.sex = :sex"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByStartDate", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.startDate = :startDate"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByExperimenter", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.experimenter = :experimenter"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByPipeline", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.pipeline = :pipeline"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByProcedureId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.procedureId = :procedureId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByStr", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.str = :str"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a = :a"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA1", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a1 = :a1"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA2", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a2 = :a2"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA3", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a3 = :a3"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA4", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a4 = :a4"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA5", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a5 = :a5"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA6", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a6 = :a6"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA7", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a7 = :a7"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA8", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a8 = :a8"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA9", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a9 = :a9"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA10", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a10 = :a10"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByA11", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.a11 = :a11"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByEquipmentname", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.equipmentname = :equipmentname"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByEquipmentmanufacturer", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.equipmentmanufacturer = :equipmentmanufacturer"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByEquipmentmodel", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.equipmentmodel = :equipmentmodel"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByMetadataGroup", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.metadataGroup = :metadataGroup"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByTrackerId", query = "SELECT p FROM ProcedureAnimalOverview p WHERE p.trackerId = :trackerId"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByCidGidSidQeid", query = "SELECT p FROM ProcedureAnimalOverview p, MeasurementsPerformed m WHERE (p.procedureOccurrenceId = m.procedureOccurrenceId AND p.centreId = :centreId AND p.genotypeId = :genotypeId AND p.strainId = :strainId AND m.parameterId = :parameterId)"),
    @NamedQuery(name = "ProcedureAnimalOverview.findByCidLidGidSidQeid", query = "SELECT p FROM ProcedureAnimalOverview p, MeasurementsPerformed m, Pipeline l WHERE (p.procedureOccurrenceId = m.procedureOccurrenceId AND p.centreId = :centreId AND l.pipelineId = :pipelineId AND p.pipeline = l.pipelineKey AND p.genotypeId = :genotypeId AND p.strainId = :strainId AND m.parameterId = :parameterId)")})
public class ProcedureAnimalOverview implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "procedure_animal_overview_id", nullable = false)
    private Integer procedureAnimalOverviewId;
    @Column(name = "animal_id")
    private BigInteger animalId;
    @Column(name = "animal_name", length = 255)
    private String animalName;
    @Column(name = "procedure_occurrence_id")
    private BigInteger procedureOccurrenceId;
    @Column(name = "centre_id")
    private BigInteger centreId;
    @Column(name = "short_name", length = 45)
    private String shortName;
    @Column(name = "genotype_id")
    private BigInteger genotypeId;
    @Column(length = 255)
    private String genotype;
    @Column(name = "strain_id")
    private BigInteger strainId;
    @Column(length = 45)
    private String strain;
    private Integer zygosity;
    private Integer sex;
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(length = 45)
    private String experimenter;
    @Column(length = 255)
    private String pipeline;
    @Column(name = "procedure_id", length = 45)
    private String procedureId;
    @Column(length = 128)
    private String str;
    @Column(name = "_12", length = 128)
    private String a;
    @Column(name = "_1", length = 128)
    private String a1;
    @Column(name = "_2", length = 128)
    private String a2;
    @Column(name = "_3", length = 128)
    private String a3;
    @Column(name = "_4", length = 128)
    private String a4;
    @Column(name = "_5", length = 128)
    private String a5;
    @Column(name = "_6", length = 128)
    private String a6;
    @Column(name = "_7", length = 128)
    private String a7;
    @Column(name = "_8", length = 128)
    private String a8;
    @Column(name = "_9", length = 128)
    private String a9;
    @Column(name = "_10", length = 128)
    private String a10;
    @Column(name = "_11", length = 128)
    private String a11;
    @Column(name = "Equipment_name", length = 128)
    private String equipmentname;
    @Column(name = "Equipment_manufacturer", length = 128)
    private String equipmentmanufacturer;
    @Column(name = "Equipment_model", length = 128)
    private String equipmentmodel;
    @Column(name = "metadata_group", length = 16)
    private String metadataGroup;
    @Column(name = "tracker_id")
    private Integer trackerId;

    public ProcedureAnimalOverview() {
    }

    public ProcedureAnimalOverview(Integer procedureAnimalOverviewId) {
        this.procedureAnimalOverviewId = procedureAnimalOverviewId;
    }

    public Integer getProcedureAnimalOverviewId() {
        return procedureAnimalOverviewId;
    }

    public void setProcedureAnimalOverviewId(Integer procedureAnimalOverviewId) {
        this.procedureAnimalOverviewId = procedureAnimalOverviewId;
    }

    public BigInteger getAnimalId() {
        return animalId;
    }

    public void setAnimalId(BigInteger animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public BigInteger getProcedureOccurrenceId() {
        return procedureOccurrenceId;
    }

    public void setProcedureOccurrenceId(BigInteger procedureOccurrenceId) {
        this.procedureOccurrenceId = procedureOccurrenceId;
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

    public BigInteger getStrainId() {
        return strainId;
    }

    public void setStrainId(BigInteger strainId) {
        this.strainId = strainId;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Integer getZygosity() {
        return zygosity;
    }

    public void setZygosity(Integer zygosity) {
        this.zygosity = zygosity;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getExperimenter() {
        return experimenter;
    }

    public void setExperimenter(String experimenter) {
        this.experimenter = experimenter;
    }

    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    public String getEquipmentmanufacturer() {
        return equipmentmanufacturer;
    }

    public void setEquipmentmanufacturer(String equipmentmanufacturer) {
        this.equipmentmanufacturer = equipmentmanufacturer;
    }

    public String getEquipmentmodel() {
        return equipmentmodel;
    }

    public void setEquipmentmodel(String equipmentmodel) {
        this.equipmentmodel = equipmentmodel;
    }

    public String getMetadataGroup() {
        return metadataGroup;
    }

    public void setMetadataGroup(String metadataGroup) {
        this.metadataGroup = metadataGroup;
    }

    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }
}
