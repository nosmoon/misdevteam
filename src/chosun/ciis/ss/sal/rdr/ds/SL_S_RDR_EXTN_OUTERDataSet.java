/***************************************************************************************************
* 파일명 : SL_S_RDR_EXTN_OUTERDataSet.java
* 기능 : 외부확장등록관리(풉앗이확장상세보기)
* 작성일자 : 2004-06-03
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
 * 외부확장등록관리(풉앗이확장상세보기)
 *
 */

public class SL_S_RDR_EXTN_OUTERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medicd;
	public String medinm;
	public String aplcdt;
	public String qty;
	public String aplcpathcd;
	public String rdr_extntypecd;
	public String extnblngcd;
	public String empclsfcd;
	public String empdeptcd;
	public String empdeptnm;
	public String empseq;
	public String bodutycd;
	public String boposicd;
	public String stafclsfcd;
	public String stafno;
	public String rdr_extnbocd;
	public String boemp_no;
	public String extnid;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String aplcpersremk;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdremail;
	public String rdroffinm;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvhopedt;
	public String corrbocd;
	public String bonm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String tel_no21;
	public String tel_no22;
	public String tel_no23;
	public String resiclsfcd;
	public String resitypecd;
	public String bo_headcnfmdt;

	public SL_S_RDR_EXTN_OUTERDataSet(){}
	public SL_S_RDR_EXTN_OUTERDataSet(String errcode, String errmsg, String medicd, String medinm, String aplcdt, String qty, String aplcpathcd, String rdr_extntypecd, String extnblngcd, String empclsfcd, String empdeptcd, String empdeptnm, String empseq, String bodutycd, String boposicd, String stafclsfcd, String stafno, String rdr_extnbocd, String boemp_no, String extnid, String extnflnm, String extntel1, String extntel2, String extntel3, String extnptph_no1, String extnptph_no2, String extnptph_no3, String extnprn, String aplcpersremk, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String rdremail, String rdroffinm, String rdroffitel_no1, String rdroffitel_no2, String rdroffitel_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String dlvhopedt, String corrbocd, String bonm, String tel_no11, String tel_no12, String tel_no13, String tel_no21, String tel_no22, String tel_no23, String resiclsfcd, String resitypecd, String bo_headcnfmdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medicd = medicd;
		this.medinm = medinm;
		this.aplcdt = aplcdt;
		this.qty = qty;
		this.aplcpathcd = aplcpathcd;
		this.rdr_extntypecd = rdr_extntypecd;
		this.extnblngcd = extnblngcd;
		this.empclsfcd = empclsfcd;
		this.empdeptcd = empdeptcd;
		this.empdeptnm = empdeptnm;
		this.empseq = empseq;
		this.bodutycd = bodutycd;
		this.boposicd = boposicd;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.rdr_extnbocd = rdr_extnbocd;
		this.boemp_no = boemp_no;
		this.extnid = extnid;
		this.extnflnm = extnflnm;
		this.extntel1 = extntel1;
		this.extntel2 = extntel2;
		this.extntel3 = extntel3;
		this.extnptph_no1 = extnptph_no1;
		this.extnptph_no2 = extnptph_no2;
		this.extnptph_no3 = extnptph_no3;
		this.extnprn = extnprn;
		this.aplcpersremk = aplcpersremk;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.rdremail = rdremail;
		this.rdroffinm = rdroffinm;
		this.rdroffitel_no1 = rdroffitel_no1;
		this.rdroffitel_no2 = rdroffitel_no2;
		this.rdroffitel_no3 = rdroffitel_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.dlvhopedt = dlvhopedt;
		this.corrbocd = corrbocd;
		this.bonm = bonm;
		this.tel_no11 = tel_no11;
		this.tel_no12 = tel_no12;
		this.tel_no13 = tel_no13;
		this.tel_no21 = tel_no21;
		this.tel_no22 = tel_no22;
		this.tel_no23 = tel_no23;
		this.resiclsfcd = resiclsfcd;
		this.resitypecd = resitypecd;
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setEmpclsfcd(String empclsfcd){
		this.empclsfcd = empclsfcd;
	}

	public void setEmpdeptcd(String empdeptcd){
		this.empdeptcd = empdeptcd;
	}

	public void setEmpdeptnm(String empdeptnm){
		this.empdeptnm = empdeptnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setBodutycd(String bodutycd){
		this.bodutycd = bodutycd;
	}

	public void setBoposicd(String boposicd){
		this.boposicd = boposicd;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setRdr_extnbocd(String rdr_extnbocd){
		this.rdr_extnbocd = rdr_extnbocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setExtnid(String extnid){
		this.extnid = extnid;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtntel1(String extntel1){
		this.extntel1 = extntel1;
	}

	public void setExtntel2(String extntel2){
		this.extntel2 = extntel2;
	}

	public void setExtntel3(String extntel3){
		this.extntel3 = extntel3;
	}

	public void setExtnptph_no1(String extnptph_no1){
		this.extnptph_no1 = extnptph_no1;
	}

	public void setExtnptph_no2(String extnptph_no2){
		this.extnptph_no2 = extnptph_no2;
	}

	public void setExtnptph_no3(String extnptph_no3){
		this.extnptph_no3 = extnptph_no3;
	}

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setAplcpersremk(String aplcpersremk){
		this.aplcpersremk = aplcpersremk;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setRdroffinm(String rdroffinm){
		this.rdroffinm = rdroffinm;
	}

	public void setRdroffitel_no1(String rdroffitel_no1){
		this.rdroffitel_no1 = rdroffitel_no1;
	}

	public void setRdroffitel_no2(String rdroffitel_no2){
		this.rdroffitel_no2 = rdroffitel_no2;
	}

	public void setRdroffitel_no3(String rdroffitel_no3){
		this.rdroffitel_no3 = rdroffitel_no3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public void setTel_no21(String tel_no21){
		this.tel_no21 = tel_no21;
	}

	public void setTel_no22(String tel_no22){
		this.tel_no22 = tel_no22;
	}

	public void setTel_no23(String tel_no23){
		this.tel_no23 = tel_no23;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setBo_headcnfmdt(String bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getEmpclsfcd(){
		return this.empclsfcd;
	}

	public String getEmpdeptcd(){
		return this.empdeptcd;
	}

	public String getEmpdeptnm(){
		return this.empdeptnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getBodutycd(){
		return this.bodutycd;
	}

	public String getBoposicd(){
		return this.boposicd;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getRdr_extnbocd(){
		return this.rdr_extnbocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getExtnid(){
		return this.extnid;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtntel1(){
		return this.extntel1;
	}

	public String getExtntel2(){
		return this.extntel2;
	}

	public String getExtntel3(){
		return this.extntel3;
	}

	public String getExtnptph_no1(){
		return this.extnptph_no1;
	}

	public String getExtnptph_no2(){
		return this.extnptph_no2;
	}

	public String getExtnptph_no3(){
		return this.extnptph_no3;
	}

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getAplcpersremk(){
		return this.aplcpersremk;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getRdroffinm(){
		return this.rdroffinm;
	}

	public String getRdroffitel_no1(){
		return this.rdroffitel_no1;
	}

	public String getRdroffitel_no2(){
		return this.rdroffitel_no2;
	}

	public String getRdroffitel_no3(){
		return this.rdroffitel_no3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public String getTel_no21(){
		return this.tel_no21;
	}

	public String getTel_no22(){
		return this.tel_no22;
	}

	public String getTel_no23(){
		return this.tel_no23;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medicd = Util.checkString(cstmt.getString(6));
		this.medinm = Util.checkString(cstmt.getString(7));
		this.aplcdt = Util.checkString(cstmt.getString(8));
		this.qty = Util.checkString(cstmt.getString(9));
		this.aplcpathcd = Util.checkString(cstmt.getString(10));
		this.rdr_extntypecd = Util.checkString(cstmt.getString(11));
		this.extnblngcd = Util.checkString(cstmt.getString(12));
		this.empclsfcd = Util.checkString(cstmt.getString(13));
		this.empdeptcd = Util.checkString(cstmt.getString(14));
		this.empdeptnm = Util.checkString(cstmt.getString(15));
		this.empseq = Util.checkString(cstmt.getString(16));
		this.bodutycd = Util.checkString(cstmt.getString(17));
		this.boposicd = Util.checkString(cstmt.getString(18));
		this.stafclsfcd = Util.checkString(cstmt.getString(19));
		this.stafno = Util.checkString(cstmt.getString(20));
		this.rdr_extnbocd = Util.checkString(cstmt.getString(21));
		this.boemp_no = Util.checkString(cstmt.getString(22));
		this.extnid = Util.checkString(cstmt.getString(23));
		this.extnflnm = Util.checkString(cstmt.getString(24));
		this.extntel1 = Util.checkString(cstmt.getString(25));
		this.extntel2 = Util.checkString(cstmt.getString(26));
		this.extntel3 = Util.checkString(cstmt.getString(27));
		this.extnptph_no1 = Util.checkString(cstmt.getString(28));
		this.extnptph_no2 = Util.checkString(cstmt.getString(29));
		this.extnptph_no3 = Util.checkString(cstmt.getString(30));
		this.extnprn = Util.checkString(cstmt.getString(31));
		this.aplcpersremk = Util.checkString(cstmt.getString(32));
		this.rdrnm = Util.checkString(cstmt.getString(33));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(34));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(35));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(36));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(37));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(38));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(39));
		this.rdremail = Util.checkString(cstmt.getString(40));
		this.rdroffinm = Util.checkString(cstmt.getString(41));
		this.rdroffitel_no1 = Util.checkString(cstmt.getString(42));
		this.rdroffitel_no2 = Util.checkString(cstmt.getString(43));
		this.rdroffitel_no3 = Util.checkString(cstmt.getString(44));
		this.dlvzip = Util.checkString(cstmt.getString(45));
		this.dlvaddr = Util.checkString(cstmt.getString(46));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(47));
		this.dlvhopedt = Util.checkString(cstmt.getString(48));
		this.corrbocd = Util.checkString(cstmt.getString(49));
		this.bonm = Util.checkString(cstmt.getString(50));
		this.tel_no11 = Util.checkString(cstmt.getString(51));
		this.tel_no12 = Util.checkString(cstmt.getString(52));
		this.tel_no13 = Util.checkString(cstmt.getString(53));
		this.tel_no21 = Util.checkString(cstmt.getString(54));
		this.tel_no22 = Util.checkString(cstmt.getString(55));
		this.tel_no23 = Util.checkString(cstmt.getString(56));
		this.resiclsfcd = Util.checkString(cstmt.getString(57));
		this.resitypecd = Util.checkString(cstmt.getString(58));
		this.bo_headcnfmdt = Util.checkString(cstmt.getString(59));
		ResultSet rset0 = (ResultSet) cstmt.getObject(60);
		while(rset0.next()){
			SL_S_RDR_EXTN_OUTERMEDICDCURRecord rec = new SL_S_RDR_EXTN_OUTERMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(61);
		while(rset1.next()){
			SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord rec = new SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_EXTN_OUTERMEDICDCURRecord rec = (SL_S_RDR_EXTN_OUTERMEDICDCURRecord)medicdcur.get(i);


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
			SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord rec = (SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord)resiclsfcdcur.get(i);


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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_EXTN_OUTERMEDICDCURRecord rec = (SL_S_RDR_EXTN_OUTERMEDICDCURRecord)medicdcur.get(i);


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
			SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord rec = (SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord)resiclsfcdcur.get(i);


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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_EXTN_OUTERMEDICDCURRecord rec = (SL_S_RDR_EXTN_OUTERMEDICDCURRecord)medicdcur.get(i);


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
			SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord rec = (SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord)resiclsfcdcur.get(i);


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
	SL_S_RDR_EXTN_OUTERDataSet ds = (SL_S_RDR_EXTN_OUTERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		SL_S_RDR_EXTN_OUTERMEDICDCURRecord medicdcurRec = (SL_S_RDR_EXTN_OUTERMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord resiclsfcdcurRec = (SL_S_RDR_EXTN_OUTERRESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicd()%>
<%= ds.getMedinm()%>
<%= ds.getAplcdt()%>
<%= ds.getQty()%>
<%= ds.getAplcpathcd()%>
<%= ds.getRdr_extntypecd()%>
<%= ds.getExtnblngcd()%>
<%= ds.getEmpclsfcd()%>
<%= ds.getEmpdeptcd()%>
<%= ds.getEmpdeptnm()%>
<%= ds.getEmpseq()%>
<%= ds.getBodutycd()%>
<%= ds.getBoposicd()%>
<%= ds.getStafclsfcd()%>
<%= ds.getStafno()%>
<%= ds.getRdr_extnbocd()%>
<%= ds.getBoemp_no()%>
<%= ds.getExtnid()%>
<%= ds.getExtnflnm()%>
<%= ds.getExtntel1()%>
<%= ds.getExtntel2()%>
<%= ds.getExtntel3()%>
<%= ds.getExtnptph_no1()%>
<%= ds.getExtnptph_no2()%>
<%= ds.getExtnptph_no3()%>
<%= ds.getExtnprn()%>
<%= ds.getAplcpersremk()%>
<%= ds.getRdrnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getRdremail()%>
<%= ds.getRdroffinm()%>
<%= ds.getRdroffitel_no1()%>
<%= ds.getRdroffitel_no2()%>
<%= ds.getRdroffitel_no3()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getDlvhopedt()%>
<%= ds.getCorrbocd()%>
<%= ds.getBonm()%>
<%= ds.getTel_no11()%>
<%= ds.getTel_no12()%>
<%= ds.getTel_no13()%>
<%= ds.getTel_no21()%>
<%= ds.getTel_no22()%>
<%= ds.getTel_no23()%>
<%= ds.getResiclsfcd()%>
<%= ds.getResitypecd()%>
<%= ds.getBo_headcnfmdt()%>
<%= ds.getMedicdcur()%>
<%= ds.getResiclsfcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= resiclsfcdcurRec.cicodeval%>
<%= resiclsfcdcurRec.cicdnm%>
<%= resiclsfcdcurRec.cicdynm%>
<%= resiclsfcdcurRec.ciymgbcd%>
<%= resiclsfcdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 08 15:05:44 KST 2004 */