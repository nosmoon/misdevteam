/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 2017-01-05
* �ۼ��� : �� �� ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :  
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;



/**
 * 
 */


public class SS_L_NEWJUSO_APPR_HISDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curhislist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_NEWJUSO_APPR_HISDataSet(){}
	public SS_L_NEWJUSO_APPR_HISDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_NEWJUSO_APPR_HISCURHISLISTRecord rec = new SS_L_NEWJUSO_APPR_HISCURHISLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.chgbocd = Util.checkString(rset0.getString("chgbocd"));
			rec.appryn = Util.checkString(rset0.getString("appryn"));
			rec.apprdt = Util.checkString(rset0.getString("apprdt"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.reqdt = Util.checkString(rset0.getString("reqdt"));
			rec.reqpers = Util.checkString(rset0.getString("reqpers"));
			
			this.curhislist.add(rec);
		}
	}

	public String curhislistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curhislist.size();
		for(int i=0; i<size; i++){
			SS_L_NEWJUSO_APPR_HISCURHISLISTRecord rec = (SS_L_NEWJUSO_APPR_HISCURHISLISTRecord)curhislist.get(i);
			
			String code = rec.bocd;
			String name = rec.chgbocd;
			
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

	public String curhislistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curhislist.size();
		for(int i=0; i<size; i++){
			SS_L_NEWJUSO_APPR_HISCURHISLISTRecord rec = (SS_L_NEWJUSO_APPR_HISCURHISLISTRecord)curhislist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.chgbocd;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String curhislistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curhislist.size();
		for(int i=0; i<size; i++){
			SS_L_NEWJUSO_APPR_HISCURHISLISTRecord rec = (SS_L_NEWJUSO_APPR_HISCURHISLISTRecord)curhislist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.chgbocd;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	SS_L_NEWJUSO_APPR_HISDataSet ds = (SS_L_NEWJUSO_APPR_HISDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curhislist.size(); i++){
		SS_L_NEWJUSO_APPR_HISCURHISLISTRecord curhislistRec = (SS_L_NEWJUSO_APPR_HISCURHISLISTRecord)ds.curhislist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurhislist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curhislistRec.bocd%>
<%= curhislistRec.chgbocd%>
<%= curhislistRec.appryn%>
<%= curhislistRec.apprdt%>
<%= curhislistRec.chgpers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Oct 17 16:48:22 KST 2017 */