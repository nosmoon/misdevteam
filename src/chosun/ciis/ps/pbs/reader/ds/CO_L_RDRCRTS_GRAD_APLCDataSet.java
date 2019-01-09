/***************************************************************************************************
 * 파일명 : CO_L_RDRCRTS_GRAD_APLC.java
 * 기능 : 독자우대등급관리(독자우대기존독자목록조회)
 * 작성일자 : 2004-04-29
 * 작성자 : 김영윤
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 우리이웃 이벤트를 위한 remk 추가
 * 수정자 : 노상현
 * 수정일자 : 2004-11-30
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 독자인증 파라미터값 변경
 * 수정자 : 노상현
 * 수정일자 : 2005-02-23
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 현금영수증 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2005-11-10
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 모바일기사 서비스 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2006-08-16
 * 백업 : 
 ***************************************************************************************************/
 /***************************************************************************************************
 * 수정내역 : Ireader 서비스 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2008-03-06
 * 백업 : 
 ***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-모닝플러스회원,현금영수증,모바일조선,Ireader회원관리
 */

public class CO_L_RDRCRTS_GRAD_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medicdcur = new ArrayList();
	public ArrayList errresncdcur = new ArrayList();
	public ArrayList mblestatcur = new ArrayList();
	public ArrayList dtlsprocstatcur = new ArrayList();
	public ArrayList pusbocdcur = new ArrayList();
	public ArrayList cashrcptstatcur = new ArrayList();
	public ArrayList mblenonrsmgcdcur = new ArrayList();
	public ArrayList gradcur = new ArrayList();
	public ArrayList rdr_gradaplccur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_L_RDRCRTS_GRAD_APLCDataSet(){}
	public CO_L_RDRCRTS_GRAD_APLCDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(25);
		ResultSet rset0 = (ResultSet) cstmt.getObject(26);
		while(rset0.next()){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.pusbocdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(27);
		while(rset1.next()){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(28);
		while(rset2.next()){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.dtlsprocstatcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(29);
		while(rset3.next()){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.errresncdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(30);
		while(rset4.next()){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCGRADCURRecord();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.gradcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(31);
		while(rset5.next()){
			CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.cashrcptstatcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(32);
		while(rset6.next()){
			CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.mblestatcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(33);
		while(rset7.next()){
			CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord();
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			this.mblenonrsmgcdcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(34);
		while(rset8.next()){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord();
			rec.regdt = Util.checkString(rset8.getString("regdt"));
			rec.regno = Util.checkString(rset8.getString("regno"));
			rec.rdr_no = Util.checkString(rset8.getString("rdr_no"));
			rec.medicd = Util.checkString(rset8.getString("medicd"));
			rec.medinm = Util.checkString(rset8.getString("medinm"));
			rec.fstsubsdt = Util.checkString(rset8.getString("fstsubsdt"));
			rec.dtlsprocstat = Util.checkString(rset8.getString("dtlsprocstat"));
			rec.dtlsprocstatnm = Util.checkString(rset8.getString("dtlsprocstatnm"));
			rec.errresncd = Util.checkString(rset8.getString("errresncd"));
			rec.errresncdnm = Util.checkString(rset8.getString("errresncdnm"));
			rec.bocd = Util.checkString(rset8.getString("bocd"));
			rec.bonm = Util.checkString(rset8.getString("bonm"));
			rec.id = Util.checkString(rset8.getString("id"));
			rec.entr_no = Util.checkString(rset8.getString("entr_no"));
			rec.memb_nm_korn = Util.checkString(rset8.getString("memb_nm_korn"));
			rec.rdrnm = Util.checkString(rset8.getString("rdrnm"));
			rec.prn = Util.checkString(rset8.getString("prn"));
			rec.email = Util.checkString(rset8.getString("email"));
			rec.ceph_no_1 = Util.checkString(rset8.getString("ceph_no_1"));
			rec.ceph_no_2 = Util.checkString(rset8.getString("ceph_no_2"));
			rec.zip = Util.checkString(rset8.getString("zip"));
			rec.addr = Util.checkString(rset8.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset8.getString("dtlsaddr"));
			rec.home_tel_no = Util.checkString(rset8.getString("home_tel_no"));
			rec.subspersrshpcd = Util.checkString(rset8.getString("subspersrshpcd"));
			rec.memb_kind_cd = Util.checkString(rset8.getString("memb_kind_cd"));
			rec.procdt = Util.checkString(rset8.getString("procdt"));
			rec.recnm = Util.checkString(rset8.getString("recnm"));
			rec.recdt = rset8.getTimestamp("recdt");
			rec.recprn = Util.checkString(rset8.getString("recprn"));
			rec.recstat = Util.checkString(rset8.getString("recstat"));
			rec.cashstatnm = Util.checkString(rset8.getString("cashstatnm"));
			rec.suspdt = Util.checkString(rset8.getString("suspdt"));
			rec.mblefrdt = Util.checkString(rset8.getString("mblefrdt"));
			rec.mbleexpydt = Util.checkString(rset8.getString("mbleexpydt"));
			rec.mblestatcd = Util.checkString(rset8.getString("mblestatcd"));
			rec.mblenonrsmgcd = Util.checkString(rset8.getString("mblenonrsmgcd"));
			rec.rnum = rset8.getInt("rnum");
			this.rdr_gradaplccur.add(rec);
		}
	}

	public String pusbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pusbocdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)pusbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String dtlsprocstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dtlsprocstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)dtlsprocstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String errresncdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errresncdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)errresncdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String gradcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = gradcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)gradcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String cashrcptstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cashrcptstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord)cashrcptstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String mblestatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mblestatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord)mblestatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String mblenonrsmgcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mblenonrsmgcdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord)mblenonrsmgcdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String rdr_gradaplccurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_gradaplccur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)rdr_gradaplccur.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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

	public String pusbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pusbocdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)pusbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String dtlsprocstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dtlsprocstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)dtlsprocstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String errresncdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errresncdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)errresncdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String gradcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = gradcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)gradcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String cashrcptstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cashrcptstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord)cashrcptstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String mblestatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mblestatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord)mblestatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String mblenonrsmgcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mblenonrsmgcdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord)mblenonrsmgcdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String rdr_gradaplccurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_gradaplccur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)rdr_gradaplccur.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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

	public String pusbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pusbocdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)pusbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String dtlsprocstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dtlsprocstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)dtlsprocstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String errresncdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errresncdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)errresncdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String gradcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = gradcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)gradcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String cashrcptstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cashrcptstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord)cashrcptstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String mblestatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mblestatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord)mblestatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String mblenonrsmgcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mblenonrsmgcdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord)mblenonrsmgcdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String rdr_gradaplccurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_gradaplccur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)rdr_gradaplccur.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.pusbocdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord pusbocdcurRec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)ds.pusbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord medicdcurRec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dtlsprocstatcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord dtlsprocstatcurRec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)ds.dtlsprocstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.errresncdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord errresncdcurRec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)ds.errresncdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.gradcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCGRADCURRecord gradcurRec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)ds.gradcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cashrcptstatcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord cashrcptstatcurRec = (CO_L_RDRCRTS_GRAD_APLCCASHRCPTSTATCURRecord)ds.cashrcptstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mblestatcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord mblestatcurRec = (CO_L_RDRCRTS_GRAD_APLCMBLESTATCURRecord)ds.mblestatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mblenonrsmgcdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord mblenonrsmgcdcurRec = (CO_L_RDRCRTS_GRAD_APLCMBLENONRSMGCDCURRecord)ds.mblenonrsmgcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_gradaplccur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rdr_gradaplccurRec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)ds.rdr_gradaplccur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getPusbocdcur()%>
