/***************************************************************************************************
* ���ϸ� : SS_L_APTDLV_LISTDataSet.java
* ��� :  �ش������Ǿ���Ʈ ���ī�� ��ȸ_����Ͽ�(ciis��)
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


public class SS_L_APTDLV_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlvlistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_APTDLV_LISTDataSet(){}
	public SS_L_APTDLV_LISTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_APTDLV_LISTDLVLISTCURRecord rec = new SS_L_APTDLV_LISTDLVLISTCURRecord();
			rec.dlvqty = Util.checkString(rset0.getString("dlvqty"));
			rec.dlvqty2 = Util.checkString(rset0.getString("dlvqty2"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.rdrmisuyn = Util.checkString(rset0.getString("rdrmisuyn"));
			this.dlvlistcur.add(rec);
		}
	}

	public String dlvlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDLV_LISTDLVLISTCURRecord rec = (SS_L_APTDLV_LISTDLVLISTCURRecord)dlvlistcur.get(i);


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

	public String dlvlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDLV_LISTDLVLISTCURRecord rec = (SS_L_APTDLV_LISTDLVLISTCURRecord)dlvlistcur.get(i);


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

	public String dlvlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDLV_LISTDLVLISTCURRecord rec = (SS_L_APTDLV_LISTDLVLISTCURRecord)dlvlistcur.get(i);


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
	SS_L_APTDLV_LISTDataSet ds = (SS_L_APTDLV_LISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.dlvlistcur.size(); i++){
		SS_L_APTDLV_LISTDLVLISTCURRecord dlvlistcurRec = (SS_L_APTDLV_LISTDLVLISTCURRecord)ds.dlvlistcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlvlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= dlvlistcurRec.dlvqty%>
<%= dlvlistcurRec.dlvqty2%>
<%= dlvlistcurRec.dlvdong%>
<%= dlvlistcurRec.dlvser_no%>
<%= dlvlistcurRec.dongno%>
<%= dlvlistcurRec.rdrmisuyn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 13 15:30:46 KST 2017 */