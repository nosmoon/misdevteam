/***************************************************************************************************
 * 파일명   : SS_L_MAIN_INITDataSet.java
 * 기능     : 판매국메인-초기화면
 * 작성일자 : 2007/04/12
 * 작성자   : 이혁
 **************************************************************************************************/



package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
**  SP_SS_L_MAIN_INIT
**/

public class SS_L_MAIN_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mainlist = new ArrayList();
	public ArrayList dsctlist = new ArrayList();
	public ArrayList extnmovmlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MAIN_INITDataSet(){}
	public SS_L_MAIN_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_MAIN_INITMAINLISTRecord rec = new SS_L_MAIN_INITMAINLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.notifrdt = Util.checkString(rset0.getString("notifrdt"));
			rec.notitodt = Util.checkString(rset0.getString("notitodt"));
			rec.regdt = rset0.getTimestamp("regdt");
			rec.upddt = rset0.getTimestamp("upddt");
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.brwscnt = rset0.getInt("brwscnt");
			rec.recomcnt = rset0.getInt("recomcnt");
			rec.dwloadcnt = rset0.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.rmsgdept = Util.checkString(rset0.getString("rmsgdept"));
			rec.rmsgarea = Util.checkString(rset0.getString("rmsgarea"));
			rec.rmsgexttcd = Util.checkString(rset0.getString("rmsgexttcd"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.filesize = Util.checkString(rset0.getString("filesize"));
			this.mainlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SS_L_MAIN_INITEXTNMOVMLISTRecord rec = new SS_L_MAIN_INITEXTNMOVMLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.nm = Util.checkString(rset1.getString("nm"));
			rec.ycnt10 = rset1.getInt("ycnt10");
			rec.ncnt10 = rset1.getInt("ncnt10");
			rec.ycnt20 = rset1.getInt("ycnt20");
			rec.ncnt20 = rset1.getInt("ncnt20");
			rec.ycnt30 = rset1.getInt("ycnt30");
			rec.ncnt30 = rset1.getInt("ncnt30");
			rec.ycnt40 = rset1.getInt("ycnt40");
			rec.ncnt40 = rset1.getInt("ncnt40");
			rec.ycnt50 = rset1.getInt("ycnt50");
			rec.ncnt50 = rset1.getInt("ncnt50");
			rec.ycnt60 = rset1.getInt("ycnt60");
			rec.ncnt60 = rset1.getInt("ncnt60");
			rec.ycnt70 = rset1.getInt("ycnt70");
			rec.ncnt70 = rset1.getInt("ncnt70");
			rec.ycnt80 = rset1.getInt("ycnt80");
			rec.ncnt80 = rset1.getInt("ncnt80");
			this.extnmovmlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			SS_L_MAIN_INITDSCTLISTRecord rec = new SS_L_MAIN_INITDSCTLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.nm = Util.checkString(rset2.getString("nm"));
			rec.reg = rset2.getInt("reg");
			rec.cnfm = rset2.getInt("cnfm");
			rec.dscttypecd10 = rset2.getInt("dscttypecd10");
			rec.dscttypecd10cnfm = rset2.getInt("dscttypecd10cnfm");
			rec.dscttypecd20 = rset2.getInt("dscttypecd20");
			rec.dscttypecd20cnfm = rset2.getInt("dscttypecd20cnfm");
			rec.dscttypecd30 = rset2.getInt("dscttypecd30");
			rec.dscttypecd30cnfm = rset2.getInt("dscttypecd30cnfm");
			rec.dscttypecd40 = rset2.getInt("dscttypecd40");
			rec.dscttypecd40cnfm = rset2.getInt("dscttypecd40cnfm");
			rec.dscttypecd45 = rset2.getInt("dscttypecd45");
			rec.dscttypecd45cnfm = rset2.getInt("dscttypecd45cnfm");
			this.dsctlist.add(rec);
		}
	}

	public String mainlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mainlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITMAINLISTRecord rec = (SS_L_MAIN_INITMAINLISTRecord)mainlist.get(i);


			String code = rec.seq + "";
			String name = rec.clsf;

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

	public String extnmovmlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnmovmlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITEXTNMOVMLISTRecord rec = (SS_L_MAIN_INITEXTNMOVMLISTRecord)extnmovmlist.get(i);


			String code = rec.cd;
			String name = rec.nm;

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

	public String dsctlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITDSCTLISTRecord rec = (SS_L_MAIN_INITDSCTLISTRecord)dsctlist.get(i);


			String code = rec.cd;
			String name = rec.nm;

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

	public String mainlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mainlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITMAINLISTRecord rec = (SS_L_MAIN_INITMAINLISTRecord)mainlist.get(i);


			String code = rec.seq + "";
			String name = rec.clsf;

			sb.append("<input name=\"");
			sb.append("seq");
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

	public String extnmovmlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnmovmlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITEXTNMOVMLISTRecord rec = (SS_L_MAIN_INITEXTNMOVMLISTRecord)extnmovmlist.get(i);


			String code = rec.cd;
			String name = rec.nm;

			sb.append("<input name=\"");
			sb.append("cd");
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

	public String dsctlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITDSCTLISTRecord rec = (SS_L_MAIN_INITDSCTLISTRecord)dsctlist.get(i);


			String code = rec.cd;
			String name = rec.nm;

			sb.append("<input name=\"");
			sb.append("cd");
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

	public String mainlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mainlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITMAINLISTRecord rec = (SS_L_MAIN_INITMAINLISTRecord)mainlist.get(i);


			String code = rec.seq + "";
			String name = rec.clsf;

			sb.append("<input name=\"");
			sb.append("seq");
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

	public String extnmovmlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnmovmlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITEXTNMOVMLISTRecord rec = (SS_L_MAIN_INITEXTNMOVMLISTRecord)extnmovmlist.get(i);


			String code = rec.cd;
			String name = rec.nm;

			sb.append("<input name=\"");
			sb.append("cd");
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

	public String dsctlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			SS_L_MAIN_INITDSCTLISTRecord rec = (SS_L_MAIN_INITDSCTLISTRecord)dsctlist.get(i);


			String code = rec.cd;
			String name = rec.nm;

			sb.append("<input name=\"");
			sb.append("cd");
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
	SS_L_MAIN_INITDataSet ds = (SS_L_MAIN_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.mainlist.size(); i++){
		SS_L_MAIN_INITMAINLISTRecord mainlistRec = (SS_L_MAIN_INITMAINLISTRecord)ds.mainlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.extnmovmlist.size(); i++){
		SS_L_MAIN_INITEXTNMOVMLISTRecord extnmovmlistRec = (SS_L_MAIN_INITEXTNMOVMLISTRecord)ds.extnmovmlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dsctlist.size(); i++){
		SS_L_MAIN_INITDSCTLISTRecord dsctlistRec = (SS_L_MAIN_INITDSCTLISTRecord)ds.dsctlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMainlist()%>
<%= ds.getExtnmovmlist()%>
<%= ds.getDsctlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= mainlistRec.seq%>
<%= mainlistRec.clsf%>
<%= mainlistRec.notifrdt%>
<%= mainlistRec.notitodt%>
<%= mainlistRec.regdt%>
<%= mainlistRec.upddt%>
<%= mainlistRec.makepersid%>
<%= mainlistRec.makepersnm%>
<%= mainlistRec.titl%>
<%= mainlistRec.brwscnt%>
<%= mainlistRec.recomcnt%>
<%= mainlistRec.dwloadcnt%>
<%= mainlistRec.deptcd%>
<%= mainlistRec.deptnm%>
<%= mainlistRec.rmsgdept%>
<%= mainlistRec.rmsgarea%>
<%= mainlistRec.rmsgexttcd%>
<%= mainlistRec.filenm%>
<%= mainlistRec.filesize%>
<%= extnmovmlistRec.cd%>
<%= extnmovmlistRec.nm%>
<%= extnmovmlistRec.ycnt10%>
<%= extnmovmlistRec.ncnt10%>
<%= extnmovmlistRec.ycnt20%>
<%= extnmovmlistRec.ncnt20%>
<%= extnmovmlistRec.ycnt30%>
<%= extnmovmlistRec.ncnt30%>
<%= extnmovmlistRec.ycnt40%>
<%= extnmovmlistRec.ncnt40%>
<%= extnmovmlistRec.ycnt50%>
<%= extnmovmlistRec.ncnt50%>
<%= extnmovmlistRec.ycnt60%>
<%= extnmovmlistRec.ncnt60%>
<%= extnmovmlistRec.ycnt70%>
<%= extnmovmlistRec.ncnt70%>
<%= extnmovmlistRec.ycnt80%>
<%= extnmovmlistRec.ncnt80%>
<%= dsctlistRec.cd%>
<%= dsctlistRec.nm%>
<%= dsctlistRec.reg%>
<%= dsctlistRec.cnfm%>
<%= dsctlistRec.dscttypecd10%>
<%= dsctlistRec.dscttypecd10cnfm%>
<%= dsctlistRec.dscttypecd20%>
<%= dsctlistRec.dscttypecd20cnfm%>
<%= dsctlistRec.dscttypecd30%>
<%= dsctlistRec.dscttypecd30cnfm%>
<%= dsctlistRec.dscttypecd40%>
<%= dsctlistRec.dscttypecd40cnfm%>
<%= dsctlistRec.dscttypecd45%>
<%= dsctlistRec.dscttypecd45cnfm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 12 15:34:18 KST 2007 */
