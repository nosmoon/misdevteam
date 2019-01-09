/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_3130_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String lbl;
	public String tot_date;
	public String tot_side;
	public String tot_dn;
	public String tot_advt_fee;
	public String avg_daily_fee;
	public String avg_side_fee;
	public String avg_advt_ocpy_rate;

	public AD_BAS_3130_LCURLIST2Record(){}

	public void setLbl(String lbl){
		this.lbl = lbl;
	}

	public void setTot_date(String tot_date){
		this.tot_date = tot_date;
	}

	public void setTot_side(String tot_side){
		this.tot_side = tot_side;
	}

	public void setTot_dn(String tot_dn){
		this.tot_dn = tot_dn;
	}

	public void setTot_advt_fee(String tot_advt_fee){
		this.tot_advt_fee = tot_advt_fee;
	}

	public void setAvg_daily_fee(String avg_daily_fee){
		this.avg_daily_fee = avg_daily_fee;
	}

	public void setAvg_side_fee(String avg_side_fee){
		this.avg_side_fee = avg_side_fee;
	}

	public void setAvg_advt_ocpy_rate(String avg_advt_ocpy_rate){
		this.avg_advt_ocpy_rate = avg_advt_ocpy_rate;
	}

	public String getLbl(){
		return this.lbl;
	}

	public String getTot_date(){
		return this.tot_date;
	}

	public String getTot_side(){
		return this.tot_side;
	}

	public String getTot_dn(){
		return this.tot_dn;
	}

	public String getTot_advt_fee(){
		return this.tot_advt_fee;
	}

	public String getAvg_daily_fee(){
		return this.avg_daily_fee;
	}

	public String getAvg_side_fee(){
		return this.avg_side_fee;
	}

	public String getAvg_advt_ocpy_rate(){
		return this.avg_advt_ocpy_rate;
	}
}

/* 작성시간 : Mon Apr 20 16:52:19 KST 2009 */