<%= ds.getMedicdcur()%>
<%= ds.getDtlsprocstatcur()%>
<%= ds.getErrresncdcur()%>
<%= ds.getGradcur()%>
<%= ds.getCashrcptstatcur()%>
<%= ds.getMblestatcur()%>
<%= ds.getMblenonrsmgcdcur()%>
<%= ds.getRdr_gradaplccur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= pusbocdcurRec.bocd%>
<%= pusbocdcurRec.bonm%>
<%= pusbocdcurRec.deptcd%>
<%= pusbocdcurRec.sellnetclsf%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= dtlsprocstatcurRec.ciymgbcd%>
<%= dtlsprocstatcurRec.cicdgb%>
<%= dtlsprocstatcurRec.cicodeval%>
<%= dtlsprocstatcurRec.cicdnm%>
<%= dtlsprocstatcurRec.cicdynm%>
<%= errresncdcurRec.ciymgbcd%>
<%= errresncdcurRec.cicdgb%>
<%= errresncdcurRec.cicodeval%>
<%= errresncdcurRec.cicdnm%>
<%= errresncdcurRec.cicdynm%>
<%= gradcurRec.ciymgbcd%>
<%= gradcurRec.cicdgb%>
<%= gradcurRec.cicodeval%>
<%= gradcurRec.cicdnm%>
<%= gradcurRec.cicdynm%>
<%= cashrcptstatcurRec.ciymgbcd%>
<%= cashrcptstatcurRec.cicdgb%>
<%= cashrcptstatcurRec.cicodeval%>
<%= cashrcptstatcurRec.cicdnm%>
<%= cashrcptstatcurRec.cicdynm%>
<%= mblestatcurRec.ciymgbcd%>
<%= mblestatcurRec.cicdgb%>
<%= mblestatcurRec.cicodeval%>
<%= mblestatcurRec.cicdnm%>
<%= mblestatcurRec.cicdynm%>
<%= mblenonrsmgcdcurRec.ciymgbcd%>
<%= mblenonrsmgcdcurRec.cicdgb%>
<%= mblenonrsmgcdcurRec.cicodeval%>
<%= mblenonrsmgcdcurRec.cicdnm%>
<%= mblenonrsmgcdcurRec.cicdynm%>
<%= rdr_gradaplccurRec.regdt%>
<%= rdr_gradaplccurRec.regno%>
<%= rdr_gradaplccurRec.rdr_no%>
<%= rdr_gradaplccurRec.medicd%>
<%= rdr_gradaplccurRec.medinm%>
<%= rdr_gradaplccurRec.fstsubsdt%>
<%= rdr_gradaplccurRec.dtlsprocstat%>
<%= rdr_gradaplccurRec.dtlsprocstatnm%>
<%= rdr_gradaplccurRec.errresncd%>
<%= rdr_gradaplccurRec.errresncdnm%>
<%= rdr_gradaplccurRec.bocd%>
<%= rdr_gradaplccurRec.bonm%>
<%= rdr_gradaplccurRec.id%>
<%= rdr_gradaplccurRec.entr_no%>
<%= rdr_gradaplccurRec.memb_nm_korn%>
<%= rdr_gradaplccurRec.rdrnm%>
<%= rdr_gradaplccurRec.prn%>
<%= rdr_gradaplccurRec.email%>
<%= rdr_gradaplccurRec.ceph_no_1%>
<%= rdr_gradaplccurRec.ceph_no_2%>
<%= rdr_gradaplccurRec.zip%>
<%= rdr_gradaplccurRec.addr%>
<%= rdr_gradaplccurRec.dtlsaddr%>
<%= rdr_gradaplccurRec.home_tel_no%>
<%= rdr_gradaplccurRec.subspersrshpcd%>
<%= rdr_gradaplccurRec.memb_kind_cd%>
<%= rdr_gradaplccurRec.procdt%>
<%= rdr_gradaplccurRec.recnm%>
<%= rdr_gradaplccurRec.recdt%>
<%= rdr_gradaplccurRec.recprn%>
<%= rdr_gradaplccurRec.recstat%>
<%= rdr_gradaplccurRec.cashstatnm%>
<%= rdr_gradaplccurRec.suspdt%>
<%= rdr_gradaplccurRec.mblefrdt%>
<%= rdr_gradaplccurRec.mbleexpydt%>
<%= rdr_gradaplccurRec.mblestatcd%>
<%= rdr_gradaplccurRec.mblenonrsmgcd%>
<%= rdr_gradaplccurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 07 16:36:06 KST 2008 */