/***************************************************************************************************
* ���ϸ� : PS_S_BNSBK_CD.java
* ��� :   �ڵ����-���ʽ��ϵ�� �ʱ�ȭ��
* �ۼ����� : 2007-05-21
* �ۼ��� : ����ǥ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * �ڵ����-�ڵ����-���ʽ��ϵ�� �ʱ�ȭ��
 *
 */

public class PS_S_BNSBK_CDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medicdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;
	public String cmpynm;

	public PS_S_BNSBK_CDDataSet(){}
	public PS_S_BNSBK_CDDataSet(String errcode, String errmsg, String sysdate, String cmpynm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
		this.cmpynm = cmpynm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSysdate(String sysdate){
		this.sysdate = sysdate;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			PS_S_BNSBK_CDMEDICDCURRecord rec = new PS_S_BNSBK_CDMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		this.sysdate = Util.checkString(cstmt.getString(5));
		this.cmpynm = Util.checkString(cstmt.getString(6));
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BNSBK_CDMEDICDCURRecord rec = (PS_S_BNSBK_CDMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BNSBK_CDMEDICDCURRecord rec = (PS_S_BNSBK_CDMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BNSBK_CDMEDICDCURRecord rec = (PS_S_BNSBK_CDMEDICDCURRecord)medicdcur.get(i);
			
			
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
	PS_S_BNSBK_CDDataSet ds = (PS_S_BNSBK_CDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_BNSBK_CDMEDICDCURRecord medicdcurRec = (PS_S_BNSBK_CDMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicdcur()%>
<%= ds.getSysdate()%>
<%= ds.getCmpynm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 21 16:56:56 KST 2007 */