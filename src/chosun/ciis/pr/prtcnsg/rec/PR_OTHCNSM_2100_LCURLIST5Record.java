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


public class PR_OTHCNSM_2100_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String issu_qty;
	public String pap_std;
	public String issu_pcnt;
	public String bw_pcnt;
	public String clr_pcnt;
	public String pj_wgt;
	public String hdqt_paper_clsf;
	public String prt_wgt;
	public String paper_uprc;

	public PR_OTHCNSM_2100_LCURLIST5Record(){}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setPj_wgt(String pj_wgt){
		this.pj_wgt = pj_wgt;
	}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}
	
	public void setPrt_wgt(String prt_wgt){
		this.prt_wgt = prt_wgt;
	}

	public void setPaper_uprc(String paper_uprc){
		this.paper_uprc = paper_uprc;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getPj_wgt(){
		return this.pj_wgt;
	}

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}
	
	public String getPrt_wgt(){
		return this.prt_wgt;
	}

	public String getPaper_uprc(){
		return this.paper_uprc;
	}
}

/* 작성시간 : Tue Oct 06 11:16:41 KST 2009 */