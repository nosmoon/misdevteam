/***************************************************************************************************
* 파일명 : SS_S_INSRAPLCCLOSDataSet.java
* 기능 : 지국지원-상해보험-마감-상세를 위한 DataSet
* 작성일자 : 2004-02-20
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
 * 지국지원-상해보험-마감-상세를 위한 DataSet
 */

public class SS_S_INSRAPLCCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String basidt;
	public String frdt;
	public String todt;
	public String closyn;
	public String closdt;
	public String clamdt;

	public SS_S_INSRAPLCCLOSDataSet(){}
	public SS_S_INSRAPLCCLOSDataSet(String errcode, String errmsg, String basidt, String frdt, String todt, String closyn, String closdt, String clamdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closyn = closyn;
		this.closdt = closdt;
		this.clamdt = clamdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setClamdt(String clamdt){
		this.clamdt = clamdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getClamdt(){
		return this.clamdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basidt = Util.checkString(cstmt.getString(4));
		this.frdt = Util.checkString(cstmt.getString(5));
		this.todt = Util.checkString(cstmt.getString(6));
		this.closyn = Util.checkString(cstmt.getString(7));
		this.closdt = Util.checkString(cstmt.getString(8));
		this.clamdt = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_INSRAPLCCLOSDataSet ds = (SS_S_INSRAPLCCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasidt()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getClosyn()%>
<%= ds.getClosdt()%>
<%= ds.getClamdt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 21 14:45:11 KST 2004 */