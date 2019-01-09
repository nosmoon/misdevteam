/***************************************************************************************************
* 파일명 : SS_L_SHFT_CLAM_OCOMDataSet.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-청구내역조회
* 작성일자 : 2004-04-12
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-납부자관리-청구내역조회
 *
 */


public class SS_L_SHFT_CLAM_OCOMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long normcnt;
	public long errcnt;
	public long totalamt;
	public long normamt;
	public long erramt;

	public SS_L_SHFT_CLAM_OCOMDataSet(){}
	public SS_L_SHFT_CLAM_OCOMDataSet(String errcode, String errmsg, long totalcnt, long normcnt, long errcnt, long totalamt, long normamt, long erramt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.normcnt = normcnt;
		this.errcnt = errcnt;
		this.totalamt = totalamt;
		this.normamt = normamt;
		this.erramt = erramt;
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

	public void setNormcnt(long normcnt){
		this.normcnt = normcnt;
	}

	public void setErrcnt(long errcnt){
		this.errcnt = errcnt;
	}

	public void setTotalamt(long totalamt){
		this.totalamt = totalamt;
	}

	public void setNormamt(long normamt){
		this.normamt = normamt;
	}

	public void setErramt(long erramt){
		this.erramt = erramt;
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

	public long getNormcnt(){
		return this.normcnt;
	}

	public long getErrcnt(){
		return this.errcnt;
	}

	public long getTotalamt(){
		return this.totalamt;
	}

	public long getNormamt(){
		return this.normamt;
	}

	public long getErramt(){
		return this.erramt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(7);
		this.normcnt = cstmt.getLong(8);
		this.errcnt = cstmt.getLong(9);
		this.totalamt = cstmt.getLong(10);
		this.normamt = cstmt.getLong(11);
		this.erramt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_SHFT_CLAM_OCOMRSLTCURRecord rec = new SS_L_SHFT_CLAM_OCOMRSLTCURRecord();
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.shftclsfcd = Util.checkString(rset0.getString("shftclsfcd"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.clamqty = rset0.getInt("clamqty");
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.clamamt = rset0.getInt("clamamt");
			rec.erryn = Util.checkString(rset0.getString("erryn"));
			rec.recpocomcd = Util.checkString(rset0.getString("recpocomcd"));
			rec.recpocomnm = Util.checkString(rset0.getString("recpocomnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_CLAM_OCOMRSLTCURRecord rec = (SS_L_SHFT_CLAM_OCOMRSLTCURRecord)rsltcur.get(i);


			String code = rec.basidt;
			String name = rec.shftclsfcd;

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
			SS_L_SHFT_CLAM_OCOMRSLTCURRecord rec = (SS_L_SHFT_CLAM_OCOMRSLTCURRecord)rsltcur.get(i);


			String code = rec.basidt;
			String name = rec.shftclsfcd;

			sb.append("<input name=\"");
			sb.append("basidt");
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
			SS_L_SHFT_CLAM_OCOMRSLTCURRecord rec = (SS_L_SHFT_CLAM_OCOMRSLTCURRecord)rsltcur.get(i);


			String code = rec.basidt;
			String name = rec.shftclsfcd;

			sb.append("<input name=\"");
			sb.append("basidt");
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
	SS_L_SHFT_CLAM_OCOMDataSet ds = (SS_L_SHFT_CLAM_OCOMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFT_CLAM_OCOMRSLTCURRecord rsltcurRec = (SS_L_SHFT_CLAM_OCOMRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getNormcnt()%>
<%= ds.getErrcnt()%>
<%= ds.getTotalamt()%>
<%= ds.getNormamt()%>
<%= ds.getErramt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.basidt%>
<%= rsltcurRec.shftclsfcd%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.clamqty%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.clamamt%>
<%= rsltcurRec.erryn%>
<%= rsltcurRec.recpocomcd%>
<%= rsltcurRec.recpocomnm%>
<%= rsltcurRec.rdrnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 12 10:46:00 KST 2004 */