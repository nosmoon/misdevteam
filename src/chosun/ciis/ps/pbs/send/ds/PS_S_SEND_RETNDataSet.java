/***************************************************************************************************
* 파일명 : SP_PS_S_SEND_RETN.java
* 발송-반송관리 초기화면
* 작성일자 : 2004-03-19
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 초기화면
 *
 */



public class PS_S_SEND_RETNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList retnocomcur = new ArrayList();
	public ArrayList retnkindcur = new ArrayList();
	public ArrayList retnresncur = new ArrayList();
	public ArrayList intgbocdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_S_SEND_RETNDataSet(){}
	public PS_S_SEND_RETNDataSet(String errcode, String errmsg){
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
			PS_S_SEND_RETNRETNKINDCURRecord rec = new PS_S_SEND_RETNRETNKINDCURRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.retnkindcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_S_SEND_RETNRETNRESNCURRecord rec = new PS_S_SEND_RETNRETNRESNCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.retnresncur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PS_S_SEND_RETNRETNOCOMCURRecord rec = new PS_S_SEND_RETNRETNOCOMCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.retnocomcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PS_S_SEND_RETNINTGBOCDCURRecord rec = new PS_S_SEND_RETNINTGBOCDCURRecord();
			rec.bocd = Util.checkString(rset3.getString("bocd"));
			rec.bonm = Util.checkString(rset3.getString("bonm"));
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset3.getString("sellnetclsf"));
			this.intgbocdcur.add(rec);
		}
	}

	public String retnkindcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNKINDCURRecord rec = (PS_S_SEND_RETNRETNKINDCURRecord)retnkindcur.get(i);

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

	public String retnresncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnresncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNRESNCURRecord rec = (PS_S_SEND_RETNRETNRESNCURRecord)retnresncur.get(i);

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

	public String retnocomcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnocomcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNOCOMCURRecord rec = (PS_S_SEND_RETNRETNOCOMCURRecord)retnocomcur.get(i);

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

	public String intgbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNINTGBOCDCURRecord rec = (PS_S_SEND_RETNINTGBOCDCURRecord)intgbocdcur.get(i);


			String code = rec.bocd;
			String name = rec.bonm;

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

	public String retnkindcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNKINDCURRecord rec = (PS_S_SEND_RETNRETNKINDCURRecord)retnkindcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String retnresncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnresncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNRESNCURRecord rec = (PS_S_SEND_RETNRETNRESNCURRecord)retnresncur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String retnocomcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnocomcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNOCOMCURRecord rec = (PS_S_SEND_RETNRETNOCOMCURRecord)retnocomcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String intgbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNINTGBOCDCURRecord rec = (PS_S_SEND_RETNINTGBOCDCURRecord)intgbocdcur.get(i);


			String code = rec.bocd;
			String name = rec.bonm;

			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String retnkindcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNKINDCURRecord rec = (PS_S_SEND_RETNRETNKINDCURRecord)retnkindcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String retnresncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnresncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNRESNCURRecord rec = (PS_S_SEND_RETNRETNRESNCURRecord)retnresncur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String retnocomcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnocomcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNRETNOCOMCURRecord rec = (PS_S_SEND_RETNRETNOCOMCURRecord)retnocomcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String intgbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETNINTGBOCDCURRecord rec = (PS_S_SEND_RETNINTGBOCDCURRecord)intgbocdcur.get(i);


			String code = rec.bocd;
			String name = rec.bonm;

			sb.append("<input name=\"");
			sb.append("bocd");
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_SEND_RETNDataSet ds = (PS_S_SEND_RETNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.retnkindcur.size(); i++){
		PS_S_SEND_RETNRETNKINDCURRecord retnkindcurRec = (PS_S_SEND_RETNRETNKINDCURRecord)ds.retnkindcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.retnresncur.size(); i++){
		PS_S_SEND_RETNRETNRESNCURRecord retnresncurRec = (PS_S_SEND_RETNRETNRESNCURRecord)ds.retnresncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.retnocomcur.size(); i++){
		PS_S_SEND_RETNRETNOCOMCURRecord retnocomcurRec = (PS_S_SEND_RETNRETNOCOMCURRecord)ds.retnocomcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_S_SEND_RETNINTGBOCDCURRecord intgbocdcurRec = (PS_S_SEND_RETNINTGBOCDCURRecord)ds.intgbocdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRetnkindcur()%>
<%= ds.getRetnresncur()%>
<%= ds.getRetnocomcur()%>
<%= ds.getIntgbocdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= retnkindcurRec.ciymgbcd%>
<%= retnkindcurRec.cicdgb%>
<%= retnkindcurRec.cicodeval%>
<%= retnkindcurRec.cicdnm%>
<%= retnkindcurRec.cicdynm%>
<%= retnresncurRec.ciymgbcd%>
<%= retnresncurRec.cicdgb%>
<%= retnresncurRec.cicodeval%>
<%= retnresncurRec.cicdnm%>
<%= retnresncurRec.cicdynm%>
<%= retnocomcurRec.ciymgbcd%>
<%= retnocomcurRec.cicdgb%>
<%= retnocomcurRec.cicodeval%>
<%= retnocomcurRec.cicdnm%>
<%= retnocomcurRec.cicdynm%>
<%= intgbocdcurRec.bocd%>
<%= intgbocdcurRec.bonm%>
<%= intgbocdcurRec.deptcd%>
<%= intgbocdcurRec.sellnetclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 19 14:32:50 KST 2004 */