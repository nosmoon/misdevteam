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


package chosun.ciis.ad.brn.rec;

import java.sql.*;
import chosun.ciis.ad.brn.dm.*;
import chosun.ciis.ad.brn.ds.*;

/**
 * 
 */


public class AD_BRN_2012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String make_dt;
	public int rept_no;
	public String advcs_clsf;
	public String medi_clsf;
	public String chrg_pers;
	public String dlco_no;
	public String patr_chrg_pers;
	public String titl;
	public String cont;
	public String chrg_chf_yn;	
	public String taem_chf_opn;
	public String team_chf_yn;
	public String hdqt_chf_yn;
	public String add_file_no;
	public String add_file_nm;

	public AD_BRN_2012_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setRept_no(int rept_no){
		this.rept_no = rept_no;
	}

	public void setAdvcs_clsf(String advcs_clsf){
		this.advcs_clsf = advcs_clsf;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPatr_chrg_pers(String patr_chrg_pers){
		this.patr_chrg_pers = patr_chrg_pers;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setChrg_chf_yn(String chrg_chf_yn){
		this.chrg_chf_yn = chrg_chf_yn;
	}
	
	public void setTaem_chf_opn(String taem_chf_opn){
		this.taem_chf_opn = taem_chf_opn;
	}

	public void setTeam_chf_yn(String team_chf_yn){
		this.team_chf_yn = team_chf_yn;
	}

	public void setHdqt_chf_yn(String hdqt_chf_yn){
		this.hdqt_chf_yn = hdqt_chf_yn;
	}

	public void setAdd_file_no(String add_file_no){
		this.add_file_no = add_file_no;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public int getRept_no(){
		return this.rept_no;
	}

	public String getAdvcs_clsf(){
		return this.advcs_clsf;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPatr_chrg_pers(){
		return this.patr_chrg_pers;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getChrg_chf_yn(){
		return this.chrg_chf_yn;
	}
	
	public String getTaem_chf_opn(){
		return this.taem_chf_opn;
	}

	public String getTeam_chf_yn(){
		return this.team_chf_yn;
	}

	public String getHdqt_chf_yn(){
		return this.hdqt_chf_yn;
	}

	public String getAdd_file_no(){
		return this.add_file_no;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}
}

/* 작성시간 : Mon Aug 06 11:35:40 KST 2012 */