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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acpn_dt;
	public String acpn_dt_tm;
	public String dlco_no;
	public String dlco_nm;
	public String rdr_nm;
	public String cns_clsf_nm;
	public String proc_clsf_nm;
	public String chrg_pers;
	public String acpn_no;

	public SP_SUP_1410_LCURLISTRecord(){}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setAcpn_dt_tm(String acpn_dt_tm){
		this.acpn_dt_tm = acpn_dt_tm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setCns_clsf_nm(String cns_clsf_nm){
		this.cns_clsf_nm = cns_clsf_nm;
	}

	public void setProc_clsf_nm(String proc_clsf_nm){
		this.proc_clsf_nm = proc_clsf_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAcpn_no(String acpn_no){
		this.acpn_no = acpn_no;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getAcpn_dt_tm(){
		return this.acpn_dt_tm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getCns_clsf_nm(){
		return this.cns_clsf_nm;
	}

	public String getProc_clsf_nm(){
		return this.proc_clsf_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAcpn_no(){
		return this.acpn_no;
	}
}

/* 작성시간 : Fri Aug 10 23:12:32 KST 2012 */