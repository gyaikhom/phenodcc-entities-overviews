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
@Table(name = "measurements_performed", catalog = "phenodcc_overviews", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MeasurementsPerformed.findAll", query = "SELECT m FROM MeasurementsPerformed m"),
    @NamedQuery(name = "MeasurementsPerformed.findByMeasurementsPerformedId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.measurementsPerformedId = :measurementsPerformedId"),
    @NamedQuery(name = "MeasurementsPerformed.findByShortName", query = "SELECT m FROM MeasurementsPerformed m WHERE m.shortName = :shortName"),
    @NamedQuery(name = "MeasurementsPerformed.findByCentreId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.centreId = :centreId"),
    @NamedQuery(name = "MeasurementsPerformed.findByStrain", query = "SELECT m FROM MeasurementsPerformed m WHERE m.strain = :strain"),
    @NamedQuery(name = "MeasurementsPerformed.findByStrainId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.strainId = :strainId"),
    @NamedQuery(name = "MeasurementsPerformed.findByValue", query = "SELECT m FROM MeasurementsPerformed m WHERE m.value = :value"),
    @NamedQuery(name = "MeasurementsPerformed.findBySex", query = "SELECT m FROM MeasurementsPerformed m WHERE m.sex = :sex"),
    @NamedQuery(name = "MeasurementsPerformed.findByIncrement", query = "SELECT m FROM MeasurementsPerformed m WHERE m.increment = :increment"),
    @NamedQuery(name = "MeasurementsPerformed.findByParameterId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.parameterId = :parameterId"),
    @NamedQuery(name = "MeasurementsPerformed.findByGenotypeId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.genotypeId = :genotypeId"),
    @NamedQuery(name = "MeasurementsPerformed.findByAnimalId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.animalId = :animalId"),
    @NamedQuery(name = "MeasurementsPerformed.findByAnimalName", query = "SELECT m FROM MeasurementsPerformed m WHERE m.animalName = :animalName"),
    @NamedQuery(name = "MeasurementsPerformed.findByGenotype", query = "SELECT m FROM MeasurementsPerformed m WHERE m.genotype = :genotype"),
    @NamedQuery(name = "MeasurementsPerformed.findByProcedureOccurrenceId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.procedureOccurrenceId = :procedureOccurrenceId"),
    @NamedQuery(name = "MeasurementsPerformed.findByMeasurementId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.measurementId = :measurementId"),
    @NamedQuery(name = "MeasurementsPerformed.findByMeasurementType", query = "SELECT m FROM MeasurementsPerformed m WHERE m.measurementType = :measurementType"),
    @NamedQuery(name = "MeasurementsPerformed.findByTrackerId", query = "SELECT m FROM MeasurementsPerformed m WHERE m.trackerId = :trackerId"),
    @NamedQuery(name = "MeasurementsPerformed.findByMeasurementIdContext", query = "SELECT m FROM MeasurementsPerformed m WHERE (m.measurementId = :measurementId AND m.centreId = :cid AND m.genotypeId = :gid AND m.strainId = :sid AND m.parameterId = :qeid)"),
    @NamedQuery(name = "MeasurementsPerformed.findMutantMeasurementsIgnorePipeline", query = "SELECT new org.mousephenotype.dcc.entities.overviews.MeasuredValues(m.measurementId, p.animalId, p.animalName, p.genotypeId, p.strainId, p.sex, p.zygosity, p.startDate, m.increment, m.value, m.trackerId) FROM MeasurementsPerformed m, ProcedureAnimalOverview p WHERE (m.centreId = :centreId and m.genotypeId = :genotypeId and m.strainId = :strainId and m.parameterId = :parameterKey and p.procedureOccurrenceId = m.procedureOccurrenceId and p.procedureId = :procedureKey)"),
    @NamedQuery(name = "MeasurementsPerformed.findMutantMeasurements", query = "SELECT new org.mousephenotype.dcc.entities.overviews.MeasuredValues(m.measurementId, p.animalId, p.animalName, p.genotypeId, p.strainId, p.sex, p.zygosity, p.startDate, m.increment, m.value, m.trackerId) FROM MeasurementsPerformed m, ProcedureAnimalOverview p, Pipeline i WHERE (m.centreId = :centreId and m.genotypeId = :genotypeId and m.strainId = :strainId and m.parameterId = :parameterKey and p.procedureOccurrenceId = m.procedureOccurrenceId and p.procedureId = :procedureKey and p.pipeline = i.pipelineKey and i.pipelineId = :pipelineId)"),
    @NamedQuery(name = "MeasurementsPerformed.findBaselineMeasurements", query = "SELECT new org.mousephenotype.dcc.entities.overviews.MeasuredValues(m.measurementId, b.animalId, b.animalName, b.genotypeId, b.strainId, b.sex, b.zygosity, b.startDate, m.increment, m.value, m.trackerId) FROM MeasurementsPerformed m, ProcedureAnimalOverview b WHERE (b.procedureOccurrenceId = m.procedureOccurrenceId AND b.centreId = :centreId AND b.pipeline = :pipeline AND b.genotypeId = 0 AND b.strainId = :strainId AND b.procedureId = :procedureId AND m.parameterId = :parameterId AND b.metadataGroup = :metadataGroup)")})
