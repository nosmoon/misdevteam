/***************************************************************************************************
* 파일명 : SL_L_RDR_EXTN_OUTER_INITDataSet.java
* 기능 : 외부확장등록관리(초기화면)
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
 * 외부확장등록관리(초기화면)
 *
 */

public class SL_L_RDR_EXTN_OUTER_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList subscnfmstatcdcur = new ArrayList();
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList extnblngcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_RDR_EXTN_OUTER_INITDataSet(){}
	public SL_L_RDR_EXTN_OUTER_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord rec = new SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord rec = new SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.extnblngcdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord rec = new SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.subscnfmstatcdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord rec = new SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord rec = new SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord)medicdcur.get(i);


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

	public String extnblngcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnblngcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord)extnblngcdcur.get(i);


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

	public String subscnfmstatcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = subscnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord)subscnfmstatcdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord)resitypecdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord)medicdcur.get(i);


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

	public String extnblngcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnblngcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord)extnblngcdcur.get(i);


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

	public String subscnfmstatcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = subscnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord)subscnfmstatcdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord)resitypecdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord)medicdcur.get(i);


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

	public String extnblngcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnblngcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord)extnblngcdcur.get(i);


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

	public String subscnfmstatcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = subscnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord)subscnfmstatcdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);


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
			SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord rec = (SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord)resitypecdcur.get(i);


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
	SL_L_RDR_EXTN_OUTER_INITDataSet ds = (SL_L_RDR_EXTN_OUTER_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord medicdcurRec = (SL_L_RDR_EXTN_OUTER_INITMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.extnblngcdcur.size(); i++){
		SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord extnblngcdcurRec = (SL_L_RDR_EXTN_OUTER_INITEXTNBLNGCDCURRecord)ds.extnblngcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.subscnfmstatcdcur.size(); i++){
		SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord subscnfmstatcdcurRec = (SL_L_RDR_EXTN_OUTER_INITSUBSCNFMSTATCDCURRecord)ds.subscnfmstatcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord resiclsfcdcurRec = (SL_L_RDR_EXTN_OUTER_INITRESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord resitypecdcurRec = (SL_L_RDR_EXTN_OUTER_INITRESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicdcur()%>
<%= ds.getExtnblngcdcur()%>
<%= ds.getSubscnfmstatcdcur()%>
<%= ds.getResiclsfcdcur()%>
<%= ds.getResitypecdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= extnblngcdcurRec.cicodeval%>
<%= extnblngcdcurRec.cicdnm%>
<%= extnblngcdcurRec.cicdynm%>
<%= extnblngcdcurRec.ciymgbcd%>
<%= extnblngcdcurRec.cicdgb%>
<%= subscnfmstatcdcurRec.cicodeval%>
<%= subscnfmstatcdcurRec.cicdnm%>
<%= subscnfmstatcdcurRec.cicdynm%>
<%= subscnfmstatcdcurRec.ciymgbcd%>
<%= subscnfmstatcdcurRec.cicdgb%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 08 15:31:01 KST 2004 */