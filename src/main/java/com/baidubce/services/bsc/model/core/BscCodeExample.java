/*
 * Copyright 2019 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bsc.model.core;

import java.util.ArrayList;
import java.util.List;

/**
 * the access for bsc code table
 */
public class BscCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BscCodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonIsNull() {
            addCriterion("options_json is null");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonIsNotNull() {
            addCriterion("options_json is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonEqualTo(String value) {
            addCriterion("options_json =", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonNotEqualTo(String value) {
            addCriterion("options_json <>", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonGreaterThan(String value) {
            addCriterion("options_json >", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonGreaterThanOrEqualTo(String value) {
            addCriterion("options_json >=", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonLessThan(String value) {
            addCriterion("options_json <", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonLessThanOrEqualTo(String value) {
            addCriterion("options_json <=", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonLike(String value) {
            addCriterion("options_json like", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonNotLike(String value) {
            addCriterion("options_json not like", value, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonIn(List<String> values) {
            addCriterion("options_json in", values, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonNotIn(List<String> values) {
            addCriterion("options_json not in", values, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonBetween(String value1, String value2) {
            addCriterion("options_json between", value1, value2, "optionsJson");
            return (Criteria) this;
        }

        public Criteria andOptionsJsonNotBetween(String value1, String value2) {
            addCriterion("options_json not between", value1, value2, "optionsJson");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}