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


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1000_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String chrg_pers;
	public String fst_route;
	public String fst_route_tm;
	public String last_route;
	public String last_route_tm;

	public PR_SENDMG_1000_LCURLIST6Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setFst_route(String fst_route){
		this.fst_route = fst_route;
	}

	public void setFst_route_tm(String fst_route_tm){
		this.fst_route_tm = fst_route_tm;
	}

	public void setLast_route(String last_route){
		this.last_route = last_route;
	}

	public void setLast_route_tm(String last_route_tm){
		this.last_route_tm = last_route_tm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getFst_route(){
		return this.fst_route;
	}

	public String getFst_route_tm(){
		return this.fst_route_tm;
	}

	public String getLast_route(){
		return this.last_route;
	}

	public String getLast_route_tm(){
		return this.last_route_tm;
	}
}

/* 작성시간 : Thu Nov 05 13:31:26 KST 2009 */