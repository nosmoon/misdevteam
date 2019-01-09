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


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2720_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String yymm;
	public String deptcd;
	public String clsf;
	public String point_min;
	public String point_max;

	public SS_SLS_BRMGR_2720_SDataSet(){}
	public SS_SLS_BRMGR_2720_SDataSet(String errcode, String errmsg, String yymm, String deptcd, String clsf, String point_min, String point_max){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yymm = yymm;
		this.deptcd = deptcd;
		this.clsf = clsf;
		this.point_min = point_min;
		this.point_max = point_max;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setPoint_min(String point_min){
		this.point_min = point_min;
	}

	public void setPoint_max(String point_max){
		this.point_max = point_max;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getPoint_min(){
		return this.point_min;
	}

	public String getPoint_max(){
		return this.point_max;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yymm = Util.checkString(cstmt.getString(6));
		this.deptcd = Util.checkString(cstmt.getString(7));
		this.clsf = Util.checkString(cstmt.getString(8));
		this.point_min = Util.checkString(cstmt.getString(9));
		this.point_max = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2720_SDataSet ds = (SS_SLS_BRMGR_2720_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getDeptcd()%>
<%= ds.getClsf()%>
<%= ds.getPoint_min()%>
<%= ds.getPoint_max()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 24 14:24:52 KST 2016 */