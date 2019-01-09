/***************************************************************************************************
* 파일명 : PS_L_SEPBK_CODE.java
* 기능 :  단행본 코드관리 
* 작성일자 : 2004-02-20
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 단행본-단행본 코드관리
 *
 */

public class PS_L_SEPBK_CODEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_SEPBK_CODEDataSet(){}
	public PS_L_SEPBK_CODEDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PS_L_SEPBK_CODECURCOMMLISTRecord rec = new PS_L_SEPBK_CODECURCOMMLISTRecord();
			rec.sep_bookcd = Util.checkString(rset0.getString("sep_bookcd"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.sep_bookcdnm = Util.checkString(rset0.getString("sep_bookcdnm"));
			rec.issuclsf = Util.checkString(rset0.getString("issuclsf"));
			rec.basiyymm = Util.checkString(rset0.getString("basiyymm"));
			rec.uprc = rset0.getInt("uprc");
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.dcrate = rset0.getInt("dcrate");
			rec.contclascd = Util.checkString(rset0.getString("contclascd"));
			rec.author = Util.checkString(rset0.getString("author"));
			rec.type = Util.checkString(rset0.getString("type"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.page = rset0.getInt("page");
			rec.covermodl = Util.checkString(rset0.getString("covermodl"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.extdtms = rset0.getInt("extdtms");
			rec.absenceyn = Util.checkString(rset0.getString("absenceyn"));
			rec.absencedt = Util.checkString(rset0.getString("absencedt"));
			rec.absenceprocdt = Util.checkString(rset0.getString("absenceprocdt"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.bundunit = rset0.getInt("bundunit");
			rec.unitmidlqunt = rset0.getInt("unitmidlqunt");
			rec.pjbasimidlqunt = rset0.getInt("pjbasimidlqunt");
			rec.sericd = Util.checkString(rset0.getString("sericd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.issuclsfnm = Util.checkString(rset0.getString("issuclsfnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_SEPBK_CODECURCOMMLISTRecord rec = (PS_L_SEPBK_CODECURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.sep_bookcd;
			String name = rec.medicd;
			
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
			PS_L_SEPBK_CODECURCOMMLISTRecord rec = (PS_L_SEPBK_CODECURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.sep_bookcd;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("sep_bookcd");
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
			PS_L_SEPBK_CODECURCOMMLISTRecord rec = (PS_L_SEPBK_CODECURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.sep_bookcd;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("sep_bookcd");
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
	PS_L_SEPBK_CODEDataSet ds = (PS_L_SEPBK_CODEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_SEPBK_CODECURCOMMLISTRecord curcommlistRec = (PS_L_SEPBK_CODECURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.sep_bookcd%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.medi_clsf%>
<%= curcommlistRec.sep_bookcdnm%>
<%= curcommlistRec.issuclsf%>
<%= curcommlistRec.basiyymm%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.subsuprc%>
<%= curcommlistRec.dcrate%>
<%= curcommlistRec.contclascd%>
<%= curcommlistRec.author%>
<%= curcommlistRec.type%>
<%= curcommlistRec.std%>
<%= curcommlistRec.page%>
<%= curcommlistRec.covermodl%>
<%= curcommlistRec.reg_dt%>
<%= curcommlistRec.extdtms%>
<%= curcommlistRec.absenceyn%>
<%= curcommlistRec.absencedt%>
<%= curcommlistRec.absenceprocdt%>
<%= curcommlistRec.cmpycd%>
<%= curcommlistRec.bundunit%>
<%= curcommlistRec.unitmidlqunt%>
<%= curcommlistRec.pjbasimidlqunt%>
<%= curcommlistRec.sericd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.issuclsfnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 25 19:33:09 KST 2005 */