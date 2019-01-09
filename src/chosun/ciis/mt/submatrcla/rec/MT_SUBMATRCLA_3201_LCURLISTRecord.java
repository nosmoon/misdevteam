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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_3201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String clam_actu_cd;
	public String item_nm;
	public String aplc_pers;
	public String via_dept;
	public String via_dept_cnfm_yn;
	public String misno_actu;
	public String acpn_dt;
	public String rid_tel_no;
	public String remk;
	
	public MT_SUBMATRCLA_3201_LCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setClam_actu_cd(String clam_actu_cd){
		this.clam_actu_cd = clam_actu_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setAplc_pers(String aplc_pers){
		this.aplc_pers = aplc_pers;
	}

	public void setVia_dept(String via_dept){
		this.via_dept = via_dept;
	}

	public void setVia_dept_cnfm_yn(String via_dept_cnfm_yn){
		this.via_dept_cnfm_yn = via_dept_cnfm_yn;
	}

	public void setMisno_actu(String misno_actu){
		this.misno_actu = misno_actu;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setRid_tel_no(String rid_tel_no){
		this.rid_tel_no = rid_tel_no;
	}

	public void setRemk(String remk) {
		this.remk = remk;
	}

	public String getCnt(){
		return this.cnt;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getClam_actu_cd(){
		return this.clam_actu_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getAplc_pers(){
		return this.aplc_pers;
	}

	public String getVia_dept(){
		return this.via_dept;
	}

	public String getVia_dept_cnfm_yn(){
		return this.via_dept_cnfm_yn;
	}

	public String getMisno_actu(){
		return this.misno_actu;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getRid_tel_no(){
		return this.rid_tel_no;
	}
	
	public String getRemk() {
		return remk;
	}

	
}

/* 작성시간 : Tue Mar 10 15:29:40 KST 2015 */