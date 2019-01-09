/***************************************************************************************************
* 파일명 : HD_AFFR_3000_L.java
* 기능 :   사보발송대상퇴직자관리
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
 * 사보발송대상퇴직자관리
 */

public class HD_AFFR_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String emp_dtls_clsf;
	public String emp_dtls_clsf_nm;
	public String emp_clsf;
	public String open_invit_desty;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String lvcmpy_resn_cd;
	public String lvcmpy_resn_nm;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;

	public HD_AFFR_3000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setLvcmpy_resn_cd(String lvcmpy_resn_cd){
		this.lvcmpy_resn_cd = lvcmpy_resn_cd;
	}

	public void setLvcmpy_resn_nm(String lvcmpy_resn_nm){
		this.lvcmpy_resn_nm = lvcmpy_resn_nm;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getLvcmpy_resn_cd(){
		return this.lvcmpy_resn_cd;
	}

	public String getLvcmpy_resn_nm(){
		return this.lvcmpy_resn_nm;
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
}

/* 작성시간 : Sat Jul 18 17:00:31 KST 2009 */