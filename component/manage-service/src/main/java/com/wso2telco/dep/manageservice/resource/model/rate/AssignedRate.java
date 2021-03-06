package com.wso2telco.dep.manageservice.resource.model.rate;

import com.fasterxml.jackson.annotation.*;
import com.wso2telco.dep.manageservice.resource.resource.RequestTransferable;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * <p>
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "operator",
        "apiOperation",
        "rateDefinition",
        "createdBy"
})
public class AssignedRate implements RequestTransferable {

    @JsonProperty("operator")
    private Operator operator;
    @JsonProperty("apiOperation")
    private ApiOperation apiOperation;
    @JsonProperty("rateDefinition")
    private RateDefinition rateDefinition;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("operator")
    public Operator getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @JsonProperty("apiOperation")
    public ApiOperation getApiOperation() {
        return apiOperation;
    }

    @JsonProperty("apiOperation")
    public void setApiOperation(ApiOperation apiOperation) {
        this.apiOperation = apiOperation;
    }

    @JsonProperty("rateDefinition")
    public RateDefinition getRateDefinition() {
        return rateDefinition;
    }

    @JsonProperty("rateDefinition")
    public void setRateDefinition(RateDefinition rateDefinition) {
        this.rateDefinition = rateDefinition;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
