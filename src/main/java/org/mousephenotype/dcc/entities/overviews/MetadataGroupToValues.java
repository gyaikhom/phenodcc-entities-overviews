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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gagarine Yaikhom <g.yaikhom@har.mrc.ac.uk>
 */
@Entity
@Table(name = "metadata_group_to_values", catalog = "phenodcc_overviews", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MetadataGroupToValues.findAll", query = "SELECT m FROM MetadataGroupToValues m"),
    @NamedQuery(name = "MetadataGroupToValues.findByMetadataGroupToValuesId", query = "SELECT m FROM MetadataGroupToValues m WHERE m.metadataGroupToValuesId = :metadataGroupToValuesId"),
    @NamedQuery(name = "MetadataGroupToValues.findByMetadataGroup", query = "SELECT m FROM MetadataGroupToValues m WHERE m.metadataGroup = :metadataGroup"),
    @NamedQuery(name = "MetadataGroupToValues.findByMetadataJson", query = "SELECT m FROM MetadataGroupToValues m WHERE m.metadataJson = :metadataJson")})
public class MetadataGroupToValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "metadata_group_to_values_id", nullable = false)
    private Long metadataGroupToValuesId;
    @Column(name = "metadata_group", length = 45)
    private String metadataGroup;
    @Column(name = "metadata_json", length = 4092)
    private String metadataJson;
    @Transient
    private Map<String, String> metadata = null;

    private Map<String, String> parseToJson(String s) {
        Map<String, String> kv = new HashMap<>();
        JSONParser parser = new JSONParser();
        s = "{" + s + "}";
        try {
            JSONObject json = (JSONObject) parser.parse(s);
            Set keys = json.keySet();
            Iterator j = keys.iterator();
            while (j.hasNext()) {
                String k = (String) j.next();
                String v = (String) json.get(k);
                kv.put(k, v);
            }
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        return kv;
    }

    public MetadataGroupToValues() {
    }

    public MetadataGroupToValues(Long metadataGroupToValuesId) {
    }

    @XmlElement(name = "i")
    public Long getMetadataGroupToValuesId() {
        return metadataGroupToValuesId;
    }

    public void setMetadataGroupToValuesId(Long metadataGroupToValuesId) {
        this.metadataGroupToValuesId = metadataGroupToValuesId;
    }

    @XmlElement(name = "g")
    public String getMetadataGroup() {
        return metadataGroup;
    }

    public void setMetadataGroup(String metadataGroup) {
        this.metadataGroup = metadataGroup;
    }

    @XmlTransient
    public String getMetadataJson() {
        return metadataJson;
    }

    public void setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
    }

    @XmlElement(name = "v")
    public Map<String, String> getMetadata() {
        if (metadata == null) {
            metadata = parseToJson(metadataJson);
        }
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

}
