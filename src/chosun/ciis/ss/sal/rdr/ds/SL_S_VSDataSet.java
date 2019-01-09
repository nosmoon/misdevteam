/***************************************************************************************************
* 파일명 : SL_S_VSDataSet.java
* 기능 : 독자-VacationStop관리-상세
* 작성일자 : 2004-04-01
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
 * 독자-VacationStop관리-상세
 *
 */

public class SL_S_VSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList clsfcur = new ArrayList();
	public ArrayList vaca_areacur = new ArrayList();
	public ArrayList vaca_arearegncur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String clsfcd;
	public String suspfrdt;
	public String susptodt;
	public String bgnmappli;
	public String endmappli;
	public String spcfdlvdt;
	public String medicd;
	public String medinm;
	public long qty;
	public String remk;
	public String vaca_arearegncd;
	public String vaca_areacd;
	public String vaca_areanm;
	public String bocd;
	public String bonm;
	public String botel;
	public String vaca_areabocd;
	public String vaca_areabonm;
	public String vaca_areabotel;
	public String bocnfmyn;
	public String boremk;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String vaca_areadlvfrdt;
	public String vaca_areadlvtodt;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;
	public String vaca_areadlvofficnfmyn;
	public String vaca_areadlvoffiremk;

	public SL_S_VSDataSet(){}
	public SL_S_VSDataSet(String errcode, String errmsg, String rdr_no, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String clsfcd, String suspfrdt, String susptodt, String bgnmappli, String endmappli, String spcfdlvdt, String medicd, String medinm, long qty, String remk, String vaca_arearegncd, String vaca_areacd, String vaca_areanm, String bocd, String bonm, String botel, String vaca_areabocd, String vaca_areabonm, String vaca_areabotel, String bocnfmyn, String boremk, String dlvzip, String dlvaddr, String dlvdtlsaddr, String vaca_areadlvfrdt, String vaca_areadlvtodt, String vaca_areazip, String vaca_areaaddr, String vaca_areadtlsaddr, String vaca_areadlvofficnfmyn, String vaca_areadlvoffiremk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.clsfcd = clsfcd;
		this.suspfrdt = suspfrdt;
		this.susptodt = susptodt;
		this.bgnmappli = bgnmappli;
		this.endmappli = endmappli;
		this.spcfdlvdt = spcfdlvdt;
		this.medicd = medicd;
		this.medinm = medinm;
		this.qty = qty;
		this.remk = remk;
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_areacd = vaca_areacd;
		this.vaca_areanm = vaca_areanm;
		this.bocd = bocd;
		this.bonm = bonm;
		this.botel = botel;
		this.vaca_areabocd = vaca_areabocd;
		this.vaca_areabonm = vaca_areabonm;
		this.vaca_areabotel = vaca_areabotel;
		this.bocnfmyn = bocnfmyn;
		this.boremk = boremk;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
		this.vaca_areadlvtodt = vaca_areadlvtodt;
		this.vaca_areazip = vaca_areazip;
		this.vaca_areaaddr = vaca_areaaddr;
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
		this.vaca_areadlvoffiremk = vaca_areadlvoffiremk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
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

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setBgnmappli(String bgnmappli){
		this.bgnmappli = bgnmappli;
	}

	public void setEndmappli(String endmappli){
		this.endmappli = endmappli;
	}

	public void setSpcfdlvdt(String spcfdlvdt){
		this.spcfdlvdt = spcfdlvdt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(long qty){
		this.qty = qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBotel(String botel){
		this.botel = botel;
	}

	public void setVaca_areabocd(String vaca_areabocd){
		this.vaca_areabocd = vaca_areabocd;
	}

	public void setVaca_areabonm(String vaca_areabonm){
		this.vaca_areabonm = vaca_areabonm;
	}

	public void setVaca_areabotel(String vaca_areabotel){
		this.vaca_areabotel = vaca_areabotel;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoremk(String boremk){
		this.boremk = boremk;
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

	public void setVaca_areadlvfrdt(String vaca_areadlvfrdt){
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
	}

	public void setVaca_areadlvtodt(String vaca_areadlvtodt){
		this.vaca_areadlvtodt = vaca_areadlvtodt;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setVaca_areadlvofficnfmyn(String vaca_areadlvofficnfmyn){
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
	}

	public void setVaca_areadlvoffiremk(String vaca_areadlvoffiremk){
		this.vaca_areadlvoffiremk = vaca_areadlvoffiremk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
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

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getBgnmappli(){
		return this.bgnmappli;
	}

	public String getEndmappli(){
		return this.endmappli;
	}

	public String getSpcfdlvdt(){
		return this.spcfdlvdt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public long getQty(){
		return this.qty;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBotel(){
		return this.botel;
	}

	public String getVaca_areabocd(){
		return this.vaca_areabocd;
	}

	public String getVaca_areabonm(){
		return this.vaca_areabonm;
	}

	public String getVaca_areabotel(){
		return this.vaca_areabotel;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getBoremk(){
		return this.boremk;
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

	public String getVaca_areadlvfrdt(){
		return this.vaca_areadlvfrdt;
	}

	public String getVaca_areadlvtodt(){
		return this.vaca_areadlvtodt;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public String getVaca_areadlvofficnfmyn(){
		return this.vaca_areadlvofficnfmyn;
	}

	public String getVaca_areadlvoffiremk(){
		return this.vaca_areadlvoffiremk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(5));
		this.rdrnm = Util.checkString(cstmt.getString(6));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(7));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(8));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(9));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(10));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(11));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(12));
		this.clsfcd = Util.checkString(cstmt.getString(13));
		this.suspfrdt = Util.checkString(cstmt.getString(14));
		this.susptodt = Util.checkString(cstmt.getString(15));
		this.bgnmappli = Util.checkString(cstmt.getString(16));
		this.endmappli = Util.checkString(cstmt.getString(17));
		this.spcfdlvdt = Util.checkString(cstmt.getString(18));
		this.medicd = Util.checkString(cstmt.getString(19));
		this.medinm = Util.checkString(cstmt.getString(20));
		this.qty = cstmt.getLong(21);
		this.remk = Util.checkString(cstmt.getString(22));
		this.vaca_arearegncd = Util.checkString(cstmt.getString(23));
		this.vaca_areacd = Util.checkString(cstmt.getString(24));
		this.vaca_areanm = Util.checkString(cstmt.getString(25));
		this.bocd = Util.checkString(cstmt.getString(26));
		this.bonm = Util.checkString(cstmt.getString(27));
		this.botel = Util.checkString(cstmt.getString(28));
		this.vaca_areabocd = Util.checkString(cstmt.getString(29));
		this.vaca_areabonm = Util.checkString(cstmt.getString(30));
		this.vaca_areabotel = Util.checkString(cstmt.getString(31));
		this.bocnfmyn = Util.checkString(cstmt.getString(32));
		this.boremk = Util.checkString(cstmt.getString(33));
		this.dlvzip = Util.checkString(cstmt.getString(34));
		this.dlvaddr = Util.checkString(cstmt.getString(35));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(36));
		this.vaca_areadlvfrdt = Util.checkString(cstmt.getString(37));
		this.vaca_areadlvtodt = Util.checkString(cstmt.getString(38));
		this.vaca_areazip = Util.checkString(cstmt.getString(39));
		this.vaca_areaaddr = Util.checkString(cstmt.getString(40));
		this.vaca_areadtlsaddr = Util.checkString(cstmt.getString(41));
		this.vaca_areadlvofficnfmyn = Util.checkString(cstmt.getString(42));
		this.vaca_areadlvoffiremk = Util.checkString(cstmt.getString(43));
		ResultSet rset0 = (ResultSet) cstmt.getObject(44);
		while(rset0.next()){
			SL_S_VSCLSFCURRecord rec = new SL_S_VSCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.clsfcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(45);
		while(rset1.next()){
			SL_S_VSVACA_AREAREGNCURRecord rec = new SL_S_VSVACA_AREAREGNCURRecord();
			rec.vaca_arearegncd = Util.checkString(rset1.getString("vaca_arearegncd"));
			rec.vaca_arearegnnm = Util.checkString(rset1.getString("vaca_arearegnnm"));
			this.vaca_arearegncur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(46);
		while(rset2.next()){
			SL_S_VSVACA_AREACURRecord rec = new SL_S_VSVACA_AREACURRecord();
			rec.vaca_areacd = Util.checkString(rset2.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset2.getString("vaca_areanm"));
			this.vaca_areacur.add(rec);
		}
	}

	public String clsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_VSCLSFCURRecord rec = (SL_S_VSCLSFCURRecord)clsfcur.get(i);
			
			
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

	public String vaca_arearegncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_arearegncur.size();
		for(int i=0; i<size; i++){
			SL_S_VSVACA_AREAREGNCURRecord rec = (SL_S_VSVACA_AREAREGNCURRecord)vaca_arearegncur.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
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

	public String vaca_areacurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_areacur.size();
		for(int i=0; i<size; i++){
			SL_S_VSVACA_AREACURRecord rec = (SL_S_VSVACA_AREACURRecord)vaca_areacur.get(i);
			
			
			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;
			
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

	public String clsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_VSCLSFCURRecord rec = (SL_S_VSCLSFCURRecord)clsfcur.get(i);
			
			
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

	public String vaca_arearegncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_arearegncur.size();
		for(int i=0; i<size; i++){
			SL_S_VSVACA_AREAREGNCURRecord rec = (SL_S_VSVACA_AREAREGNCURRecord)vaca_arearegncur.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
			sb.append("<input name=\"");
			sb.append("vaca_arearegncd");
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

	public String vaca_areacurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_areacur.size();
		for(int i=0; i<size; i++){
			SL_S_VSVACA_AREACURRecord rec = (SL_S_VSVACA_AREACURRecord)vaca_areacur.get(i);
			
			
			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;
			
			sb.append("<input name=\"");
			sb.append("vaca_areacd");
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

	public String clsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_VSCLSFCURRecord rec = (SL_S_VSCLSFCURRecord)clsfcur.get(i);
			
			
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

	public String vaca_arearegncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_arearegncur.size();
		for(int i=0; i<size; i++){
			SL_S_VSVACA_AREAREGNCURRecord rec = (SL_S_VSVACA_AREAREGNCURRecord)vaca_arearegncur.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
			sb.append("<input name=\"");
			sb.append("vaca_arearegncd");
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

	public String vaca_areacurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_areacur.size();
		for(int i=0; i<size; i++){
			SL_S_VSVACA_AREACURRecord rec = (SL_S_VSVACA_AREACURRecord)vaca_areacur.get(i);
			
			
			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;
			
			sb.append("<input name=\"");
			sb.append("vaca_areacd");
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
	SL_S_VSDataSet ds = (SL_S_VSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.clsfcur.size(); i++){
		SL_S_VSCLSFCURRecord clsfcurRec = (SL_S_VSCLSFCURRecord)ds.clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.vaca_arearegncur.size(); i++){
		SL_S_VSVACA_AREAREGNCURRecord vaca_arearegncurRec = (SL_S_VSVACA_AREAREGNCURRecord)ds.vaca_arearegncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.vaca_areacur.size(); i++){
		SL_S_VSVACA_AREACURRecord vaca_areacurRec = (SL_S_VSVACA_AREACURRecord)ds.vaca_areacur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getClsfcd()%>
<%= ds.getSuspfrdt()%>
<%= ds.getSusptodt()%>
<%= ds.getBgnmappli()%>
<%= ds.getEndmappli()%>
<%= ds.getSpcfdlvdt()%>
<%= ds.getMedicd()%>
<%= ds.getMedinm()%>
<%= ds.getQty()%>
<%= ds.getRemk()%>
<%= ds.getVaca_arearegncd()%>
<%= ds.getVaca_areacd()%>
<%= ds.getVaca_areanm()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getBotel()%>
<%= ds.getVaca_areabocd()%>
<%= ds.getVaca_areabonm()%>
<%= ds.getVaca_areabotel()%>
<%= ds.getBocnfmyn()%>
<%= ds.getBoremk()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getVaca_areadlvfrdt()%>
<%= ds.getVaca_areadlvtodt()%>
<%= ds.getVaca_areazip()%>
<%= ds.getVaca_areaaddr()%>
<%= ds.getVaca_areadtlsaddr()%>
<%= ds.getVaca_areadlvofficnfmyn()%>
<%= ds.getVaca_areadlvoffiremk()%>
<%= ds.getClsfcur()%>
<%= ds.getVaca_arearegncur()%>
<%= ds.getVaca_areacur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= clsfcurRec.cicodeval%>
<%= clsfcurRec.cicdnm%>
<%= clsfcurRec.cicdynm%>
<%= clsfcurRec.ciymgbcd%>
<%= clsfcurRec.cicdgb%>
<%= vaca_arearegncurRec.vaca_arearegncd%>
<%= vaca_arearegncurRec.vaca_arearegnnm%>
<%= vaca_areacurRec.vaca_areacd%>
<%= vaca_areacurRec.vaca_areanm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 02 00:04:32 KST 2004 */