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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_7011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String fac_clsf_nm;
	public String ispt_clsf;
	public String ispt_clsf_nm;
	public String ispt_cd;
	public String ispt_nm;
	public String ispt_clas1;
	public String ispt_clas2;
	public String ispt_clas1_nm;
	public String ispt_clas2_nm;
	public String ispt_clas3;
	public String ispt_clas4;
	public String ispt_clas3_nm;
	public String ispt_clas4_nm;
	public String ispt_months;
	public String ispt_days;
	public String remk;
	public String chg_pers;
	public String chg_dt_tm;

	public PR_PAPMAKE_7011_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setIspt_clsf(String ispt_clsf){
		this.ispt_clsf = ispt_clsf;
	}

	public void setIspt_cd(String ispt_cd){
		this.ispt_cd = ispt_cd;
	}

	public void setIspt_nm(String ispt_nm){
		this.ispt_nm = ispt_nm;
	}

	public void setIspt_clas1(String ispt_clas1){
		this.ispt_clas1 = ispt_clas1;
	}

	public void setIspt_clas2(String ispt_clas2){
		this.ispt_clas2 = ispt_clas2;
	}

	public void setIspt_clas1_nm(String ispt_clas1_nm){
		this.ispt_clas1_nm = ispt_clas1_nm;
	}

	public void setIspt_clas2_nm(String ispt_clas2_nm){
		this.ispt_clas2_nm = ispt_clas2_nm;
	}

	public void setIspt_clas3(String ispt_clas3){
		this.ispt_clas3 = ispt_clas3;
	}

	public void setIspt_clas4(String ispt_clas4){
		this.ispt_clas4 = ispt_clas4;
	}

	public void setIspt_clas3_nm(String ispt_clas3_nm){
		this.ispt_clas3_nm = ispt_clas3_nm;
	}

	public void setIspt_clas4_nm(String ispt_clas4_nm){
		this.ispt_clas4_nm = ispt_clas4_nm;
	}

	public void setIspt_months(String ispt_months){
		this.ispt_months = ispt_months;
	}

	public void setIspt_days(String ispt_days) {
		this.ispt_days = ispt_days;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setIspt_clsf_nm(String ispt_clsf_nm) {
		this.ispt_clsf_nm = ispt_clsf_nm;
	}


	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getIspt_clsf(){
		return this.ispt_clsf;
	}

	public String getIspt_cd(){
		return this.ispt_cd;
	}

	public String getIspt_nm(){
		return this.ispt_nm;
	}

	public String getIspt_clas1(){
		return this.ispt_clas1;
	}

	public String getIspt_clas2(){
		return this.ispt_clas2;
	}

	public String getIspt_clas1_nm(){
		return this.ispt_clas1_nm;
	}

	public String getIspt_clas2_nm(){
		return this.ispt_clas2_nm;
	}

	public String getIspt_clas3(){
		return this.ispt_clas3;
	}

	public String getIspt_clas4(){
		return this.ispt_clas4;
	}

	public String getIspt_clas3_nm(){
		return this.ispt_clas3_nm;
	}

	public String getIspt_clas4_nm(){
		return this.ispt_clas4_nm;
	}

	public String getIspt_months(){
		return this.ispt_months;
	}

	public String getIspt_days() {
		return ispt_days;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
	
	public String getIspt_clsf_nm() {
		return ispt_clsf_nm;
	}


}

/* 작성시간 : Tue Dec 22 19:00:48 KST 2015 */