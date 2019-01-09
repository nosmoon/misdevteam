/***************************************************************************************************
 * 파일명   : PS_S_RDR_EXTNDataSet.java
 * 기능     : 독자-확장독자관리 초기,상세조회,RESET
 * 작성일자 : 2004-02-26
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-확장독자관리 초기,상세조회,RESET
 */

public class PS_S_RDR_EXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medicdcur = new ArrayList();
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList rshpclsfcdcur = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList rdr_extnclsfcdcur = new ArrayList();
	public ArrayList rdrextninfocur = new ArrayList();
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList rcpmmthdcur = new ArrayList();
	public ArrayList acqclsfcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_S_RDR_EXTNDataSet(){}
	public PS_S_RDR_EXTNDataSet(String errcode, String errmsg){
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
			PS_S_RDR_EXTNRDREXTNINFOCURRecord rec = new PS_S_RDR_EXTNRDREXTNINFOCURRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.qty = rset0.getInt("qty");
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.extnblngcd = Util.checkString(rset0.getString("extnblngcd"));
			rec.extnblngnm = Util.checkString(rset0.getString("extnblngnm"));
			rec.empclsfcd = Util.checkString(rset0.getString("empclsfcd"));
			rec.empdeptcd = Util.checkString(rset0.getString("empdeptcd"));
			rec.empdeptnm = Util.checkString(rset0.getString("empdeptnm"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.extnid = Util.checkString(rset0.getString("extnid"));
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
			rec.aplcperstel_no1 = Util.checkString(rset0.getString("aplcperstel_no1"));
			rec.aplcperstel_no2 = Util.checkString(rset0.getString("aplcperstel_no2"));
			rec.aplcperstel_no3 = Util.checkString(rset0.getString("aplcperstel_no3"));
			rec.aplcpersptph_no1 = Util.checkString(rset0.getString("aplcpersptph_no1"));
			rec.aplcpersptph_no2 = Util.checkString(rset0.getString("aplcpersptph_no2"));
			rec.aplcpersptph_no3 = Util.checkString(rset0.getString("aplcpersptph_no3"));
			rec.aplcpersoffinm = Util.checkString(rset0.getString("aplcpersoffinm"));
			rec.aplcpersposi = Util.checkString(rset0.getString("aplcpersposi"));
			rec.aplcpersremk = Util.checkString(rset0.getString("aplcpersremk"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdrprn = Util.checkString(rset0.getString("rdrprn"));
			rec.rdremail = Util.checkString(rset0.getString("rdremail"));
			rec.rdrmembseq = Util.checkString(rset0.getString("rdrmembseq"));
			rec.rdrposi = Util.checkString(rset0.getString("rdrposi"));
			rec.rdroffinm = Util.checkString(rset0.getString("rdroffinm"));
			rec.rdroffitel_no1 = Util.checkString(rset0.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset0.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset0.getString("rdroffitel_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.acqclsf = Util.checkString(rset0.getString("acqclsf"));
			rec.pymtflnm = Util.checkString(rset0.getString("pymtflnm"));
			rec.pymtoffinm = Util.checkString(rset0.getString("pymtoffinm"));
			rec.pymtposi = Util.checkString(rset0.getString("pymtposi"));
			rec.pymttel_no1 = Util.checkString(rset0.getString("pymttel_no1"));
			rec.pymttel_no2 = Util.checkString(rset0.getString("pymttel_no2"));
			rec.pymttel_no3 = Util.checkString(rset0.getString("pymttel_no3"));
			rec.pymtptph_no1 = Util.checkString(rset0.getString("pymtptph_no1"));
			rec.pymtptph_no2 = Util.checkString(rset0.getString("pymtptph_no2"));
			rec.pymtptph_no3 = Util.checkString(rset0.getString("pymtptph_no3"));
			rec.pymtzip = Util.checkString(rset0.getString("pymtzip"));
			rec.pymtaddr = Util.checkString(rset0.getString("pymtaddr"));
			rec.pymtdtlsaddr = Util.checkString(rset0.getString("pymtdtlsaddr"));
			rec.rcpmmthd = Util.checkString(rset0.getString("rcpmmthd"));
			rec.deliproccd = Util.checkString(rset0.getString("deliproccd"));
			rec.asindt = Util.checkString(rset0.getString("asindt"));
			rec.asinbocd = Util.checkString(rset0.getString("asinbocd"));
			rec.asinbonm = Util.checkString(rset0.getString("asinbonm"));
			rec.asinpers = Util.checkString(rset0.getString("asinpers"));
			rec.asinresn = Util.checkString(rset0.getString("asinresn"));
			rec.bouseyn = Util.checkString(rset0.getString("bouseyn"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.subscnfmstatcd = Util.checkString(rset0.getString("subscnfmstatcd"));
			rec.prcmsg = Util.checkString(rset0.getString("prcmsg"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.rdr_extn_info = Util.checkString(rset0.getString("rdr_extn_info"));
			rec.rdr_extnclsfcd = Util.checkString(rset0.getString("rdr_extnclsfcd"));
			rec.rdr_extnclsfnm = Util.checkString(rset0.getString("rdr_extnclsfnm"));
			rec.prvsubsmedicd = Util.checkString(rset0.getString("prvsubsmedicd"));
			rec.prvsubsmedinm = Util.checkString(rset0.getString("prvsubsmedinm"));
			this.rdrextninfocur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PS_S_RDR_EXTNMEDICDCURRecord rec = new PS_S_RDR_EXTNMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PS_S_RDR_EXTNACQCLSFCURRecord rec = new PS_S_RDR_EXTNACQCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.acqclsfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			PS_S_RDR_EXTNRCPMMTHDCURRecord rec = new PS_S_RDR_EXTNRCPMMTHDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.rcpmmthdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			PS_S_RDR_EXTNRSHPCLSFCDCURRecord rec = new PS_S_RDR_EXTNRSHPCLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.rshpclsfcdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			PS_S_RDR_EXTNRESICLSFCDCURRecord rec = new PS_S_RDR_EXTNRESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			PS_S_RDR_EXTNRESITYPECDCURRecord rec = new PS_S_RDR_EXTNRESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			PS_S_RDR_EXTNASINBOCDCURRecord rec = new PS_S_RDR_EXTNASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset7.getString("bocd"));
			rec.bonm = Util.checkString(rset7.getString("bonm"));
			rec.deptcd = Util.checkString(rset7.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset7.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord rec = new PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset8.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset8.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset8.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset8.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset8.getString("cicdgb"));
			this.rdr_extnclsfcdcur.add(rec);
		}
	}

	public String rdrextninfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrextninfocur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRDREXTNINFOCURRecord rec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)rdrextninfocur.get(i);
			
			
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

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNMEDICDCURRecord rec = (PS_S_RDR_EXTNMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String acqclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acqclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNACQCLSFCURRecord rec = (PS_S_RDR_EXTNACQCLSFCURRecord)acqclsfcur.get(i);
			
			
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

	public String rcpmmthdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRCPMMTHDCURRecord rec = (PS_S_RDR_EXTNRCPMMTHDCURRecord)rcpmmthdcur.get(i);
			
			
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

	public String rshpclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rshpclsfcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRSHPCLSFCDCURRecord rec = (PS_S_RDR_EXTNRSHPCLSFCDCURRecord)rshpclsfcdcur.get(i);
			
			
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
			PS_S_RDR_EXTNRESICLSFCDCURRecord rec = (PS_S_RDR_EXTNRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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
			PS_S_RDR_EXTNRESITYPECDCURRecord rec = (PS_S_RDR_EXTNRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNASINBOCDCURRecord rec = (PS_S_RDR_EXTNASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String rdr_extnclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extnclsfcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord rec = (PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord)rdr_extnclsfcdcur.get(i);
			
			
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

	public String rdrextninfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrextninfocur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRDREXTNINFOCURRecord rec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)rdrextninfocur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNMEDICDCURRecord rec = (PS_S_RDR_EXTNMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String acqclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acqclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNACQCLSFCURRecord rec = (PS_S_RDR_EXTNACQCLSFCURRecord)acqclsfcur.get(i);
			
			
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

	public String rcpmmthdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRCPMMTHDCURRecord rec = (PS_S_RDR_EXTNRCPMMTHDCURRecord)rcpmmthdcur.get(i);
			
			
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

	public String rshpclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rshpclsfcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRSHPCLSFCDCURRecord rec = (PS_S_RDR_EXTNRSHPCLSFCDCURRecord)rshpclsfcdcur.get(i);
			
			
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
			PS_S_RDR_EXTNRESICLSFCDCURRecord rec = (PS_S_RDR_EXTNRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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
			PS_S_RDR_EXTNRESITYPECDCURRecord rec = (PS_S_RDR_EXTNRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNASINBOCDCURRecord rec = (PS_S_RDR_EXTNASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String rdr_extnclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extnclsfcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord rec = (PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord)rdr_extnclsfcdcur.get(i);
			
			
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

	public String rdrextninfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrextninfocur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRDREXTNINFOCURRecord rec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)rdrextninfocur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNMEDICDCURRecord rec = (PS_S_RDR_EXTNMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String acqclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acqclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNACQCLSFCURRecord rec = (PS_S_RDR_EXTNACQCLSFCURRecord)acqclsfcur.get(i);
			
			
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

	public String rcpmmthdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRCPMMTHDCURRecord rec = (PS_S_RDR_EXTNRCPMMTHDCURRecord)rcpmmthdcur.get(i);
			
			
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

	public String rshpclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rshpclsfcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRSHPCLSFCDCURRecord rec = (PS_S_RDR_EXTNRSHPCLSFCDCURRecord)rshpclsfcdcur.get(i);
			
			
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
			PS_S_RDR_EXTNRESICLSFCDCURRecord rec = (PS_S_RDR_EXTNRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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
			PS_S_RDR_EXTNRESITYPECDCURRecord rec = (PS_S_RDR_EXTNRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNASINBOCDCURRecord rec = (PS_S_RDR_EXTNASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String rdr_extnclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extnclsfcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord rec = (PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord)rdr_extnclsfcdcur.get(i);
			
			
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
	PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrextninfocur.size(); i++){
		PS_S_RDR_EXTNRDREXTNINFOCURRecord rdrextninfocurRec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)ds.rdrextninfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_RDR_EXTNMEDICDCURRecord medicdcurRec = (PS_S_RDR_EXTNMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acqclsfcur.size(); i++){
		PS_S_RDR_EXTNACQCLSFCURRecord acqclsfcurRec = (PS_S_RDR_EXTNACQCLSFCURRecord)ds.acqclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpmmthdcur.size(); i++){
		PS_S_RDR_EXTNRCPMMTHDCURRecord rcpmmthdcurRec = (PS_S_RDR_EXTNRCPMMTHDCURRecord)ds.rcpmmthdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rshpclsfcdcur.size(); i++){
		PS_S_RDR_EXTNRSHPCLSFCDCURRecord rshpclsfcdcurRec = (PS_S_RDR_EXTNRSHPCLSFCDCURRecord)ds.rshpclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		PS_S_RDR_EXTNRESICLSFCDCURRecord resiclsfcdcurRec = (PS_S_RDR_EXTNRESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		PS_S_RDR_EXTNRESITYPECDCURRecord resitypecdcurRec = (PS_S_RDR_EXTNRESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_S_RDR_EXTNASINBOCDCURRecord asinbocdcurRec = (PS_S_RDR_EXTNASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extnclsfcdcur.size(); i++){
		PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord rdr_extnclsfcdcurRec = (PS_S_RDR_EXTNRDR_EXTNCLSFCDCURRecord)ds.rdr_extnclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdrextninfocur()%>
<%= ds.getMedicdcur()%>
<%= ds.getAcqclsfcur()%>
<%= ds.getRcpmmthdcur()%>
<%= ds.getRshpclsfcdcur()%>
<%= ds.getResiclsfcdcur()%>
<%= ds.getResitypecdcur()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getRdr_extnclsfcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdrextninfocurRec.rdr_extndt%>
<%= rdrextninfocurRec.rdr_extnno%>
<%= rdrextninfocurRec.medicd%>
<%= rdrextninfocurRec.aplcdt%>
<%= rdrextninfocurRec.qty%>
<%= rdrextninfocurRec.aplcpathcd%>
<%= rdrextninfocurRec.aplcpathnm%>
<%= rdrextninfocurRec.rdr_extntypecd%>
<%= rdrextninfocurRec.rdr_extntypenm%>
<%= rdrextninfocurRec.extnblngcd%>
<%= rdrextninfocurRec.extnblngnm%>
<%= rdrextninfocurRec.empclsfcd%>
<%= rdrextninfocurRec.empdeptcd%>
<%= rdrextninfocurRec.empdeptnm%>
<%= rdrextninfocurRec.empseq%>
<%= rdrextninfocurRec.boemp_no%>
<%= rdrextninfocurRec.extnid%>
<%= rdrextninfocurRec.extnflnm%>
<%= rdrextninfocurRec.extntel1%>
<%= rdrextninfocurRec.extntel2%>
<%= rdrextninfocurRec.extntel3%>
<%= rdrextninfocurRec.extnptph_no1%>
<%= rdrextninfocurRec.extnptph_no2%>
<%= rdrextninfocurRec.extnptph_no3%>
<%= rdrextninfocurRec.extnprn%>
<%= rdrextninfocurRec.rshpclsfcd%>
<%= rdrextninfocurRec.aplcpersnm%>
<%= rdrextninfocurRec.aplcperstel_no1%>
<%= rdrextninfocurRec.aplcperstel_no2%>
<%= rdrextninfocurRec.aplcperstel_no3%>
<%= rdrextninfocurRec.aplcpersptph_no1%>
<%= rdrextninfocurRec.aplcpersptph_no2%>
<%= rdrextninfocurRec.aplcpersptph_no3%>
<%= rdrextninfocurRec.aplcpersoffinm%>
<%= rdrextninfocurRec.aplcpersposi%>
<%= rdrextninfocurRec.aplcpersremk%>
<%= rdrextninfocurRec.rdrnm%>
<%= rdrextninfocurRec.rdrtel_no1%>
<%= rdrextninfocurRec.rdrtel_no2%>
<%= rdrextninfocurRec.rdrtel_no3%>
<%= rdrextninfocurRec.rdrptph_no1%>
<%= rdrextninfocurRec.rdrptph_no2%>
<%= rdrextninfocurRec.rdrptph_no3%>
<%= rdrextninfocurRec.rdrprn%>
<%= rdrextninfocurRec.rdremail%>
<%= rdrextninfocurRec.rdrmembseq%>
<%= rdrextninfocurRec.rdrposi%>
<%= rdrextninfocurRec.rdroffinm%>
<%= rdrextninfocurRec.rdroffitel_no1%>
<%= rdrextninfocurRec.rdroffitel_no2%>
<%= rdrextninfocurRec.rdroffitel_no3%>
<%= rdrextninfocurRec.dlvzip%>
<%= rdrextninfocurRec.dlvaddr%>
<%= rdrextninfocurRec.dlvdtlsaddr%>
<%= rdrextninfocurRec.acqclsf%>
<%= rdrextninfocurRec.pymtflnm%>
<%= rdrextninfocurRec.pymtoffinm%>
<%= rdrextninfocurRec.pymtposi%>
<%= rdrextninfocurRec.pymttel_no1%>
<%= rdrextninfocurRec.pymttel_no2%>
<%= rdrextninfocurRec.pymttel_no3%>
<%= rdrextninfocurRec.pymtptph_no1%>
<%= rdrextninfocurRec.pymtptph_no2%>
<%= rdrextninfocurRec.pymtptph_no3%>
<%= rdrextninfocurRec.pymtzip%>
<%= rdrextninfocurRec.pymtaddr%>
<%= rdrextninfocurRec.pymtdtlsaddr%>
<%= rdrextninfocurRec.rcpmmthd%>
<%= rdrextninfocurRec.deliproccd%>
<%= rdrextninfocurRec.asindt%>
<%= rdrextninfocurRec.asinbocd%>
<%= rdrextninfocurRec.asinbonm%>
<%= rdrextninfocurRec.asinpers%>
<%= rdrextninfocurRec.asinresn%>
<%= rdrextninfocurRec.bouseyn%>
<%= rdrextninfocurRec.resiclsfcd%>
<%= rdrextninfocurRec.resitypecd%>
<%= rdrextninfocurRec.subscnfmstatcd%>
<%= rdrextninfocurRec.prcmsg%>
<%= rdrextninfocurRec.remk%>
<%= rdrextninfocurRec.rdr_extn_info%>
<%= rdrextninfocurRec.rdr_extnclsfcd%>
<%= rdrextninfocurRec.rdr_extnclsfnm%>
<%= rdrextninfocurRec.prvsubsmedicd%>
<%= rdrextninfocurRec.prvsubsmedinm%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= acqclsfcurRec.cicodeval%>
<%= acqclsfcurRec.cicdnm%>
<%= acqclsfcurRec.cicdynm%>
<%= acqclsfcurRec.ciymgbcd%>
<%= acqclsfcurRec.cicdgb%>
<%= rcpmmthdcurRec.cicodeval%>
<%= rcpmmthdcurRec.cicdnm%>
<%= rcpmmthdcurRec.cicdynm%>
<%= rcpmmthdcurRec.ciymgbcd%>
<%= rcpmmthdcurRec.cicdgb%>
<%= rshpclsfcdcurRec.cicodeval%>
<%= rshpclsfcdcurRec.cicdnm%>
<%= rshpclsfcdcurRec.cicdynm%>
<%= rshpclsfcdcurRec.ciymgbcd%>
<%= rshpclsfcdcurRec.cicdgb%>
<%= resiclsfcdcurRec.cicodeval%>
<%= resiclsfcdcurRec.cicdnm%>
<%= resiclsfcdcurRec.cicdynm%>
<%= resiclsfcdcurRec.ciymgbcd%>
<%= resiclsfcdcurRec.cicdgb%>
<%= resitypecdcurRec.cicodeval%>
<%= resitypecdcurRec.cicdnm%>
<%= resitypecdcurRec.cicdynm%>
<%= resitypecdcurRec.ciymgbcd%>
<%= resitypecdcurRec.cicdgb%>
<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= rdr_extnclsfcdcurRec.cicodeval%>
<%= rdr_extnclsfcdcurRec.cicdnm%>
<%= rdr_extnclsfcdcurRec.cicdynm%>
<%= rdr_extnclsfcdcurRec.ciymgbcd%>
<%= rdr_extnclsfcdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 28 13:09:32 KST 2007 */