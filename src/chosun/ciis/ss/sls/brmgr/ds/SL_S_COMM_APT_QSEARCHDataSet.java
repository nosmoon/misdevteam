/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_QSEARCH.java
 * 기능     : 지국경영-투입율조사-아파트구조 바로가기
 * 작성일자 : 2006/06/21
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SL_S_COMM_APT_QSEARCH
**/

public class SL_S_COMM_APT_QSEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdrcur = new ArrayList();
	public ArrayList bolist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList dongcur = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public ArrayList dlvstatcur = new ArrayList();
	public ArrayList apttypecur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String florcnt;
	public String flor_houscnt;
	public String hoscnt;
	public String pyong;
	public String mvindt;
	public String deptcd;
	public String areacd;
	public String bocd;

	public SL_S_COMM_APT_QSEARCHDataSet(){}
	public SL_S_COMM_APT_QSEARCHDataSet(String errcode, String errmsg, String florcnt, String flor_houscnt, String hoscnt, String pyong, String mvindt, String deptcd, String areacd, String bocd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.florcnt = florcnt;
		this.flor_houscnt = flor_houscnt;
		this.hoscnt = hoscnt;
		this.pyong = pyong;
		this.mvindt = mvindt;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFlorcnt(String florcnt){
		this.florcnt = florcnt;
	}

	public void setFlor_houscnt(String flor_houscnt){
		this.flor_houscnt = flor_houscnt;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setMvindt(String mvindt){
		this.mvindt = mvindt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFlorcnt(){
		return this.florcnt;
	}

	public String getFlor_houscnt(){
		return this.flor_houscnt;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getMvindt(){
		return this.mvindt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.florcnt = Util.checkString(cstmt.getString(4));
		this.flor_houscnt = Util.checkString(cstmt.getString(5));
		this.hoscnt = Util.checkString(cstmt.getString(6));
		this.pyong = Util.checkString(cstmt.getString(7));
		this.mvindt = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SL_S_COMM_APT_QSEARCHAPTTYPECURRecord rec = new SL_S_COMM_APT_QSEARCHAPTTYPECURRecord();
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.col = Util.checkString(rset0.getString("col"));
			rec.totalrowcol = Util.checkString(rset0.getString("totalrowcol"));
			this.apttypecur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			SL_S_COMM_APT_QSEARCHDLVSTATCURRecord rec = new SL_S_COMM_APT_QSEARCHDLVSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.dlvstatcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			SL_S_COMM_APT_QSEARCHCRDRCURRecord rec = new SL_S_COMM_APT_QSEARCHCRDRCURRecord();
			rec.dlvdong = Util.checkString(rset2.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset2.getString("dlvser_no"));
			this.crdrcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			SL_S_COMM_APT_QSEARCHADDRCDCURRecord rec = new SL_S_COMM_APT_QSEARCHADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset3.getString("addrcd"));
			rec.addrnm = Util.checkString(rset3.getString("addrnm"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(13);
		while(rset4.next()){
			SL_S_COMM_APT_QSEARCHDONGCURRecord rec = new SL_S_COMM_APT_QSEARCHDONGCURRecord();
			rec.addrcd = Util.checkString(rset4.getString("addrcd"));
			rec.dongno = Util.checkString(rset4.getString("dongno"));
			this.dongcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(14);
		while(rset5.next()){
			SL_S_COMM_APT_QSEARCHAREALISTRecord rec = new SL_S_COMM_APT_QSEARCHAREALISTRecord();
			rec.areacd = Util.checkString(rset5.getString("areacd"));
			rec.areanm = Util.checkString(rset5.getString("areanm"));
			this.arealist.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(15);
		while(rset6.next()){
			SL_S_COMM_APT_QSEARCHBOLISTRecord rec = new SL_S_COMM_APT_QSEARCHBOLISTRecord();
			rec.bocd = Util.checkString(rset6.getString("bocd"));
			rec.bonm = Util.checkString(rset6.getString("bonm"));
			this.bolist.add(rec);
		}
		this.deptcd = Util.checkString(cstmt.getString(16));
		this.areacd = Util.checkString(cstmt.getString(17));
		this.bocd = Util.checkString(cstmt.getString(18));
	}

	public String apttypecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHAPTTYPECURRecord rec = (SL_S_COMM_APT_QSEARCHAPTTYPECURRecord)apttypecur.get(i);
			
			
			String code = rec.arow;
			String name = rec.col;
			
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

	public String dlvstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHDLVSTATCURRecord rec = (SL_S_COMM_APT_QSEARCHDLVSTATCURRecord)dlvstatcur.get(i);
			
			
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

	public String crdrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crdrcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHCRDRCURRecord rec = (SL_S_COMM_APT_QSEARCHCRDRCURRecord)crdrcur.get(i);
			
			
			String code = rec.dlvdong;
			String name = rec.dlvser_no;
			
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
			SL_S_COMM_APT_QSEARCHADDRCDCURRecord rec = (SL_S_COMM_APT_QSEARCHADDRCDCURRecord)addrcdcur.get(i);
			
			
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

	public String dongcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHDONGCURRecord rec = (SL_S_COMM_APT_QSEARCHDONGCURRecord)dongcur.get(i);
			
			
//			String code = rec.addrcd;
			String code = rec.dongno;
			String name = rec.dongno;
			
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
			SL_S_COMM_APT_QSEARCHAREALISTRecord rec = (SL_S_COMM_APT_QSEARCHAREALISTRecord)arealist.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
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

	public String bolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bolist.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHBOLISTRecord rec = (SL_S_COMM_APT_QSEARCHBOLISTRecord)bolist.get(i);
			
			
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

	public String apttypecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHAPTTYPECURRecord rec = (SL_S_COMM_APT_QSEARCHAPTTYPECURRecord)apttypecur.get(i);
			
			
			String code = rec.arow;
			String name = rec.col;
			
			sb.append("<input name=\"");
			sb.append("arow");
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

	public String dlvstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHDLVSTATCURRecord rec = (SL_S_COMM_APT_QSEARCHDLVSTATCURRecord)dlvstatcur.get(i);
			
			
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

	public String crdrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crdrcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHCRDRCURRecord rec = (SL_S_COMM_APT_QSEARCHCRDRCURRecord)crdrcur.get(i);
			
			
			String code = rec.dlvdong;
			String name = rec.dlvser_no;
			
			sb.append("<input name=\"");
			sb.append("dlvdong");
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
			SL_S_COMM_APT_QSEARCHADDRCDCURRecord rec = (SL_S_COMM_APT_QSEARCHADDRCDCURRecord)addrcdcur.get(i);
			
			
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

	public String dongcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHDONGCURRecord rec = (SL_S_COMM_APT_QSEARCHDONGCURRecord)dongcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.dongno;
			
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

	public String arealistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHAREALISTRecord rec = (SL_S_COMM_APT_QSEARCHAREALISTRecord)arealist.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String bolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bolist.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHBOLISTRecord rec = (SL_S_COMM_APT_QSEARCHBOLISTRecord)bolist.get(i);
			
			
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

	public String apttypecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHAPTTYPECURRecord rec = (SL_S_COMM_APT_QSEARCHAPTTYPECURRecord)apttypecur.get(i);
			
			
			String code = rec.arow;
			String name = rec.col;
			
			sb.append("<input name=\"");
			sb.append("arow");
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

	public String dlvstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHDLVSTATCURRecord rec = (SL_S_COMM_APT_QSEARCHDLVSTATCURRecord)dlvstatcur.get(i);
			
			
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

	public String crdrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crdrcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHCRDRCURRecord rec = (SL_S_COMM_APT_QSEARCHCRDRCURRecord)crdrcur.get(i);
			
			
			String code = rec.dlvdong;
			String name = rec.dlvser_no;
			
			sb.append("<input name=\"");
			sb.append("dlvdong");
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
			SL_S_COMM_APT_QSEARCHADDRCDCURRecord rec = (SL_S_COMM_APT_QSEARCHADDRCDCURRecord)addrcdcur.get(i);
			
			
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

	public String dongcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHDONGCURRecord rec = (SL_S_COMM_APT_QSEARCHDONGCURRecord)dongcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.dongno;
			
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

	public String arealistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHAREALISTRecord rec = (SL_S_COMM_APT_QSEARCHAREALISTRecord)arealist.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String bolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bolist.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_QSEARCHBOLISTRecord rec = (SL_S_COMM_APT_QSEARCHBOLISTRecord)bolist.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_COMM_APT_QSEARCHDataSet ds = (SL_S_COMM_APT_QSEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.apttypecur.size(); i++){
		SL_S_COMM_APT_QSEARCHAPTTYPECURRecord apttypecurRec = (SL_S_COMM_APT_QSEARCHAPTTYPECURRecord)ds.apttypecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvstatcur.size(); i++){
		SL_S_COMM_APT_QSEARCHDLVSTATCURRecord dlvstatcurRec = (SL_S_COMM_APT_QSEARCHDLVSTATCURRecord)ds.dlvstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crdrcur.size(); i++){
		SL_S_COMM_APT_QSEARCHCRDRCURRecord crdrcurRec = (SL_S_COMM_APT_QSEARCHCRDRCURRecord)ds.crdrcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_S_COMM_APT_QSEARCHADDRCDCURRecord addrcdcurRec = (SL_S_COMM_APT_QSEARCHADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dongcur.size(); i++){
		SL_S_COMM_APT_QSEARCHDONGCURRecord dongcurRec = (SL_S_COMM_APT_QSEARCHDONGCURRecord)ds.dongcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SL_S_COMM_APT_QSEARCHAREALISTRecord arealistRec = (SL_S_COMM_APT_QSEARCHAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bolist.size(); i++){
		SL_S_COMM_APT_QSEARCHBOLISTRecord bolistRec = (SL_S_COMM_APT_QSEARCHBOLISTRecord)ds.bolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFlorcnt()%>
<%= ds.getFlor_houscnt()%>
<%= ds.getHoscnt()%>
<%= ds.getPyong()%>
<%= ds.getMvindt()%>
<%= ds.getApttypecur()%>
<%= ds.getDlvstatcur()%>
<%= ds.getCrdrcur()%>
<%= ds.getAddrcdcur()%>
<%= ds.getDongcur()%>
<%= ds.getArealist()%>
<%= ds.getBolist()%>
<%= ds.getDeptcd()%>
<%= ds.getAreacd()%>
<%= ds.getBocd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= apttypecurRec.arow%>
<%= apttypecurRec.col%>
<%= apttypecurRec.totalrowcol%>
<%= dlvstatcurRec.ciymgbcd%>
<%= dlvstatcurRec.cicdgb%>
<%= dlvstatcurRec.cicodeval%>
<%= dlvstatcurRec.cicdnm%>
<%= dlvstatcurRec.cicdynm%>
<%= crdrcurRec.dlvdong%>
<%= crdrcurRec.dlvser_no%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= dongcurRec.addrcd%>
<%= dongcurRec.dongno%>
<%= arealistRec.areacd%>
<%= arealistRec.areanm%>
<%= bolistRec.bocd%>
<%= bolistRec.bonm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 22 11:08:44 KST 2006 */