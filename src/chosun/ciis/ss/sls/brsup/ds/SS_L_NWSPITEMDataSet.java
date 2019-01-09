/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEMDataSet.java
* ��� : ��������-�Ź�������ǰ-���-����� ���� DataSet
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-�Ź�������ǰ-���-����� ���� DataSet
 */

public class SS_L_NWSPITEMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_NWSPITEMDataSet(){}
	public SS_L_NWSPITEMDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_NWSPITEMCURCOMMLISTRecord rec = new SS_L_NWSPITEMCURCOMMLISTRecord();
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.qunt = rset0.getInt("qunt");
			rec.uprc = rset0.getInt("uprc");
			rec.divnuprc = rset0.getInt("divnuprc");
			rec.insddivnuprc = rset0.getInt("insddivnuprc");
			rec.rcpmchrgpersclsf = Util.checkString(rset0.getString("rcpmchrgpersclsf"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.clamchrgpersclsf = Util.checkString(rset0.getString("clamchrgpersclsf"));
			rec.itemclsf = Util.checkString(rset0.getString("itemclsf"));
			rec.itemclsfnm = Util.checkString(rset0.getString("itemclsfnm"));
			rec.sendclsf = Util.checkString(rset0.getString("sendclsf"));
			rec.sendclsfnm = Util.checkString(rset0.getString("sendclsfnm"));
			rec.costclsf = Util.checkString(rset0.getString("costclsf"));
			rec.costclsfnm = Util.checkString(rset0.getString("costclsfnm"));
			rec.aplcfrdt = Util.checkString(rset0.getString("aplcfrdt"));
			rec.aplctodt = Util.checkString(rset0.getString("aplctodt"));
			rec.aplcclostm = Util.checkString(rset0.getString("aplcclostm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(10);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEMCURCOMMLISTRecord rec = (SS_L_NWSPITEMCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

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
			SS_L_NWSPITEMCURCOMMLISTRecord rec = (SS_L_NWSPITEMCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

			sb.append("<input name=\"");
			sb.append("itemcd");
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
			SS_L_NWSPITEMCURCOMMLISTRecord rec = (SS_L_NWSPITEMCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

			sb.append("<input name=\"");
			sb.append("itemcd");
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
	SS_L_NWSPITEMDataSet ds = (SS_L_NWSPITEMDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.itemcd%>
<%= curcommlistRec.itemnm%>
<%= curcommlistRec.qunt%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.divnuprc%>
<%= curcommlistRec.insddivnuprc%>
<%= curcommlistRec.rcpmchrgpersclsf%>
<%= curcommlistRec.unit%>
<%= curcommlistRec.clamchrgpersclsf%>
<%= curcommlistRec.itemclsf%>
<%= curcommlistRec.itemclsfnm%>
<%= curcommlistRec.sendclsf%>
<%= curcommlistRec.sendclsfnm%>
<%= curcommlistRec.costclsf%>
<%= curcommlistRec.costclsfnm%>
<%= curcommlistRec.aplcfrdt%>
<%= curcommlistRec.aplctodt%>
<%= curcommlistRec.aplcclostm%>
<%= curcommlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 28 21:18:50 KST 2004 */