/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.model.v20150630;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.batchcompute.pojo.v20150630.JobDescription;
import com.aliyuncs.batchcompute.transform.v20150630.CreateJobRequestMarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class CreateJobRequest extends RoaAcsRequest<CreateJobResponse> {

    public CreateJobRequest() {
        super("BatchCompute", "2015-06-30", "PostJob");
        setUriPattern("/jobs");
        setMethod(MethodType.POST);
    }

    public CreateJobRequest(JobDescription jobDescription) throws ClientException {
        super("BatchCompute", "2015-06-30", "PostJob");
        setUriPattern("/jobs");
        setMethod(MethodType.POST);
        setJobDescription(jobDescription);
    }

    public JobDescription getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(JobDescription jobDescription) throws ClientException {
        this.jobDescription = jobDescription;
        CreateJobRequestMarshaller.marshall(this, jobDescription);
    }

    private JobDescription jobDescription;


    @Override
    public Class<CreateJobResponse> getResponseClass() {
        return CreateJobResponse.class;
    }

}
