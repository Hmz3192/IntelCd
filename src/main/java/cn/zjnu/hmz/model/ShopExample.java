package cn.zjnu.hmz.model;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopPicsIsNull() {
            addCriterion("shop_pics is null");
            return (Criteria) this;
        }

        public Criteria andShopPicsIsNotNull() {
            addCriterion("shop_pics is not null");
            return (Criteria) this;
        }

        public Criteria andShopPicsEqualTo(String value) {
            addCriterion("shop_pics =", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsNotEqualTo(String value) {
            addCriterion("shop_pics <>", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsGreaterThan(String value) {
            addCriterion("shop_pics >", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_pics >=", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsLessThan(String value) {
            addCriterion("shop_pics <", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsLessThanOrEqualTo(String value) {
            addCriterion("shop_pics <=", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsLike(String value) {
            addCriterion("shop_pics like", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsNotLike(String value) {
            addCriterion("shop_pics not like", value, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsIn(List<String> values) {
            addCriterion("shop_pics in", values, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsNotIn(List<String> values) {
            addCriterion("shop_pics not in", values, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsBetween(String value1, String value2) {
            addCriterion("shop_pics between", value1, value2, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopPicsNotBetween(String value1, String value2) {
            addCriterion("shop_pics not between", value1, value2, "shopPics");
            return (Criteria) this;
        }

        public Criteria andShopLocationIsNull() {
            addCriterion("shop_location is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationIsNotNull() {
            addCriterion("shop_location is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationEqualTo(String value) {
            addCriterion("shop_location =", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotEqualTo(String value) {
            addCriterion("shop_location <>", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationGreaterThan(String value) {
            addCriterion("shop_location >", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location >=", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLessThan(String value) {
            addCriterion("shop_location <", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLessThanOrEqualTo(String value) {
            addCriterion("shop_location <=", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLike(String value) {
            addCriterion("shop_location like", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotLike(String value) {
            addCriterion("shop_location not like", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationIn(List<String> values) {
            addCriterion("shop_location in", values, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotIn(List<String> values) {
            addCriterion("shop_location not in", values, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationBetween(String value1, String value2) {
            addCriterion("shop_location between", value1, value2, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotBetween(String value1, String value2) {
            addCriterion("shop_location not between", value1, value2, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardIsNull() {
            addCriterion("shop_verify_card is null");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardIsNotNull() {
            addCriterion("shop_verify_card is not null");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardEqualTo(String value) {
            addCriterion("shop_verify_card =", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardNotEqualTo(String value) {
            addCriterion("shop_verify_card <>", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardGreaterThan(String value) {
            addCriterion("shop_verify_card >", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardGreaterThanOrEqualTo(String value) {
            addCriterion("shop_verify_card >=", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardLessThan(String value) {
            addCriterion("shop_verify_card <", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardLessThanOrEqualTo(String value) {
            addCriterion("shop_verify_card <=", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardLike(String value) {
            addCriterion("shop_verify_card like", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardNotLike(String value) {
            addCriterion("shop_verify_card not like", value, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardIn(List<String> values) {
            addCriterion("shop_verify_card in", values, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardNotIn(List<String> values) {
            addCriterion("shop_verify_card not in", values, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardBetween(String value1, String value2) {
            addCriterion("shop_verify_card between", value1, value2, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopVerifyCardNotBetween(String value1, String value2) {
            addCriterion("shop_verify_card not between", value1, value2, "shopVerifyCard");
            return (Criteria) this;
        }

        public Criteria andShopProductsIsNull() {
            addCriterion("shop_products is null");
            return (Criteria) this;
        }

        public Criteria andShopProductsIsNotNull() {
            addCriterion("shop_products is not null");
            return (Criteria) this;
        }

        public Criteria andShopProductsEqualTo(String value) {
            addCriterion("shop_products =", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsNotEqualTo(String value) {
            addCriterion("shop_products <>", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsGreaterThan(String value) {
            addCriterion("shop_products >", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_products >=", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsLessThan(String value) {
            addCriterion("shop_products <", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsLessThanOrEqualTo(String value) {
            addCriterion("shop_products <=", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsLike(String value) {
            addCriterion("shop_products like", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsNotLike(String value) {
            addCriterion("shop_products not like", value, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsIn(List<String> values) {
            addCriterion("shop_products in", values, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsNotIn(List<String> values) {
            addCriterion("shop_products not in", values, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsBetween(String value1, String value2) {
            addCriterion("shop_products between", value1, value2, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andShopProductsNotBetween(String value1, String value2) {
            addCriterion("shop_products not between", value1, value2, "shopProducts");
            return (Criteria) this;
        }

        public Criteria andProductsPicsIsNull() {
            addCriterion("products_pics is null");
            return (Criteria) this;
        }

        public Criteria andProductsPicsIsNotNull() {
            addCriterion("products_pics is not null");
            return (Criteria) this;
        }

        public Criteria andProductsPicsEqualTo(String value) {
            addCriterion("products_pics =", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsNotEqualTo(String value) {
            addCriterion("products_pics <>", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsGreaterThan(String value) {
            addCriterion("products_pics >", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsGreaterThanOrEqualTo(String value) {
            addCriterion("products_pics >=", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsLessThan(String value) {
            addCriterion("products_pics <", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsLessThanOrEqualTo(String value) {
            addCriterion("products_pics <=", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsLike(String value) {
            addCriterion("products_pics like", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsNotLike(String value) {
            addCriterion("products_pics not like", value, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsIn(List<String> values) {
            addCriterion("products_pics in", values, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsNotIn(List<String> values) {
            addCriterion("products_pics not in", values, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsBetween(String value1, String value2) {
            addCriterion("products_pics between", value1, value2, "productsPics");
            return (Criteria) this;
        }

        public Criteria andProductsPicsNotBetween(String value1, String value2) {
            addCriterion("products_pics not between", value1, value2, "productsPics");
            return (Criteria) this;
        }

        public Criteria andShopIntroIsNull() {
            addCriterion("shop_intro is null");
            return (Criteria) this;
        }

        public Criteria andShopIntroIsNotNull() {
            addCriterion("shop_intro is not null");
            return (Criteria) this;
        }

        public Criteria andShopIntroEqualTo(String value) {
            addCriterion("shop_intro =", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotEqualTo(String value) {
            addCriterion("shop_intro <>", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroGreaterThan(String value) {
            addCriterion("shop_intro >", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroGreaterThanOrEqualTo(String value) {
            addCriterion("shop_intro >=", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroLessThan(String value) {
            addCriterion("shop_intro <", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroLessThanOrEqualTo(String value) {
            addCriterion("shop_intro <=", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroLike(String value) {
            addCriterion("shop_intro like", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotLike(String value) {
            addCriterion("shop_intro not like", value, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroIn(List<String> values) {
            addCriterion("shop_intro in", values, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotIn(List<String> values) {
            addCriterion("shop_intro not in", values, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroBetween(String value1, String value2) {
            addCriterion("shop_intro between", value1, value2, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopIntroNotBetween(String value1, String value2) {
            addCriterion("shop_intro not between", value1, value2, "shopIntro");
            return (Criteria) this;
        }

        public Criteria andShopTipsIsNull() {
            addCriterion("shop_tips is null");
            return (Criteria) this;
        }

        public Criteria andShopTipsIsNotNull() {
            addCriterion("shop_tips is not null");
            return (Criteria) this;
        }

        public Criteria andShopTipsEqualTo(String value) {
            addCriterion("shop_tips =", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsNotEqualTo(String value) {
            addCriterion("shop_tips <>", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsGreaterThan(String value) {
            addCriterion("shop_tips >", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsGreaterThanOrEqualTo(String value) {
            addCriterion("shop_tips >=", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsLessThan(String value) {
            addCriterion("shop_tips <", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsLessThanOrEqualTo(String value) {
            addCriterion("shop_tips <=", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsLike(String value) {
            addCriterion("shop_tips like", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsNotLike(String value) {
            addCriterion("shop_tips not like", value, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsIn(List<String> values) {
            addCriterion("shop_tips in", values, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsNotIn(List<String> values) {
            addCriterion("shop_tips not in", values, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsBetween(String value1, String value2) {
            addCriterion("shop_tips between", value1, value2, "shopTips");
            return (Criteria) this;
        }

        public Criteria andShopTipsNotBetween(String value1, String value2) {
            addCriterion("shop_tips not between", value1, value2, "shopTips");
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