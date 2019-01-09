/***************************************************************************************************
* ���ϸ� : SS_L_BO_HEAD_INITDataSet.java
* ��� : ����Info-������-�ʱ�ȭ���� ���� DataSet
* �ۼ����� : 2004-05-19
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * ����Info-������-�ʱ�ȭ���� ���� DataSet
 */

public class SS_L_BO_HEAD_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curjmgystgb = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_BO_HEAD_INITDataSet(){}
	public SS_L_BO_HEAD_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(3);
		while(rset1.next()){
			SS_L_BO_HEAD_INITCURDEPTCDRecord rec = new SS_L_BO_HEAD_INITCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(4);
		while(rset2.next()){
			SS_L_BO_HEAD_INITCURJMGYSTGBRecord rec = new SS_L_BO_HEAD_INITCURJMGYSTGBRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curjmgystgb.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEAD_INITCURDEPTCDRecord rec = (SS_L_BO_HEAD_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String curjmgystgbOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curjmgystgb.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEAD_INITCURJMGYSTGBRecord rec = (SS_L_BO_HEAD_INITCURJMGYSTGBRecord)curjmgystgb.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEAD_INITCURDEPTCDRecord rec = (SS_L_BO_HEAD_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curjmgystgbChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curjmgystgb.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEAD_INITCURJMGYSTGBRecord rec = (SS_L_BO_HEAD_INITCURJMGYSTGBRecord)curjmgystgb.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEAD_INITCURDEPTCDRecord rec = (SS_L_BO_HEAD_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curjmgystgbRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curjmgystgb.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEAD_INITCURJMGYSTGBRecord rec = (SS_L_BO_HEAD_INITCURJMGYSTGBRecord)curjmgystgb.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SS_L_BO_HEAD_INITDataSet ds = (SS_L_BO_HEAD_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_L_BO_HEAD_INITCURDEPTCDRecord curdeptcdRec = (SS_L_BO_HEAD_INITCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curjmgystgb.size(); i++){
		SS_L_BO_HEAD_INITCURJMGYSTGBRecord curjmgystgbRec = (SS_L_BO_HEAD_INITCURJMGYSTGBRecord)ds.curjmgystgb.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurjmgystgb()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= curjmgystgbRec.cicodeval%>
<%= curjmgystgbRec.cicdnm%>
<%= curjmgystgbRec.ciymgbcd%>
<%= curjmgystgbRec.cicdgb%>
<%= curjmgystgbRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 20 19:15:06 KST 2004 */