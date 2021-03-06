package cn.zjnu.hmz.model;

import java.util.ArrayList;
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

        public Criteria andDoorIdEqualTo(String value) {
            addCriterion("door_id =", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotEqualTo(String value) {
            addCriterion("door_id <>", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdGreaterThan(String value) {
            addCriterion("door_id >", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdGreaterThanOrEqualTo(String value) {
            addCriterion("door_id >=", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLessThan(String value) {
            addCriterion("door_id <", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLessThanOrEqualTo(String value) {
            addCriterion("door_id <=", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdLike(String value) {
            addCriterion("door_id like", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotLike(String value) {
            addCriterion("door_id not like", value, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdIn(List<String> values) {
            addCriterion("door_id in", values, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotIn(List<String> values) {
            addCriterion("door_id not in", values, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdBetween(String value1, String value2) {
            addCriterion("door_id between", value1, value2, "doorId");
            return (Criteria) this;
        }

        public Criteria andDoorIdNotBetween(String value1, String value2) {
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

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("add_time like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("add_time not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
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

        public Criteria andDoorKindIsNull() {
            addCriterion("door_kind is null");
            return (Criteria) this;
        }

        public Criteria andDoorKindIsNotNull() {
            addCriterion("door_kind is not null");
            return (Criteria) this;
        }

        public Criteria andDoorKindEqualTo(String value) {
            addCriterion("door_kind =", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindNotEqualTo(String value) {
            addCriterion("door_kind <>", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindGreaterThan(String value) {
            addCriterion("door_kind >", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindGreaterThanOrEqualTo(String value) {
            addCriterion("door_kind >=", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindLessThan(String value) {
            addCriterion("door_kind <", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindLessThanOrEqualTo(String value) {
            addCriterion("door_kind <=", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindLike(String value) {
            addCriterion("door_kind like", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindNotLike(String value) {
            addCriterion("door_kind not like", value, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindIn(List<String> values) {
            addCriterion("door_kind in", values, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindNotIn(List<String> values) {
            addCriterion("door_kind not in", values, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindBetween(String value1, String value2) {
            addCriterion("door_kind between", value1, value2, "doorKind");
            return (Criteria) this;
        }

        public Criteria andDoorKindNotBetween(String value1, String value2) {
            addCriterion("door_kind not between", value1, value2, "doorKind");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNull() {
            addCriterion("dimension is null");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNotNull() {
            addCriterion("dimension is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionEqualTo(String value) {
            addCriterion("dimension =", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotEqualTo(String value) {
            addCriterion("dimension <>", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThan(String value) {
            addCriterion("dimension >", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThanOrEqualTo(String value) {
            addCriterion("dimension >=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThan(String value) {
            addCriterion("dimension <", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThanOrEqualTo(String value) {
            addCriterion("dimension <=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLike(String value) {
            addCriterion("dimension like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotLike(String value) {
            addCriterion("dimension not like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionIn(List<String> values) {
            addCriterion("dimension in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotIn(List<String> values) {
            addCriterion("dimension not in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionBetween(String value1, String value2) {
            addCriterion("dimension between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotBetween(String value1, String value2) {
            addCriterion("dimension not between", value1, value2, "dimension");
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