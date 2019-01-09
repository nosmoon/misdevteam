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


package chosun.ciis.ad.common.rec;

import java.sql.*;
import chosun.ciis.ad.common.dm.*;
import chosun.ciis.ad.common.ds.*;

/**
 * 
 */


public class AD_CO_1700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gb;
	public String seq;
	public String sect;
	public String dn;
	public String cm;
	public String advt_cont;
	public String dlco_nm;
	public String preng_uprc;
	public String preng_fee;
	public String asum_uprc;
	public String asum_fee;
	public String dffn_fee;
	public String slcrg_pers;

	public AD_CO_1700_LCURLISTRecord(){}

	public void setGb(String gb){
		this.gb = gb;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPreng_uprc(String preng_uprc){
		this.preng_uprc = preng_uprc;
	}

	public void setPreng_fee(String preng_fee){
		this.preng_fee = preng_fee;
	}

	public void setAsum_uprc(String asum_uprc){
		this.asum_uprc = asum_uprc;
	}

	public void setAsum_fee(String asum_fee){
		this.asum_fee = asum_fee;
	}

	public void setDffn_fee(String dffn_fee){
		this.dffn_fee = dffn_fee;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public String getGb(){
		return this.gb;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSect(){
		return this.sect;
	}

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPreng_uprc(){
		return this.preng_uprc;
	}

	public String getPreng_fee(){
		return this.preng_fee;
	}

	public String getAsum_uprc(){
		return this.asum_uprc;
	}

	public String getAsum_fee(){
		return this.asum_fee;
	}

	public String getDffn_fee(){
		return this.dffn_fee;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}
}

/* 작성시간 : Tue May 03 11:24:03 KST 2016 */