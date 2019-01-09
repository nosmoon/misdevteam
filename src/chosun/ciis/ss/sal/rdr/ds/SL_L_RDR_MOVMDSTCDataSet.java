/***************************************************************************************************
* 파일명 : SL_L_RDR_MOVMDSTCDataSet.java
* 기능 : 관할지국조정관리-인수(대상목록)
* 작성일자 : 2004-02-07
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 관할지국조정관리-인수(대상목록)
 *
 */


public class SL_L_RDR_MOVMDSTCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dstcinfocur = new ArrayList();
	public ArrayList rdr_movmdstc = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_RDR_MOVMDSTCDataSet(){}
	public SL_L_RDR_MOVMDSTCDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord rec = new SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset0.getString("dstcnm"));
			rec.rdrcnt = rset0.getInt("rdrcnt");
			rec.bgndlvno = Util.checkString(rset0.getString("bgndlvno"));
			rec.enddlvno = Util.checkString(rset0.getString("enddlvno"));
			this.rdr_movmdstc.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SL_L_RDR_MOVMDSTCDSTCINFOCURRecord rec = new SL_L_RDR_MOVMDSTCDSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset1.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset1.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset1.getString("teamcd"));
			this.dstcinfocur.add(rec);
		}
	}

	public String rdr_movmdstcOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_movmdstc.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord rec = (SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord)rdr_movmdstc.get(i);
			
			
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

	public String dstcinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMDSTCDSTCINFOCURRecord rec = (SL_L_RDR_MOVMDSTCDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
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

	public String rdr_movmdstcChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_movmdstc.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord rec = (SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord)rdr_movmdstc.get(i);
			
			
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

	public String dstcinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMDSTCDSTCINFOCURRecord rec = (SL_L_RDR_MOVMDSTCDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
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

	public String rdr_movmdstcRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_movmdstc.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord rec = (SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord)rdr_movmdstc.get(i);
			
			
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

	public String dstcinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMDSTCDSTCINFOCURRecord rec = (SL_L_RDR_MOVMDSTCDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
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
	SL_L_RDR_MOVMDSTCDataSet ds = (SL_L_RDR_MOVMDSTCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdr_movmdstc.size(); i++){
		SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord rdr_movmdstcRec = (SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord)ds.rdr_movmdstc.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SL_L_RDR_MOVMDSTCDSTCINFOCURRecord dstcinfocurRec = (SL_L_RDR_MOVMDSTCDSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_movmdstc()%>
<%= ds.getDstcinfocur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdr_movmdstcRec.regdt%>
<%= rdr_movmdstcRec.regno%>
<%= rdr_movmdstcRec.seq%>
<%= rdr_movmdstcRec.dstccd%>
<%= rdr_movmdstcRec.dstcnm%>
<%= rdr_movmdstcRec.rdrcnt%>
<%= rdr_movmdstcRec.bgndlvno%>
<%= rdr_movmdstcRec.enddlvno%>
<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 16:14:11 KST 2004 */