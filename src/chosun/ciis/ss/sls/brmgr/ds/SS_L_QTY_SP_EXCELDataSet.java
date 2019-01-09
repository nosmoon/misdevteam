/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-�������μ���Ȳ-�μ�
* �ۼ����� : 2009-05-07
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * �����濵-�������μ���Ȳ-�μ�
 */

public class SS_L_QTY_SP_EXCELDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bo_yymm;

	public SS_L_QTY_SP_EXCELDataSet(){}
	public SS_L_QTY_SP_EXCELDataSet(String errcode, String errmsg, String bo_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bo_yymm = bo_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBo_yymm(String bo_yymm){
		this.bo_yymm = bo_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBo_yymm(){
		return this.bo_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bo_yymm = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_QTY_SP_EXCELCURCOMMLISTRecord rec = new SS_L_QTY_SP_EXCELCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.iygwygbs = rset0.getInt("iygwygbs");
			rec.iygwmgbs = rset0.getInt("iygwmgbs");
			rec.iygwsdbs = rset0.getInt("iygwsdbs");
			rec.dntnwsp = rset0.getInt("dntnwsp");
			rec.cupn = rset0.getInt("cupn");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_QTY_SP_EXCELCURCOMMLISTRecord rec = (SS_L_QTY_SP_EXCELCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_QTY_SP_EXCELCURCOMMLISTRecord rec = (SS_L_QTY_SP_EXCELCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
			SS_L_QTY_SP_EXCELCURCOMMLISTRecord rec = (SS_L_QTY_SP_EXCELCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_QTY_SP_EXCELDataSet ds = (SS_L_QTY_SP_EXCELDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_QTY_SP_EXCELCURCOMMLISTRecord curcommlistRec = (SS_L_QTY_SP_EXCELCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBo_yymm()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.iygwygbs%>
<%= curcommlistRec.iygwmgbs%>
<%= curcommlistRec.iygwsdbs%>
<%= curcommlistRec.dntnwsp%>
<%= curcommlistRec.cupn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 07 11:01:58 KST 2009 */