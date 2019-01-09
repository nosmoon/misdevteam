/***************************************************************************************************
* ���ϸ�	: SS_L_MIGRERRDataSet.java
* ���		: ������ - ���̱׷��̼� - ���� - �������ڸ���Ʈ
* �ۼ�����	: 2004-06-13
* �ۼ���	: �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	:
* ������	:
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������ - ���̱׷��̼� - ���� - �������ڸ���Ʈ
 *
 */


public class SS_L_MIGRERRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList migrerrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MIGRERRDataSet(){}
	public SS_L_MIGRERRDataSet(String errcode, String errmsg){
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
			SS_L_MIGRERRMIGRERRCURRecord rec = new SS_L_MIGRERRMIGRERRCURRecord();
			rec.dd_no = Util.checkString(rset0.getString("dd_no"));
			rec.dd_bno = Util.checkString(rset0.getString("dd_bno"));
			rec.dd_code = Util.checkString(rset0.getString("dd_code"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.sinmoon = Util.checkString(rset0.getString("sinmoon"));
			rec.oyuga = Util.checkString(rset0.getString("oyuga"));
			rec.ogudok = Util.checkString(rset0.getString("ogudok"));
			rec.osgbang = Util.checkString(rset0.getString("osgbang"));
			rec.cfreeyn = Util.checkString(rset0.getString("cfreeyn"));
			rec.cyuga = Util.checkString(rset0.getString("cyuga"));
			rec.csgbang = Util.checkString(rset0.getString("csgbang"));
			rec.ercode = Util.checkString(rset0.getString("ercode"));
			rec.ername = Util.checkString(rset0.getString("ername"));
			this.migrerrcur.add(rec);
		}
	}

	public String migrerrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrerrcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRERRMIGRERRCURRecord rec = (SS_L_MIGRERRMIGRERRCURRecord)migrerrcur.get(i);
			
			
			String code = rec.dd_no;
			String name = rec.dd_bno;
			
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

	public String migrerrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrerrcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRERRMIGRERRCURRecord rec = (SS_L_MIGRERRMIGRERRCURRecord)migrerrcur.get(i);
			
			
			String code = rec.dd_no;
			String name = rec.dd_bno;
			
			sb.append("<input name=\"");
			sb.append("dd_no");
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

	public String migrerrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrerrcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRERRMIGRERRCURRecord rec = (SS_L_MIGRERRMIGRERRCURRecord)migrerrcur.get(i);
			
			
			String code = rec.dd_no;
			String name = rec.dd_bno;
			
			sb.append("<input name=\"");
			sb.append("dd_no");
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
	SS_L_MIGRERRDataSet ds = (SS_L_MIGRERRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.migrerrcur.size(); i++){
		SS_L_MIGRERRMIGRERRCURRecord migrerrcurRec = (SS_L_MIGRERRMIGRERRCURRecord)ds.migrerrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMigrerrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= migrerrcurRec.dd_no%>
<%= migrerrcurRec.dd_bno%>
<%= migrerrcurRec.dd_code%>
<%= migrerrcurRec.rdr_no%>
<%= migrerrcurRec.sinmoon%>
<%= migrerrcurRec.oyuga%>
<%= migrerrcurRec.ogudok%>
<%= migrerrcurRec.osgbang%>
<%= migrerrcurRec.cfreeyn%>
<%= migrerrcurRec.cyuga%>
<%= migrerrcurRec.csgbang%>
<%= migrerrcurRec.ercode%>
<%= migrerrcurRec.ername%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jun 13 23:42:55 KST 2004 */