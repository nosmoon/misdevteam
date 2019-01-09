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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String fac_clsf_nm;
	public String ecnt;
	public String avg_prt_bgn;
	public String avg_prt_end;
	public String avg_rmsg;
	public String avg_off_plat;
	public String avg_off_plat_end;
	public String avg_qty;
	public String avg_real_prt_qty;

	public PR_PRTEXEC_1200_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setAvg_prt_bgn(String avg_prt_bgn){
		this.avg_prt_bgn = avg_prt_bgn;
	}

	public void setAvg_prt_end(String avg_prt_end){
		this.avg_prt_end = avg_prt_end;
	}

	public void setAvg_rmsg(String avg_rmsg){
		this.avg_rmsg = avg_rmsg;
	}

	public void setAvg_off_plat(String avg_off_plat){
		this.avg_off_plat = avg_off_plat;
	}

	public void setAvg_off_plat_end(String avg_off_plat_end){
		this.avg_off_plat_end = avg_off_plat_end;
	}

	public void setAvg_qty(String avg_qty){
		this.avg_qty = avg_qty;
	}

	public void setAvg_real_prt_qty(String avg_real_prt_qty){
		this.avg_real_prt_qty = avg_real_prt_qty;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getAvg_prt_bgn(){
		return this.avg_prt_bgn;
	}

	public String getAvg_prt_end(){
		return this.avg_prt_end;
	}

	public String getAvg_rmsg(){
		return this.avg_rmsg;
	}

	public String getAvg_off_plat(){
		return this.avg_off_plat;
	}

	public String getAvg_off_plat_end(){
		return this.avg_off_plat_end;
	}

	public String getAvg_qty(){
		return this.avg_qty;
	}

	public String getAvg_real_prt_qty(){
		return this.avg_real_prt_qty;
	}
}

/* 작성시간 : Sat Jun 06 18:09:40 KST 2009 */