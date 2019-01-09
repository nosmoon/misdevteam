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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2602_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String rptv_movm_nm;
	public String vip_serv_job;
	public String cntr_cnclus_dt;

	public HD_INFO_2602_LCURLIST1Record(){}

	public void setRptv_movm_nm(String rptv_movm_nm){
		this.rptv_movm_nm = rptv_movm_nm;
	}

	public void setVip_serv_job(String vip_serv_job){
		this.vip_serv_job = vip_serv_job;
	}

	public void setCntr_cnclus_dt(String cntr_cnclus_dt){
		this.cntr_cnclus_dt = cntr_cnclus_dt;
	}

	public String getRptv_movm_nm(){
		return this.rptv_movm_nm;
	}

	public String getVip_serv_job(){
		return this.vip_serv_job;
	}

	public String getCntr_cnclus_dt(){
		return this.cntr_cnclus_dt;
	}
}

/* 작성시간 : Tue Aug 25 15:34:37 KST 2009 */