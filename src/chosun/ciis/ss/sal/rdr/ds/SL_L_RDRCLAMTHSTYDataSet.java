/***************************************************************************************************
* 파일명 : SL_L_RDRCLAMTHSTYDataSet.java
* 기능 : 독자정보관리(입금내역-목록)
* 작성일자 : 2003-12-27
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
 * 독자정보관리(입금내역-목록)
 *
 */


public class SL_L_RDRCLAMTHSTYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList brfcur = new ArrayList();
	public ArrayList rsltcur = new ArrayList();
	public ArrayList brfcur2 = new ArrayList();
	public String errcode;
	public String errmsg;
	public long un_clamt;
	public long un_clamt_mm;
	public String curryymm;
	public String prevyymm;
	public String nextyymm;

	public SL_L_RDRCLAMTHSTYDataSet(){}
	public SL_L_RDRCLAMTHSTYDataSet(String errcode, String errmsg, long un_clamt, long un_clamt_mm, String curryymm, String prevyymm, String nextyymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.un_clamt = un_clamt;
		this.un_clamt_mm = un_clamt_mm;
		this.curryymm = curryymm;
		this.prevyymm = prevyymm;
		this.nextyymm = nextyymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setUn_clamt(long un_clamt){
		this.un_clamt = un_clamt;
	}

	public void setUn_clamt_mm(long un_clamt_mm){
		this.un_clamt_mm = un_clamt_mm;
	}

	public void setCurryymm(String curryymm){
		this.curryymm = curryymm;
	}

	public void setPrevyymm(String prevyymm){
		this.prevyymm = prevyymm;
	}

	public void setNextyymm(String nextyymm){
		this.nextyymm = nextyymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getUn_clamt(){
		return this.un_clamt;
	}

	public long getUn_clamt_mm(){
		return this.un_clamt_mm;
	}

	public String getCurryymm(){
		return this.curryymm;
	}

	public String getPrevyymm(){
		return this.prevyymm;
	}

	public String getNextyymm(){
		return this.nextyymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.un_clamt = cstmt.getLong(7);
		this.un_clamt_mm = cstmt.getLong(8);
		this.curryymm = Util.checkString(cstmt.getString(9));
		this.prevyymm = Util.checkString(cstmt.getString(10));
		this.nextyymm = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SL_L_RDRCLAMTHSTYRSLTCURRecord rec = new SL_L_RDRCLAMTHSTYRSLTCURRecord();
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.clamamt = rset0.getInt("clamamt");
			rec.clamt = rset0.getInt("clamt");
			rec.rcpmclsfcd = Util.checkString(rset0.getString("rcpmclsfcd"));
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.rcpmclsfnm = Util.checkString(rset0.getString("rcpmclsfnm"));
			this.rsltcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			SL_L_RDRCLAMTHSTYBRFCURRecord rec = new SL_L_RDRCLAMTHSTYBRFCURRecord();
			rec.subsmappli = Util.checkString(rset1.getString("subsmappli"));
			rec.clamtynm = Util.checkString(rset1.getString("clamtynm"));
			this.brfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(14);
		while(rset2.next()){
			SL_L_RDRCLAMTHSTYBRFCUR2Record rec = new SL_L_RDRCLAMTHSTYBRFCUR2Record();
			rec.subsmappli = Util.checkString(rset2.getString("subsmappli"));
			rec.clamtynm = Util.checkString(rset2.getString("clamtynm"));
			this.brfcur2.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYRSLTCURRecord rec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)rsltcur.get(i);


			String code = rec.subsmappli;
			String name = rec.recpdt;

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

	public String brfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = brfcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYBRFCURRecord rec = (SL_L_RDRCLAMTHSTYBRFCURRecord)brfcur.get(i);


			String code = rec.subsmappli;
			String name = rec.clamtynm;

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

	public String brfcur2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = brfcur2.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYBRFCUR2Record rec = (SL_L_RDRCLAMTHSTYBRFCUR2Record)brfcur2.get(i);


			String code = rec.subsmappli;
			String name = rec.clamtynm;

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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYRSLTCURRecord rec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)rsltcur.get(i);


			String code = rec.subsmappli;
			String name = rec.recpdt;

			sb.append("<input name=\"");
			sb.append("subsmappli");
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

	public String brfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = brfcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYBRFCURRecord rec = (SL_L_RDRCLAMTHSTYBRFCURRecord)brfcur.get(i);


			String code = rec.subsmappli;
			String name = rec.clamtynm;

			sb.append("<input name=\"");
			sb.append("subsmappli");
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

	public String brfcur2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = brfcur2.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYBRFCUR2Record rec = (SL_L_RDRCLAMTHSTYBRFCUR2Record)brfcur2.get(i);


			String code = rec.subsmappli;
			String name = rec.clamtynm;

			sb.append("<input name=\"");
			sb.append("subsmappli");
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYRSLTCURRecord rec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)rsltcur.get(i);


			String code = rec.subsmappli;
			String name = rec.recpdt;

			sb.append("<input name=\"");
			sb.append("subsmappli");
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

	public String brfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = brfcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYBRFCURRecord rec = (SL_L_RDRCLAMTHSTYBRFCURRecord)brfcur.get(i);


			String code = rec.subsmappli;
			String name = rec.clamtynm;

			sb.append("<input name=\"");
			sb.append("subsmappli");
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

	public String brfcur2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = brfcur2.size();
		for(int i=0; i<size; i++){
			SL_L_RDRCLAMTHSTYBRFCUR2Record rec = (SL_L_RDRCLAMTHSTYBRFCUR2Record)brfcur2.get(i);


			String code = rec.subsmappli;
			String name = rec.clamtynm;

			sb.append("<input name=\"");
			sb.append("subsmappli");
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
	SL_L_RDRCLAMTHSTYDataSet ds = (SL_L_RDRCLAMTHSTYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_RDRCLAMTHSTYRSLTCURRecord rsltcurRec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.brfcur.size(); i++){
		SL_L_RDRCLAMTHSTYBRFCURRecord brfcurRec = (SL_L_RDRCLAMTHSTYBRFCURRecord)ds.brfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.brfcur2.size(); i++){
		SL_L_RDRCLAMTHSTYBRFCUR2Record brfcur2Rec = (SL_L_RDRCLAMTHSTYBRFCUR2Record)ds.brfcur2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getUn_clamt()%>
<%= ds.getUn_clamt_mm()%>
<%= ds.getCurryymm()%>
<%= ds.getPrevyymm()%>
<%= ds.getNextyymm()%>
<%= ds.getRsltcur()%>
<%= ds.getBrfcur()%>
<%= ds.getBrfcur2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.recpdt%>
<%= rsltcurRec.clamamt%>
<%= rsltcurRec.clamt%>
<%= rsltcurRec.rcpmclsfcd%>
<%= rsltcurRec.clamtmthdcd%>
<%= rsltcurRec.rcpmclsfnm%>
<%= brfcurRec.subsmappli%>
<%= brfcurRec.clamtynm%>
<%= brfcur2Rec.subsmappli%>
<%= brfcur2Rec.clamtynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 22 14:24:57 KST 2003 */