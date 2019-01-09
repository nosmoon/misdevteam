/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-입고-초기화면
* 작성일자 : 2009-04-07
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-입고-초기화면
 */

public class SS_L_NWSPITEM_CDLSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curitemclsfcd = new ArrayList();
	public ArrayList curchrgpersclsfcd = new ArrayList();
	public ArrayList cursendplaccd = new ArrayList();
	public ArrayList cursendclsfcd = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList curcostclsfcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_NWSPITEM_CDLSTDataSet(){}
	public SS_L_NWSPITEM_CDLSTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_NWSPITEM_CDLSTTEAMLISTRecord rec = new SS_L_NWSPITEM_CDLSTTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_NWSPITEM_CDLSTPARTLISTRecord rec = new SS_L_NWSPITEM_CDLSTPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_NWSPITEM_CDLSTAREALISTRecord rec = new SS_L_NWSPITEM_CDLSTAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord rec = new SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.curitemclsfcd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord rec = new SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.cursendclsfcd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord rec = new SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.curcostclsfcd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord rec = new SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.curchrgpersclsfcd.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord rec = new SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			this.cursendplaccd.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTTEAMLISTRecord rec = (SS_L_NWSPITEM_CDLSTTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
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

	public String partlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTPARTLISTRecord rec = (SS_L_NWSPITEM_CDLSTPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
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

	public String arealistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTAREALISTRecord rec = (SS_L_NWSPITEM_CDLSTAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
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

	public String curitemclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curitemclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord)curitemclsfcd.get(i);
			
			
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

	public String cursendclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursendclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord)cursendclsfcd.get(i);
			
			
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

	public String curcostclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcostclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord)curcostclsfcd.get(i);
			
			
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

	public String curchrgpersclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curchrgpersclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord)curchrgpersclsfcd.get(i);
			
			
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

	public String cursendplaccdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursendplaccd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord rec = (SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord)cursendplaccd.get(i);
			
			
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

	public String teamlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTTEAMLISTRecord rec = (SS_L_NWSPITEM_CDLSTTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String partlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTPARTLISTRecord rec = (SS_L_NWSPITEM_CDLSTPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String arealistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTAREALISTRecord rec = (SS_L_NWSPITEM_CDLSTAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<input name=\"");
			sb.append("area_cd");
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

	public String curitemclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curitemclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord)curitemclsfcd.get(i);
			
			
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

	public String cursendclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursendclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord)cursendclsfcd.get(i);
			
			
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

	public String curcostclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcostclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord)curcostclsfcd.get(i);
			
			
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

	public String curchrgpersclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curchrgpersclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord)curchrgpersclsfcd.get(i);
			
			
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

	public String cursendplaccdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursendplaccd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord rec = (SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord)cursendplaccd.get(i);
			
			
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

	public String teamlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTTEAMLISTRecord rec = (SS_L_NWSPITEM_CDLSTTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String partlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTPARTLISTRecord rec = (SS_L_NWSPITEM_CDLSTPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String arealistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTAREALISTRecord rec = (SS_L_NWSPITEM_CDLSTAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<input name=\"");
			sb.append("area_cd");
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

	public String curitemclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curitemclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord)curitemclsfcd.get(i);
			
			
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

	public String cursendclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursendclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord)cursendclsfcd.get(i);
			
			
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

	public String curcostclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcostclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord)curcostclsfcd.get(i);
			
			
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

	public String curchrgpersclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curchrgpersclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord rec = (SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord)curchrgpersclsfcd.get(i);
			
			
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

	public String cursendplaccdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursendplaccd.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord rec = (SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord)cursendplaccd.get(i);
			
			
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
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_NWSPITEM_CDLSTTEAMLISTRecord teamlistRec = (SS_L_NWSPITEM_CDLSTTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_NWSPITEM_CDLSTPARTLISTRecord partlistRec = (SS_L_NWSPITEM_CDLSTPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_NWSPITEM_CDLSTAREALISTRecord arealistRec = (SS_L_NWSPITEM_CDLSTAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curitemclsfcd.size(); i++){
		SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord curitemclsfcdRec = (SS_L_NWSPITEM_CDLSTCURITEMCLSFCDRecord)ds.curitemclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursendclsfcd.size(); i++){
		SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord cursendclsfcdRec = (SS_L_NWSPITEM_CDLSTCURSENDCLSFCDRecord)ds.cursendclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcostclsfcd.size(); i++){
		SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord curcostclsfcdRec = (SS_L_NWSPITEM_CDLSTCURCOSTCLSFCDRecord)ds.curcostclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curchrgpersclsfcd.size(); i++){
		SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord curchrgpersclsfcdRec = (SS_L_NWSPITEM_CDLSTCURCHRGPERSCLSFCDRecord)ds.curchrgpersclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursendplaccd.size(); i++){
		SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord cursendplaccdRec = (SS_L_NWSPITEM_CDLSTCURSENDPLACCDRecord)ds.cursendplaccd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getCuritemclsfcd()%>
<%= ds.getCursendclsfcd()%>
<%= ds.getCurcostclsfcd()%>
<%= ds.getCurchrgpersclsfcd()%>
<%= ds.getCursendplaccd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= curitemclsfcdRec.cicodeval%>
<%= curitemclsfcdRec.cicdnm%>
<%= curitemclsfcdRec.ciymgbcd%>
<%= curitemclsfcdRec.cicdgb%>
<%= curitemclsfcdRec.cicdynm%>
<%= cursendclsfcdRec.cicodeval%>
<%= cursendclsfcdRec.cicdnm%>
<%= cursendclsfcdRec.ciymgbcd%>
<%= cursendclsfcdRec.cicdgb%>
<%= cursendclsfcdRec.cicdynm%>
<%= curcostclsfcdRec.cicodeval%>
<%= curcostclsfcdRec.cicdnm%>
<%= curcostclsfcdRec.ciymgbcd%>
<%= curcostclsfcdRec.cicdgb%>
<%= curcostclsfcdRec.cicdynm%>
<%= curchrgpersclsfcdRec.cicodeval%>
<%= curchrgpersclsfcdRec.cicdnm%>
<%= curchrgpersclsfcdRec.ciymgbcd%>
<%= curchrgpersclsfcdRec.cicdgb%>
<%= curchrgpersclsfcdRec.cicdynm%>
<%= cursendplaccdRec.cicodeval%>
<%= cursendplaccdRec.cicdnm%>
<%= cursendplaccdRec.ciymgbcd%>
<%= cursendplaccdRec.cicdgb%>
<%= cursendplaccdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 17:22:12 KST 2009 */