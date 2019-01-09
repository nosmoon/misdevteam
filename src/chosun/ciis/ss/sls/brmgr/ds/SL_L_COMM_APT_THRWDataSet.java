/***************************************************************************************************
 * 파일명   : SP_SL_L_COMM_APT_THRW.java
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

public class SL_L_COMM_APT_THRWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList regtypecur2 = new ArrayList();
	public ArrayList regtypecur1 = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public ArrayList dlvstatcur = new ArrayList();
	public ArrayList thrwlistcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_COMM_APT_THRWDataSet(){}
	public SL_L_COMM_APT_THRWDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SL_L_COMM_APT_THRWTHRWLISTCURRecord rec = new SL_L_COMM_APT_THRWTHRWLISTCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.invsgdt = Util.checkString(rset0.getString("invsgdt"));
			rec.invsgno = Util.checkString(rset0.getString("invsgno"));
			rec.invsghhmm = Util.checkString(rset0.getString("invsghhmm"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.invsgpers = Util.checkString(rset0.getString("invsgpers"));
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			this.thrwlistcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SL_L_COMM_APT_THRWADDRCDCURRecord rec = new SL_L_COMM_APT_THRWADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset1.getString("addrcd"));
			rec.addrnm = Util.checkString(rset1.getString("addrnm"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			SL_L_COMM_APT_THRWDLVSTATCURRecord rec = new SL_L_COMM_APT_THRWDLVSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.dlvstatcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(13);
		while(rset3.next()){
			SL_L_COMM_APT_THRWREGTYPECUR1Record rec = new SL_L_COMM_APT_THRWREGTYPECUR1Record();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.regtypecur1.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(14);
		while(rset4.next()){
			SL_L_COMM_APT_THRWREGTYPECUR2Record rec = new SL_L_COMM_APT_THRWREGTYPECUR2Record();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.regtypecur2.add(rec);
		}
	}

	public String thrwlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwlistcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWTHRWLISTCURRecord rec = (SL_L_COMM_APT_THRWTHRWLISTCURRecord)thrwlistcur.get(i);


			String code = rec.bocd;
			String name = rec.invsgdt;

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
			SL_L_COMM_APT_THRWADDRCDCURRecord rec = (SL_L_COMM_APT_THRWADDRCDCURRecord)addrcdcur.get(i);


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

	public String dlvstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWDLVSTATCURRecord rec = (SL_L_COMM_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);


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

	public String regtypecur1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWREGTYPECUR1Record rec = (SL_L_COMM_APT_THRWREGTYPECUR1Record)regtypecur1.get(i);



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

	public String regtypecur2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWREGTYPECUR2Record rec = (SL_L_COMM_APT_THRWREGTYPECUR2Record)regtypecur2.get(i);



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

	public String thrwlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwlistcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWTHRWLISTCURRecord rec = (SL_L_COMM_APT_THRWTHRWLISTCURRecord)thrwlistcur.get(i);


			String code = rec.bocd;
			String name = rec.invsgdt;

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

	public String addrcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWADDRCDCURRecord rec = (SL_L_COMM_APT_THRWADDRCDCURRecord)addrcdcur.get(i);


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

	public String dlvstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWDLVSTATCURRecord rec = (SL_L_COMM_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);


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

	public String regtypecur1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWREGTYPECUR1Record rec = (SL_L_COMM_APT_THRWREGTYPECUR1Record)regtypecur1.get(i);


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

	public String regtypecur2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWREGTYPECUR2Record rec = (SL_L_COMM_APT_THRWREGTYPECUR2Record)regtypecur2.get(i);


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

	public String thrwlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwlistcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWTHRWLISTCURRecord rec = (SL_L_COMM_APT_THRWTHRWLISTCURRecord)thrwlistcur.get(i);


			String code = rec.bocd;
			String name = rec.invsgdt;

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

	public String addrcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWADDRCDCURRecord rec = (SL_L_COMM_APT_THRWADDRCDCURRecord)addrcdcur.get(i);


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

	public String dlvstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWDLVSTATCURRecord rec = (SL_L_COMM_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);


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

	public String regtypecur1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWREGTYPECUR1Record rec = (SL_L_COMM_APT_THRWREGTYPECUR1Record)regtypecur1.get(i);


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

	public String regtypecur2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_THRWREGTYPECUR2Record rec = (SL_L_COMM_APT_THRWREGTYPECUR2Record)regtypecur2.get(i);


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
	SL_L_COMM_APT_THRWDataSet ds = (SL_L_COMM_APT_THRWDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.thrwlistcur.size(); i++){
		SL_L_COMM_APT_THRWTHRWLISTCURRecord thrwlistcurRec = (SL_L_COMM_APT_THRWTHRWLISTCURRecord)ds.thrwlistcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_L_COMM_APT_THRWADDRCDCURRecord addrcdcurRec = (SL_L_COMM_APT_THRWADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvstatcur.size(); i++){
		SL_L_COMM_APT_THRWDLVSTATCURRecord dlvstatcurRec = (SL_L_COMM_APT_THRWDLVSTATCURRecord)ds.dlvstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.regtypecur1.size(); i++){
		SL_L_COMM_APT_THRWREGTYPECUR1Record regtypecur1Rec = (SL_L_COMM_APT_THRWREGTYPECUR1Record)ds.regtypecur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.regtypecur2.size(); i++){
		SL_L_COMM_APT_THRWREGTYPECUR2Record regtypecur2Rec = (SL_L_COMM_APT_THRWREGTYPECUR2Record)ds.regtypecur2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getThrwlistcur()%>
<%= ds.getAddrcdcur()%>
<%= ds.getDlvstatcur()%>
<%= ds.getRegtypecur1()%>
<%= ds.getRegtypecur2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= thrwlistcurRec.bocd%>
<%= thrwlistcurRec.invsgdt%>
<%= thrwlistcurRec.invsgno%>
<%= thrwlistcurRec.invsghhmm%>
<%= thrwlistcurRec.addrnm%>
<%= thrwlistcurRec.invsgpers%>
<%= thrwlistcurRec.addrcd%>
<%= thrwlistcurRec.dongno%>
<%= thrwlistcurRec.regdt%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= dlvstatcurRec.ciymgbcd%>
<%= dlvstatcurRec.cicdgb%>
<%= dlvstatcurRec.cicodeval%>
<%= dlvstatcurRec.cicdnm%>
<%= dlvstatcurRec.cicdynm%>
<%= regtypecur1Rec.ciymgbcd%>
<%= regtypecur1Rec.cicdgb%>
<%= regtypecur1Rec.cicodeval%>
<%= regtypecur1Rec.cicdnm%>
<%= regtypecur1Rec.cicdynm%>
<%= regtypecur2Rec.ciymgbcd%>
<%= regtypecur2Rec.cicdgb%>
<%= regtypecur2Rec.cicodeval%>
<%= regtypecur2Rec.cicdnm%>
<%= regtypecur2Rec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 13 13:34:21 KST 2006 */
