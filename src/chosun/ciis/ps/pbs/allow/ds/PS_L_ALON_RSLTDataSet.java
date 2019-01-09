/***************************************************************************************************
* 파일명 : SP_PS_L_ALON_RSLT.java
* 수당-수당관리 수당처리 사원조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-수당관리 수당처리 사원조회
 *
 */



public class PS_L_ALON_RSLTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList fixlist = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public ArrayList alonlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_ALON_RSLTDataSet(){}
	public PS_L_ALON_RSLTDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_ALON_RSLTCURCOMMLISTRecord rec = new PS_L_ALON_RSLTCURCOMMLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.boemp_nm = Util.checkString(rset0.getString("boemp_nm"));
			rec.dutycd_nm = Util.checkString(rset0.getString("dutycd_nm"));
			rec.aloncd = Util.checkString(rset0.getString("aloncd"));
			rec.trgtnoit = rset0.getInt("trgtnoit");
			rec.fix_rateclsf = Util.checkString(rset0.getString("fix_rateclsf"));
			rec.amt = rset0.getInt("amt");
			rec.ratiocalcclsf = Util.checkString(rset0.getString("ratiocalcclsf"));
			rec.ratio = rset0.getFloat("ratio");
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			PS_L_ALON_RSLTALONLISTRecord rec = new PS_L_ALON_RSLTALONLISTRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.alonlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			PS_L_ALON_RSLTFIXLISTRecord rec = new PS_L_ALON_RSLTFIXLISTRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.fixlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTCURCOMMLISTRecord rec = (PS_L_ALON_RSLTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bonm;
			String name = rec.flnm;

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

	public String alonlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTALONLISTRecord rec = (PS_L_ALON_RSLTALONLISTRecord)alonlist.get(i);


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

	public String fixlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = fixlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTFIXLISTRecord rec = (PS_L_ALON_RSLTFIXLISTRecord)fixlist.get(i);


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
			PS_L_ALON_RSLTCURCOMMLISTRecord rec = (PS_L_ALON_RSLTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bonm;
			String name = rec.flnm;

			sb.append("<input name=\"");
			sb.append("bonm");
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

	public String alonlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTALONLISTRecord rec = (PS_L_ALON_RSLTALONLISTRecord)alonlist.get(i);


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

	public String fixlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = fixlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTFIXLISTRecord rec = (PS_L_ALON_RSLTFIXLISTRecord)fixlist.get(i);


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
			PS_L_ALON_RSLTCURCOMMLISTRecord rec = (PS_L_ALON_RSLTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bonm;
			String name = rec.flnm;

			sb.append("<input name=\"");
			sb.append("bonm");
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

	public String alonlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTALONLISTRecord rec = (PS_L_ALON_RSLTALONLISTRecord)alonlist.get(i);


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

	public String fixlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = fixlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLTFIXLISTRecord rec = (PS_L_ALON_RSLTFIXLISTRecord)fixlist.get(i);


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
	PS_L_ALON_RSLTDataSet ds = (PS_L_ALON_RSLTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_ALON_RSLTCURCOMMLISTRecord curcommlistRec = (PS_L_ALON_RSLTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.alonlist.size(); i++){
		PS_L_ALON_RSLTALONLISTRecord alonlistRec = (PS_L_ALON_RSLTALONLISTRecord)ds.alonlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.fixlist.size(); i++){
		PS_L_ALON_RSLTFIXLISTRecord fixlistRec = (PS_L_ALON_RSLTFIXLISTRecord)ds.fixlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
<%= ds.getAlonlist()%>
<%= ds.getFixlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bonm%>
<%= curcommlistRec.flnm%>
<%= curcommlistRec.boemp_no%>
<%= curcommlistRec.boemp_nm%>
<%= curcommlistRec.dutycd_nm%>
<%= curcommlistRec.aloncd%>
<%= curcommlistRec.trgtnoit%>
<%= curcommlistRec.fix_rateclsf%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.ratiocalcclsf%>
<%= curcommlistRec.ratio%>
<%= alonlistRec.cicodeval%>
<%= alonlistRec.cicdnm%>
<%= alonlistRec.ciymgbcd%>
<%= alonlistRec.cicdgb%>
<%= alonlistRec.cicdynm%>
<%= fixlistRec.cicodeval%>
<%= fixlistRec.cicdnm%>
<%= fixlistRec.ciymgbcd%>
<%= fixlistRec.cicdgb%>
<%= fixlistRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 12:42:11 KST 2004 */