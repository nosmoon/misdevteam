/***************************************************************************************************
* 파일명 : SL_L_RDR_EXTN_CNFMDataSet.java
* 기능 : 외부확장확인관리(목록조회)
* 작성일자 : 2004-06-03
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
 * 외부확장확인관리(목록조회)
 *
 */

public class SL_L_RDR_EXTN_CNFMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList extncur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long uncnfmcnt;
	public long cnfmcnt;
	public long errcnt;

	public SL_L_RDR_EXTN_CNFMDataSet(){}
	public SL_L_RDR_EXTN_CNFMDataSet(String errcode, String errmsg, long totalcnt, long uncnfmcnt, long cnfmcnt, long errcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.uncnfmcnt = uncnfmcnt;
		this.cnfmcnt = cnfmcnt;
		this.errcnt = errcnt;
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

	public void setUncnfmcnt(long uncnfmcnt){
		this.uncnfmcnt = uncnfmcnt;
	}

	public void setCnfmcnt(long cnfmcnt){
		this.cnfmcnt = cnfmcnt;
	}

	public void setErrcnt(long errcnt){
		this.errcnt = errcnt;
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

	public long getUncnfmcnt(){
		return this.uncnfmcnt;
	}

	public long getCnfmcnt(){
		return this.cnfmcnt;
	}

	public long getErrcnt(){
		return this.errcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(15);
		this.uncnfmcnt = cstmt.getLong(16);
		this.cnfmcnt = cstmt.getLong(17);
		this.errcnt = cstmt.getLong(18);
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			SL_L_RDR_EXTN_CNFMEXTNCURRecord rec = new SL_L_RDR_EXTN_CNFMEXTNCURRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.mediynm = Util.checkString(rset0.getString("mediynm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.qty = rset0.getInt("qty");
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.extnblngcd = Util.checkString(rset0.getString("extnblngcd"));
			rec.extnflnm = Util.checkString(rset0.getString("extnflnm"));
			rec.extntel1 = Util.checkString(rset0.getString("extntel1"));
			rec.extntel2 = Util.checkString(rset0.getString("extntel2"));
			rec.extntel3 = Util.checkString(rset0.getString("extntel3"));
			rec.extnptph_no1 = Util.checkString(rset0.getString("extnptph_no1"));
			rec.extnptph_no2 = Util.checkString(rset0.getString("extnptph_no2"));
			rec.extnptph_no3 = Util.checkString(rset0.getString("extnptph_no3"));
			rec.extnprn = Util.checkString(rset0.getString("extnprn"));
			rec.rshpclsfcd = Util.checkString(rset0.getString("rshpclsfcd"));
			rec.aplcpersnm = Util.checkString(rset0.getString("aplcpersnm"));
			rec.aplcpersemail = Util.checkString(rset0.getString("aplcpersemail"));
			rec.aplcperstel_no1 = Util.checkString(rset0.getString("aplcperstel_no1"));
			rec.aplcperstel_no2 = Util.checkString(rset0.getString("aplcperstel_no2"));
			rec.aplcperstel_no3 = Util.checkString(rset0.getString("aplcperstel_no3"));
			rec.aplcpersptph_no1 = Util.checkString(rset0.getString("aplcpersptph_no1"));
			rec.aplcpersptph_no2 = Util.checkString(rset0.getString("aplcpersptph_no2"));
			rec.aplcpersptph_no3 = Util.checkString(rset0.getString("aplcpersptph_no3"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdremail = Util.checkString(rset0.getString("rdremail"));
			rec.rdroffinm = Util.checkString(rset0.getString("rdroffinm"));
			rec.rdroffitel_no1 = Util.checkString(rset0.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset0.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset0.getString("rdroffitel_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvhopedt = Util.checkString(rset0.getString("dlvhopedt"));
			rec.rdr_extnbocd = Util.checkString(rset0.getString("rdr_extnbocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.botel_no11 = Util.checkString(rset0.getString("botel_no11"));
			rec.botel_no12 = Util.checkString(rset0.getString("botel_no12"));
			rec.botel_no13 = Util.checkString(rset0.getString("botel_no13"));
			rec.botel_no21 = Util.checkString(rset0.getString("botel_no21"));
			rec.botel_no22 = Util.checkString(rset0.getString("botel_no22"));
			rec.botel_no23 = Util.checkString(rset0.getString("botel_no23"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.subscnfmstatcd = Util.checkString(rset0.getString("subscnfmstatcd"));
			rec.subscnfmstatcdnm = Util.checkString(rset0.getString("subscnfmstatcdnm"));
			this.extncur.add(rec);
		}
	}

	public String extncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extncur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_CNFMEXTNCURRecord rec = (SL_L_RDR_EXTN_CNFMEXTNCURRecord)extncur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
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

	public String extncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extncur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_CNFMEXTNCURRecord rec = (SL_L_RDR_EXTN_CNFMEXTNCURRecord)extncur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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

	public String extncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extncur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_CNFMEXTNCURRecord rec = (SL_L_RDR_EXTN_CNFMEXTNCURRecord)extncur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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
	SL_L_RDR_EXTN_CNFMDataSet ds = (SL_L_RDR_EXTN_CNFMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.extncur.size(); i++){
		SL_L_RDR_EXTN_CNFMEXTNCURRecord extncurRec = (SL_L_RDR_EXTN_CNFMEXTNCURRecord)ds.extncur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getUncnfmcnt()%>
<%= ds.getCnfmcnt()%>
<%= ds.getErrcnt()%>
<%= ds.getExtncur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= extncurRec.rdr_extndt%>
<%= extncurRec.rdr_extnno%>
<%= extncurRec.medicd%>
<%= extncurRec.medinm%>
<%= extncurRec.mediynm%>
<%= extncurRec.aplcdt%>
<%= extncurRec.qty%>
<%= extncurRec.aplcpathcd%>
<%= extncurRec.aplcpathnm%>
<%= extncurRec.rdr_extntypecd%>
<%= extncurRec.rdr_extntypenm%>
<%= extncurRec.extnblngcd%>
<%= extncurRec.extnflnm%>
<%= extncurRec.extntel1%>
<%= extncurRec.extntel2%>
<%= extncurRec.extntel3%>
<%= extncurRec.extnptph_no1%>
<%= extncurRec.extnptph_no2%>
<%= extncurRec.extnptph_no3%>
<%= extncurRec.extnprn%>
<%= extncurRec.rshpclsfcd%>
<%= extncurRec.aplcpersnm%>
<%= extncurRec.aplcpersemail%>
<%= extncurRec.aplcperstel_no1%>
<%= extncurRec.aplcperstel_no2%>
<%= extncurRec.aplcperstel_no3%>
<%= extncurRec.aplcpersptph_no1%>
<%= extncurRec.aplcpersptph_no2%>
<%= extncurRec.aplcpersptph_no3%>
<%= extncurRec.rdrnm%>
<%= extncurRec.rdrtel_no1%>
<%= extncurRec.rdrtel_no2%>
<%= extncurRec.rdrtel_no3%>
<%= extncurRec.rdrptph_no1%>
<%= extncurRec.rdrptph_no2%>
<%= extncurRec.rdrptph_no3%>
<%= extncurRec.rdremail%>
<%= extncurRec.rdroffinm%>
<%= extncurRec.rdroffitel_no1%>
<%= extncurRec.rdroffitel_no2%>
<%= extncurRec.rdroffitel_no3%>
<%= extncurRec.dlvzip%>
<%= extncurRec.dlvaddr%>
<%= extncurRec.dlvdtlsaddr%>
<%= extncurRec.dlvhopedt%>
<%= extncurRec.rdr_extnbocd%>
<%= extncurRec.bonm%>
<%= extncurRec.botel_no11%>
<%= extncurRec.botel_no12%>
<%= extncurRec.botel_no13%>
<%= extncurRec.botel_no21%>
<%= extncurRec.botel_no22%>
<%= extncurRec.botel_no23%>
<%= extncurRec.resiclsfcd%>
<%= extncurRec.resitypecd%>
<%= extncurRec.subscnfmstatcd%>
<%= extncurRec.subscnfmstatcdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 10:41:35 KST 2004 */