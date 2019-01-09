/***************************************************************************************************
* 파일명 : PS_L_SHFT_CLAM_PLAN.java
* 기능   : 자동이체청구예정목록
* 작성일자 : 2006-04-25
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체청구예정목록
 *
 */

public class PS_L_SHFT_CLAM_PLANDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalsum;

	public PS_L_SHFT_CLAM_PLANDataSet(){}
	public PS_L_SHFT_CLAM_PLANDataSet(String errcode, String errmsg, long totalcnt, long totalsum){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalsum = totalsum;
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

	public void setTotalsum(long totalsum){
		this.totalsum = totalsum;
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

	public long getTotalsum(){
		return this.totalsum;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(11);
		this.totalsum = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_SHFT_CLAM_PLANRSLTCURRecord rec = new PS_L_SHFT_CLAM_PLANRSLTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.agrmntamt = rset0.getInt("agrmntamt");
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.rcpmmthd = Util.checkString(rset0.getString("rcpmmthd"));
			rec.agrmnt_dt = Util.checkString(rset0.getString("agrmnt_dt"));
			rec.rcpmmthdnm = Util.checkString(rset0.getString("rcpmmthdnm"));
			rec.rcpmclsfcd = Util.checkString(rset0.getString("rcpmclsfcd"));
			rec.rcpmclsfnm = Util.checkString(rset0.getString("rcpmclsfnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.agrmntseq = Util.checkString(rset0.getString("agrmntseq"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_SHFT_CLAM_PLANRSLTCURRecord rec = (PS_L_SHFT_CLAM_PLANRSLTCURRecord)rsltcur.get(i);
			
			
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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_SHFT_CLAM_PLANRSLTCURRecord rec = (PS_L_SHFT_CLAM_PLANRSLTCURRecord)rsltcur.get(i);
			
			
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_SHFT_CLAM_PLANRSLTCURRecord rec = (PS_L_SHFT_CLAM_PLANRSLTCURRecord)rsltcur.get(i);
			
			
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
	PS_L_SHFT_CLAM_PLANDataSet ds = (PS_L_SHFT_CLAM_PLANDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		PS_L_SHFT_CLAM_PLANRSLTCURRecord rsltcurRec = (PS_L_SHFT_CLAM_PLANRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalsum()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.termsubsno%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.agrmntamt%>
<%= rsltcurRec.dlvaddr%>
<%= rsltcurRec.rcpmmthd%>
<%= rsltcurRec.agrmnt_dt%>
<%= rsltcurRec.rcpmmthdnm%>
<%= rsltcurRec.rcpmclsfcd%>
<%= rsltcurRec.rcpmclsfnm%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.agrmntseq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 25 15:14:46 KST 2006 */