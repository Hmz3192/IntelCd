package cn.zjnu.hmz.model;

import java.util.ArrayList;
import java.util.List;

public class DoorRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoorRecordExample() {
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

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenKindIsNull() {
            addCriterion("open_kind is null");
            return (Criteria) this;
        }

        public Criteria andOpenKindIsNotNull() {
            addCriterion("open_kind is not null");
            return (Criteria) this;
        }

        public Criteria andOpenKindEqualTo(String value) {
            addCriterion("open_kind =", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindNotEqualTo(String value) {
            addCriterion("open_kind <>", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindGreaterThan(String value) {
            addCriterion("open_kind >", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindGreaterThanOrEqualTo(String value) {
            addCriterion("open_kind >=", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindLessThan(String value) {
            addCriterion("open_kind <", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindLessThanOrEqualTo(String value) {
            addCriterion("open_kind <=", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindLike(String value) {
            addCriterion("open_kind like", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindNotLike(String value) {
            addCriterion("open_kind not like", value, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindIn(List<String> values) {
            addCriterion("open_kind in", values, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindNotIn(List<String> values) {
            addCriterion("open_kind not in", values, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindBetween(String value1, String value2) {
            addCriterion("open_kind between", value1, value2, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenKindNotBetween(String value1, String value2) {
            addCriterion("open_kind not between", value1, value2, "openKind");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordIsNull() {
            addCriterion("open_password is null");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordIsNotNull() {
            addCriterion("open_password is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordEqualTo(String value) {
            addCriterion("open_password =", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordNotEqualTo(String value) {
            addCriterion("open_password <>", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordGreaterThan(String value) {
            addCriterion("open_password >", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("open_password >=", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordLessThan(String value) {
            addCriterion("open_password <", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordLessThanOrEqualTo(String value) {
            addCriterion("open_password <=", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordLike(String value) {
            addCriterion("open_password like", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordNotLike(String value) {
            addCriterion("open_password not like", value, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordIn(List<String> values) {
            addCriterion("open_password in", values, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordNotIn(List<String> values) {
            addCriterion("open_password not in", values, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordBetween(String value1, String value2) {
            addCriterion("open_password between", value1, value2, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenPasswordNotBetween(String value1, String value2) {
            addCriterion("open_password not between", value1, value2, "openPassword");
            return (Criteria) this;
        }

        public Criteria andOpenResonIsNull() {
            addCriterion("open_reson is null");
            return (Criteria) this;
        }

        public Criteria andOpenResonIsNotNull() {
            addCriterion("open_reson is not null");
            return (Criteria) this;
        }

        public Criteria andOpenResonEqualTo(String value) {
            addCriterion("open_reson =", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonNotEqualTo(String value) {
            addCriterion("open_reson <>", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonGreaterThan(String value) {
            addCriterion("open_reson >", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonGreaterThanOrEqualTo(String value) {
            addCriterion("open_reson >=", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonLessThan(String value) {
            addCriterion("open_reson <", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonLessThanOrEqualTo(String value) {
            addCriterion("open_reson <=", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonLike(String value) {
            addCriterion("open_reson like", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonNotLike(String value) {
            addCriterion("open_reson not like", value, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonIn(List<String> values) {
            addCriterion("open_reson in", values, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonNotIn(List<String> values) {
            addCriterion("open_reson not in", values, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonBetween(String value1, String value2) {
            addCriterion("open_reson between", value1, value2, "openReson");
            return (Criteria) this;
        }

        public Criteria andOpenResonNotBetween(String value1, String value2) {
            addCriterion("open_reson not between", value1, value2, "openReson");
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