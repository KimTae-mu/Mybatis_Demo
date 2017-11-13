package com.msic.pojo;

import java.util.ArrayList;
import java.util.List;

public class FansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FansExample() {
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

        public Criteria andFansIdIsNull() {
            addCriterion("fans_id is null");
            return (Criteria) this;
        }

        public Criteria andFansIdIsNotNull() {
            addCriterion("fans_id is not null");
            return (Criteria) this;
        }

        public Criteria andFansIdEqualTo(Integer value) {
            addCriterion("fans_id =", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotEqualTo(Integer value) {
            addCriterion("fans_id <>", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdGreaterThan(Integer value) {
            addCriterion("fans_id >", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_id >=", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdLessThan(Integer value) {
            addCriterion("fans_id <", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdLessThanOrEqualTo(Integer value) {
            addCriterion("fans_id <=", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdIn(List<Integer> values) {
            addCriterion("fans_id in", values, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotIn(List<Integer> values) {
            addCriterion("fans_id not in", values, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdBetween(Integer value1, Integer value2) {
            addCriterion("fans_id between", value1, value2, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_id not between", value1, value2, "fansId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserFocusIsNull() {
            addCriterion("user_focus is null");
            return (Criteria) this;
        }

        public Criteria andUserFocusIsNotNull() {
            addCriterion("user_focus is not null");
            return (Criteria) this;
        }

        public Criteria andUserFocusEqualTo(Integer value) {
            addCriterion("user_focus =", value, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusNotEqualTo(Integer value) {
            addCriterion("user_focus <>", value, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusGreaterThan(Integer value) {
            addCriterion("user_focus >", value, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_focus >=", value, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusLessThan(Integer value) {
            addCriterion("user_focus <", value, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusLessThanOrEqualTo(Integer value) {
            addCriterion("user_focus <=", value, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusIn(List<Integer> values) {
            addCriterion("user_focus in", values, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusNotIn(List<Integer> values) {
            addCriterion("user_focus not in", values, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusBetween(Integer value1, Integer value2) {
            addCriterion("user_focus between", value1, value2, "userFocus");
            return (Criteria) this;
        }

        public Criteria andUserFocusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_focus not between", value1, value2, "userFocus");
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