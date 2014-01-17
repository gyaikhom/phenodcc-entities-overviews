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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Gagarine Yaikhom <g.yaikhom@har.mrc.ac.uk>
 */
@Entity
@Table(name = "centre", catalog = "phenodcc_overviews", schema = "")
@XmlRootElement
@XmlType(propOrder = {"i", "f", "s", "a", "t", "c", "u", "m"})
@NamedQueries({
    @NamedQuery(name = "Centre.findAll", query = "SELECT c FROM Centre c"),
    @NamedQuery(name = "Centre.findByCentreId", query = "SELECT c FROM Centre c WHERE c.centreId = :centreId"),
    @NamedQuery(name = "Centre.findByFullName", query = "SELECT c FROM Centre c WHERE c.fullName = :fullName"),
    @NamedQuery(name = "Centre.findByShortName", query = "SELECT c FROM Centre c WHERE c.shortName = :shortName"),
    @NamedQuery(name = "Centre.findByAddress", query = "SELECT c FROM Centre c WHERE c.address = :address"),
    @NamedQuery(name = "Centre.findByTelephoneNumber", query = "SELECT c FROM Centre c WHERE c.telephoneNumber = :telephoneNumber"),
    @NamedQuery(name = "Centre.findByContactName", query = "SELECT c FROM Centre c WHERE c.contactName = :contactName"),
    @NamedQuery(name = "Centre.findByUrl", query = "SELECT c FROM Centre c WHERE c.url = :url"),
    @NamedQuery(name = "Centre.findByImitsName", query = "SELECT c FROM Centre c WHERE c.imitsName = :imitsName")})
public class Centre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "centre_id", nullable = false)
    private Integer centreId;
    @Column(name = "full_name", length = 255)
    private String fullName;
    @Basic(optional = false)
    @Column(name = "short_name", nullable = false, length = 20)
    private String shortName;
    @Column(length = 1024)
    private String address;
    @Column(name = "telephone_number", length = 20)
    private String telephoneNumber;
    @Column(name = "contact_name", length = 255)
    private String contactName;
    @Column(length = 255)
    private String url;
    @Column(name = "imits_name", length = 55)
    private String imitsName;

    public Centre() {
    }

    public Centre(Integer centreId) {
        this.centreId = centreId;
    }

    public Centre(Integer centreId, String shortName) {
        this.centreId = centreId;
        this.shortName = shortName;
    }

    @XmlElement(name = "i")
    public Integer getCentreId() {
        return centreId;
    }

    public void setCentreId(Integer centreId) {
        this.centreId = centreId;
    }

    @XmlElement(name = "f")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @XmlElement(name = "s")
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @XmlElement(name = "a")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement(name = "t")
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @XmlElement(name = "c")
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @XmlElement(name = "u")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlElement(name = "m")
    public String getImitsName() {
        return imitsName;
    }

    public void setImitsName(String imitsName) {
        this.imitsName = imitsName;
    }
}
