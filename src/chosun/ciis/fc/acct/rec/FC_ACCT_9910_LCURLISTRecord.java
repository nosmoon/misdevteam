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


public class FC_ACCT_9910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String chrg_pers;
	public String dlco_no;
	public String dlco_nm;
	public String patr_chrg_pers;
	public String titl;
	public String cont;
	public String tag;
	public String team_chf_yn;
	public String file_yn;
	public String w_file_yn;
	public String p_file_yn;
	public String add_file_no1;
	public String add_file_nm1;
	public String add_file_no2;
	public String add_file_nm2;
	public String add_file_no3;
	public String add_file_nm3;
	public String add_file_no4;
	public String add_file_nm4;
	public String add_file_no5;
	public String add_file_nm5;
	public String add_file_no6;
	public String add_file_nm6;
	public String add_file_no7;
	public String add_file_nm7;
	public String add_file_no8;
	public String add_file_nm8;
	public String add_file_no9;
	public String add_file_nm9;
	public String add_file_no10;
	public String add_file_nm10;
	

	public FC_ACCT_9910_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public void setTag(String tag){
		this.tag = tag;
	}
	
	public void setTeam_chf_yn(String team_chf_yn){
		this.team_chf_yn = team_chf_yn;
	}
	
	public void setFile_yn(String file_yn){
		this.file_yn = file_yn;
	}
	
	public void setW_file_yn(String w_file_yn){
		this.w_file_yn = w_file_yn;
	}
	
	public void setP_file_yn(String p_file_yn){
		this.p_file_yn = p_file_yn;
	}
	
	public void setAdd_file_no1(String add_file_no1){
		this.add_file_no1 = add_file_no1;
	}
	
	public void setAdd_file_no2(String add_file_no2){
		this.add_file_no2 = add_file_no2;
	}
	
	public void setAdd_file_no3(String add_file_no3){
		this.add_file_no3 = add_file_no3;
	}
	
	public void setAdd_file_no4(String add_file_no4){
		this.add_file_no4 = add_file_no4;
	}
	
	public void setAdd_file_no5(String add_file_no5){
		this.add_file_no5 = add_file_no5;
	}
	
	public void setAdd_file_no6(String add_file_no6){
		this.add_file_no6 = add_file_no6;
	}
	
	public void setAdd_file_no7(String add_file_no7){
		this.add_file_no7 = add_file_no7;
	}
	
	public void setAdd_file_no8(String add_file_no8){
		this.add_file_no8 = add_file_no8;
	}
	
	public void setAdd_file_no9(String add_file_no9){
		this.add_file_no9 = add_file_no9;
	}
	
	public void setAdd_file_no10(String add_file_no10){
		this.add_file_no10 = add_file_no10;
	}
	
	public void setAdd_file_nm1(String add_file_nm1){
		this.add_file_nm1 = add_file_nm1;
	}
	
	public void setAdd_file_nm2(String add_file_nm2){
		this.add_file_nm2 = add_file_nm2;
	}
	
	public void setAdd_file_nm3(String add_file_nm3){
		this.add_file_nm3 = add_file_nm3;
	}
	
	public void setAdd_file_nm4(String add_file_nm4){
		this.add_file_nm4 = add_file_nm4;
	}
	
	public void setAdd_file_nm5(String add_file_nm5){
		this.add_file_nm5 = add_file_nm5;
	}
	
	public void setAdd_file_nm6(String add_file_nm6){
		this.add_file_nm6 = add_file_nm6;
	}
	
	public void setAdd_file_nm7(String add_file_nm7){
		this.add_file_nm7 = add_file_nm7;
	}
	
	public void setAdd_file_nm8(String add_file_nm8){
		this.add_file_nm8 = add_file_nm8;
	}
	
	public void setAdd_file_nm9(String add_file_nm9){
		this.add_file_nm9 = add_file_nm9;
	}
	
	public void setAdd_file_nm10(String add_file_nm10){
		this.add_file_nm10 = add_file_nm10;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
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

	public String getTag(){
		return this.tag;
	}
	
	public String getTeam_chf_yn(){
		return this.team_chf_yn;
	}
	
	public String getFile_yn(){
		return this.file_yn;
	}

	public String getW_file_yn(){
		return this.w_file_yn;
	}

	public String getP_file_yn(){
		return this.p_file_yn;
	}

	public String getAdd_file_no1(){
		return this.add_file_no1;
	}
	
	public String getAdd_file_no2(){
		return this.add_file_no2;
	}

	public String getAdd_file_no3(){
		return this.add_file_no3;
	}

	public String getAdd_file_no4(){
		return this.add_file_no4;
	}
	
	public String getAdd_file_no5(){
		return this.add_file_no5;
	}
//
	public String getAdd_file_no6(){
		return this.add_file_no6;
	}

	public String getAdd_file_no7(){
		return this.add_file_no7;
	}

	public String getAdd_file_no8(){
		return this.add_file_no8;
	}

	public String getAdd_file_no9(){
		return this.add_file_no9;
	}

	public String getAdd_file_no10(){
		return this.add_file_no10;
	}
	
	public String getAdd_file_nm1(){
		return this.add_file_nm1;
	}
//	
	public String getAdd_file_nm2(){
		return this.add_file_nm2;
	}

	public String getAdd_file_nm3(){
		return this.add_file_nm3;
	}
//
	public String getAdd_file_nm4(){
		return this.add_file_nm4;
	}
	
	public String getAdd_file_nm5(){
		return this.add_file_nm5;
	}

	public String getAdd_file_nm6(){
		return this.add_file_nm6;
	}

	public String getAdd_file_nm7(){
		return this.add_file_nm7;
	}

	public String getAdd_file_nm8(){
		return this.add_file_nm8;
	}

	public String getAdd_file_nm9(){
		return this.add_file_nm9;
	}

	public String getAdd_file_nm10(){
		return this.add_file_nm10;
	}
}

/* 작성시간 : Fri Feb 14 15:25:40 KST 2014 */