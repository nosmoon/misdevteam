/***************************************************************************************************
 * 파일명   : PS_S_SEPBK_INFODM.java
 * 기능     : 코드-단행본 등록 상세내역
 * 작성일자 : 2004-09-21
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드-단행본 등록 상세내역
 */

public class PS_S_SEPBK_INFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList contclascur = new ArrayList();
	public ArrayList sepbkinfo = new ArrayList();
	public ArrayList absenceyncur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList issuclsf = new ArrayList();
	public ArrayList sericdcur = new ArrayList();
	public ArrayList typecur = new ArrayList();
	public ArrayList mediclsfcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_SEPBK_INFODataSet(){}
	public PS_S_SEPBK_INFODataSet(String errcode, String errmsg, String sysdate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSysdate(String sysdate){
		this.sysdate = sysdate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sysdate = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PS_S_SEPBK_INFOMEDICDCURRecord rec = new PS_S_SEPBK_INFOMEDICDCURRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PS_S_SEPBK_INFOMEDICLSFCURRecord rec = new PS_S_SEPBK_INFOMEDICLSFCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.mediclsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PS_S_SEPBK_INFOCONTCLASCURRecord rec = new PS_S_SEPBK_INFOCONTCLASCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.contclascur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			PS_S_SEPBK_INFOTYPECURRecord rec = new PS_S_SEPBK_INFOTYPECURRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.typecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			PS_S_SEPBK_INFOSERICDCURRecord rec = new PS_S_SEPBK_INFOSERICDCURRecord();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.sericdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			PS_S_SEPBK_INFOABSENCEYNCURRecord rec = new PS_S_SEPBK_INFOABSENCEYNCURRecord();
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.absenceyncur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			PS_S_SEPBK_INFOISSUCLSFRecord rec = new PS_S_SEPBK_INFOISSUCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.issuclsf.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(13);
		while(rset7.next()){
			PS_S_SEPBK_INFOSEPBKINFORecord rec = new PS_S_SEPBK_INFOSEPBKINFORecord();
			rec.sep_bookcd = Util.checkString(rset7.getString("sep_bookcd"));
			rec.medicd = Util.checkString(rset7.getString("medicd"));
			rec.mediser_no = Util.checkString(rset7.getString("mediser_no"));
			rec.medi_clsf = Util.checkString(rset7.getString("medi_clsf"));
			rec.sep_bookcdnm = Util.checkString(rset7.getString("sep_bookcdnm"));
			rec.issuclsf = Util.checkString(rset7.getString("issuclsf"));
			rec.basiyymm = Util.checkString(rset7.getString("basiyymm"));
			rec.uprc = rset7.getInt("uprc");
			rec.subsuprc = rset7.getInt("subsuprc");
			rec.dcrate = rset7.getInt("dcrate");
			rec.contclascd = Util.checkString(rset7.getString("contclascd"));
			rec.author = Util.checkString(rset7.getString("author"));
			rec.type = Util.checkString(rset7.getString("type"));
			rec.std = Util.checkString(rset7.getString("std"));
			rec.page = rset7.getInt("page");
			rec.covermodl = Util.checkString(rset7.getString("covermodl"));
			rec.reg_dt = Util.checkString(rset7.getString("reg_dt"));
			rec.extdtms = rset7.getInt("extdtms");
			rec.absenceyn = Util.checkString(rset7.getString("absenceyn"));
			rec.absencedt = Util.checkString(rset7.getString("absencedt"));
			rec.absenceprocdt = Util.checkString(rset7.getString("absenceprocdt"));
			rec.cmpycd = Util.checkString(rset7.getString("cmpycd"));
			rec.bundunit = rset7.getInt("bundunit");
			rec.unitmidlqunt = rset7.getInt("unitmidlqunt");
			rec.pjbasimidlqunt = rset7.getInt("pjbasimidlqunt");
			rec.sericd = Util.checkString(rset7.getString("sericd"));
			rec.medinm = Util.checkString(rset7.getString("medinm"));
			rec.issuclsfnm = Util.checkString(rset7.getString("issuclsfnm"));
			rec.memo = Util.checkString(rset7.getString("memo"));
			rec.endbasiyymm = Util.checkString(rset7.getString("endbasiyymm"));
			this.sepbkinfo.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOMEDICDCURRecord rec = (PS_S_SEPBK_INFOMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String mediclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mediclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOMEDICLSFCURRecord rec = (PS_S_SEPBK_INFOMEDICLSFCURRecord)mediclsfcur.get(i);
			
			
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

	public String contclascurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = contclascur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOCONTCLASCURRecord rec = (PS_S_SEPBK_INFOCONTCLASCURRecord)contclascur.get(i);
			
			
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

	public String typecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = typecur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOTYPECURRecord rec = (PS_S_SEPBK_INFOTYPECURRecord)typecur.get(i);
			
			
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

	public String sericdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sericdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOSERICDCURRecord rec = (PS_S_SEPBK_INFOSERICDCURRecord)sericdcur.get(i);
			
			
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

	public String absenceyncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = absenceyncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOABSENCEYNCURRecord rec = (PS_S_SEPBK_INFOABSENCEYNCURRecord)absenceyncur.get(i);
			
			
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

	public String issuclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = issuclsf.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOISSUCLSFRecord rec = (PS_S_SEPBK_INFOISSUCLSFRecord)issuclsf.get(i);
			
			
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

	public String sepbkinfoOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sepbkinfo.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOSEPBKINFORecord rec = (PS_S_SEPBK_INFOSEPBKINFORecord)sepbkinfo.get(i);
			
			
			String code = rec.sep_bookcd;
			String name = rec.medicd;
			
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
			PS_S_SEPBK_INFOMEDICDCURRecord rec = (PS_S_SEPBK_INFOMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String mediclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mediclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOMEDICLSFCURRecord rec = (PS_S_SEPBK_INFOMEDICLSFCURRecord)mediclsfcur.get(i);
			
			
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

	public String contclascurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = contclascur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOCONTCLASCURRecord rec = (PS_S_SEPBK_INFOCONTCLASCURRecord)contclascur.get(i);
			
			
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

	public String typecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = typecur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOTYPECURRecord rec = (PS_S_SEPBK_INFOTYPECURRecord)typecur.get(i);
			
			
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

	public String sericdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sericdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOSERICDCURRecord rec = (PS_S_SEPBK_INFOSERICDCURRecord)sericdcur.get(i);
			
			
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

	public String absenceyncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = absenceyncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOABSENCEYNCURRecord rec = (PS_S_SEPBK_INFOABSENCEYNCURRecord)absenceyncur.get(i);
			
			
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

	public String issuclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = issuclsf.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOISSUCLSFRecord rec = (PS_S_SEPBK_INFOISSUCLSFRecord)issuclsf.get(i);
			
			
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

	public String sepbkinfoChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sepbkinfo.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOSEPBKINFORecord rec = (PS_S_SEPBK_INFOSEPBKINFORecord)sepbkinfo.get(i);
			
			
			String code = rec.sep_bookcd;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("sep_bookcd");
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
			PS_S_SEPBK_INFOMEDICDCURRecord rec = (PS_S_SEPBK_INFOMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String mediclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mediclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOMEDICLSFCURRecord rec = (PS_S_SEPBK_INFOMEDICLSFCURRecord)mediclsfcur.get(i);
			
			
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

	public String contclascurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = contclascur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOCONTCLASCURRecord rec = (PS_S_SEPBK_INFOCONTCLASCURRecord)contclascur.get(i);
			
			
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

	public String typecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = typecur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOTYPECURRecord rec = (PS_S_SEPBK_INFOTYPECURRecord)typecur.get(i);
			
			
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

	public String sericdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sericdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOSERICDCURRecord rec = (PS_S_SEPBK_INFOSERICDCURRecord)sericdcur.get(i);
			
			
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

	public String absenceyncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = absenceyncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOABSENCEYNCURRecord rec = (PS_S_SEPBK_INFOABSENCEYNCURRecord)absenceyncur.get(i);
			
			
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

	public String issuclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = issuclsf.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOISSUCLSFRecord rec = (PS_S_SEPBK_INFOISSUCLSFRecord)issuclsf.get(i);
			
			
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

	public String sepbkinfoRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sepbkinfo.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_INFOSEPBKINFORecord rec = (PS_S_SEPBK_INFOSEPBKINFORecord)sepbkinfo.get(i);
			
			
			String code = rec.sep_bookcd;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("sep_bookcd");
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
	PS_S_SEPBK_INFODataSet ds = (PS_S_SEPBK_INFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_SEPBK_INFOMEDICDCURRecord medicdcurRec = (PS_S_SEPBK_INFOMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mediclsfcur.size(); i++){
		PS_S_SEPBK_INFOMEDICLSFCURRecord mediclsfcurRec = (PS_S_SEPBK_INFOMEDICLSFCURRecord)ds.mediclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.contclascur.size(); i++){
		PS_S_SEPBK_INFOCONTCLASCURRecord contclascurRec = (PS_S_SEPBK_INFOCONTCLASCURRecord)ds.contclascur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.typecur.size(); i++){
		PS_S_SEPBK_INFOTYPECURRecord typecurRec = (PS_S_SEPBK_INFOTYPECURRecord)ds.typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sericdcur.size(); i++){
		PS_S_SEPBK_INFOSERICDCURRecord sericdcurRec = (PS_S_SEPBK_INFOSERICDCURRecord)ds.sericdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.absenceyncur.size(); i++){
		PS_S_SEPBK_INFOABSENCEYNCURRecord absenceyncurRec = (PS_S_SEPBK_INFOABSENCEYNCURRecord)ds.absenceyncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.issuclsf.size(); i++){
		PS_S_SEPBK_INFOISSUCLSFRecord issuclsfRec = (PS_S_SEPBK_INFOISSUCLSFRecord)ds.issuclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sepbkinfo.size(); i++){
		PS_S_SEPBK_INFOSEPBKINFORecord sepbkinfoRec = (PS_S_SEPBK_INFOSEPBKINFORecord)ds.sepbkinfo.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getMedicdcur()%>
<%= ds.getMediclsfcur()%>
<%= ds.getContclascur()%>
<%= ds.getTypecur()%>
<%= ds.getSericdcur()%>
<%= ds.getAbsenceyncur()%>
<%= ds.getIssuclsf()%>
<%= ds.getSepbkinfo()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= mediclsfcurRec.ciymgbcd%>
<%= mediclsfcurRec.cicdgb%>
<%= mediclsfcurRec.cicodeval%>
<%= mediclsfcurRec.cicdnm%>
<%= mediclsfcurRec.cicdynm%>
<%= contclascurRec.ciymgbcd%>
<%= contclascurRec.cicdgb%>
<%= contclascurRec.cicodeval%>
<%= contclascurRec.cicdnm%>
<%= contclascurRec.cicdynm%>
<%= typecurRec.ciymgbcd%>
<%= typecurRec.cicdgb%>
<%= typecurRec.cicodeval%>
<%= typecurRec.cicdnm%>
<%= typecurRec.cicdynm%>
<%= sericdcurRec.ciymgbcd%>
<%= sericdcurRec.cicdgb%>
<%= sericdcurRec.cicodeval%>
<%= sericdcurRec.cicdnm%>
<%= sericdcurRec.cicdynm%>
<%= absenceyncurRec.ciymgbcd%>
<%= absenceyncurRec.cicdgb%>
<%= absenceyncurRec.cicodeval%>
<%= absenceyncurRec.cicdnm%>
<%= absenceyncurRec.cicdynm%>
<%= issuclsfRec.ciymgbcd%>
<%= issuclsfRec.cicdgb%>
<%= issuclsfRec.cicodeval%>
<%= issuclsfRec.cicdnm%>
<%= issuclsfRec.cicdynm%>
<%= sepbkinfoRec.sep_bookcd%>
<%= sepbkinfoRec.medicd%>
<%= sepbkinfoRec.mediser_no%>
<%= sepbkinfoRec.medi_clsf%>
<%= sepbkinfoRec.sep_bookcdnm%>
<%= sepbkinfoRec.issuclsf%>
<%= sepbkinfoRec.basiyymm%>
<%= sepbkinfoRec.uprc%>
<%= sepbkinfoRec.subsuprc%>
<%= sepbkinfoRec.dcrate%>
<%= sepbkinfoRec.contclascd%>
<%= sepbkinfoRec.author%>
<%= sepbkinfoRec.type%>
<%= sepbkinfoRec.std%>
<%= sepbkinfoRec.page%>
<%= sepbkinfoRec.covermodl%>
<%= sepbkinfoRec.reg_dt%>
<%= sepbkinfoRec.extdtms%>
<%= sepbkinfoRec.absenceyn%>
<%= sepbkinfoRec.absencedt%>
<%= sepbkinfoRec.absenceprocdt%>
<%= sepbkinfoRec.cmpycd%>
<%= sepbkinfoRec.bundunit%>
<%= sepbkinfoRec.unitmidlqunt%>
<%= sepbkinfoRec.pjbasimidlqunt%>
<%= sepbkinfoRec.sericd%>
<%= sepbkinfoRec.medinm%>
<%= sepbkinfoRec.issuclsfnm%>
<%= sepbkinfoRec.memo%>
<%= sepbkinfoRec.endbasiyymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 31 14:22:14 KST 2005 */