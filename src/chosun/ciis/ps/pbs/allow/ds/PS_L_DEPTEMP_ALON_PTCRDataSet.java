/***************************************************************************************************
 * 파일명   : PS_L_DEPTEMP_ALON_PTCR.java
 * 기능     : 수당-수당월마감 조회
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-수당월마감 검색
 */

public class PS_L_DEPTEMP_ALON_PTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList intgbocdcur = new ArrayList();
	public ArrayList deptlistcur = new ArrayList();
	public ArrayList empaloncur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_DEPTEMP_ALON_PTCRDataSet(){}
	public PS_L_DEPTEMP_ALON_PTCRDataSet(String errcode, String errmsg){
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
			PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord rec = new PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.paytot_amt = rset0.getInt("paytot_amt");
			rec.dductot_amt = rset0.getInt("dductot_amt");
			rec.sellpaytot_amt = rset0.getInt("sellpaytot_amt");
			rec.selldductot_amt = rset0.getInt("selldductot_amt");
			rec.paynewnoit = rset0.getInt("paynewnoit");
			rec.paylinknoit = rset0.getInt("paylinknoit");
			rec.dducnewnoit = rset0.getInt("dducnewnoit");
			rec.dduclinknoit = rset0.getInt("dduclinknoit");
			rec.deptrsltnoit = rset0.getInt("deptrsltnoit");
			rec.dcl_amtnoit = rset0.getInt("dcl_amtnoit");
			rec.dcl_amtamt = rset0.getInt("dcl_amtamt");
			rec.dcl_amtalontot_amt = rset0.getInt("dcl_amtalontot_amt");
			rec.rsltalontot_amt = rset0.getInt("rsltalontot_amt");
			rec.spcalontot_amt = rset0.getInt("spcalontot_amt");
			rec.posialontot_amt = rset0.getInt("posialontot_amt");
			rec.etcalontot_amt = rset0.getInt("etcalontot_amt");
			rec.prsntalontot_amt = rset0.getInt("prsntalontot_amt");
			rec.campalontot_amt = rset0.getInt("campalontot_amt");
			rec.cashalon_amt = rset0.getInt("cashalon_amt");
			rec.advnalon_amt = rset0.getInt("advnalon_amt");
			rec.etc_amt = rset0.getInt("etc_amt");
			rec.busnshow_amt = rset0.getInt("busnshow_amt");
			rec.telfee_amt = rset0.getInt("telfee_amt");
			rec.retnalonamt = rset0.getInt("retnalonamt");
			rec.gdsdducalonamt = rset0.getInt("gdsdducalonamt");
			this.empaloncur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord rec = new PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset1.getString("sellnetclsf"));
			this.intgbocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord rec = new PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord();
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.deptnm = Util.checkString(rset2.getString("deptnm"));
			this.deptlistcur.add(rec);
		}
	}

	public String empaloncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empaloncur.size();
		for(int i=0; i<size; i++){
			PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord rec = (PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord)empaloncur.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.deptcd;
			
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
			PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord rec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String deptlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord rec = (PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord)deptlistcur.get(i);
			
			
			String code = rec.deptcd;
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

	public String empaloncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empaloncur.size();
		for(int i=0; i<size; i++){
			PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord rec = (PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord)empaloncur.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
			PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord rec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String deptlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord rec = (PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord)deptlistcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String empaloncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empaloncur.size();
		for(int i=0; i<size; i++){
			PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord rec = (PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord)empaloncur.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
			PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord rec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String deptlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord rec = (PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord)deptlistcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
	PS_L_DEPTEMP_ALON_PTCRDataSet ds = (PS_L_DEPTEMP_ALON_PTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.empaloncur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord empaloncurRec = (PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord)ds.empaloncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord intgbocdcurRec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)ds.intgbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord deptlistcurRec = (PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord)ds.deptlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEmpaloncur()%>
<%= ds.getIntgbocdcur()%>
<%= ds.getDeptlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= empaloncurRec.deptnm%>
<%= empaloncurRec.deptcd%>
<%= empaloncurRec.boemp_no%>
<%= empaloncurRec.flnm%>
<%= empaloncurRec.paytot_amt%>
<%= empaloncurRec.dductot_amt%>
<%= empaloncurRec.sellpaytot_amt%>
<%= empaloncurRec.selldductot_amt%>
<%= empaloncurRec.paynewnoit%>
<%= empaloncurRec.paylinknoit%>
<%= empaloncurRec.dducnewnoit%>
<%= empaloncurRec.dduclinknoit%>
<%= empaloncurRec.deptrsltnoit%>
<%= empaloncurRec.dcl_amtnoit%>
<%= empaloncurRec.dcl_amtamt%>
<%= empaloncurRec.dcl_amtalontot_amt%>
<%= empaloncurRec.rsltalontot_amt%>
<%= empaloncurRec.spcalontot_amt%>
<%= empaloncurRec.posialontot_amt%>
<%= empaloncurRec.etcalontot_amt%>
<%= empaloncurRec.prsntalontot_amt%>
<%= empaloncurRec.campalontot_amt%>
<%= empaloncurRec.cashalon_amt%>
<%= empaloncurRec.advnalon_amt%>
<%= empaloncurRec.etc_amt%>
<%= empaloncurRec.busnshow_amt%>
<%= empaloncurRec.telfee_amt%>
<%= empaloncurRec.retnalonamt%>
<%= empaloncurRec.gdsdducalonamt%>
<%= intgbocdcurRec.bocd%>
<%= intgbocdcurRec.bonm%>
<%= intgbocdcurRec.deptcd%>
<%= intgbocdcurRec.sellnetclsf%>
<%= deptlistcurRec.deptcd%>
<%= deptlistcurRec.deptnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 21 17:43:19 KST 2007 */