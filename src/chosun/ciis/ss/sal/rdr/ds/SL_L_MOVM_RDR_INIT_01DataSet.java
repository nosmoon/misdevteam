/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자정보관리(이사인계팝업-초기화면)
* 작성일자 : 2009-04-02
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(이사인계팝업-초기화면)
 */

public class SL_L_MOVM_RDR_INIT_01DataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmovmresitype = new ArrayList();
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList curmovmrdrtype = new ArrayList();
	public ArrayList curproccd = new ArrayList();
	public ArrayList curmovmresiclsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_MOVM_RDR_INIT_01DataSet(){}
	public SL_L_MOVM_RDR_INIT_01DataSet(String errcode, String errmsg){
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
			SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord rec = new SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curmovmresiclsf.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord rec = new SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmovmresitype.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord rec = new SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curmovmrdrtype.add(rec);
		}
	}

	public String curmovmresiclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresiclsf.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord)curmovmresiclsf.get(i);
			
			
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

	public String curmovmresitypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresitype.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord)curmovmresitype.get(i);
			
			
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

	public String curmovmrdrtypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmrdrtype.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord)curmovmrdrtype.get(i);
			
			
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

	public String curmovmresiclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresiclsf.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord)curmovmresiclsf.get(i);
			
			
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

	public String curmovmresitypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresitype.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord)curmovmresitype.get(i);
			
			
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

	public String curmovmrdrtypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmrdrtype.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord)curmovmrdrtype.get(i);
			
			
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

	public String curmovmresiclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresiclsf.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord)curmovmresiclsf.get(i);
			
			
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

	public String curmovmresitypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmresitype.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord)curmovmresitype.get(i);
			
			
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

	public String curmovmrdrtypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmovmrdrtype.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord rec = (SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord)curmovmrdrtype.get(i);
			
			
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
	SL_L_MOVM_RDR_INIT_01DataSet ds = (SL_L_MOVM_RDR_INIT_01DataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmovmresiclsf.size(); i++){
		SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord curmovmresiclsfRec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESICLSFRecord)ds.curmovmresiclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmovmresitype.size(); i++){
		SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord curmovmresitypeRec = (SL_L_MOVM_RDR_INIT_01CURMOVMRESITYPERecord)ds.curmovmresitype.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmovmrdrtype.size(); i++){
		SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord curmovmrdrtypeRec = (SL_L_MOVM_RDR_INIT_01CURMOVMRDRTYPERecord)ds.curmovmrdrtype.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmovmresiclsf()%>
<%= ds.getCurmovmresitype()%>
<%= ds.getCurmovmrdrtype()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmovmresiclsfRec.cicodeval%>
<%= curmovmresiclsfRec.cicdnm%>
<%= curmovmresiclsfRec.ciymgbcd%>
<%= curmovmresiclsfRec.cicdgb%>
<%= curmovmresiclsfRec.cicdynm%>
<%= curmovmresitypeRec.cicodeval%>
<%= curmovmresitypeRec.cicdnm%>
<%= curmovmresitypeRec.ciymgbcd%>
<%= curmovmresitypeRec.cicdgb%>
<%= curmovmresitypeRec.cicdynm%>
<%= curmovmrdrtypeRec.cicodeval%>
<%= curmovmrdrtypeRec.cicdnm%>
<%= curmovmrdrtypeRec.ciymgbcd%>
<%= curmovmrdrtypeRec.cicdgb%>
<%= curmovmrdrtypeRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 13:24:34 KST 2009 */