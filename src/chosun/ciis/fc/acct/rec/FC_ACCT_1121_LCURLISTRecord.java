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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1121_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String impt_expn_clsf_cd_nm;
	public String fund_cd;
	public String fund_cdnm;
	public String pay_cycl_cd_nm;
	public String pay_wkdy_nm;
	public String pay_dd_nm;
	public String repe_yn_nm;
	public String repe_cycl;
	public String repe_end_yymm;
	public String repe_dd;
	public String use_yn_nm;
	public String impt_expn_clsf_cd;
	public String pay_cycl_cd;
	public String pay_wkdy;
	public String pay_dd;
	public String pay_dd2;
	public String repe_yn;
	public String use_yn;
	public String use_yn_han;
	public String hd_bsdd_afbf_flag;

	public FC_ACCT_1121_LCURLISTRecord(){}

	public void setImpt_expn_clsf_cd_nm(String impt_expn_clsf_cd_nm){
		this.impt_expn_clsf_cd_nm = impt_expn_clsf_cd_nm;
	}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setFund_cdnm(String fund_cdnm){
		this.fund_cdnm = fund_cdnm;
	}

	public void setPay_cycl_cd_nm(String pay_cycl_cd_nm){
		this.pay_cycl_cd_nm = pay_cycl_cd_nm;
	}

	public void setPay_wkdy_nm(String pay_wkdy_nm){
		this.pay_wkdy_nm = pay_wkdy_nm;
	}

	public void setPay_dd_nm(String pay_dd_nm){
		this.pay_dd_nm = pay_dd_nm;
	}

	public void setRepe_yn_nm(String repe_yn_nm){
		this.repe_yn_nm = repe_yn_nm;
	}

	public void setRepe_cycl(String repe_cycl){
		this.repe_cycl = repe_cycl;
	}

	public void setRepe_end_yymm(String repe_end_yymm){
		this.repe_end_yymm = repe_end_yymm;
	}

	public void setRepe_dd(String repe_dd){
		this.repe_dd = repe_dd;
	}

	public void setUse_yn_nm(String use_yn_nm){
		this.use_yn_nm = use_yn_nm;
	}

	public void setImpt_expn_clsf_cd(String impt_expn_clsf_cd){
		this.impt_expn_clsf_cd = impt_expn_clsf_cd;
	}

	public void setPay_cycl_cd(String pay_cycl_cd){
		this.pay_cycl_cd = pay_cycl_cd;
	}

	public void setPay_wkdy(String pay_wkdy){
		this.pay_wkdy = pay_wkdy;
	}

	public void setPay_dd(String pay_dd){
		this.pay_dd = pay_dd;
	}

	public void setPay_dd2(String pay_dd2){
		this.pay_dd2 = pay_dd2;
	}

	public void setRepe_yn(String repe_yn){
		this.repe_yn = repe_yn;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setUse_yn_han(String use_yn_han){
		this.use_yn_han = use_yn_han;
	}

	public void setHd_bsdd_afbf_flag(String hd_bsdd_afbf_flag){
		this.hd_bsdd_afbf_flag = hd_bsdd_afbf_flag;
	}

	public String getImpt_expn_clsf_cd_nm(){
		return this.impt_expn_clsf_cd_nm;
	}

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getFund_cdnm(){
		return this.fund_cdnm;
	}

	public String getPay_cycl_cd_nm(){
		return this.pay_cycl_cd_nm;
	}

	public String getPay_wkdy_nm(){
		return this.pay_wkdy_nm;
	}

	public String getPay_dd_nm(){
		return this.pay_dd_nm;
	}

	public String getRepe_yn_nm(){
		return this.repe_yn_nm;
	}

	public String getRepe_cycl(){
		return this.repe_cycl;
	}

	public String getRepe_end_yymm(){
		return this.repe_end_yymm;
	}

	public String getRepe_dd(){
		return this.repe_dd;
	}

	public String getUse_yn_nm(){
		return this.use_yn_nm;
	}

	public String getImpt_expn_clsf_cd(){
		return this.impt_expn_clsf_cd;
	}

	public String getPay_cycl_cd(){
		return this.pay_cycl_cd;
	}

	public String getPay_wkdy(){
		return this.pay_wkdy;
	}

	public String getPay_dd(){
		return this.pay_dd;
	}

	public String getPay_dd2(){
		return this.pay_dd2;
	}

	public String getRepe_yn(){
		return this.repe_yn;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getUse_yn_han(){
		return this.use_yn_han;
	}

	public String getHd_bsdd_afbf_flag(){
		return this.hd_bsdd_afbf_flag;
	}
}

/* 작성시간 : Wed May 06 17:59:19 KST 2009 */