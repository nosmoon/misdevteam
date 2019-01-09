/***************************************************************************************************
 * 파일명   : PB_L_TAOCC_PSTCDDataSet.java
 * 기능     : 공통-우편번호 및 주소 찾기
 * 작성일자 : 2004-03-05
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * 공통-우편번호 및 주소 찾기
 */

public class PB_L_TAOCC_PSTCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList zipaddrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PB_L_TAOCC_PSTCDDataSet(){}
	public PB_L_TAOCC_PSTCDDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PB_L_TAOCC_PSTCDZIPADDRCURRecord rec = new PB_L_TAOCC_PSTCDZIPADDRCURRecord();
			rec.juzipcd1 = Util.checkString(rset0.getString("juzipcd1"));
			rec.juzipcd2 = Util.checkString(rset0.getString("juzipcd2"));
			rec.juzipcd3 = Util.checkString(rset0.getString("juzipcd3"));
			rec.jujuso1 = Util.checkString(rset0.getString("jujuso1"));
			rec.jujuso2 = Util.checkString(rset0.getString("jujuso2"));
			rec.jujuso3 = Util.checkString(rset0.getString("jujuso3"));
			rec.jujuso4 = Util.checkString(rset0.getString("jujuso4"));
			rec.judoseo = Util.checkString(rset0.getString("judoseo"));
			rec.jusaf = Util.checkString(rset0.getString("jusaf"));
			rec.jusat = Util.checkString(rset0.getString("jusat"));
			this.zipaddrcur.add(rec);
		}
	}

	public String zipaddrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = zipaddrcur.size();
		for(int i=0; i<size; i++){
			PB_L_TAOCC_PSTCDZIPADDRCURRecord rec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)zipaddrcur.get(i);


			String code = rec.juzipcd1;
			String name = rec.juzipcd2;

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

	public String zipaddrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = zipaddrcur.size();
		for(int i=0; i<size; i++){
			PB_L_TAOCC_PSTCDZIPADDRCURRecord rec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)zipaddrcur.get(i);


			String code = rec.juzipcd1;
			String name = rec.juzipcd2;

			sb.append("<input name=\"");
			sb.append("juzipcd1");
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

	public String zipaddrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = zipaddrcur.size();
		for(int i=0; i<size; i++){
			PB_L_TAOCC_PSTCDZIPADDRCURRecord rec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)zipaddrcur.get(i);


			String code = rec.juzipcd1;
			String name = rec.juzipcd2;

			sb.append("<input name=\"");
			sb.append("juzipcd1");
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
	PB_L_TAOCC_PSTCDDataSet ds = (PB_L_TAOCC_PSTCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.zipaddrcur.size(); i++){
		PB_L_TAOCC_PSTCDZIPADDRCURRecord zipaddrcurRec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)ds.zipaddrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getZipaddrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= zipaddrcurRec.juzipcd1%>
<%= zipaddrcurRec.juzipcd2%>
<%= zipaddrcurRec.juzipcd3%>
<%= zipaddrcurRec.jujuso1%>
<%= zipaddrcurRec.jujuso2%>
<%= zipaddrcurRec.jujuso3%>
<%= zipaddrcurRec.jujuso4%>
<%= zipaddrcurRec.judoseo%>
<%= zipaddrcurRec.jusaf%>
<%= zipaddrcurRec.jusat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 05 14:46:20 KST 2004 */