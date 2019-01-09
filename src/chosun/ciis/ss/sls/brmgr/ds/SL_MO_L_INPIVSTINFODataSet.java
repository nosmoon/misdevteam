/***************************************************************************************************
* ���ϸ� : SL_MO_L_INPIVSTINFODataSet.java
* ��� :  ����Ʈ���Է���ȸ(����Ʈ���¸���Ʈ or ���Է���ϸ���Ʈ)_����ϸ�����
* �ۼ����� : 2017-01-12
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


public class SL_MO_L_INPIVSTINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aptinfocur = new ArrayList();
	public ArrayList aptivstmedicur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_MO_L_INPIVSTINFODataSet(){}
	public SL_MO_L_INPIVSTINFODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SL_MO_L_INPIVSTINFOAPTINFOCURRecord rec = new SL_MO_L_INPIVSTINFOAPTINFOCURRecord();
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.florcnt = Util.checkString(rset0.getString("florcnt"));
			rec.flor_houscnt = Util.checkString(rset0.getString("flor_houscnt"));
			rec.hoscnt = Util.checkString(rset0.getString("hoscnt"));
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.stairyn = Util.checkString(rset0.getString("stairyn"));
			rec.under_exne = Util.checkString(rset0.getString("under_exne"));
			this.aptinfocur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord rec = new SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord();
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.mediycd = Util.checkString(rset1.getString("mediycd"));
			rec.mediynm = Util.checkString(rset1.getString("mediynm"));
			this.aptivstmedicur.add(rec);
		}
	}

	public String aptinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptinfocur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_INPIVSTINFOAPTINFOCURRecord rec = (SL_MO_L_INPIVSTINFOAPTINFOCURRecord)aptinfocur.get(i);


			String code = rec.dongno;
			String name = rec.florcnt;

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

	public String aptivstmedicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptivstmedicur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord rec = (SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord)aptivstmedicur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

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

	public String aptinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptinfocur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_INPIVSTINFOAPTINFOCURRecord rec = (SL_MO_L_INPIVSTINFOAPTINFOCURRecord)aptinfocur.get(i);


			String code = rec.dongno;
			String name = rec.florcnt;

			sb.append("<input name=\"");
			sb.append("dongno");
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

	public String aptivstmedicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptivstmedicur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord rec = (SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord)aptivstmedicur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String aptinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptinfocur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_INPIVSTINFOAPTINFOCURRecord rec = (SL_MO_L_INPIVSTINFOAPTINFOCURRecord)aptinfocur.get(i);


			String code = rec.dongno;
			String name = rec.florcnt;

			sb.append("<input name=\"");
			sb.append("dongno");
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

	public String aptivstmedicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptivstmedicur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord rec = (SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord)aptivstmedicur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("medicd");
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
	SL_MO_L_INPIVSTINFODataSet ds = (SL_MO_L_INPIVSTINFODataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.aptinfocur.size(); i++){
		SL_MO_L_INPIVSTINFOAPTINFOCURRecord aptinfocurRec = (SL_MO_L_INPIVSTINFOAPTINFOCURRecord)ds.aptinfocur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.aptivstmedicur.size(); i++){
		SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord aptivstmedicurRec = (SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord)ds.aptivstmedicur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAptinfocur()%>
<%= ds.getAptivstmedicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= aptinfocurRec.dongno%>
<%= aptinfocurRec.florcnt%>
<%= aptinfocurRec.flor_houscnt%>
<%= aptinfocurRec.hoscnt%>
<%= aptinfocurRec.pyong%>
<%= aptinfocurRec.stairyn%>
<%= aptinfocurRec.under_exne%>
<%= aptivstmedicurRec.medicd%>
<%= aptivstmedicurRec.medinm%>
<%= aptivstmedicurRec.mediycd%>
<%= aptivstmedicurRec.mediynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jan 12 17:26:47 KST 2017 */