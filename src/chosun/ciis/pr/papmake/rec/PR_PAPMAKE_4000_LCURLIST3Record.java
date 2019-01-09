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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_4000_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String addm_prt_servcost;
	public String sep_prt_servcost;
	public String crps_cost;
	public String dduc_cost;
	public String addm_make_servcost;

	public PR_PAPMAKE_4000_LCURLIST3Record(){}

	public void setAddm_prt_servcost(String addm_prt_servcost){
		this.addm_prt_servcost = addm_prt_servcost;
	}

	public void setSep_prt_servcost(String sep_prt_servcost){
		this.sep_prt_servcost = sep_prt_servcost;
	}

	public void setCrps_cost(String crps_cost){
		this.crps_cost = crps_cost;
	}

	public void setDduc_cost(String dduc_cost){
		this.dduc_cost = dduc_cost;
	}

	public void setAddm_make_servcost(String addm_make_servcost){
		this.addm_make_servcost = addm_make_servcost;
	}

	public String getAddm_prt_servcost(){
		return this.addm_prt_servcost;
	}

	public String getSep_prt_servcost(){
		return this.sep_prt_servcost;
	}

	public String getCrps_cost(){
		return this.crps_cost;
	}

	public String getDduc_cost(){
		return this.dduc_cost;
	}

	public String getAddm_make_servcost(){
		return this.addm_make_servcost;
	}
}

/* 작성시간 : Tue Aug 25 15:07:42 KST 2009 */