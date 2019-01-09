/***************************************************************************************************
* ���ϸ� : SS_MO_L_APTINPIVSTDataSet.java
* ��� :  �����ϱ� ���� ����Ʈ���Է���ȸ(����Ʈ���¸���Ʈ or ���Է���ϸ���Ʈ)_����Ͽ�(ciis��)
* �ۼ����� : 2017-01-13
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 *
 */


public class SS_MO_L_APTINPIVSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aptinpivstcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_L_APTINPIVSTDataSet(){}
	public SS_MO_L_APTINPIVSTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord rec = new SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord();
			rec.dlvqty = Util.checkString(rset0.getString("dlvqty"));
			rec.dlvqty2 = Util.checkString(rset0.getString("dlvqty2"));
			rec.dlvqty3 = Util.checkString(rset0.getString("dlvqty3"));
			rec.apt_dong = Util.checkString(rset0.getString("apt_dong"));
			rec.apt_floor = Util.checkString(rset0.getString("apt_floor"));
			rec.apt_ho = Util.checkString(rset0.getString("apt_ho"));
			rec.bk_dongno = Util.checkString(rset0.getString("bk_dongno"));
			rec.bk_addr_ho = Util.checkString(rset0.getString("bk_addr_ho"));
			this.aptinpivstcur.add(rec);
		}
	}

	public String aptinpivstcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptinpivstcur.size();
		for(int i=0; i<size; i++){
			SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord rec = (SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord)aptinpivstcur.get(i);


			String code = rec.dlvqty;
			String name = rec.dlvqty2;

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

	public String aptinpivstcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptinpivstcur.size();
		for(int i=0; i<size; i++){
			SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord rec = (SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord)aptinpivstcur.get(i);


			String code = rec.dlvqty;
			String name = rec.dlvqty2;

			sb.append("<input name=\"");
			sb.append("dlvqty");
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

	public String aptinpivstcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptinpivstcur.size();
		for(int i=0; i<size; i++){
			SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord rec = (SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord)aptinpivstcur.get(i);


			String code = rec.dlvqty;
			String name = rec.dlvqty2;

			sb.append("<input name=\"");
			sb.append("dlvqty");
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
	SS_MO_L_APTINPIVSTDataSet ds = (SS_MO_L_APTINPIVSTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.aptinpivstcur.size(); i++){
		SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord aptinpivstcurRec = (SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord)ds.aptinpivstcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAptinpivstcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= aptinpivstcurRec.dlvqty%>
<%= aptinpivstcurRec.dlvqty2%>
<%= aptinpivstcurRec.dlvqty3%>
<%= aptinpivstcurRec.apt_dong%>
<%= aptinpivstcurRec.apt_floor%>
<%= aptinpivstcurRec.apt_ho%>
<%= aptinpivstcurRec.bk_dongno%>
<%= aptinpivstcurRec.bk_addr_ho%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 13 16:24:08 KST 2017 */