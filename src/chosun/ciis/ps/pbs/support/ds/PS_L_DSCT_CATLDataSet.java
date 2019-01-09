/***************************************************************************************************
* 파일명 : PS_L_DSCT_CATL.java
* 기능   :  불편접수 - 조회리스트 
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편접수 - 조회 리스트
 *
 */

public class PS_L_DSCT_CATLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bocdcur = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_DSCT_CATLDataSet(){}
	public PS_L_DSCT_CATLDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PS_L_DSCT_CATLCURCOMMLISTRecord rec = new PS_L_DSCT_CATLCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.dscttypecd = Util.checkString(rset0.getString("dscttypecd"));
			rec.acpndt = Util.checkString(rset0.getString("acpndt"));
			rec.acpnpathcd = Util.checkString(rset0.getString("acpnpathcd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.rdremail = Util.checkString(rset0.getString("rdremail"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.bocnfmdt = Util.checkString(rset0.getString("bocnfmdt"));
			rec.bocnfmyn = Util.checkString(rset0.getString("bocnfmyn"));
			rec.boprocdt = Util.checkString(rset0.getString("boprocdt"));
			rec.boprocyn = Util.checkString(rset0.getString("boprocyn"));
			rec.boproccont = Util.checkString(rset0.getString("boproccont"));
			rec.cns_empnm = Util.checkString(rset0.getString("cns_empnm"));
			rec.cns_empid = Util.checkString(rset0.getString("cns_empid"));
			rec.proccont = Util.checkString(rset0.getString("proccont"));
			rec.procpers = Util.checkString(rset0.getString("procpers"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.delidt = Util.checkString(rset0.getString("delidt"));
			rec.sendmthd = Util.checkString(rset0.getString("sendmthd"));
			rec.sendmthdnm = Util.checkString(rset0.getString("sendmthdnm"));
			rec.sendyncd = Util.checkString(rset0.getString("sendyncd"));
			rec.mang_emp_nm = Util.checkString(rset0.getString("mang_emp_nm"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset0.getString("substoser_no"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			PS_L_DSCT_CATLBOCDCURRecord rec = new PS_L_DSCT_CATLBOCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.bocdcur.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_CATLCURCOMMLISTRecord rec = (PS_L_DSCT_CATLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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

	public String bocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_CATLBOCDCURRecord rec = (PS_L_DSCT_CATLBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_CATLCURCOMMLISTRecord rec = (PS_L_DSCT_CATLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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

	public String bocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_CATLBOCDCURRecord rec = (PS_L_DSCT_CATLBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_CATLCURCOMMLISTRecord rec = (PS_L_DSCT_CATLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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

	public String bocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_CATLBOCDCURRecord rec = (PS_L_DSCT_CATLBOCDCURRecord)bocdcur.get(i);
			
			
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_L_DSCT_CATLDataSet ds = (PS_L_DSCT_CATLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_DSCT_CATLCURCOMMLISTRecord curcommlistRec = (PS_L_DSCT_CATLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bocdcur.size(); i++){
		PS_L_DSCT_CATLBOCDCURRecord bocdcurRec = (PS_L_DSCT_CATLBOCDCURRecord)ds.bocdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
<%= ds.getBocdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.dscttypecd%>
<%= curcommlistRec.acpndt%>
<%= curcommlistRec.acpnpathcd%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.tel_no%>
<%= curcommlistRec.ptph_no%>
<%= curcommlistRec.rdremail%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.termsubsno%>
<%= curcommlistRec.titl%>
<%= curcommlistRec.cont%>
<%= curcommlistRec.bocnfmdt%>
<%= curcommlistRec.bocnfmyn%>
<%= curcommlistRec.boprocdt%>
<%= curcommlistRec.boprocyn%>
<%= curcommlistRec.boproccont%>
<%= curcommlistRec.cns_empnm%>
<%= curcommlistRec.cns_empid%>
<%= curcommlistRec.proccont%>
<%= curcommlistRec.procpers%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.delidt%>
<%= curcommlistRec.sendmthd%>
<%= curcommlistRec.sendmthdnm%>
<%= curcommlistRec.sendyncd%>
<%= curcommlistRec.mang_emp_nm%>
<%= curcommlistRec.memo%>
<%= curcommlistRec.subsfrser_no%>
<%= curcommlistRec.substoser_no%>
<%= bocdcurRec.cicodeval%>
<%= bocdcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 11 20:48:34 KST 2005 */