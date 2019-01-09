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


package chosun.ciis.mt.common.rec;

import java.sql.*;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.ds.*;

/**
 * 
 */


public class MT_COMMON_MATR_0004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk_yn;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String dept_cd;
	public String via_dept;
	public String matr_cd;
	public String matr_nm;
	public String clam_qunt;
	public String fix_qunt;
	public String uprc;
	public String acpn_dt;

	public MT_COMMON_MATR_0004_LCURLISTRecord(){}

	public void setChk_yn(String chk_yn){
		this.chk_yn = chk_yn;
	}
	
	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}
	
	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setVia_dept(String via_dept){
		this.via_dept = via_dept;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}
	
	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}
	
	public String getChk_yn(){
		return this.chk_yn;
	}
	
	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
	
	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getVia_dept(){
		return this.via_dept;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}
	
	public String getUprc(){
		return this.uprc;
	}
	
	public String getAcpn_dt(){
		return this.acpn_dt;
	}
}

/* 작성시간 : Sun Nov 29 19:50:17 KST 2009 */