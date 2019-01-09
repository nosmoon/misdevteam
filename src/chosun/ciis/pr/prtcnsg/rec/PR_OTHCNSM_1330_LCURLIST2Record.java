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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_1330_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String fac_clsf;
	public String psplat_clsf;
	public String psplat_fee;
	public String gnaw_fee;

	public PR_OTHCNSM_1330_LCURLIST2Record(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPsplat_clsf(String psplat_clsf){
		this.psplat_clsf = psplat_clsf;
	}

	public void setPsplat_fee(String psplat_fee){
		this.psplat_fee = psplat_fee;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPsplat_clsf(){
		return this.psplat_clsf;
	}

	public String getPsplat_fee(){
		return this.psplat_fee;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}
}

/* 작성시간 : Mon May 25 15:32:15 KST 2009 */