/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SERVCOSTDDataSet.java
* ��� : Ȯ����Ȳ-����ISȮ��-�������� �󼼸���� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-����ISȮ��-�������� �󼼸���� ���� DataSet
 */


public class SS_L_RDR_EXTN_SERVCOSTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_SERVCOSTDDataSet(){}
	public SS_L_RDR_EXTN_SERVCOSTDDataSet(String errcode, String errmsg){
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
			SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord();
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.resitypenm = Util.checkString(rset0.getString("resitypenm"));
			rec.rdr_extnqty = rset0.getInt("rdr_extnqty");
			rec.adjmqty = rset0.getInt("adjmqty");
			rec.errqty = rset0.getInt("errqty");
			rec.basiamt = rset0.getInt("basiamt");
			rec.servcost = rset0.getInt("servcost");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medinm;
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medinm;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("medinm");
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
			SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medinm;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("medinm");
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
	SS_L_RDR_EXTN_SERVCOSTDDataSet ds = (SS_L_RDR_EXTN_SERVCOSTDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.medinm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.resitypenm%>
<%= curcommlistRec.rdr_extnqty%>
<%= curcommlistRec.adjmqty%>
<%= curcommlistRec.errqty%>
<%= curcommlistRec.basiamt%>
<%= curcommlistRec.servcost%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 03 19:37:00 KST 2004 */