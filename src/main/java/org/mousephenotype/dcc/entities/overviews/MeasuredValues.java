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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Gagarine Yaikhom <g.yaikhom@har.mrc.ac.uk>
 */
@Entity
@XmlRootElement
@XmlType(propOrder = {"m", "a", "n", "g", "t", "s", "z", "d", "i", "v", "x", "u"})
public class MeasuredValues implements Serializable {

    @Id
    private Long measurementId;
    private BigInteger animalId;
    private String animalName;
    private BigInteger genotype;
    private BigInteger strain;
    private Integer sex;
    private Integer zygosity;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    private String increment;
    private String value;
    private Long trackerId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified;

    public MeasuredValues() {
    }

    public MeasuredValues(Long measurementId, BigInteger animalId,
            String animalName, BigInteger genotype, BigInteger strain,
            Integer sex, Integer zygosity, Date startDate, String increment,
            String value, Long trackerId) {
        this.measurementId = measurementId;
        this.animalId = animalId;
        this.animalName = animalName;
        this.genotype = genotype;
        this.strain = strain;
        this.sex = sex;
        this.zygosity = zygosity;
        this.startDate = startDate;
        this.increment = increment;
        this.value = value;
        this.trackerId = trackerId;
    }

    @XmlElement(name = "m")
    public Long getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(Long measurementId) {
        this.measurementId = measurementId;
    }

    @XmlElement(name = "a")
    public BigInteger getAnimalId() {
        return animalId;
    }

    public void setAnimalId(BigInteger animalId) {
        this.animalId = animalId;
    }

    @XmlElement(name = "n")
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @XmlElement(name = "i")
    public String getIncrement() {
        return increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    @XmlElement(name = "g")
    public BigInteger getGenotype() {
        return genotype;
    }

    public void setGenotype(BigInteger genotype) {
        this.genotype = genotype;
    }

    @XmlElement(name = "t")
    public BigInteger getStrain() {
        return strain;
    }

    public void setStrain(BigInteger strain) {
        this.strain = strain;
    }

    @XmlElement(name = "s")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @XmlElement(name = "z")
    public Integer getZygosity() {
        return zygosity;
    }

    public void setZygosity(Integer zygosity) {
        this.zygosity = zygosity;
    }

    @XmlElement(name = "d")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement(name = "v")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlElement(name = "x")
    public Long getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Long trackerId) {
        this.trackerId = trackerId;
    }

    @XmlElement(name = "u")
    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}
