/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-지국월마감-상세
* 작성일자 : 2005-02-02
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-지국월마감-상세
 */


public class SS_S_BOCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bocd;
	public String bonm;
	public String yymm;
	public String closyn;
	public String closfrdt;
	public String clostodt;
	public String clos_dt;
	public String remk;

	public SS_S_BOCLOSDataSet(){}
	public SS_S_BOCLOSDataSet(String errcode, String errmsg, String bocd, String bonm, String yymm, String closyn, String closfrdt, String clostodt, String clos_dt, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bocd = bocd;
		this.bonm = bonm;
		this.yymm = yymm;
		this.closyn = closyn;
		this.closfrdt = closfrdt;
		this.clostodt = clostodt;
		this.clos_dt = clos_dt;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosfrdt(String closfrdt){
		this.closfrdt = closfrdt;
	}

	public void setClostodt(String clostodt){
		this.clostodt = clostodt;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosfrdt(){
		return this.closfrdt;
	}

	public String getClostodt(){
		return this.clostodt;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bocd = Util.checkString(cstmt.getString(6));
		this.bonm = Util.checkString(cstmt.getString(7));
		this.yymm = Util.checkString(cstmt.getString(8));
		this.closyn = Util.checkString(cstmt.getString(9));
		this.closfrdt = Util.checkString(cstmt.getString(10));
		this.clostodt = Util.checkString(cstmt.getString(11));
		this.clos_dt = Util.checkString(cstmt.getString(12));
		this.remk = Util.checkString(cstmt.getString(13));
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_S_BOCLOSCURCOMMLISTRecord rec = new SS_S_BOCLOSCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			rec.closfrdt = Util.checkString(rset0.getString("closfrdt"));
			rec.clostodt = Util.checkString(rset0.getString("clostodt"));
			rec.clos_dt = Util.checkString(rset0.getString("clos_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_BOCLOSCURCOMMLISTRecord rec = (SS_S_BOCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.yymm;
			String name = rec.closyn;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_BOCLOSCURCOMMLISTRecord rec = (SS_S_BOCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.yymm;
			String name = rec.closyn;
			
			sb.append("<input name=\"");
			sb.append("yymm");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_BOCLOSCURCOMMLISTRecord rec = (SS_S_BOCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.yymm;
			String name = rec.closyn;
			
			sb.append("<input name=\"");
			sb.append("yymm");
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
	SS_S_BOCLOSDataSet ds = (SS_S_BOCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_BOCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_BOCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getYymm()%>
<%= ds.getClosyn()%>
<%= ds.getClosfrdt()%>
<%= ds.getClostodt()%>
<%= ds.getClos_dt()%>
<%= ds.getRemk()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.closyn%>
<%= curcommlistRec.closfrdt%>
<%= curcommlistRec.clostodt%>
<%= curcommlistRec.clos_dt%>
<%= curcommlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 02 11:54:15 KST 2005 */