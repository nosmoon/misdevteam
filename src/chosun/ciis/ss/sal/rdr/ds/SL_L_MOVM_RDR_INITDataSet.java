/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDR_INITDataSet.java
* 기능 : 독자-이사독자관리-초기화면을 위한 DataSet
* 작성일자 : 2004-01-14
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
 * 독자-이사독자관리-초기화면을 위한 DataSet
 */

public class SL_L_MOVM_RDR_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList curproccd = new ArrayList();
	public ArrayList curmovmresiclsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_MOVM_RDR_INITDataSet(){}
	public SL_L_MOVM_RDR_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SL_L_MOVM_RDR_INITCURPROCCDRecord rec = new SL_L_MOVM_RDR_INITCURPROCCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curproccd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord rec = new SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curaplcpathcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord rec = new SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curmovmresiclsf.add(rec);
		}
	}

	public String curproccdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curproccd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURPROCCDRecord rec = (SL_L_MOVM_RDR_INITCURPROCCDRecord)curproccd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curaplcpathcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaplcpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord rec = (SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curmovmresiclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresiclsf.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord rec = (SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord)curmovmresiclsf.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curproccdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curproccd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURPROCCDRecord rec = (SL_L_MOVM_RDR_INITCURPROCCDRecord)curproccd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curaplcpathcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaplcpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord rec = (SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curmovmresiclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresiclsf.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord rec = (SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord)curmovmresiclsf.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curproccdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curproccd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURPROCCDRecord rec = (SL_L_MOVM_RDR_INITCURPROCCDRecord)curproccd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curaplcpathcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaplcpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord rec = (SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curmovmresiclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresiclsf.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord rec = (SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord)curmovmresiclsf.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SL_L_MOVM_RDR_INITDataSet ds = (SL_L_MOVM_RDR_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curproccd.size(); i++){
		SL_L_MOVM_RDR_INITCURPROCCDRecord curproccdRec = (SL_L_MOVM_RDR_INITCURPROCCDRecord)ds.curproccd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaplcpathcd.size(); i++){
		SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord curaplcpathcdRec = (SL_L_MOVM_RDR_INITCURAPLCPATHCDRecord)ds.curaplcpathcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmovmresiclsf.size(); i++){
		SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord curmovmresiclsfRec = (SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord)ds.curmovmresiclsf.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurproccd()%>
<%= ds.getCuraplcpathcd()%>
<%= ds.getCurmovmresiclsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curproccdRec.cicodeval%>
<%= curproccdRec.cicdnm%>
<%= curproccdRec.ciymgbcd%>
<%= curproccdRec.cicdgb%>
<%= curproccdRec.cicdynm%>
<%= curaplcpathcdRec.cicodeval%>
<%= curaplcpathcdRec.cicdnm%>
<%= curaplcpathcdRec.ciymgbcd%>
<%= curaplcpathcdRec.cicdgb%>
<%= curaplcpathcdRec.cicdynm%>
<%= curmovmresiclsfRec.cicodeval%>
<%= curmovmresiclsfRec.cicdnm%>
<%= curmovmresiclsfRec.ciymgbcd%>
<%= curmovmresiclsfRec.cicdgb%>
<%= curmovmresiclsfRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 15 14:55:38 KST 2004 */