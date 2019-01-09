/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAY_DTLDataSet.java
* 기능 : 확장현황-사이버확장-수당-상세
* 작성일자 : 2004-04-06
* 작성자 : 고윤홍
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
 * 확장현황-사이버확장-수당-상세
 *
 */

public class SS_L_PROMSTAF_CYEXPAY_DTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_PROMSTAF_CYEXPAY_DTLDataSet(){}
	public SS_L_PROMSTAF_CYEXPAY_DTLDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord rec = new SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord();
			rec.rdr_extncampno = Util.checkString(rset0.getString("rdr_extncampno"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.rdr_extnqty = rset0.getInt("rdr_extnqty");
			rec.calcqty = rset0.getInt("calcqty");
			rec.basialonamt = rset0.getInt("basialonamt");
			rec.basialonpont = rset0.getInt("basialonpont");
			rec.alonamt = rset0.getInt("alonamt");
			rec.alonpont = rset0.getInt("alonpont");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extncampno;
			String name = rec.campnm;
			
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
			SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extncampno;
			String name = rec.campnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extncampno");
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
			SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extncampno;
			String name = rec.campnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extncampno");
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
	SS_L_PROMSTAF_CYEXPAY_DTLDataSet ds = (SS_L_PROMSTAF_CYEXPAY_DTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_extncampno%>
<%= curcommlistRec.campnm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.rdr_extnqty%>
<%= curcommlistRec.calcqty%>
<%= curcommlistRec.basialonamt%>
<%= curcommlistRec.basialonpont%>
<%= curcommlistRec.alonamt%>
<%= curcommlistRec.alonpont%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 06 10:58:32 KST 2004 */