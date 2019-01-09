/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-독자등급관리-초기화면
* 작성일자 : 2009-04-10
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급관리-초기화면
 */

public class SS_L_RDRCRTS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList currmblenonrsmg = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curerrresncd = new ArrayList();
	public ArrayList curdtlsprocstatcd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList currecstat = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList currmblestat = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDRCRTS_INITDataSet(){}
	public SS_L_RDRCRTS_INITDataSet(String errcode, String errmsg){
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
			SS_L_RDRCRTS_INITTEAMLISTRecord rec = new SS_L_RDRCRTS_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_RDRCRTS_INITPARTLISTRecord rec = new SS_L_RDRCRTS_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_RDRCRTS_INITAREALISTRecord rec = new SS_L_RDRCRTS_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_RDRCRTS_INITCURMEDICDRecord rec = new SS_L_RDRCRTS_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord rec = new SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curdtlsprocstatcd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_RDRCRTS_INITCURERRRESNCDRecord rec = new SS_L_RDRCRTS_INITCURERRRESNCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.curerrresncd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			SS_L_RDRCRTS_INITCURRECSTATRecord rec = new SS_L_RDRCRTS_INITCURRECSTATRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.currecstat.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			SS_L_RDRCRTS_INITCURRMBLESTATRecord rec = new SS_L_RDRCRTS_INITCURRMBLESTATRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			this.currmblestat.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord rec = new SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord();
			rec.cicodeval = Util.checkString(rset8.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset8.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset8.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset8.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset8.getString("cicdynm"));
			this.currmblenonrsmg.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITTEAMLISTRecord rec = (SS_L_RDRCRTS_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_RDRCRTS_INITPARTLISTRecord rec = (SS_L_RDRCRTS_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_RDRCRTS_INITAREALISTRecord rec = (SS_L_RDRCRTS_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURMEDICDRecord rec = (SS_L_RDRCRTS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curdtlsprocstatcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdtlsprocstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord rec = (SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord)curdtlsprocstatcd.get(i);
			
			
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

	public String curerrresncdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curerrresncd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURERRRESNCDRecord rec = (SS_L_RDRCRTS_INITCURERRRESNCDRecord)curerrresncd.get(i);
			
			
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

	public String currecstatOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currecstat.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRECSTATRecord rec = (SS_L_RDRCRTS_INITCURRECSTATRecord)currecstat.get(i);
			
			
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

	public String currmblestatOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currmblestat.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRMBLESTATRecord rec = (SS_L_RDRCRTS_INITCURRMBLESTATRecord)currmblestat.get(i);
			
			
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

	public String currmblenonrsmgOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currmblenonrsmg.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord rec = (SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord)currmblenonrsmg.get(i);
			
			
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
			SS_L_RDRCRTS_INITTEAMLISTRecord rec = (SS_L_RDRCRTS_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_RDRCRTS_INITPARTLISTRecord rec = (SS_L_RDRCRTS_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_RDRCRTS_INITAREALISTRecord rec = (SS_L_RDRCRTS_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURMEDICDRecord rec = (SS_L_RDRCRTS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curdtlsprocstatcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdtlsprocstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord rec = (SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord)curdtlsprocstatcd.get(i);
			
			
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

	public String curerrresncdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curerrresncd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURERRRESNCDRecord rec = (SS_L_RDRCRTS_INITCURERRRESNCDRecord)curerrresncd.get(i);
			
			
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

	public String currecstatChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currecstat.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRECSTATRecord rec = (SS_L_RDRCRTS_INITCURRECSTATRecord)currecstat.get(i);
			
			
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

	public String currmblestatChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currmblestat.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRMBLESTATRecord rec = (SS_L_RDRCRTS_INITCURRMBLESTATRecord)currmblestat.get(i);
			
			
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

	public String currmblenonrsmgChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currmblenonrsmg.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord rec = (SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord)currmblenonrsmg.get(i);
			
			
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
			SS_L_RDRCRTS_INITTEAMLISTRecord rec = (SS_L_RDRCRTS_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_RDRCRTS_INITPARTLISTRecord rec = (SS_L_RDRCRTS_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_RDRCRTS_INITAREALISTRecord rec = (SS_L_RDRCRTS_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURMEDICDRecord rec = (SS_L_RDRCRTS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curdtlsprocstatcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdtlsprocstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord rec = (SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord)curdtlsprocstatcd.get(i);
			
			
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

	public String curerrresncdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curerrresncd.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURERRRESNCDRecord rec = (SS_L_RDRCRTS_INITCURERRRESNCDRecord)curerrresncd.get(i);
			
			
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

	public String currecstatRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currecstat.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRECSTATRecord rec = (SS_L_RDRCRTS_INITCURRECSTATRecord)currecstat.get(i);
			
			
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

	public String currmblestatRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currmblestat.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRMBLESTATRecord rec = (SS_L_RDRCRTS_INITCURRMBLESTATRecord)currmblestat.get(i);
			
			
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

	public String currmblenonrsmgRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = currmblenonrsmg.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord rec = (SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord)currmblenonrsmg.get(i);
			
			
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
	SS_L_RDRCRTS_INITDataSet ds = (SS_L_RDRCRTS_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_RDRCRTS_INITTEAMLISTRecord teamlistRec = (SS_L_RDRCRTS_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_RDRCRTS_INITPARTLISTRecord partlistRec = (SS_L_RDRCRTS_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_RDRCRTS_INITAREALISTRecord arealistRec = (SS_L_RDRCRTS_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_RDRCRTS_INITCURMEDICDRecord curmedicdRec = (SS_L_RDRCRTS_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdtlsprocstatcd.size(); i++){
		SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord curdtlsprocstatcdRec = (SS_L_RDRCRTS_INITCURDTLSPROCSTATCDRecord)ds.curdtlsprocstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curerrresncd.size(); i++){
		SS_L_RDRCRTS_INITCURERRRESNCDRecord curerrresncdRec = (SS_L_RDRCRTS_INITCURERRRESNCDRecord)ds.curerrresncd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.currecstat.size(); i++){
		SS_L_RDRCRTS_INITCURRECSTATRecord currecstatRec = (SS_L_RDRCRTS_INITCURRECSTATRecord)ds.currecstat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.currmblestat.size(); i++){
		SS_L_RDRCRTS_INITCURRMBLESTATRecord currmblestatRec = (SS_L_RDRCRTS_INITCURRMBLESTATRecord)ds.currmblestat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.currmblenonrsmg.size(); i++){
		SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord currmblenonrsmgRec = (SS_L_RDRCRTS_INITCURRMBLENONRSMGRecord)ds.currmblenonrsmg.get(i);%>
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
<%= ds.getCurmedicd()%>
<%= ds.getCurdtlsprocstatcd()%>
<%= ds.getCurerrresncd()%>
<%= ds.getCurrecstat()%>
<%= ds.getCurrmblestat()%>
<%= ds.getCurrmblenonrsmg()%>
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
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
<%= curdtlsprocstatcdRec.cicodeval%>
<%= curdtlsprocstatcdRec.cicdnm%>
<%= curdtlsprocstatcdRec.ciymgbcd%>
<%= curdtlsprocstatcdRec.cicdgb%>
<%= curdtlsprocstatcdRec.cicdynm%>
<%= curerrresncdRec.cicodeval%>
<%= curerrresncdRec.cicdnm%>
<%= curerrresncdRec.ciymgbcd%>
<%= curerrresncdRec.cicdgb%>
<%= curerrresncdRec.cicdynm%>
<%= currecstatRec.cicodeval%>
<%= currecstatRec.cicdnm%>
<%= currecstatRec.ciymgbcd%>
<%= currecstatRec.cicdgb%>
<%= currecstatRec.cicdynm%>
<%= currmblestatRec.cicodeval%>
<%= currmblestatRec.cicdnm%>
<%= currmblestatRec.ciymgbcd%>
<%= currmblestatRec.cicdgb%>
<%= currmblestatRec.cicdynm%>
<%= currmblenonrsmgRec.cicodeval%>
<%= currmblenonrsmgRec.cicdnm%>
<%= currmblenonrsmgRec.ciymgbcd%>
<%= currmblenonrsmgRec.cicdgb%>
<%= currmblenonrsmgRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 13:13:10 KST 2009 */