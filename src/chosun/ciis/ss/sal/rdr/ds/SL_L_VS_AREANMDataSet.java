/***************************************************************************************************
* ���ϸ� : SL_L_VS_AREANMDataSet.java
* ��� : ����-VacationStop-�ް���������� ����� ���� DataSet
* �ۼ����� : 2004-01-20
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ����-VacationStop-�ް���������� ����� ���� DataSet
 */


public class SL_L_VS_AREANMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_VS_AREANMDataSet(){}
	public SL_L_VS_AREANMDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(4);
		while(rset2.next()){
			SL_L_VS_AREANMCURCOMMLISTRecord rec = new SL_L_VS_AREANMCURCOMMLISTRecord();
			rec.vaca_areacd = Util.checkString(rset2.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset2.getString("vaca_areanm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_VS_AREANMCURCOMMLISTRecord rec = (SL_L_VS_AREANMCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;

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
			SL_L_VS_AREANMCURCOMMLISTRecord rec = (SL_L_VS_AREANMCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;

			sb.append("<input name=\"");
			sb.append("vaca_areacd");
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
			SL_L_VS_AREANMCURCOMMLISTRecord rec = (SL_L_VS_AREANMCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;

			sb.append("<input name=\"");
			sb.append("vaca_areacd");
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
	SL_L_VS_AREANMDataSet ds = (SL_L_VS_AREANMDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_VS_AREANMCURCOMMLISTRecord curcommlistRec = (SL_L_VS_AREANMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.vaca_areacd%>
<%= curcommlistRec.vaca_areanm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 26 11:59:10 KST 2004 */