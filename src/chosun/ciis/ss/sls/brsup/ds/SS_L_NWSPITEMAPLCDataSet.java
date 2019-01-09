/***************************************************************************************************
* 파일명 : .java
* 기능 : 검색조건에 따라 신문지원물품 신청목록을 리턴한다.
* 작성일자 :2009/07/03  
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-신청-목록
 */

public class SS_L_NWSPITEMAPLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalaplcqunt;
	public long totalamt;

	public SS_L_NWSPITEMAPLCDataSet(){}
	public SS_L_NWSPITEMAPLCDataSet(String errcode, String errmsg, long totalcnt, long totalaplcqunt, long totalamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalaplcqunt = totalaplcqunt;
		this.totalamt = totalamt;
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

	public void setTotalaplcqunt(long totalaplcqunt){
		this.totalaplcqunt = totalaplcqunt;
	}

	public void setTotalamt(long totalamt){
		this.totalamt = totalamt;
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

	public long getTotalaplcqunt(){
		return this.totalaplcqunt;
	}

	public long getTotalamt(){
		return this.totalamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_L_NWSPITEMAPLCCURCOMMLISTRecord rec = new SS_L_NWSPITEMAPLCCURCOMMLISTRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.itemclsfnm = Util.checkString(rset0.getString("itemclsfnm"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.uprc = rset0.getInt("uprc");
			rec.aplcqunt = rset0.getInt("aplcqunt");
			rec.amt = rset0.getInt("amt");
			rec.senddt = Util.checkString(rset0.getString("senddt"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			rec.owhqunt = rset0.getInt("owhqunt");
			rec.owhdd = Util.checkString(rset0.getString("owhdd"));
			rec.owhproc = Util.checkString(rset0.getString("owhproc"));
			rec.promseqreg = rset0.getInt("promseqreg");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(13);
		this.totalaplcqunt = cstmt.getLong(14);
		this.totalamt = cstmt.getLong(15);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEMAPLCCURCOMMLISTRecord rec = (SS_L_NWSPITEMAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
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
			SS_L_NWSPITEMAPLCCURCOMMLISTRecord rec = (SS_L_NWSPITEMAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
			SS_L_NWSPITEMAPLCCURCOMMLISTRecord rec = (SS_L_NWSPITEMAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
	SS_L_NWSPITEMAPLCDataSet ds = (SS_L_NWSPITEMAPLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMAPLCCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalaplcqunt()%>
<%= ds.getTotalamt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.aplcno%>
<%= curcommlistRec.itemcd%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.itemclsfnm%>
<%= curcommlistRec.itemnm%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.aplcqunt%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.senddt%>
<%= curcommlistRec.closyn%>
<%= curcommlistRec.owhqunt%>
<%= curcommlistRec.owhdd%>
<%= curcommlistRec.owhproc%>
<%= curcommlistRec.promseqreg%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 03 15:43:38 PDT 2009 */