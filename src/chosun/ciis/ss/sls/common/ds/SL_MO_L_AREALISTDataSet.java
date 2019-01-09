/***************************************************************************************************
* ���ϸ� : SL_MO_L_AREALISTDataSet.java
* ��� : �����ڵ�-��������Ʈ
* �ۼ����� : 2016-12-14
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 *
 */


public class SL_MO_L_AREALISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList areacur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_MO_L_AREALISTDataSet(){}
	public SL_MO_L_AREALISTDataSet(String errcode, String errmsg){
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
			SL_MO_L_AREALISTAREACURRecord rec = new SL_MO_L_AREALISTAREACURRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_persnm = Util.checkString(rset0.getString("chrg_persnm"));
			this.areacur.add(rec);
		}
	}

	public String areacurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_AREALISTAREACURRecord rec = (SL_MO_L_AREALISTAREACURRecord)areacur.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

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

	public String areacurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_AREALISTAREACURRecord rec = (SL_MO_L_AREALISTAREACURRecord)areacur.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
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

	public String areacurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_AREALISTAREACURRecord rec = (SL_MO_L_AREALISTAREACURRecord)areacur.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
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
	SL_MO_L_AREALISTDataSet ds = (SL_MO_L_AREALISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.areacur.size(); i++){
		SL_MO_L_AREALISTAREACURRecord areacurRec = (SL_MO_L_AREALISTAREACURRecord)ds.areacur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAreacur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= areacurRec.cd%>
<%= areacurRec.cdnm%>
<%= areacurRec.chrg_pers%>
<%= areacurRec.chrg_persnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 14 17:16:29 KST 2016 */