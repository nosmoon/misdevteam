/***************************************************************************************************
* 파일명 : SS_S_NWSPITEMEWHDataSet.java
* 기능 : 지국지원-신문지원물품-입고-상세를 위한 DataSet 
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-입고-상세를 위한 DataSet 
 */


public class SS_S_NWSPITEMEWHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String itemclsfnm;
	public String itemnm;
	public long ewhqunt;
	public long stokqunt;
	public long uprc;

	public SS_S_NWSPITEMEWHDataSet(){}
	public SS_S_NWSPITEMEWHDataSet(String errcode, String errmsg, String itemclsfnm, String itemnm, long ewhqunt, long stokqunt, long uprc){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.itemclsfnm = itemclsfnm;
		this.itemnm = itemnm;
		this.ewhqunt = ewhqunt;
		this.stokqunt = stokqunt;
		this.uprc = uprc;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setItemclsfnm(String itemclsfnm){
		this.itemclsfnm = itemclsfnm;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setEwhqunt(long ewhqunt){
		this.ewhqunt = ewhqunt;
	}

	public void setStokqunt(long stokqunt){
		this.stokqunt = stokqunt;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getItemclsfnm(){
		return this.itemclsfnm;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public long getEwhqunt(){
		return this.ewhqunt;
	}

	public long getStokqunt(){
		return this.stokqunt;
	}

	public long getUprc(){
		return this.uprc;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.itemclsfnm = Util.checkString(cstmt.getString(6));
		this.itemnm = Util.checkString(cstmt.getString(7));
		this.ewhqunt = cstmt.getLong(8);
		this.stokqunt = cstmt.getLong(9);
		this.uprc = cstmt.getLong(10);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_NWSPITEMEWHDataSet ds = (SS_S_NWSPITEMEWHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getItemclsfnm()%>
<%= ds.getItemnm()%>
<%= ds.getEwhqunt()%>
<%= ds.getStokqunt()%>
<%= ds.getUprc()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 10:43:39 KST 2004 */