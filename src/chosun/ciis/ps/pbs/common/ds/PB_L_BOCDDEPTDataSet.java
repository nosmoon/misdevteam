/***************************************************************************************************
 * ���ϸ�   : PB_L_BOCDDEPTDataSet.java
 * ���     : ����-���纰 �μ��˻�
* �ۼ����� : 2004-03-08
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * ����-���纰 �μ��˻�
 */ 

public class PB_L_BOCDDEPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deptlistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PB_L_BOCDDEPTDataSet(){}
	public PB_L_BOCDDEPTDataSet(String errcode, String errmsg){
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
			PB_L_BOCDDEPTDEPTLISTCURRecord rec = new PB_L_BOCDDEPTDEPTLISTCURRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			this.deptlistcur.add(rec);
		}
	}

	public String deptlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PB_L_BOCDDEPTDEPTLISTCURRecord rec = (PB_L_BOCDDEPTDEPTLISTCURRecord)deptlistcur.get(i);
			
			
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

	public String deptlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PB_L_BOCDDEPTDEPTLISTCURRecord rec = (PB_L_BOCDDEPTDEPTLISTCURRecord)deptlistcur.get(i);
			
			
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

	public String deptlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PB_L_BOCDDEPTDEPTLISTCURRecord rec = (PB_L_BOCDDEPTDEPTLISTCURRecord)deptlistcur.get(i);
			
			
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
	PB_L_BOCDDEPTDataSet ds = (PB_L_BOCDDEPTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PB_L_BOCDDEPTDEPTLISTCURRecord deptlistcurRec = (PB_L_BOCDDEPTDEPTLISTCURRecord)ds.deptlistcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= deptlistcurRec.deptcd%>
<%= deptlistcurRec.deptnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 08 16:18:05 KST 2004 */