/***************************************************************************************************
* ���ϸ� : SS_L_DAY_SCHEDataSet.java
* ��� : ��������-����������-�Ϻ� ���� ����� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * ��������-����������-�Ϻ� ���� ����� ���� DataSet
 */

public class SS_L_DAY_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dayschecur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_DAY_SCHEDataSet(){}
	public SS_L_DAY_SCHEDataSet(String errcode, String errmsg){
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
		ResultSet rset31 = (ResultSet) cstmt.getObject(6);
		while(rset31.next()){
			SS_L_DAY_SCHEDAYSCHECURRecord rec = new SS_L_DAY_SCHEDAYSCHECURRecord();
			rec.seq = Util.checkString(rset31.getString("seq"));
			rec.frdt = Util.checkString(rset31.getString("frdt"));
			rec.todt = Util.checkString(rset31.getString("todt"));
			rec.remk = Util.checkString(rset31.getString("remk"));
			rec.schemangitemcd = Util.checkString(rset31.getString("schemangitemcd"));
			rec.schemangitemcd_nm = Util.checkString(rset31.getString("schemangitemcd_nm"));
			rec.schemangunitcd = Util.checkString(rset31.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset31.getString("schemangunitcd_nm"));
			this.dayschecur.add(rec);
		}
	}

	public String dayschecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			SS_L_DAY_SCHEDAYSCHECURRecord rec = (SS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
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

	public String dayschecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			SS_L_DAY_SCHEDAYSCHECURRecord rec = (SS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
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

	public String dayschecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			SS_L_DAY_SCHEDAYSCHECURRecord rec = (SS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
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
	SS_L_DAY_SCHEDataSet ds = (SS_L_DAY_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.dayschecur.size(); i++){
		SS_L_DAY_SCHEDAYSCHECURRecord dayschecurRec = (SS_L_DAY_SCHEDAYSCHECURRecord)ds.dayschecur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDayschecur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= dayschecurRec.seq%>
<%= dayschecurRec.frdt%>
<%= dayschecurRec.todt%>
<%= dayschecurRec.remk%>
<%= dayschecurRec.schemangitemcd%>
<%= dayschecurRec.schemangitemcd_nm%>
<%= dayschecurRec.schemangunitcd%>
<%= dayschecurRec.schemangunitcd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 07 14:07:49 KST 2004 */