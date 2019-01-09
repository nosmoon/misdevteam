/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAYDataSet.java
* 기능 : 확장현황-사이버확장-수당-목록을 위한 DataSet
* 작성일자 : 2004-09-13
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-수당-목록을 위한 DataSet
 */


public class SS_L_PROMSTAF_CYEXPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_PROMSTAF_CYEXPAYDataSet(){}
	public SS_L_PROMSTAF_CYEXPAYDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(16);
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord rec = new SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafclsfnm = Util.checkString(rset0.getString("stafclsfnm"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.tel_no1 = Util.checkString(rset0.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset0.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset0.getString("tel_no3"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.acctbank = Util.checkString(rset0.getString("acctbank"));
			rec.acctdeps_pers = Util.checkString(rset0.getString("acctdeps_pers"));
			rec.cnvsstafno = Util.checkString(rset0.getString("cnvsstafno"));
			rec.cnvsstafnm = Util.checkString(rset0.getString("cnvsstafnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rshpclsfcd = Util.checkString(rset0.getString("rshpclsfcd"));
			rec.rshpclsfnm = Util.checkString(rset0.getString("rshpclsfnm"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.resiclsfnm = Util.checkString(rset0.getString("resiclsfnm"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.resitypenm = Util.checkString(rset0.getString("resitypenm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.qty = rset0.getInt("qty");
			rec.dlvhopedt = Util.checkString(rset0.getString("dlvhopedt"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.corrbocd = Util.checkString(rset0.getString("corrbocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bo_headcnfmyn = Util.checkString(rset0.getString("bo_headcnfmyn"));
			rec.bo_headcnfmdt = Util.checkString(rset0.getString("bo_headcnfmdt"));
			rec.subscnfmstatcd = Util.checkString(rset0.getString("subscnfmstatcd"));
			rec.subscnfmstatnm = Util.checkString(rset0.getString("subscnfmstatnm"));
			rec.cyextnalon = rset0.getInt("cyextnalon");
			rec.alonadjmyn = Util.checkString(rset0.getString("alonadjmyn"));
			rec.alonadjmdt = Util.checkString(rset0.getString("alonadjmdt"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
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
			SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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
			SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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
	SS_L_PROMSTAF_CYEXPAYDataSet ds = (SS_L_PROMSTAF_CYEXPAYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.rdr_extndt%>
<%= curcommlistRec.rdr_extnno%>
<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.stafclsfnm%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.tel_no1%>
<%= curcommlistRec.tel_no2%>
<%= curcommlistRec.tel_no3%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.acctbank%>
<%= curcommlistRec.acctdeps_pers%>
<%= curcommlistRec.cnvsstafno%>
<%= curcommlistRec.cnvsstafnm%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rshpclsfcd%>
<%= curcommlistRec.rshpclsfnm%>
<%= curcommlistRec.resiclsfcd%>
<%= curcommlistRec.resiclsfnm%>
<%= curcommlistRec.resitypecd%>
<%= curcommlistRec.resitypenm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.qty%>
<%= curcommlistRec.dlvhopedt%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.corrbocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bo_headcnfmyn%>
<%= curcommlistRec.bo_headcnfmdt%>
<%= curcommlistRec.subscnfmstatcd%>
<%= curcommlistRec.subscnfmstatnm%>
<%= curcommlistRec.cyextnalon%>
<%= curcommlistRec.alonadjmyn%>
<%= curcommlistRec.alonadjmdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 15 13:59:10 KST 2004 */