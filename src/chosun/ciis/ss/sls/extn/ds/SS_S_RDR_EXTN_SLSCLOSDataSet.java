/***************************************************************************************************
* 파일명 : SS_S_RDR_EXTN_SLSCLOSDataSet.java
* 기능 : 확장지원비용 상세를 위한 DataSet
* 작성일자 : 2003-12-17
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_S_RDR_EXTN_SLSCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String basidt;
	public String frdt;
	public String todt;
	public String closyn;
	public String closdt;

	public SS_S_RDR_EXTN_SLSCLOSDataSet(){}
	public SS_S_RDR_EXTN_SLSCLOSDataSet(String errcode, String errmsg, String basidt, String frdt, String todt, String closyn, String closdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closyn = closyn;
		this.closdt = closdt;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basidt = Util.checkString(cstmt.getString(4));
		this.frdt = Util.checkString(cstmt.getString(5));
		this.todt = Util.checkString(cstmt.getString(6));
		this.closyn = Util.checkString(cstmt.getString(7));
		this.closdt = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_RDR_EXTN_SLSCLOSDataSet ds = (SS_S_RDR_EXTN_SLSCLOSDataSet)request.getAttribute("ds");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 17 17:53:53 KST 2003 */