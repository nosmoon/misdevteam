/***************************************************************************************************
* 파일명 : .java
* 기능 : 본사확장 초기화 
* 작성일자 : 2009-07-23
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 본사확장 초기화 
 */

public class SS_L_EXTN_HDQT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curmprcd = new ArrayList();
	public ArrayList curonlinecd = new ArrayList();
	public ArrayList curjehucd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList cureducd = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList cursubscnfmstatcd = new ArrayList();
	public ArrayList curextntypecd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_HDQT_INITDataSet(){}
	public SS_L_EXTN_HDQT_INITDataSet(String errcode, String errmsg){
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
			SS_L_EXTN_HDQT_INITTEAMLISTRecord rec = new SS_L_EXTN_HDQT_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_EXTN_HDQT_INITPARTLISTRecord rec = new SS_L_EXTN_HDQT_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_EXTN_HDQT_INITAREALISTRecord rec = new SS_L_EXTN_HDQT_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord rec = new SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.curextntypecd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_EXTN_HDQT_INITCURMEDICDRecord rec = new SS_L_EXTN_HDQT_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord rec = new SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.cursubscnfmstatcd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord rec = new SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.curaplcpathcd.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			SS_L_EXTN_HDQT_INITCUREDUCDRecord rec = new SS_L_EXTN_HDQT_INITCUREDUCDRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			this.cureducd.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			SS_L_EXTN_HDQT_INITCURJEHUCDRecord rec = new SS_L_EXTN_HDQT_INITCURJEHUCDRecord();
			rec.cicodeval = Util.checkString(rset8.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset8.getString("cicdnm"));
			this.curjehucd.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(16);
		while(rset9.next()){
			SS_L_EXTN_HDQT_INITCURMPRCDRecord rec = new SS_L_EXTN_HDQT_INITCURMPRCDRecord();
			rec.cicodeval = Util.checkString(rset9.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset9.getString("cicdnm"));
			this.curmprcd.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(17);
		while(rset10.next()){
			SS_L_EXTN_HDQT_INITCURONLINECDRecord rec = new SS_L_EXTN_HDQT_INITCURONLINECDRecord();
			rec.cicodeval = Util.checkString(rset10.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset10.getString("cicdnm"));
			this.curonlinecd.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITTEAMLISTRecord rec = (SS_L_EXTN_HDQT_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITPARTLISTRecord rec = (SS_L_EXTN_HDQT_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITAREALISTRecord rec = (SS_L_EXTN_HDQT_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curextntypecdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextntypecd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord rec = (SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord)curextntypecd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURMEDICDRecord rec = (SS_L_EXTN_HDQT_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord rec = (SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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

	public String cureducdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cureducd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCUREDUCDRecord rec = (SS_L_EXTN_HDQT_INITCUREDUCDRecord)cureducd.get(i);
			
			
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

	public String curjehucdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curjehucd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURJEHUCDRecord rec = (SS_L_EXTN_HDQT_INITCURJEHUCDRecord)curjehucd.get(i);
			
			
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

	public String curmprcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmprcd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURMPRCDRecord rec = (SS_L_EXTN_HDQT_INITCURMPRCDRecord)curmprcd.get(i);
			
			
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

	public String curonlinecdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curonlinecd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURONLINECDRecord rec = (SS_L_EXTN_HDQT_INITCURONLINECDRecord)curonlinecd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITTEAMLISTRecord rec = (SS_L_EXTN_HDQT_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITPARTLISTRecord rec = (SS_L_EXTN_HDQT_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITAREALISTRecord rec = (SS_L_EXTN_HDQT_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curextntypecdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextntypecd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord rec = (SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord)curextntypecd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURMEDICDRecord rec = (SS_L_EXTN_HDQT_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord rec = (SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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

	public String cureducdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cureducd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCUREDUCDRecord rec = (SS_L_EXTN_HDQT_INITCUREDUCDRecord)cureducd.get(i);
			
			
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

	public String curjehucdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curjehucd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURJEHUCDRecord rec = (SS_L_EXTN_HDQT_INITCURJEHUCDRecord)curjehucd.get(i);
			
			
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

	public String curmprcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmprcd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURMPRCDRecord rec = (SS_L_EXTN_HDQT_INITCURMPRCDRecord)curmprcd.get(i);
			
			
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

	public String curonlinecdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curonlinecd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURONLINECDRecord rec = (SS_L_EXTN_HDQT_INITCURONLINECDRecord)curonlinecd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITTEAMLISTRecord rec = (SS_L_EXTN_HDQT_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITPARTLISTRecord rec = (SS_L_EXTN_HDQT_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITAREALISTRecord rec = (SS_L_EXTN_HDQT_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curextntypecdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curextntypecd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord rec = (SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord)curextntypecd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURMEDICDRecord rec = (SS_L_EXTN_HDQT_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord rec = (SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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

	public String cureducdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cureducd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCUREDUCDRecord rec = (SS_L_EXTN_HDQT_INITCUREDUCDRecord)cureducd.get(i);
			
			
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

	public String curjehucdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curjehucd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURJEHUCDRecord rec = (SS_L_EXTN_HDQT_INITCURJEHUCDRecord)curjehucd.get(i);
			
			
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

	public String curmprcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmprcd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURMPRCDRecord rec = (SS_L_EXTN_HDQT_INITCURMPRCDRecord)curmprcd.get(i);
			
			
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

	public String curonlinecdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curonlinecd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_INITCURONLINECDRecord rec = (SS_L_EXTN_HDQT_INITCURONLINECDRecord)curonlinecd.get(i);
			
			
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
	SS_L_EXTN_HDQT_INITDataSet ds = (SS_L_EXTN_HDQT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_EXTN_HDQT_INITTEAMLISTRecord teamlistRec = (SS_L_EXTN_HDQT_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_EXTN_HDQT_INITPARTLISTRecord partlistRec = (SS_L_EXTN_HDQT_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_EXTN_HDQT_INITAREALISTRecord arealistRec = (SS_L_EXTN_HDQT_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curextntypecd.size(); i++){
		SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord curextntypecdRec = (SS_L_EXTN_HDQT_INITCUREXTNTYPECDRecord)ds.curextntypecd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_EXTN_HDQT_INITCURMEDICDRecord curmedicdRec = (SS_L_EXTN_HDQT_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursubscnfmstatcd.size(); i++){
		SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord cursubscnfmstatcdRec = (SS_L_EXTN_HDQT_INITCURSUBSCNFMSTATCDRecord)ds.cursubscnfmstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaplcpathcd.size(); i++){
		SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord curaplcpathcdRec = (SS_L_EXTN_HDQT_INITCURAPLCPATHCDRecord)ds.curaplcpathcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cureducd.size(); i++){
		SS_L_EXTN_HDQT_INITCUREDUCDRecord cureducdRec = (SS_L_EXTN_HDQT_INITCUREDUCDRecord)ds.cureducd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curjehucd.size(); i++){
		SS_L_EXTN_HDQT_INITCURJEHUCDRecord curjehucdRec = (SS_L_EXTN_HDQT_INITCURJEHUCDRecord)ds.curjehucd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmprcd.size(); i++){
		SS_L_EXTN_HDQT_INITCURMPRCDRecord curmprcdRec = (SS_L_EXTN_HDQT_INITCURMPRCDRecord)ds.curmprcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curonlinecd.size(); i++){
		SS_L_EXTN_HDQT_INITCURONLINECDRecord curonlinecdRec = (SS_L_EXTN_HDQT_INITCURONLINECDRecord)ds.curonlinecd.get(i);%>
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
<%= ds.getCurextntypecd()%>
<%= ds.getCurmedicd()%>
<%= ds.getCursubscnfmstatcd()%>
<%= ds.getCuraplcpathcd()%>
<%= ds.getCureducd()%>
<%= ds.getCurjehucd()%>
<%= ds.getCurmprcd()%>
<%= ds.getCuronlinecd()%>
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
<%= cureducdRec.cicodeval%>
<%= cureducdRec.cicdnm%>
<%= curjehucdRec.cicodeval%>
<%= curjehucdRec.cicdnm%>
<%= curmprcdRec.cicodeval%>
<%= curmprcdRec.cicdnm%>
<%= curonlinecdRec.cicodeval%>
<%= curonlinecdRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 13:32:35 KST 2009 */