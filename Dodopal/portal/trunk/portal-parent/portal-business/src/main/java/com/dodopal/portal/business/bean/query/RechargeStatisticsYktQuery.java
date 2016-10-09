package com.dodopal.portal.business.bean.query;

import com.dodopal.common.model.QueryBase;

/**
 *  一卡通充值统计查询
 * @author hxc
 *
 */
public class RechargeStatisticsYktQuery extends QueryBase{

		private static final long serialVersionUID = -1191791856702313608L;

		//pos号
		private String proCode;
		//启用标识
		private String bind;
		//商户名称
		private String merName;
		//开始日期
		private String startDate;
		//结束日期
		private String endDate;
		//城市
		private String cityName;
		
		//上级商户号
		private String parentCode;
		//通卡公司code
		private String yktCode;
		
		//订单状态
		private String states;
		
		
		
		public String getStates() {
            return states;
        }
        public void setStates(String states) {
            this.states = states;
        }
        public String getYktCode() {
			return yktCode;
		}
		public void setYktCode(String yktCode) {
			this.yktCode = yktCode;
		}
		public String getParentCode() {
			return parentCode;
		}
		public void setParentCode(String parentCode) {
			this.parentCode = parentCode;
		}
		public String getProCode() {
			return proCode;
		}
		public void setProCode(String proCode) {
			this.proCode = proCode;
		}
		public String getBind() {
			return bind;
		}
		public void setBind(String bind) {
			this.bind = bind;
		}
		public String getMerName() {
			return merName;
		}
		public void setMerName(String merName) {
			this.merName = merName;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
}
