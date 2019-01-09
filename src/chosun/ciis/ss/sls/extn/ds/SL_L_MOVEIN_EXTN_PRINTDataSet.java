/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-입주아파트현황-입주팀확장현황-엑셀저장
* 작성일자 : 2009-04-02
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
 * 지국경영-입주아파트현황-입주팀확장현황-엑셀저장
 */

public class SL_L_MOVEIN_EXTN_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curextnlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long subscnt;
	public long realcnt;

	public SL_L_MOVEIN_EXTN_PRINTDataSet(){}
	public SL_L_MOVEIN_EXTN_PRINTDataSet(String errcode, String errmsg, long totalcnt, long subscnt, long realcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.subscnt = subscnt;
		this.realcnt = realcnt;
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

	public void setSubscnt(long subscnt){
		this.subscnt = subscnt;
	}

	public void setRealcnt(long realcnt){
		this.realcnt = realcnt;
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

	public long getSubscnt(){
		return this.subscnt;
	}

	public long getRealcnt(){
		return this.realcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord rec = new SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord();
			rec.extndt = Util.checkString(rset0.getString("extndt"));
			rec.teamnm = Util.checkString(rset0.getString("teamnm"));
			rec.jursareanm = Util.checkString(rset0.getString("jursareanm"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.resitypenm = Util.checkString(rset0.getString("resitypenm"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.amt = rset0.getInt("amt");
			rec.qty = rset0.getInt("qty");
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.subspyn = Util.checkString(rset0.getString("subspyn"));
			rec.mvinaptyn = Util.checkString(rset0.getString("mvinaptyn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			this.curextnlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(13);
		this.subscnt = cstmt.getLong(14);
		this.realcnt = cstmt.getLong(15);
	}

	public String curextnlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextnlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord rec = (SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord)curextnlist.get(i);
			
			
			String code = rec.extndt;
			String name = rec.teamnm;
			
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

	public String curextnlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextnlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord rec = (SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord)curextnlist.get(i);
			
			
			String code = rec.extndt;
			String name = rec.teamnm;
			
			sb.append("<input name=\"");
			sb.append("extndt");
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

	public String curextnlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextnlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord rec = (SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord)curextnlist.get(i);
			
			
			String code = rec.extndt;
			String name = rec.teamnm;
			
			sb.append("<input name=\"");
			sb.append("extndt");
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
	SL_L_MOVEIN_EXTN_PRINTDataSet ds = (SL_L_MOVEIN_EXTN_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextnlist.size(); i++){
		SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord curextnlistRec = (SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord)ds.curextnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurextnlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getSubscnt()%>
<%= ds.getRealcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextnlistRec.extndt%>
<%= curextnlistRec.teamnm%>
<%= curextnlistRec.jursareanm%>
<%= curextnlistRec.stafnm%>
<%= curextnlistRec.deptnm%>
<%= curextnlistRec.areanm%>
<%= curextnlistRec.bonm%>
<%= curextnlistRec.rdrnm%>
<%= curextnlistRec.rdr_no%>
<%= curextnlistRec.addr%>
<%= curextnlistRec.dtlsaddr%>
<%= curextnlistRec.resitypenm%>
<%= curextnlistRec.valmm%>
<%= curextnlistRec.telno%>
<%= curextnlistRec.ptphno%>
<%= curextnlistRec.amt%>
<%= curextnlistRec.qty%>
<%= curextnlistRec.suspdt%>
<%= curextnlistRec.subspyn%>
<%= curextnlistRec.mvinaptyn%>
<%= curextnlistRec.remk%>
<%= curextnlistRec.rdr_extntypenm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 21:38:34 KST 2009 */