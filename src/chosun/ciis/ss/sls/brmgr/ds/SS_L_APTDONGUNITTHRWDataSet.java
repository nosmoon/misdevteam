/***************************************************************************************************
* 파일명 : .java
* 기능 : 아파트투입률 조회
* 작성일자 : 2009-08-13
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 아파트투입률 조회
 */ 

public class SS_L_APTDONGUNITTHRWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dongcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_APTDONGUNITTHRWDataSet(){}
	public SS_L_APTDONGUNITTHRWDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_L_APTDONGUNITTHRWDONGCURRecord rec = new SS_L_APTDONGUNITTHRWDONGCURRecord();
			rec.invsgdt = Util.checkString(rset0.getString("invsgdt"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.addrcdnm = Util.checkString(rset0.getString("addrcdnm"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.hoscnt = Util.checkString(rset0.getString("hoscnt"));
			rec.chothrwqty = rset0.getInt("chothrwqty");
			rec.cho_rate = Util.checkString(rset0.getString("cho_rate"));
			rec.jungthrwqty = rset0.getInt("jungthrwqty");
			rec.jung_rate = Util.checkString(rset0.getString("jung_rate"));
			rec.dongthrwqty = rset0.getInt("dongthrwqty");
			rec.dong_rate = Util.checkString(rset0.getString("dong_rate"));
			rec.etcthrwqty = rset0.getInt("etcthrwqty");
			rec.etc_rate = Util.checkString(rset0.getString("etc_rate"));
			rec.check1 = Util.checkString(rset0.getString("check1"));
			this.dongcur.add(rec);
		}
	}

	public String dongcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDONGUNITTHRWDONGCURRecord rec = (SS_L_APTDONGUNITTHRWDONGCURRecord)dongcur.get(i);
			
			
			String code = rec.invsgdt;
			String name = rec.deptcd;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dongcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDONGUNITTHRWDONGCURRecord rec = (SS_L_APTDONGUNITTHRWDONGCURRecord)dongcur.get(i);
			
			
			String code = rec.invsgdt;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("invsgdt");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dongcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDONGUNITTHRWDONGCURRecord rec = (SS_L_APTDONGUNITTHRWDONGCURRecord)dongcur.get(i);
			
			
			String code = rec.invsgdt;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("invsgdt");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_APTDONGUNITTHRWDataSet ds = (SS_L_APTDONGUNITTHRWDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dongcur.size(); i++){
		SS_L_APTDONGUNITTHRWDONGCURRecord dongcurRec = (SS_L_APTDONGUNITTHRWDONGCURRecord)ds.dongcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDongcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dongcurRec.invsgdt%>
<%= dongcurRec.deptcd%>
<%= dongcurRec.deptnm%>
<%= dongcurRec.partcd%>
<%= dongcurRec.partnm%>
<%= dongcurRec.areacd%>
<%= dongcurRec.areanm%>
<%= dongcurRec.bocd%>
<%= dongcurRec.bonm%>
<%= dongcurRec.addrcd%>
<%= dongcurRec.addrcdnm%>
<%= dongcurRec.dongno%>
<%= dongcurRec.pyong%>
<%= dongcurRec.hoscnt%>
<%= dongcurRec.chothrwqty%>
<%= dongcurRec.cho_rate%>
<%= dongcurRec.jungthrwqty%>
<%= dongcurRec.jung_rate%>
<%= dongcurRec.dongthrwqty%>
<%= dongcurRec.dong_rate%>
<%= dongcurRec.etcthrwqty%>
<%= dongcurRec.etc_rate%>
<%= dongcurRec.check1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 11:09:28 KST 2009 */