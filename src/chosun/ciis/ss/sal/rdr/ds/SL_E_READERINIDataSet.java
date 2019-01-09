/***************************************************************************************************
* 파일명 : SL_E_READERINIDataSet.java
* 기능 : 독자정보관리(초기화면)
* 작성일자 : 2004-05-20
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
 * 독자정보관리(초기화면)
 *
 */

public class SL_E_READERINIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList suspresncdcur = new ArrayList();
	public ArrayList bomedicdcur = new ArrayList();
	public ArrayList paty_clsfcdcur = new ArrayList();
	public ArrayList areanocdcur = new ArrayList();
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList rdr_extntypecdcur = new ArrayList();
	public ArrayList dlvmthdcdcur = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public ArrayList thrwplaccdcur = new ArrayList();
	public ArrayList dstcinfocur = new ArrayList();
	public ArrayList ceph1cdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String curryymm;
	public String bo_tel1;

	public SL_E_READERINIDataSet(){}
	public SL_E_READERINIDataSet(String errcode, String errmsg, String curryymm, String bo_tel1){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.curryymm = curryymm;
		this.bo_tel1 = bo_tel1;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCurryymm(String curryymm){
		this.curryymm = curryymm;
	}

	public void setBo_tel1(String bo_tel1){
		this.bo_tel1 = bo_tel1;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCurryymm(){
		return this.curryymm;
	}

	public String getBo_tel1(){
		return this.bo_tel1;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.curryymm = Util.checkString(cstmt.getString(4));
		this.bo_tel1 = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SL_E_READERINIDSTCINFOCURRecord rec = new SL_E_READERINIDSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset0.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset0.getString("teamcd"));
			this.dstcinfocur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SL_E_READERINIADDRCDCURRecord rec = new SL_E_READERINIADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset1.getString("addrcd"));
			rec.addrnm = Util.checkString(rset1.getString("addrnm"));
			rec.resitypecd = Util.checkString(rset1.getString("resitypecd"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SL_E_READERINIPATY_CLSFCDCURRecord rec = new SL_E_READERINIPATY_CLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.paty_clsfcdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SL_E_READERINIAREANOCDCURRecord rec = new SL_E_READERINIAREANOCDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.areanocdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			SL_E_READERINIRESITYPECDCURRecord rec = new SL_E_READERINIRESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			SL_E_READERINIRESICLSFCDCURRecord rec = new SL_E_READERINIRESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			SL_E_READERINICEPH1CDCURRecord rec = new SL_E_READERINICEPH1CDCURRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			this.ceph1cdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(13);
		while(rset7.next()){
			SL_E_READERINIDLVMTHDCDCURRecord rec = new SL_E_READERINIDLVMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			this.dlvmthdcdcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(14);
		while(rset8.next()){
			SL_E_READERINITHRWPLACCDCURRecord rec = new SL_E_READERINITHRWPLACCDCURRecord();
			rec.cicodeval = Util.checkString(rset8.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset8.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset8.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset8.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset8.getString("cicdgb"));
			this.thrwplaccdcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(15);
		while(rset9.next()){
			SL_E_READERINIBOMEDICDCURRecord rec = new SL_E_READERINIBOMEDICDCURRecord();
			rec.medicd = Util.checkString(rset9.getString("medicd"));
			rec.cicdnm = Util.checkString(rset9.getString("cicdnm"));
			rec.remk = Util.checkString(rset9.getString("remk"));
			rec.areanwspyn = Util.checkString(rset9.getString("areanwspyn"));
			rec.subsuprc = rset9.getInt("subsuprc");
			rec.ciymgbcd = Util.checkString(rset9.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset9.getString("cicdgb"));
			this.bomedicdcur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(16);
		while(rset10.next()){
			SL_E_READERINIRDR_EXTNTYPECDCURRecord rec = new SL_E_READERINIRDR_EXTNTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset10.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset10.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset10.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset10.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset10.getString("cicdgb"));
			this.rdr_extntypecdcur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(17);
		while(rset11.next()){
			SL_E_READERINICLAMTMTHDCDCURRecord rec = new SL_E_READERINICLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset11.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset11.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset11.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset11.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset11.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(18);
		while(rset12.next()){
			SL_E_READERINIFREECLSFCDCURRecord rec = new SL_E_READERINIFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset12.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset12.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset12.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset12.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset12.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(19);
		while(rset13.next()){
			SL_E_READERINISUSPRESNCDCURRecord rec = new SL_E_READERINISUSPRESNCDCURRecord();
			rec.cicodeval = Util.checkString(rset13.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset13.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset13.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset13.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset13.getString("cicdgb"));
			this.suspresncdcur.add(rec);
		}
	}

	public String dstcinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIDSTCINFOCURRecord rec = (SL_E_READERINIDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
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

	public String addrcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIADDRCDCURRecord rec = (SL_E_READERINIADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
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

	public String paty_clsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paty_clsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIPATY_CLSFCDCURRecord rec = (SL_E_READERINIPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
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

	public String areanocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areanocdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIAREANOCDCURRecord rec = (SL_E_READERINIAREANOCDCURRecord)areanocdcur.get(i);
			
			
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

	public String resitypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resitypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRESITYPECDCURRecord rec = (SL_E_READERINIRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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

	public String resiclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resiclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRESICLSFCDCURRecord rec = (SL_E_READERINIRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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

	public String ceph1cdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = ceph1cdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINICEPH1CDCURRecord rec = (SL_E_READERINICEPH1CDCURRecord)ceph1cdcur.get(i);
			
			
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

	public String dlvmthdcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIDLVMTHDCDCURRecord rec = (SL_E_READERINIDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
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

	public String thrwplaccdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwplaccdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINITHRWPLACCDCURRecord rec = (SL_E_READERINITHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
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

	public String bomedicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIBOMEDICDCURRecord rec = (SL_E_READERINIBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
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

	public String rdr_extntypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRDR_EXTNTYPECDCURRecord rec = (SL_E_READERINIRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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

	public String clamtmthdcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINICLAMTMTHDCDCURRecord rec = (SL_E_READERINICLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
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

	public String freeclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIFREECLSFCDCURRecord rec = (SL_E_READERINIFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String suspresncdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINISUSPRESNCDCURRecord rec = (SL_E_READERINISUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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

	public String dstcinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIDSTCINFOCURRecord rec = (SL_E_READERINIDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
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

	public String addrcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIADDRCDCURRecord rec = (SL_E_READERINIADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
			sb.append("<input name=\"");
			sb.append("addrcd");
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

	public String paty_clsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paty_clsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIPATY_CLSFCDCURRecord rec = (SL_E_READERINIPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
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

	public String areanocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areanocdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIAREANOCDCURRecord rec = (SL_E_READERINIAREANOCDCURRecord)areanocdcur.get(i);
			
			
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

	public String resitypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resitypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRESITYPECDCURRecord rec = (SL_E_READERINIRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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

	public String resiclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resiclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRESICLSFCDCURRecord rec = (SL_E_READERINIRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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

	public String ceph1cdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = ceph1cdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINICEPH1CDCURRecord rec = (SL_E_READERINICEPH1CDCURRecord)ceph1cdcur.get(i);
			
			
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

	public String dlvmthdcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIDLVMTHDCDCURRecord rec = (SL_E_READERINIDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
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

	public String thrwplaccdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwplaccdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINITHRWPLACCDCURRecord rec = (SL_E_READERINITHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
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

	public String bomedicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIBOMEDICDCURRecord rec = (SL_E_READERINIBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String rdr_extntypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRDR_EXTNTYPECDCURRecord rec = (SL_E_READERINIRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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

	public String clamtmthdcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINICLAMTMTHDCDCURRecord rec = (SL_E_READERINICLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
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

	public String freeclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIFREECLSFCDCURRecord rec = (SL_E_READERINIFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String suspresncdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINISUSPRESNCDCURRecord rec = (SL_E_READERINISUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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

	public String dstcinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIDSTCINFOCURRecord rec = (SL_E_READERINIDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
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

	public String addrcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIADDRCDCURRecord rec = (SL_E_READERINIADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
			sb.append("<input name=\"");
			sb.append("addrcd");
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

	public String paty_clsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paty_clsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIPATY_CLSFCDCURRecord rec = (SL_E_READERINIPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
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

	public String areanocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areanocdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIAREANOCDCURRecord rec = (SL_E_READERINIAREANOCDCURRecord)areanocdcur.get(i);
			
			
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

	public String resitypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resitypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRESITYPECDCURRecord rec = (SL_E_READERINIRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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

	public String resiclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resiclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRESICLSFCDCURRecord rec = (SL_E_READERINIRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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

	public String ceph1cdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = ceph1cdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINICEPH1CDCURRecord rec = (SL_E_READERINICEPH1CDCURRecord)ceph1cdcur.get(i);
			
			
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

	public String dlvmthdcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIDLVMTHDCDCURRecord rec = (SL_E_READERINIDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
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

	public String thrwplaccdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwplaccdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINITHRWPLACCDCURRecord rec = (SL_E_READERINITHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
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

	public String bomedicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIBOMEDICDCURRecord rec = (SL_E_READERINIBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String rdr_extntypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIRDR_EXTNTYPECDCURRecord rec = (SL_E_READERINIRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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

	public String clamtmthdcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINICLAMTMTHDCDCURRecord rec = (SL_E_READERINICLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
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

	public String freeclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINIFREECLSFCDCURRecord rec = (SL_E_READERINIFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String suspresncdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_E_READERINISUSPRESNCDCURRecord rec = (SL_E_READERINISUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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
	SL_E_READERINIDataSet ds = (SL_E_READERINIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SL_E_READERINIDSTCINFOCURRecord dstcinfocurRec = (SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_E_READERINIADDRCDCURRecord addrcdcurRec = (SL_E_READERINIADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paty_clsfcdcur.size(); i++){
		SL_E_READERINIPATY_CLSFCDCURRecord paty_clsfcdcurRec = (SL_E_READERINIPATY_CLSFCDCURRecord)ds.paty_clsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areanocdcur.size(); i++){
		SL_E_READERINIAREANOCDCURRecord areanocdcurRec = (SL_E_READERINIAREANOCDCURRecord)ds.areanocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SL_E_READERINIRESITYPECDCURRecord resitypecdcurRec = (SL_E_READERINIRESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		SL_E_READERINIRESICLSFCDCURRecord resiclsfcdcurRec = (SL_E_READERINIRESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.ceph1cdcur.size(); i++){
		SL_E_READERINICEPH1CDCURRecord ceph1cdcurRec = (SL_E_READERINICEPH1CDCURRecord)ds.ceph1cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvmthdcdcur.size(); i++){
		SL_E_READERINIDLVMTHDCDCURRecord dlvmthdcdcurRec = (SL_E_READERINIDLVMTHDCDCURRecord)ds.dlvmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.thrwplaccdcur.size(); i++){
		SL_E_READERINITHRWPLACCDCURRecord thrwplaccdcurRec = (SL_E_READERINITHRWPLACCDCURRecord)ds.thrwplaccdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		SL_E_READERINIBOMEDICDCURRecord bomedicdcurRec = (SL_E_READERINIBOMEDICDCURRecord)ds.bomedicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntypecdcur.size(); i++){
		SL_E_READERINIRDR_EXTNTYPECDCURRecord rdr_extntypecdcurRec = (SL_E_READERINIRDR_EXTNTYPECDCURRecord)ds.rdr_extntypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SL_E_READERINICLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SL_E_READERINICLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_E_READERINIFREECLSFCDCURRecord freeclsfcdcurRec = (SL_E_READERINIFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.suspresncdcur.size(); i++){
		SL_E_READERINISUSPRESNCDCURRecord suspresncdcurRec = (SL_E_READERINISUSPRESNCDCURRecord)ds.suspresncdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurryymm()%>
<%= ds.getBo_tel1()%>
<%= ds.getDstcinfocur()%>
<%= ds.getAddrcdcur()%>
<%= ds.getPaty_clsfcdcur()%>
<%= ds.getAreanocdcur()%>
<%= ds.getResitypecdcur()%>
<%= ds.getResiclsfcdcur()%>
<%= ds.getCeph1cdcur()%>
<%= ds.getDlvmthdcdcur()%>
<%= ds.getThrwplaccdcur()%>
<%= ds.getBomedicdcur()%>
<%= ds.getRdr_extntypecdcur()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getFreeclsfcdcur()%>
<%= ds.getSuspresncdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= addrcdcurRec.resitypecd%>
<%= paty_clsfcdcurRec.cicodeval%>
<%= paty_clsfcdcurRec.cicdnm%>
<%= paty_clsfcdcurRec.cicdynm%>
<%= paty_clsfcdcurRec.ciymgbcd%>
<%= paty_clsfcdcurRec.cicdgb%>
<%= areanocdcurRec.cicodeval%>
<%= areanocdcurRec.cicdnm%>
<%= areanocdcurRec.cicdynm%>
<%= areanocdcurRec.ciymgbcd%>
<%= areanocdcurRec.cicdgb%>
<%= resitypecdcurRec.cicodeval%>
<%= resitypecdcurRec.cicdnm%>
<%= resitypecdcurRec.cicdynm%>
<%= resitypecdcurRec.ciymgbcd%>
<%= resitypecdcurRec.cicdgb%>
<%= resiclsfcdcurRec.cicodeval%>
<%= resiclsfcdcurRec.cicdnm%>
<%= resiclsfcdcurRec.cicdynm%>
<%= resiclsfcdcurRec.ciymgbcd%>
<%= resiclsfcdcurRec.cicdgb%>
<%= ceph1cdcurRec.cicodeval%>
<%= ceph1cdcurRec.cicdnm%>
<%= ceph1cdcurRec.cicdynm%>
<%= ceph1cdcurRec.ciymgbcd%>
<%= ceph1cdcurRec.cicdgb%>
<%= dlvmthdcdcurRec.cicodeval%>
<%= dlvmthdcdcurRec.cicdnm%>
<%= dlvmthdcdcurRec.cicdynm%>
<%= dlvmthdcdcurRec.ciymgbcd%>
<%= dlvmthdcdcurRec.cicdgb%>
<%= thrwplaccdcurRec.cicodeval%>
<%= thrwplaccdcurRec.cicdnm%>
<%= thrwplaccdcurRec.cicdynm%>
<%= thrwplaccdcurRec.ciymgbcd%>
<%= thrwplaccdcurRec.cicdgb%>
<%= bomedicdcurRec.medicd%>
<%= bomedicdcurRec.cicdnm%>
<%= bomedicdcurRec.remk%>
<%= bomedicdcurRec.areanwspyn%>
<%= bomedicdcurRec.subsuprc%>
<%= bomedicdcurRec.ciymgbcd%>
<%= bomedicdcurRec.cicdgb%>
<%= rdr_extntypecdcurRec.cicodeval%>
<%= rdr_extntypecdcurRec.cicdnm%>
<%= rdr_extntypecdcurRec.cicdynm%>
<%= rdr_extntypecdcurRec.ciymgbcd%>
<%= rdr_extntypecdcurRec.cicdgb%>
<%= clamtmthdcdcurRec.cicodeval%>
<%= clamtmthdcdcurRec.cicdnm%>
<%= clamtmthdcdcurRec.cicdynm%>
<%= clamtmthdcdcurRec.ciymgbcd%>
<%= clamtmthdcdcurRec.cicdgb%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
<%= suspresncdcurRec.cicodeval%>
<%= suspresncdcurRec.cicdnm%>
<%= suspresncdcurRec.cicdynm%>
<%= suspresncdcurRec.ciymgbcd%>
<%= suspresncdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun May 30 16:06:43 KST 2004 */