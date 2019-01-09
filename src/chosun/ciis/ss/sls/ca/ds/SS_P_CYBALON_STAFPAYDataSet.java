/***************************************************************************************************
 * ���ϸ�   : SS_P_CYBALON_STAFPAYDataSet.java
 * ���     : ���̹�����-���̹��������� �μ�
 * �ۼ����� : 2005-07-15
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.ca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * ���̹�����-���̹��������� �μ�
 */

public class SS_P_CYBALON_STAFPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList stafpaylist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_P_CYBALON_STAFPAYDataSet(){}
	public SS_P_CYBALON_STAFPAYDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord rec = new SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord();
			rec.closyymm = Util.checkString(rset0.getString("closyymm"));
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.rdrcnt = rset0.getInt("rdrcnt");
			rec.payalonnoit = rset0.getInt("payalonnoit");
			rec.payalonamt = rset0.getInt("payalonamt");
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ernno = Util.checkString(rset0.getString("ernno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.acctbank = Util.checkString(rset0.getString("acctbank"));
			rec.acctbanknm = Util.checkString(rset0.getString("acctbanknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.acctdeps_pers = Util.checkString(rset0.getString("acctdeps_pers"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.cntrstatcd = Util.checkString(rset0.getString("cntrstatcd"));
			rec.cntrstatnm = Util.checkString(rset0.getString("cntrstatnm"));
			rec.rnum = rset0.getInt("rnum");
			this.stafpaylist.add(rec);
		}
	}

	public String stafpaylistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = stafpaylist.size();
		for(int i=0; i<size; i++){
			SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord rec = (SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord)stafpaylist.get(i);
			
			
			String code = rec.closyymm;
			String name = rec.stafclsfcd;
			
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

	public String stafpaylistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = stafpaylist.size();
		for(int i=0; i<size; i++){
			SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord rec = (SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord)stafpaylist.get(i);
			
			
			String code = rec.closyymm;
			String name = rec.stafclsfcd;
			
			sb.append("<input name=\"");
			sb.append("closyymm");
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

	public String stafpaylistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = stafpaylist.size();
		for(int i=0; i<size; i++){
			SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord rec = (SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord)stafpaylist.get(i);
			
			
			String code = rec.closyymm;
			String name = rec.stafclsfcd;
			
			sb.append("<input name=\"");
			sb.append("closyymm");
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
	SS_P_CYBALON_STAFPAYDataSet ds = (SS_P_CYBALON_STAFPAYDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.stafpaylist.size(); i++){
		SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord stafpaylistRec = (SS_P_CYBALON_STAFPAYSTAFPAYLISTRecord)ds.stafpaylist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStafpaylist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= stafpaylistRec.closyymm%>
<%= stafpaylistRec.stafclsfcd%>
<%= stafpaylistRec.stafno%>
<%= stafpaylistRec.rdrcnt%>
<%= stafpaylistRec.payalonnoit%>
<%= stafpaylistRec.payalonamt%>
<%= stafpaylistRec.prn%>
<%= stafpaylistRec.ernno%>
<%= stafpaylistRec.stafnm%>
<%= stafpaylistRec.acctbank%>
<%= stafpaylistRec.acctbanknm%>
<%= stafpaylistRec.acctno%>
<%= stafpaylistRec.acctdeps_pers%>
<%= stafpaylistRec.tel_no%>
<%= stafpaylistRec.ptph_no%>
<%= stafpaylistRec.email%>
<%= stafpaylistRec.cntrstatcd%>
<%= stafpaylistRec.cntrstatnm%>
<%= stafpaylistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 21 18:38:23 KST 2005 */