public class MeasurementsPerformed implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "measurements_performed_id", nullable = false)
    private Long measurementsPerformedId;
    @Basic(optional = false)
    @Column(name = "short_name", nullable = false, length = 20)
    private String shortName;
    @Basic(optional = false)
    @Column(name = "centre_id", nullable = false)
    private Integer centreId;
    @Column(length = 255)
    private String strain;
    @Basic(optional = false)
    @Column(name = "strain_id", nullable = false)
    private Integer strainId;
    @Column(length = 255)
    private String value;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean sex;
    @Column(length = 40)
    private String increment;
    @Column(name = "parameter_id", length = 45)
    private String parameterId;
    @Basic(optional = false)
    @Column(name = "genotype_id", nullable = false)
    private Integer genotypeId;
    @Basic(optional = false)
    @Column(name = "animal_id", nullable = false)
    private Integer animalId;
    @Column(name = "animal_name", length = 255)
    private String animalName;
    @Column(length = 255)
    private String genotype;
    @Basic(optional = false)
    @Column(name = "procedure_occurrence_id", nullable = false)
    private Integer procedureOccurrenceId;
    @Basic(optional = false)
    @Column(name = "measurement_id", nullable = false)
    private Long measurementId;
    @Column(name = "measurement_type", length = 255)
    private String measurementType;
    @Basic(optional = false)
    @Column(name = "tracker_id", nullable = false)
    private Long trackerId;

    public MeasurementsPerformed() {
    }

    public MeasurementsPerformed(Long measurementsPerformedId) {
        this.measurementsPerformedId = measurementsPerformedId;
    }

    public MeasurementsPerformed(Long measurementsPerformedId,
            String shortName, Integer centreId, Integer strainId,
            boolean sex, Integer genotypeId, Integer animalId,
            Integer procedureOccurrenceId, Long measurementId,
            Long trackerId) {
        this.measurementsPerformedId = measurementsPerformedId;
        this.shortName = shortName;
        this.centreId = centreId;
        this.strainId = strainId;
        this.sex = sex;
        this.genotypeId = genotypeId;
        this.animalId = animalId;
        this.procedureOccurrenceId = procedureOccurrenceId;
        this.measurementId = measurementId;
        this.trackerId = trackerId;
    }

    public Long getMeasurementsPerformedId() {
        return measurementsPerformedId;
    }

    public void setMeasurementsPerformedId(Long measurementsPerformedId) {
        this.measurementsPerformedId = measurementsPerformedId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getCentreId() {
        return centreId;
    }

    public void setCentreId(Integer centreId) {
        this.centreId = centreId;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Integer getStrainId() {
        return strainId;
    }

    public void setStrainId(Integer strainId) {
        this.strainId = strainId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getIncrement() {
        return increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getGenotypeId() {
        return genotypeId;
    }

    public void setGenotypeId(Integer genotypeId) {
        this.genotypeId = genotypeId;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public Integer getProcedureOccurrenceId() {
        return procedureOccurrenceId;
    }

    public void setProcedureOccurrenceId(Integer procedureOccurrenceId) {
        this.procedureOccurrenceId = procedureOccurrenceId;
    }

    public Long getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(Long measurementId) {
        this.measurementId = measurementId;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public Long getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Long trackerId) {
        this.trackerId = trackerId;
    }
}
