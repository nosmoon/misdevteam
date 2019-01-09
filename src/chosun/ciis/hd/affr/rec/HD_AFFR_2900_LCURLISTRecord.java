/***************************************************************************************************
* 파일명 : FC_ACCT_2901_L.java
* 기능 :   명함신청관리 검색
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 명함신청관리 검색
 */

public class HD_AFFR_2900_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String qunt_side_clam_qunt;
	public String dn_side_clam_qunt;
	public String aplc_flnm;
	public String aplc_engl_flnm;
	public String aplc_dty_nm;
	public String aplc_offi_nm;
	public String aplc_dept_nm;
	public String tel_no;
	public String fax_no;
	public String ceph_no;
	public String email;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String remk;
	public String aplc_cnfm_yn;
	public String aplc_cnfm_ynnm;

	public HD_AFFR_2900_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setQunt_side_clam_qunt(String qunt_side_clam_qunt){
		this.qunt_side_clam_qunt = qunt_side_clam_qunt;
	}

	public void setDn_side_clam_qunt(String dn_side_clam_qunt){
		this.dn_side_clam_qunt = dn_side_clam_qunt;
	}

	public void setAplc_flnm(String aplc_flnm){
		this.aplc_flnm = aplc_flnm;
	}

	public void setAplc_engl_flnm(String aplc_engl_flnm){
		this.aplc_engl_flnm = aplc_engl_flnm;
	}

	public void setAplc_dty_nm(String aplc_dty_nm){
		this.aplc_dty_nm = aplc_dty_nm;
	}

	public void setAplc_offi_nm(String aplc_offi_nm){
		this.aplc_offi_nm = aplc_offi_nm;
	}

	public void setAplc_dept_nm(String aplc_dept_nm){
		this.aplc_dept_nm = aplc_dept_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setCeph_no(String ceph_no){
		this.ceph_no = ceph_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAplc_cnfm_yn(String aplc_cnfm_yn){
		this.aplc_cnfm_yn = aplc_cnfm_yn;
	}

	public void setAplc_cnfm_ynnm(String aplc_cnfm_ynnm){
		this.aplc_cnfm_ynnm = aplc_cnfm_ynnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getQunt_side_clam_qunt(){
		return this.qunt_side_clam_qunt;
	}

	public String getDn_side_clam_qunt(){
		return this.dn_side_clam_qunt;
	}

	public String getAplc_flnm(){
		return this.aplc_flnm;
	}

	public String getAplc_engl_flnm(){
		return this.aplc_engl_flnm;
	}

	public String getAplc_dty_nm(){
		return this.aplc_dty_nm;
	}

	public String getAplc_offi_nm(){
		return this.aplc_offi_nm;
	}

	public String getAplc_dept_nm(){
		return this.aplc_dept_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getCeph_no(){
		return this.ceph_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAplc_cnfm_yn(){
		return this.aplc_cnfm_yn;
	}

	public String getAplc_cnfm_ynnm(){
		return this.aplc_cnfm_ynnm;
	}
}

/* 작성시간 : Wed Jul 01 19:41:59 KST 2009 */