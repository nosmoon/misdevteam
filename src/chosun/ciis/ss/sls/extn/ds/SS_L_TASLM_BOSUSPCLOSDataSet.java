/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-지국중지마감-목록조회
* 작성일자 : 2010-01-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *  확장현황-지국중지마감-목록조회
 */

public class SS_L_TASLM_BOSUSPCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bosuspclos = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_TASLM_BOSUSPCLOSDataSet(){}
	public SS_L_TASLM_BOSUSPCLOSDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord rec = new SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.closmm = Util.checkString(rset0.getString("closmm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.dstc = Util.checkString(rset0.getString("dstc"));
			rec.medi = Util.checkString(rset0.getString("medi"));
			rec.subsbgndd = Util.checkString(rset0.getString("subsbgndd"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.resitype = Util.checkString(rset0.getString("resitype"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extntype1 = Util.checkString(rset0.getString("rdr_extntype1"));
			rec.rdr_extntype2 = Util.checkString(rset0.getString("rdr_extntype2"));
			rec.camprdr_extnnm = Util.checkString(rset0.getString("camprdr_extnnm"));
			rec.aplcpath = Util.checkString(rset0.getString("aplcpath"));
			rec.camptype = Util.checkString(rset0.getString("camptype"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.uprc = rset0.getInt("uprc");
			rec.qty = rset0.getInt("qty");
			rec.clamtmatt = Util.checkString(rset0.getString("clamtmatt"));
			rec.clamtmonth = rset0.getInt("clamtmonth");
			rec.totsubsmonth = rset0.getInt("totsubsmonth");
			rec.subsmonth200407aft = rset0.getInt("subsmonth200407aft");
			rec.clamtmthd = Util.checkString(rset0.getString("clamtmthd"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.vexcboyn = Util.checkString(rset0.getString("vexcboyn"));
			rec.suspexclyn = Util.checkString(rset0.getString("suspexclyn"));
			this.bosuspclos.add(rec);
		}
	}

	public String bosuspclosOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bosuspclos.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord rec = (SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord)bosuspclos.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.cmpycd;
			
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

	public String bosuspclosChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bosuspclos.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord rec = (SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord)bosuspclos.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.cmpycd;
			
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

	public String bosuspclosRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bosuspclos.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord rec = (SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord)bosuspclos.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.cmpycd;
			
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
	SS_L_TASLM_BOSUSPCLOSDataSet ds = (SS_L_TASLM_BOSUSPCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bosuspclos.size(); i++){
		SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord bosuspclosRec = (SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord)ds.bosuspclos.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBosuspclos()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bosuspclosRec.deptcd%>
<%= bosuspclosRec.cmpycd%>
<%= bosuspclosRec.closmm%>
<%= bosuspclosRec.seq%>
<%= bosuspclosRec.deptnm%>
<%= bosuspclosRec.partcd%>
<%= bosuspclosRec.partnm%>
<%= bosuspclosRec.areacd%>
<%= bosuspclosRec.areanm%>
<%= bosuspclosRec.bocd%>
<%= bosuspclosRec.bonm%>
<%= bosuspclosRec.rdr_no%>
<%= bosuspclosRec.addr%>
<%= bosuspclosRec.rdrnm%>
<%= bosuspclosRec.dstc%>
<%= bosuspclosRec.medi%>
<%= bosuspclosRec.subsbgndd%>
<%= bosuspclosRec.valmm%>
<%= bosuspclosRec.freeclsf%>
<%= bosuspclosRec.resitype%>
<%= bosuspclosRec.tel_no%>
<%= bosuspclosRec.rdr_extndt%>
<%= bosuspclosRec.rdr_extntype1%>
<%= bosuspclosRec.rdr_extntype2%>
<%= bosuspclosRec.camprdr_extnnm%>
<%= bosuspclosRec.aplcpath%>
<%= bosuspclosRec.camptype%>
<%= bosuspclosRec.extnnm%>
<%= bosuspclosRec.uprc%>
<%= bosuspclosRec.qty%>
<%= bosuspclosRec.clamtmatt%>
<%= bosuspclosRec.clamtmonth%>
<%= bosuspclosRec.totsubsmonth%>
<%= bosuspclosRec.subsmonth200407aft%>
<%= bosuspclosRec.clamtmthd%>
<%= bosuspclosRec.suspresncd%>
<%= bosuspclosRec.suspdt%>
<%= bosuspclosRec.vexcboyn%>
<%= bosuspclosRec.suspexclyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 06 16:14:22 KST 2010 */