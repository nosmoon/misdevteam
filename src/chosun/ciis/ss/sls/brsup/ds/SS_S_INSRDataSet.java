/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국지원-상해보험-등록-상세
* 작성일자 : 2010-01-26
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *  지국지원-상해보험-등록-상세
 */

public class SS_S_INSRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cntryy;
	public String insrnm;
	public String insrcmpynm;
	public String insrcmpychrgnm;
	public String insrcmpychrgemail;
	public long insruprc;
	public long splyuprc;
	public long insruprcf;
	public long splyuprcf;
	public String aplcfrdt;
	public String aplctodt;
	public String compdt;
	public String exprdt;

	public SS_S_INSRDataSet(){}
	public SS_S_INSRDataSet(String errcode, String errmsg, String cntryy, String insrnm, String insrcmpynm, String insrcmpychrgnm, String insrcmpychrgemail, long insruprc, long splyuprc, long insruprcf, long splyuprcf, String aplcfrdt, String aplctodt, String compdt, String exprdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cntryy = cntryy;
		this.insrnm = insrnm;
		this.insrcmpynm = insrcmpynm;
		this.insrcmpychrgnm = insrcmpychrgnm;
		this.insrcmpychrgemail = insrcmpychrgemail;
		this.insruprc = insruprc;
		this.splyuprc = splyuprc;
		this.insruprcf = insruprcf;
		this.splyuprcf = splyuprcf;
		this.aplcfrdt = aplcfrdt;
		this.aplctodt = aplctodt;
		this.compdt = compdt;
		this.exprdt = exprdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public void setInsrcmpynm(String insrcmpynm){
		this.insrcmpynm = insrcmpynm;
	}

	public void setInsrcmpychrgnm(String insrcmpychrgnm){
		this.insrcmpychrgnm = insrcmpychrgnm;
	}

	public void setInsrcmpychrgemail(String insrcmpychrgemail){
		this.insrcmpychrgemail = insrcmpychrgemail;
	}

	public void setInsruprc(long insruprc){
		this.insruprc = insruprc;
	}

	public void setSplyuprc(long splyuprc){
		this.splyuprc = splyuprc;
	}

	public void setInsruprcf(long insruprcf){
		this.insruprcf = insruprcf;
	}

	public void setSplyuprcf(long splyuprcf){
		this.splyuprcf = splyuprcf;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public void setCompdt(String compdt){
		this.compdt = compdt;
	}

	public void setExprdt(String exprdt){
		this.exprdt = exprdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getInsrnm(){
		return this.insrnm;
	}

	public String getInsrcmpynm(){
		return this.insrcmpynm;
	}

	public String getInsrcmpychrgnm(){
		return this.insrcmpychrgnm;
	}

	public String getInsrcmpychrgemail(){
		return this.insrcmpychrgemail;
	}

	public long getInsruprc(){
		return this.insruprc;
	}

	public long getSplyuprc(){
		return this.splyuprc;
	}

	public long getInsruprcf(){
		return this.insruprcf;
	}

	public long getSplyuprcf(){
		return this.splyuprcf;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}

	public String getCompdt(){
		return this.compdt;
	}

	public String getExprdt(){
		return this.exprdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.cntryy = Util.checkString(cstmt.getString(4));
		this.insrnm = Util.checkString(cstmt.getString(5));
		this.insrcmpynm = Util.checkString(cstmt.getString(6));
		this.insrcmpychrgnm = Util.checkString(cstmt.getString(7));
		this.insrcmpychrgemail = Util.checkString(cstmt.getString(8));
		this.insruprc = cstmt.getLong(9);
		this.splyuprc = cstmt.getLong(10);
		this.insruprcf = cstmt.getLong(11);
		this.splyuprcf = cstmt.getLong(12);
		this.aplcfrdt = Util.checkString(cstmt.getString(13));
		this.aplctodt = Util.checkString(cstmt.getString(14));
		this.compdt = Util.checkString(cstmt.getString(15));
		this.exprdt = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_INSRDataSet ds = (SS_S_INSRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCntryy()%>
<%= ds.getInsrnm()%>
<%= ds.getInsrcmpynm()%>
<%= ds.getInsrcmpychrgnm()%>
<%= ds.getInsrcmpychrgemail()%>
<%= ds.getInsruprc()%>
<%= ds.getSplyuprc()%>
<%= ds.getInsruprcf()%>
<%= ds.getSplyuprcf()%>
<%= ds.getAplcfrdt()%>
<%= ds.getAplctodt()%>
<%= ds.getCompdt()%>
<%= ds.getExprdt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 08 10:23:25 KST 2010 */