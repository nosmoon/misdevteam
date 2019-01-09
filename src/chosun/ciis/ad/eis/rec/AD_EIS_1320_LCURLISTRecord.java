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


package chosun.ciis.ad.eis.rec;


/**
 * 
 */


public class AD_EIS_1320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_yy;
	public String advt_fee;
	public String tot_pcnt;
	public String self_advt_tot;
	public String bef_advt_fee;
	public String bef_tot_pcnt;
	public String bef_self_advt_tot;

	public AD_EIS_1320_LCURLISTRecord(){}

	public void setPubc_yy(String pubc_yy){
		this.pubc_yy = pubc_yy;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setTot_pcnt(String tot_pcnt){
		this.tot_pcnt = tot_pcnt;
	}

	public void setSelf_advt_tot(String self_advt_tot){
		this.self_advt_tot = self_advt_tot;
	}

	public void setBef_advt_fee(String bef_advt_fee){
		this.bef_advt_fee = bef_advt_fee;
	}

	public void setBef_tot_pcnt(String bef_tot_pcnt){
		this.bef_tot_pcnt = bef_tot_pcnt;
	}

	public void setBef_self_advt_tot(String bef_self_advt_tot){
		this.bef_self_advt_tot = bef_self_advt_tot;
	}

	public String getPubc_yy(){
		return this.pubc_yy;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getTot_pcnt(){
		return this.tot_pcnt;
	}

	public String getSelf_advt_tot(){
		return this.self_advt_tot;
	}

	public String getBef_advt_fee(){
		return this.bef_advt_fee;
	}

	public String getBef_tot_pcnt(){
		return this.bef_tot_pcnt;
	}

	public String getBef_self_advt_tot(){
		return this.bef_self_advt_tot;
	}
}

/* 작성시간 : Mon Jun 08 10:05:42 KST 2009 */