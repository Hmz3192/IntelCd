package cn.zjnu.hmz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoorExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andDoorNameIsNull() {
            addCriterion("door_name is null");
            return (Criteria) this;
        }

        public Criteria andDoorNameIsNotNull() {
            addCriterion("door_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoorNameEqualTo(String value) {
            addCriterion("door_name =", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameNotEqualTo(String value) {
            addCriterion("door_name <>", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameGreaterThan(String value) {
            addCriterion("door_name >", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameGreaterThanOrEqualTo(String value) {
            addCriterion("door_name >=", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameLessThan(String value) {
            addCriterion("door_name <", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameLessThanOrEqualTo(String value) {
            addCriterion("door_name <=", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameLike(String value) {
            addCriterion("door_name like", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameNotLike(String value) {
            addCriterion("door_name not like", value, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameIn(List<String> values) {
            addCriterion("door_name in", values, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameNotIn(List<String> values) {
            addCriterion("door_name not in", values, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameBetween(String value1, String value2) {
            addCriterion("door_name between", value1, value2, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorNameNotBetween(String value1, String value2) {
            addCriterion("door_name not between", value1, value2, "doorName");
            return (Criteria) this;
        }

        public Criteria andDoorLocationIsNull() {
            addCriterion("door_location is null");
            return (Criteria) this;
        }

        public Criteria andDoorLocationIsNotNull() {
            addCriterion("door_location is not null");
            return (Criteria) this;
        }

        public Criteria andDoorLocationEqualTo(String value) {
            addCriterion("door_location =", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationNotEqualTo(String value) {
            addCriterion("door_location <>", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationGreaterThan(String value) {
            addCriterion("door_location >", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationGreaterThanOrEqualTo(String value) {
            addCriterion("door_location >=", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationLessThan(String value) {
            addCriterion("door_location <", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationLessThanOrEqualTo(String value) {
            addCriterion("door_location <=", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationLike(String value) {
            addCriterion("door_location like", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationNotLike(String value) {
            addCriterion("door_location not like", value, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationIn(List<String> values) {
            addCriterion("door_location in", values, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationNotIn(List<String> values) {
            addCriterion("door_location not in", values, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationBetween(String value1, String value2) {
            addCriterion("door_location between", value1, value2, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorLocationNotBetween(String value1, String value2) {
            addCriterion("door_location not between", value1, value2, "doorLocation");
            return (Criteria) this;
        }

        public Criteria andDoorIdIsNull() {
            addCriterion("door_id is null");
            return (Criteria) this;
        }

        public Criteria andDoorIdIsNotNull() {
            addCriterion("door_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoorIdEqualTo(Integer value) {
            addCriterion("door_id =", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotEqualTo(Integer value) {
            addCriterion("door_id <>", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdGreaterThan(Integer value) {
            addCriterion("door_id >", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("door_id >=", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLessThan(Integer value) {
            addCriterion("door_id <", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLessThanOrEqualTo(Integer value) {
            addCriterion("door_id <=", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdIn(List<Integer> values) {
            addCriterion("door_id in", values, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotIn(List<Integer> values) {
            addCriterion("door_id not in", values, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdBetween(Integer value1, Integer value2) {
            addCriterion("door_id between", value1, value2, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("door_id not between", value1, value2, "doorId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andDoorStateIsNull() {
            addCriterion("door_state is null");
            return (Criteria) this;
        }

        public Criteria andDoorStateIsNotNull() {
            addCriterion("door_state is not null");
            return (Criteria) this;
        }

        public Criteria andDoorStateEqualTo(String value) {
            addCriterion("door_state =", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotEqualTo(String value) {
            addCriterion("door_state <>", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateGreaterThan(String value) {
            addCriterion("door_state >", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateGreaterThanOrEqualTo(String value) {
            addCriterion("door_state >=", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateLessThan(String value) {
            addCriterion("door_state <", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateLessThanOrEqualTo(String value) {
            addCriterion("door_state <=", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateLike(String value) {
            addCriterion("door_state like", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotLike(String value) {
            addCriterion("door_state not like", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateIn(List<String> values) {
            addCriterion("door_state in", values, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotIn(List<String> values) {
            addCriterion("door_state not in", values, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateBetween(String value1, String value2) {
            addCriterion("door_state between", value1, value2, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotBetween(String value1, String value2) {
            addCriterion("door_state not between", value1, value2, "doorState");
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