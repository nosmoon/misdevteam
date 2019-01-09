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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_2220_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String sido_nm;
	public String gu_nm;
	public String purc_dlco_nm;
	public String incmg_dt;
	public String advcs_nm;
	public String tel_no;
	public String chosun;
	public String jungang;
	public String donga;
	public String incmg_pers_clsf_nm;

	public IS_BUS_2220_LCURLIST_1Record(){}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setGu_nm(String gu_nm){
		this.gu_nm = gu_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setChosun(String chosun){
		this.chosun = chosun;
	}

	public void setJungang(String jungang){
		this.jungang = jungang;
	}

	public void setDonga(String donga){
		this.donga = donga;
	}

	public void setIncmg_pers_clsf_nm(String incmg_pers_clsf_nm){
		this.incmg_pers_clsf_nm = incmg_pers_clsf_nm;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getGu_nm(){
		return this.gu_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getChosun(){
		return this.chosun;
	}

	public String getJungang(){
		return this.jungang;
	}

	public String getDonga(){
		return this.donga;
	}

	public String getIncmg_pers_clsf_nm(){
		return this.incmg_pers_clsf_nm;
	}
}

/* 작성시간 : Thu Jun 21 19:41:12 KST 2012 */