/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_STRUCT.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
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
**  투입율조사-현황등록
**/

public class SL_S_COMM_APT_STRUCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdrcur = new ArrayList();
	public ArrayList dlvstatcur = new ArrayList();
	public ArrayList apttypecur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String florcnt;
	public String flor_houscnt;
	public String hoscnt;
	public String pyong;
	public String mvindt;

	public SL_S_COMM_APT_STRUCTDataSet(){}
	public SL_S_COMM_APT_STRUCTDataSet(String errcode, String errmsg, String florcnt, String flor_houscnt, String hoscnt, String pyong, String mvindt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.florcnt = florcnt;
		this.flor_houscnt = flor_houscnt;
		this.hoscnt = hoscnt;
		this.pyong = pyong;
		this.mvindt = mvindt;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.florcnt = Util.checkString(cstmt.getString(8));
		this.flor_houscnt = Util.checkString(cstmt.getString(9));
		this.hoscnt = Util.checkString(cstmt.getString(10));
		this.pyong = Util.checkString(cstmt.getString(11));
		this.mvindt = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = new SL_S_COMM_APT_STRUCTAPTTYPECURRecord();
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.col = Util.checkString(rset0.getString("col"));
			rec.totalrowcol = Util.checkString(rset0.getString("totalrowcol"));
			this.apttypecur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SL_S_COMM_APT_STRUCTDLVSTATCURRecord rec = new SL_S_COMM_APT_STRUCTDLVSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.dlvstatcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			SL_S_COMM_APT_STRUCTCRDRCURRecord rec = new SL_S_COMM_APT_STRUCTCRDRCURRecord();
			rec.dlvdong = Util.checkString(rset2.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset2.getString("dlvser_no"));
			this.crdrcur.add(rec);
		}
	}

	public String apttypecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)apttypecur.get(i);


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
			SL_S_COMM_APT_STRUCTDLVSTATCURRecord rec = (SL_S_COMM_APT_STRUCTDLVSTATCURRecord)dlvstatcur.get(i);


            String code = rec.cicodeval;
            String name = rec.cicdnm;
//			String code = rec.ciymgbcd;
//			String name = rec.cicdgb;

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
			SL_S_COMM_APT_STRUCTCRDRCURRecord rec = (SL_S_COMM_APT_STRUCTCRDRCURRecord)crdrcur.get(i);


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

	public String apttypecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)apttypecur.get(i);


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
			SL_S_COMM_APT_STRUCTDLVSTATCURRecord rec = (SL_S_COMM_APT_STRUCTDLVSTATCURRecord)dlvstatcur.get(i);


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
			SL_S_COMM_APT_STRUCTCRDRCURRecord rec = (SL_S_COMM_APT_STRUCTCRDRCURRecord)crdrcur.get(i);


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

	public String apttypecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)apttypecur.get(i);


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
			SL_S_COMM_APT_STRUCTDLVSTATCURRecord rec = (SL_S_COMM_APT_STRUCTDLVSTATCURRecord)dlvstatcur.get(i);


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
			SL_S_COMM_APT_STRUCTCRDRCURRecord rec = (SL_S_COMM_APT_STRUCTCRDRCURRecord)crdrcur.get(i);


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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_COMM_APT_STRUCTDataSet ds = (SL_S_COMM_APT_STRUCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.apttypecur.size(); i++){
		SL_S_COMM_APT_STRUCTAPTTYPECURRecord apttypecurRec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)ds.apttypecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvstatcur.size(); i++){
		SL_S_COMM_APT_STRUCTDLVSTATCURRecord dlvstatcurRec = (SL_S_COMM_APT_STRUCTDLVSTATCURRecord)ds.dlvstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crdrcur.size(); i++){
		SL_S_COMM_APT_STRUCTCRDRCURRecord crdrcurRec = (SL_S_COMM_APT_STRUCTCRDRCURRecord)ds.crdrcur.get(i);%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 13 17:11:10 KST 2006 */
