/***************************************************************************************************
* ���ϸ� : SP_PS_L_EMP_ALON_DEPT.java
* ����-������� ���纰 �μ��ڵ�
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * ����-������� ���纰 �μ��ڵ� ��ȸȭ��  
 *
 */ 

 

public class PS_L_EMP_ALON_DEPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bodeptcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_EMP_ALON_DEPTDataSet(){}
	public PS_L_EMP_ALON_DEPTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = new PS_L_EMP_ALON_DEPTBODEPTCURRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			this.bodeptcur.add(rec);
		}
	}

	public String bodeptcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bodeptcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)bodeptcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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

	public String bodeptcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bodeptcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)bodeptcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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

	public String bodeptcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bodeptcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)bodeptcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_L_EMP_ALON_DEPTDataSet ds = (PS_L_EMP_ALON_DEPTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.bodeptcur.size(); i++){
		PS_L_EMP_ALON_DEPTBODEPTCURRecord bodeptcurRec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)ds.bodeptcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBodeptcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= bodeptcurRec.deptcd%>
<%= bodeptcurRec.deptnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 08 14:54:16 KST 2004 */