/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2710_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String deptnm;
	public String clsfnm;
	public String point_min;
	public String point_max;
	public String deptcd;
	public String clsf;

	public SS_SLS_BRMGR_2710_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setClsfnm(String clsfnm){
		this.clsfnm = clsfnm;
	}

	public void setPoint_min(String point_min){
		this.point_min = point_min;
	}

	public void setPoint_max(String point_max){
		this.point_max = point_max;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getClsfnm(){
		return this.clsfnm;
	}

	public String getPoint_min(){
		return this.point_min;
	}

	public String getPoint_max(){
		return this.point_max;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getClsf(){
		return this.clsf;
	}
}

/* 작성시간 : Fri Jun 24 14:12:34 KST 2016 */