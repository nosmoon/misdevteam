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


public class SP_SUP_1420_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String acpn_dt;
	public String dlco_nm;
	public String rdr_nm;
	public String cns_clsf_nm;
	public String cns_ptcr;

	public SP_SUP_1420_SCURLIST2Record(){}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
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

	public void setCns_ptcr(String cns_ptcr){
		this.cns_ptcr = cns_ptcr;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
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

	public String getCns_ptcr(){
		return this.cns_ptcr;
	}
}

/* 작성시간 : Fri Aug 10 23:06:01 KST 2012 */