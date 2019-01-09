/***************************************************************************************************
 * 파일명 : CO_MO_L_NEW_ADDRDataSet.java_모바일용
 * 기능 : 공통-우편번호검색
 * 작성일자 : 2017-02-17
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 *
 */


public class CO_MO_L_NEW_ADDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_MO_L_NEW_ADDRDataSet(){}
	public CO_MO_L_NEW_ADDRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(17);
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			CO_MO_L_NEW_ADDRCURCOMMLISTRecord rec = new CO_MO_L_NEW_ADDRCURCOMMLISTRecord();
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.rd_addr = Util.checkString(rset0.getString("rd_addr"));
			rec.bldgnm = Util.checkString(rset0.getString("bldgnm"));
			rec.rd_fulladdr = Util.checkString(rset0.getString("rd_fulladdr"));
			rec.bj_addr = Util.checkString(rset0.getString("bj_addr"));
			rec.bj_addr_fst = Util.checkString(rset0.getString("bj_addr_fst"));
			rec.bj_addr_lst = Util.checkString(rset0.getString("bj_addr_lst"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bldmngnn = Util.checkString(rset0.getString("bldmngnn"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.telno1 = Util.checkString(rset0.getString("telno1"));
			rec.telno2 = Util.checkString(rset0.getString("telno2"));
			rec.telno3 = Util.checkString(rset0.getString("telno3"));
			rec.sendyn = Util.checkString(rset0.getString("sendyn"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			CO_MO_L_NEW_ADDRCURCOMMLISTRecord rec = (CO_MO_L_NEW_ADDRCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.zip;
			String name = rec.rd_addr;

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
			CO_MO_L_NEW_ADDRCURCOMMLISTRecord rec = (CO_MO_L_NEW_ADDRCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.zip;
			String name = rec.rd_addr;

			sb.append("<input name=\"");
			sb.append("zip");
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
			CO_MO_L_NEW_ADDRCURCOMMLISTRecord rec = (CO_MO_L_NEW_ADDRCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.zip;
			String name = rec.rd_addr;

			sb.append("<input name=\"");
			sb.append("zip");
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
	CO_MO_L_NEW_ADDRDataSet ds = (CO_MO_L_NEW_ADDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_MO_L_NEW_ADDRCURCOMMLISTRecord curcommlistRec = (CO_MO_L_NEW_ADDRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.zip%>
<%= curcommlistRec.rd_addr%>
<%= curcommlistRec.bldgnm%>
<%= curcommlistRec.rd_fulladdr%>
<%= curcommlistRec.bj_addr%>
<%= curcommlistRec.bj_addr_fst%>
<%= curcommlistRec.bj_addr_lst%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bldmngnn%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.telno1%>
<%= curcommlistRec.telno2%>
<%= curcommlistRec.telno3%>
<%= curcommlistRec.sendyn%>
<%= curcommlistRec.sellnetclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 10 10:47:17 KST 2017 */