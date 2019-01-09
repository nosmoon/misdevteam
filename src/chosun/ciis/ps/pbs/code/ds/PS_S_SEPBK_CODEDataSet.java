/***************************************************************************************************
* 파일명 :
* 기능 :  단행본 코드관리
* 작성일자 : 2004-02-20
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 단행본-단행본 코드관리
 *
 */

public class PS_S_SEPBK_CODEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList contclascur = new ArrayList();
	public ArrayList absenceyncur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList issuclsf = new ArrayList();
	public ArrayList sericdcur = new ArrayList();
	public ArrayList typecur = new ArrayList();
	public ArrayList mediclsfcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_SEPBK_CODEDataSet(){}
	public PS_S_SEPBK_CODEDataSet(String errcode, String errmsg, String sysdate){
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
		this.sysdate = Util.checkString(cstmt.getString(4));
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_S_SEPBK_CODEMEDICDCURRecord rec = new PS_S_SEPBK_CODEMEDICDCURRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_S_SEPBK_CODEMEDICLSFCURRecord rec = new PS_S_SEPBK_CODEMEDICLSFCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.mediclsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PS_S_SEPBK_CODECONTCLASCURRecord rec = new PS_S_SEPBK_CODECONTCLASCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.contclascur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PS_S_SEPBK_CODETYPECURRecord rec = new PS_S_SEPBK_CODETYPECURRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.typecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PS_S_SEPBK_CODESERICDCURRecord rec = new PS_S_SEPBK_CODESERICDCURRecord();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.sericdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			PS_S_SEPBK_CODEABSENCEYNCURRecord rec = new PS_S_SEPBK_CODEABSENCEYNCURRecord();
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.absenceyncur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			PS_S_SEPBK_CODEISSUCLSFRecord rec = new PS_S_SEPBK_CODEISSUCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.issuclsf.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODEMEDICDCURRecord rec = (PS_S_SEPBK_CODEMEDICDCURRecord)medicdcur.get(i);


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

	public String mediclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mediclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODEMEDICLSFCURRecord rec = (PS_S_SEPBK_CODEMEDICLSFCURRecord)mediclsfcur.get(i);


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

	public String contclascurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = contclascur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODECONTCLASCURRecord rec = (PS_S_SEPBK_CODECONTCLASCURRecord)contclascur.get(i);


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

	public String typecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = typecur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODETYPECURRecord rec = (PS_S_SEPBK_CODETYPECURRecord)typecur.get(i);


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

	public String sericdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sericdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODESERICDCURRecord rec = (PS_S_SEPBK_CODESERICDCURRecord)sericdcur.get(i);


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

	public String absenceyncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = absenceyncur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODEABSENCEYNCURRecord rec = (PS_S_SEPBK_CODEABSENCEYNCURRecord)absenceyncur.get(i);


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

	public String issuclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = issuclsf.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODEISSUCLSFRecord rec = (PS_S_SEPBK_CODEISSUCLSFRecord)issuclsf.get(i);


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
			PS_S_SEPBK_CODEMEDICDCURRecord rec = (PS_S_SEPBK_CODEMEDICDCURRecord)medicdcur.get(i);


            String code = rec.cicodeval;
			String name = rec.cicdnm;

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
			PS_S_SEPBK_CODEMEDICLSFCURRecord rec = (PS_S_SEPBK_CODEMEDICLSFCURRecord)mediclsfcur.get(i);


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
			PS_S_SEPBK_CODECONTCLASCURRecord rec = (PS_S_SEPBK_CODECONTCLASCURRecord)contclascur.get(i);


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
			PS_S_SEPBK_CODETYPECURRecord rec = (PS_S_SEPBK_CODETYPECURRecord)typecur.get(i);


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
			PS_S_SEPBK_CODESERICDCURRecord rec = (PS_S_SEPBK_CODESERICDCURRecord)sericdcur.get(i);


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
			PS_S_SEPBK_CODEABSENCEYNCURRecord rec = (PS_S_SEPBK_CODEABSENCEYNCURRecord)absenceyncur.get(i);


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
			PS_S_SEPBK_CODEISSUCLSFRecord rec = (PS_S_SEPBK_CODEISSUCLSFRecord)issuclsf.get(i);


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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBK_CODEMEDICDCURRecord rec = (PS_S_SEPBK_CODEMEDICDCURRecord)medicdcur.get(i);


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
			PS_S_SEPBK_CODEMEDICLSFCURRecord rec = (PS_S_SEPBK_CODEMEDICLSFCURRecord)mediclsfcur.get(i);


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
			PS_S_SEPBK_CODECONTCLASCURRecord rec = (PS_S_SEPBK_CODECONTCLASCURRecord)contclascur.get(i);


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
			PS_S_SEPBK_CODETYPECURRecord rec = (PS_S_SEPBK_CODETYPECURRecord)typecur.get(i);


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
			PS_S_SEPBK_CODESERICDCURRecord rec = (PS_S_SEPBK_CODESERICDCURRecord)sericdcur.get(i);


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
			PS_S_SEPBK_CODEABSENCEYNCURRecord rec = (PS_S_SEPBK_CODEABSENCEYNCURRecord)absenceyncur.get(i);


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
			PS_S_SEPBK_CODEISSUCLSFRecord rec = (PS_S_SEPBK_CODEISSUCLSFRecord)issuclsf.get(i);


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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_SEPBK_CODEDataSet ds = (PS_S_SEPBK_CODEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_SEPBK_CODEMEDICDCURRecord medicdcurRec = (PS_S_SEPBK_CODEMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mediclsfcur.size(); i++){
		PS_S_SEPBK_CODEMEDICLSFCURRecord mediclsfcurRec = (PS_S_SEPBK_CODEMEDICLSFCURRecord)ds.mediclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.contclascur.size(); i++){
		PS_S_SEPBK_CODECONTCLASCURRecord contclascurRec = (PS_S_SEPBK_CODECONTCLASCURRecord)ds.contclascur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.typecur.size(); i++){
		PS_S_SEPBK_CODETYPECURRecord typecurRec = (PS_S_SEPBK_CODETYPECURRecord)ds.typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sericdcur.size(); i++){
		PS_S_SEPBK_CODESERICDCURRecord sericdcurRec = (PS_S_SEPBK_CODESERICDCURRecord)ds.sericdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.absenceyncur.size(); i++){
		PS_S_SEPBK_CODEABSENCEYNCURRecord absenceyncurRec = (PS_S_SEPBK_CODEABSENCEYNCURRecord)ds.absenceyncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.issuclsf.size(); i++){
		PS_S_SEPBK_CODEISSUCLSFRecord issuclsfRec = (PS_S_SEPBK_CODEISSUCLSFRecord)ds.issuclsf.get(i);%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 13:27:20 KST 2004 */