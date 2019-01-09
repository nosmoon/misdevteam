/***************************************************************************************************
* 파일명   : SP_PS_L_PBLMCLAMT.java
* 기능     : 독자-수금입력목록 조회화면
* 작성일자 : 2008-07-16
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-수금입력목록 조회화면
 *
 */

public class PS_L_PBLMCLAMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_PBLMCLAMTDataSet(){}
	public PS_L_PBLMCLAMTDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PS_L_PBLMCLAMTCURCOMMLISTRecord rec = new PS_L_PBLMCLAMTCURCOMMLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.procdt = Util.checkString(rset0.getString("procdt"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.recpmthd = Util.checkString(rset0.getString("recpmthd"));
			rec.rcpmamt = rset0.getInt("rcpmamt");
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_PBLMCLAMTCURCOMMLISTRecord rec = (PS_L_PBLMCLAMTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.rdr_no;
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
			PS_L_PBLMCLAMTCURCOMMLISTRecord rec = (PS_L_PBLMCLAMTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.rdr_no;
			String name = rec.medicd;

			sb.append("<input name=\"");
			sb.append("rdr_no");
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
			PS_L_PBLMCLAMTCURCOMMLISTRecord rec = (PS_L_PBLMCLAMTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.rdr_no;
			String name = rec.medicd;

			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	PS_L_PBLMCLAMTDataSet ds = (PS_L_PBLMCLAMTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_PBLMCLAMTCURCOMMLISTRecord curcommlistRec = (PS_L_PBLMCLAMTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.termsubsno%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.procdt%>
<%= curcommlistRec.acqnm%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.recpmthd%>
<%= curcommlistRec.rcpmamt%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 16 15:57:30 KST 2008 */
