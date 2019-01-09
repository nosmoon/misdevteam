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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1902_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String clam_tot_amt;
	public String rcpm_tot_amt;

	public AS_LEAS_1902_SCURLIST2Record(){}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}
}

/* 작성시간 : Fri May 29 17:05:50 KST 2009 */