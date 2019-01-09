/***************************************************************************************************
 * 파일명   : SP_SS_L_RDR_JM_EXTN_INIT
 * 기능     : 확장현황-제휴확장 신청현황
 * 작성일자 : 2007/11/17
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  SP_SS_L_RDR_JM_EXTN_INIT
**/

public class SS_L_RDR_JM_EXTN_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList curcampcompcd = new ArrayList();
	public ArrayList curcampcd = new ArrayList();
	public ArrayList curextntypecd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList cursubscnfmstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_JM_EXTN_INITDataSet(){}
	public SS_L_RDR_JM_EXTN_INITDataSet(String errcode, String errmsg){
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
			SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord rec = new SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord rec = new SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curextntypecd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_RDR_JM_EXTN_INITCURMEDICDRecord rec = new SS_L_RDR_JM_EXTN_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord rec = new SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.cursubscnfmstatcd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord rec = new SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curaplcpathcd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(8);
		while(rset5.next()){
			SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord rec = new SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.curcampcd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(9);
		while(rset6.next()){
			SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord rec = new SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.curcampcompcd.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String curextntypecdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextntypecd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord rec = (SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord)curextntypecd.get(i);
			
			
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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURMEDICDRecord rec = (SS_L_RDR_JM_EXTN_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String cursubscnfmstatcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubscnfmstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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

	public String curcampcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord)curcampcd.get(i);
			
			
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

	public String curcampcompcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampcompcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord)curcampcompcd.get(i);
			
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curextntypecdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextntypecd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord rec = (SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord)curextntypecd.get(i);
			
			
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURMEDICDRecord rec = (SS_L_RDR_JM_EXTN_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String cursubscnfmstatcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubscnfmstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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

	public String curcampcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord)curcampcd.get(i);
			
			
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

	public String curcampcompcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampcompcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord)curcampcompcd.get(i);
			
			
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curextntypecdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextntypecd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord rec = (SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord)curextntypecd.get(i);
			
			
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURMEDICDRecord rec = (SS_L_RDR_JM_EXTN_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String cursubscnfmstatcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubscnfmstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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

	public String curcampcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord)curcampcd.get(i);
			
			
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

	public String curcampcompcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampcompcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord rec = (SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord)curcampcompcd.get(i);
			
			
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
	SS_L_RDR_JM_EXTN_INITDataSet ds = (SS_L_RDR_JM_EXTN_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord curdeptcdRec = (SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curextntypecd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord curextntypecdRec = (SS_L_RDR_JM_EXTN_INITCUREXTNTYPECDRecord)ds.curextntypecd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCURMEDICDRecord curmedicdRec = (SS_L_RDR_JM_EXTN_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursubscnfmstatcd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord cursubscnfmstatcdRec = (SS_L_RDR_JM_EXTN_INITCURSUBSCNFMSTATCDRecord)ds.cursubscnfmstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaplcpathcd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord curaplcpathcdRec = (SS_L_RDR_JM_EXTN_INITCURAPLCPATHCDRecord)ds.curaplcpathcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcampcd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord curcampcdRec = (SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord)ds.curcampcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcampcompcd.size(); i++){
		SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord curcampcompcdRec = (SS_L_RDR_JM_EXTN_INITCURCAMPCOMPCDRecord)ds.curcampcompcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurextntypecd()%>
<%= ds.getCurmedicd()%>
<%= ds.getCursubscnfmstatcd()%>
<%= ds.getCuraplcpathcd()%>
<%= ds.getCurcampcd()%>
<%= ds.getCurcampcompcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= curextntypecdRec.cicodeval%>
<%= curextntypecdRec.cicdnm%>
<%= curextntypecdRec.ciymgbcd%>
<%= curextntypecdRec.cicdgb%>
<%= curextntypecdRec.cicdynm%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
<%= cursubscnfmstatcdRec.cicodeval%>
<%= cursubscnfmstatcdRec.cicdnm%>
<%= cursubscnfmstatcdRec.ciymgbcd%>
<%= cursubscnfmstatcdRec.cicdgb%>
<%= cursubscnfmstatcdRec.cicdynm%>
<%= curaplcpathcdRec.cicodeval%>
<%= curaplcpathcdRec.cicdnm%>
<%= curaplcpathcdRec.ciymgbcd%>
<%= curaplcpathcdRec.cicdgb%>
<%= curaplcpathcdRec.cicdynm%>
<%= curcampcdRec.cicodeval%>
<%= curcampcdRec.cicdnm%>
<%= curcampcdRec.ciymgbcd%>
<%= curcampcdRec.cicdgb%>
<%= curcampcdRec.cicdynm%>
<%= curcampcompcdRec.cicodeval%>
<%= curcampcompcdRec.cicdnm%>
<%= curcampcompcdRec.ciymgbcd%>
<%= curcampcompcdRec.cicdgb%>
<%= curcampcompcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 16 14:26:43 KST 2007 */