/***************************************************************************************************
* 파일명 : SP_PS_S_ABNOR_SEPBK.java
* 수금-비정상입금 초기화면
* 작성일자 : 2004-03-19
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-비정상입금 수금화면
 *
 */



public class PS_S_ABNOR_SEPBKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList crpmyncur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_ABNOR_SEPBKDataSet(){}
	public PS_S_ABNOR_SEPBKDataSet(String errcode, String errmsg, String sysdate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sysdate = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PS_S_ABNOR_SEPBKASINBOCDCURRecord rec = new PS_S_ABNOR_SEPBKASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PS_S_ABNOR_SEPBKCRPMYNCURRecord rec = new PS_S_ABNOR_SEPBKCRPMYNCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.crpmyncur.add(rec);
		}
	}

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_ABNOR_SEPBKASINBOCDCURRecord rec = (PS_S_ABNOR_SEPBKASINBOCDCURRecord)asinbocdcur.get(i);


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

	public String crpmyncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crpmyncur.size();
		for(int i=0; i<size; i++){
			PS_S_ABNOR_SEPBKCRPMYNCURRecord rec = (PS_S_ABNOR_SEPBKCRPMYNCURRecord)crpmyncur.get(i);


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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_ABNOR_SEPBKASINBOCDCURRecord rec = (PS_S_ABNOR_SEPBKASINBOCDCURRecord)asinbocdcur.get(i);


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

	public String crpmyncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crpmyncur.size();
		for(int i=0; i<size; i++){
			PS_S_ABNOR_SEPBKCRPMYNCURRecord rec = (PS_S_ABNOR_SEPBKCRPMYNCURRecord)crpmyncur.get(i);


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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_ABNOR_SEPBKASINBOCDCURRecord rec = (PS_S_ABNOR_SEPBKASINBOCDCURRecord)asinbocdcur.get(i);


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

	public String crpmyncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crpmyncur.size();
		for(int i=0; i<size; i++){
			PS_S_ABNOR_SEPBKCRPMYNCURRecord rec = (PS_S_ABNOR_SEPBKCRPMYNCURRecord)crpmyncur.get(i);


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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_ABNOR_SEPBKDataSet ds = (PS_S_ABNOR_SEPBKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_S_ABNOR_SEPBKASINBOCDCURRecord asinbocdcurRec = (PS_S_ABNOR_SEPBKASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crpmyncur.size(); i++){
		PS_S_ABNOR_SEPBKCRPMYNCURRecord crpmyncurRec = (PS_S_ABNOR_SEPBKCRPMYNCURRecord)ds.crpmyncur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getCrpmyncur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= crpmyncurRec.ciymgbcd%>
<%= crpmyncurRec.cicdgb%>
<%= crpmyncurRec.cicodeval%>
<%= crpmyncurRec.cicdnm%>
<%= crpmyncurRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 29 17:16:57 KST 2004 */