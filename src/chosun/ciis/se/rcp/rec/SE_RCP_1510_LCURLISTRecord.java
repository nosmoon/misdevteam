/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String rcpm_dt;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String area_cd;
	public String cnt;
	public String actu_slip_no;
	public String acct_slip_no;
	public String rcpm_amt;
	public String clos_yn;

	public SE_RCP_1510_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setAcct_slip_no(String acct_slip_no){
		this.acct_slip_no = acct_slip_no;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getAcct_slip_no(){
		return this.acct_slip_no;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}
}

/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */