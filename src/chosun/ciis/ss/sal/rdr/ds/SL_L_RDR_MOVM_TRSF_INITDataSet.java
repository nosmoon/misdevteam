/***************************************************************************************************
* 파일명 : SL_L_RDR_MOVM_TRSF_INITDataSet.java
* 기능 : 이사독자관리-인계(초기화면)
* 작성일자 : 2003-12-17
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
 * 이사독자관리-인계(초기화면)
 *
 */


public class SL_L_RDR_MOVM_TRSF_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dstcinfocur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_RDR_MOVM_TRSF_INITDataSet(){}
	public SL_L_RDR_MOVM_TRSF_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord rec = new SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset0.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset0.getString("teamcd"));
			rec.bgndlvno = Util.checkString(rset0.getString("bgndlvno"));
			rec.enddlvno = Util.checkString(rset0.getString("enddlvno"));
			this.dstcinfocur.add(rec);
		}
	}

	public String dstcinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord rec = (SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord)dstcinfocur.get(i);


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

	public String dstcinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord rec = (SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord)dstcinfocur.get(i);


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

	public String dstcinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord rec = (SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord)dstcinfocur.get(i);


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
	SL_L_RDR_MOVM_TRSF_INITDataSet ds = (SL_L_RDR_MOVM_TRSF_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord dstcinfocurRec = (SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDstcinfocur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
<%= dstcinfocurRec.bgndlvno%>
<%= dstcinfocurRec.enddlvno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 02 21:48:01 KST 2004 */