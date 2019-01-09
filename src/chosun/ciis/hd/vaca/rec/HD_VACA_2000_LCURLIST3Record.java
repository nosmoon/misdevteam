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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_2000_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String appm_vaca_plan_dt;
	public String wkdy;
	public String proc_stat_nm;

	public HD_VACA_2000_LCURLIST3Record(){}

	public void setAppm_vaca_plan_dt(String appm_vaca_plan_dt){
		this.appm_vaca_plan_dt = appm_vaca_plan_dt;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public String getAppm_vaca_plan_dt(){
		return this.appm_vaca_plan_dt;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}
}

/* 작성시간 : Tue Oct 20 15:36:45 KST 2009 */