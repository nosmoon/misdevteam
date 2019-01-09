/***************************************************************************************************
* 파일명 : SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord.java
* 기능 : 센터종합관리-센터관리-센터건전도-매출_모바일용
* 작성일자 : 2016-12-19
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 센터정렬순으로 정렬, 팀,파트,지역으로 조건 넣을 수 있도록 추가.
* 수정자 : 장 선 희
* 수정일자 : 2017-03-16
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String srtseq;
	public String bocd;
	public String bonm;
	public String boclsf;
	public String net_sale_amt;
	public String net_sale_amt_110;
	public String rcpm_amt;
	public String rcpm_rate;
	public String now_bal;
	public String bal;
	public String acct_tot_amt;
	public String pdlv_altn_amt;
	public String vitl_acct_no;

	public SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setSrtseq(String srtseq){
		this.srtseq = srtseq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoclsf(String boclsf){
		this.boclsf = boclsf;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setNet_sale_amt_110(String net_sale_amt_110){
		this.net_sale_amt_110 = net_sale_amt_110;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setNow_bal(String now_bal){
		this.now_bal = now_bal;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setAcct_tot_amt(String acct_tot_amt){
		this.acct_tot_amt = acct_tot_amt;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public void setVitl_acct_no(String vitl_acct_no){
		this.vitl_acct_no = vitl_acct_no;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getSrtseq(){
		return this.srtseq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoclsf(){
		return this.boclsf;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getNet_sale_amt_110(){
		return this.net_sale_amt_110;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getNow_bal(){
		return this.now_bal;
	}

	public String getBal(){
		return this.bal;
	}

	public String getAcct_tot_amt(){
		return this.acct_tot_amt;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}

	public String getVitl_acct_no(){
		return this.vitl_acct_no;
	}
}

/* 작성시간 : Fri Mar 24 16:35:33 KST 2017 */