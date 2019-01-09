/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_BO_RSLTDDataSet.java
* 기능 : 확장용역비용 조선IS 확장실적(지국별)  상세 목록을 위한 DataSet
* 작성일자 : 2003-12-23
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_BO_RSLTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList errlist = new ArrayList();
	public ArrayList nocnfmlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long nocnfmtotalcnt;
	public long errtotalcnt;

	public SS_L_RDR_EXTN_BO_RSLTDDataSet(){}
	public SS_L_RDR_EXTN_BO_RSLTDDataSet(String errcode, String errmsg, long nocnfmtotalcnt, long errtotalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.nocnfmtotalcnt = nocnfmtotalcnt;
		this.errtotalcnt = errtotalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNocnfmtotalcnt(long nocnfmtotalcnt){
		this.nocnfmtotalcnt = nocnfmtotalcnt;
	}

	public void setErrtotalcnt(long errtotalcnt){
		this.errtotalcnt = errtotalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getNocnfmtotalcnt(){
		return this.nocnfmtotalcnt;
	}

	public long getErrtotalcnt(){
		return this.errtotalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord rec = new SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord();
			rec.aplcpersnm = Util.checkString(rset2.getString("aplcpersnm"));
			rec.rdr_extndt = Util.checkString(rset2.getString("rdr_extndt"));
			rec.extnflnm = Util.checkString(rset2.getString("extnflnm"));
			this.nocnfmlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord rec = new SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord();
			rec.aplcpersnm = Util.checkString(rset3.getString("aplcpersnm"));
			rec.rdr_extndt = Util.checkString(rset3.getString("rdr_extndt"));
			rec.extnflnm = Util.checkString(rset3.getString("extnflnm"));
			rec.subscnfmstatnm = Util.checkString(rset3.getString("subscnfmstatnm"));
			this.errlist.add(rec);
		}
		this.nocnfmtotalcnt = cstmt.getLong(8);
		this.errtotalcnt = cstmt.getLong(9);
	}

	public String nocnfmlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nocnfmlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord)nocnfmlist.get(i);
			
			
			String code = rec.aplcpersnm;
			String name = rec.rdr_extndt;
			
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

	public String errlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord)errlist.get(i);
			
			
			String code = rec.aplcpersnm;
			String name = rec.rdr_extndt;
			
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

	public String nocnfmlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nocnfmlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord)nocnfmlist.get(i);
			
			
			String code = rec.aplcpersnm;
			String name = rec.rdr_extndt;
			
			sb.append("<input name=\"");
			sb.append("aplcpersnm");
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

	public String errlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord)errlist.get(i);
			
			
			String code = rec.aplcpersnm;
			String name = rec.rdr_extndt;
			
			sb.append("<input name=\"");
			sb.append("aplcpersnm");
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

	public String nocnfmlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nocnfmlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord)nocnfmlist.get(i);
			
			
			String code = rec.aplcpersnm;
			String name = rec.rdr_extndt;
			
			sb.append("<input name=\"");
			sb.append("aplcpersnm");
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

	public String errlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord)errlist.get(i);
			
			
			String code = rec.aplcpersnm;
			String name = rec.rdr_extndt;
			
			sb.append("<input name=\"");
			sb.append("aplcpersnm");
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
	SS_L_RDR_EXTN_BO_RSLTDDataSet ds = (SS_L_RDR_EXTN_BO_RSLTDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.nocnfmlist.size(); i++){
		SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord nocnfmlistRec = (SS_L_RDR_EXTN_BO_RSLTDNOCNFMLISTRecord)ds.nocnfmlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.errlist.size(); i++){
		SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord errlistRec = (SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord)ds.errlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNocnfmlist()%>
<%= ds.getErrlist()%>
<%= ds.getNocnfmtotalcnt()%>
<%= ds.getErrtotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= nocnfmlistRec.aplcpersnm%>
<%= nocnfmlistRec.rdr_extndt%>
<%= nocnfmlistRec.extnflnm%>
<%= errlistRec.aplcpersnm%>
<%= errlistRec.rdr_extndt%>
<%= errlistRec.extnflnm%>
<%= errlistRec.subscnfmstatnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 23 15:02:05 KST 2003 */