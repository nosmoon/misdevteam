/***************************************************************************************************
* 파일명 : SS_L_BO_HEADDataSet.java
* 기능 : 지국Info-지국장-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국장-목록을 위한 DataSet
 */

public class SS_L_BO_HEADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long total2;
	public long totalcnt;

	public SS_L_BO_HEADDataSet(){}
	public SS_L_BO_HEADDataSet(String errcode, String errmsg, long total2, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.total2 = total2;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotal2(long total2){
		this.total2 = total2;
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

	public long getTotal2(){
		return this.total2;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.total2 = cstmt.getLong(11);
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_BO_HEADCURCOMMLISTRecord rec = new SS_L_BO_HEADCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.jmgystgb = Util.checkString(rset0.getString("jmgystgb"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.bo_zip = Util.checkString(rset0.getString("bo_zip"));
			rec.boaddr = Util.checkString(rset0.getString("boaddr"));
			rec.bodtlsaddr = Util.checkString(rset0.getString("bodtlsaddr"));
			rec.bo_headnm = Util.checkString(rset0.getString("bo_headnm"));
			rec.tel_no11 = Util.checkString(rset0.getString("tel_no11"));
			rec.tel_no12 = Util.checkString(rset0.getString("tel_no12"));
			rec.tel_no13 = Util.checkString(rset0.getString("tel_no13"));
			rec.bo_head_ptph_no1 = Util.checkString(rset0.getString("bo_head_ptph_no1"));
			rec.bo_head_ptph_no2 = Util.checkString(rset0.getString("bo_head_ptph_no2"));
			rec.bo_head_ptph_no3 = Util.checkString(rset0.getString("bo_head_ptph_no3"));
			rec.bo_head_tel_no1 = Util.checkString(rset0.getString("bo_head_tel_no1"));
			rec.bo_head_tel_no2 = Util.checkString(rset0.getString("bo_head_tel_no2"));
			rec.bo_head_tel_no3 = Util.checkString(rset0.getString("bo_head_tel_no3"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.bjjgseq = Util.checkString(rset0.getString("bjjgseq"));
			rec.bjjuminno = Util.checkString(rset0.getString("bjjuminno"));
			rec.bjnm = Util.checkString(rset0.getString("bjnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEADCURCOMMLISTRecord rec = (SS_L_BO_HEADCURCOMMLISTRecord)curcommlist.get(i);
			
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEADCURCOMMLISTRecord rec = (SS_L_BO_HEADCURCOMMLISTRecord)curcommlist.get(i);
			
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEADCURCOMMLISTRecord rec = (SS_L_BO_HEADCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_BO_HEADDataSet ds = (SS_L_BO_HEADDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BO_HEADCURCOMMLISTRecord curcommlistRec = (SS_L_BO_HEADCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotal2()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.boksnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.jmgystgb%>
<%= curcommlistRec.presi_nm%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.bo_zip%>
<%= curcommlistRec.boaddr%>
<%= curcommlistRec.bodtlsaddr%>
<%= curcommlistRec.bo_headnm%>
<%= curcommlistRec.tel_no11%>
<%= curcommlistRec.tel_no12%>
<%= curcommlistRec.tel_no13%>
<%= curcommlistRec.bo_head_ptph_no1%>
<%= curcommlistRec.bo_head_ptph_no2%>
<%= curcommlistRec.bo_head_ptph_no3%>
<%= curcommlistRec.bo_head_tel_no1%>
<%= curcommlistRec.bo_head_tel_no2%>
<%= curcommlistRec.bo_head_tel_no3%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.bjjgseq%>
<%= curcommlistRec.bjjuminno%>
<%= curcommlistRec.bjnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 20 22:08:13 KST 2004 */