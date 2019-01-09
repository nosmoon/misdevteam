/***************************************************************************************************
* 파일명 : SL_L_DTLSADDRDataSet.java
* 기능 :  해당지국의아파트 주소코드에 따른 동 리스트 리턴_모바일용
* 작성일자 : 2017-01-13
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;


public class SL_L_DTLSADDRDataSet extends somo.framework.db.BaseDataSet
		implements java.io.Serializable {
	public ArrayList curcommlist = new ArrayList();
	public ArrayList resitypelist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String addrcd;
	public String addrnm;
	public String resitypecd;
	public String resikubun;
	public String addrbnji;
	public String mvindt;
	public String mvinexpdt;
	public String mvinaptyn;
	public long totalcnt;

	public SL_L_DTLSADDRDataSet() {
	}

	public SL_L_DTLSADDRDataSet(String errcode, String errmsg, String addrcd,
			String addrnm, String resitypecd, String resikubun,
			String addrbnji, String mvindt, String mvinexpdt, String mvinaptyn,
			long totalcnt) {
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.addrcd = addrcd;
		this.addrnm = addrnm;
		this.resitypecd = resitypecd;
		this.resikubun = resikubun;
		this.addrbnji = addrbnji;
		this.mvindt = mvindt;
		this.mvinexpdt = mvinexpdt;
		this.mvinaptyn = mvinaptyn;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public void setAddrcd(String addrcd) {
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm) {
		this.addrnm = addrnm;
	}

	public void setResitypecd(String resitypecd) {
		this.resitypecd = resitypecd;
	}

	public void setResikubun(String resikubun) {
		this.resikubun = resikubun;
	}

	public void setAddrbnji(String addrbnji) {
		this.addrbnji = addrbnji;
	}

	public void setMvindt(String mvindt) {
		this.mvindt = mvindt;
	}

	public void setMvinexpdt(String mvinexpdt) {
		this.mvinexpdt = mvinexpdt;
	}

	public void setMvinaptyn(String mvinaptyn) {
		this.mvinaptyn = mvinaptyn;
	}

	public void setTotalcnt(long totalcnt) {
		this.totalcnt = totalcnt;
	}

	public String getErrcode() {
		return this.errcode;
	}

	public String getErrmsg() {
		return this.errmsg;
	}

	public String getAddrcd() {
		return this.addrcd;
	}

	public String getAddrnm() {
		return this.addrnm;
	}

	public String getResitypecd() {
		return this.resitypecd;
	}

	public String getResikubun() {
		return this.resikubun;
	}

	public String getAddrbnji() {
		return this.addrbnji;
	}

	public String getMvindt() {
		return this.mvindt;
	}

	public String getMvinexpdt() {
		return this.mvinexpdt;
	}

	public String getMvinaptyn() {
		return this.mvinaptyn;
	}

	public long getTotalcnt() {
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException {
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if (!"".equals(this.errcode)) {
			return;
		}
		this.addrcd = Util.checkString(cstmt.getString(7));
		this.addrnm = Util.checkString(cstmt.getString(8));
		this.resitypecd = Util.checkString(cstmt.getString(9));
		this.resikubun = Util.checkString(cstmt.getString(10));
		this.addrbnji = Util.checkString(cstmt.getString(11));
		this.mvindt = Util.checkString(cstmt.getString(12));
		this.mvinexpdt = Util.checkString(cstmt.getString(13));
		this.mvinaptyn = Util.checkString(cstmt.getString(14));
		this.totalcnt = cstmt.getLong(15);
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while (rset0.next()) {
			SL_L_DTLSADDRCURCOMMLISTRecord rec = new SL_L_DTLSADDRCURCOMMLISTRecord();
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.florcnt = rset0.getInt("florcnt");
			rec.flor_houscnt = rset0.getInt("flor_houscnt");
			rec.hoscnt = rset0.getInt("hoscnt");
			rec.pyong = rset0.getInt("pyong");
			rec.stairyn = Util.checkString(rset0.getString("stairyn"));
			rec.under_exne = Util.checkString(rset0.getString("under_exne"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(17);
		while (rset1.next()) {
			SL_L_DTLSADDRRESITYPELISTRecord rec = new SL_L_DTLSADDRRESITYPELISTRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.resitypelist.add(rec);
		}
	}

	/*
	 * public String curcommlistOptHtml(String selected){ StringBuffer sb = new
	 * StringBuffer(""); int size = curcommlist.size(); for(int i=0; i<size;
	 * i++){ SL_L_DTLSADDRCURCOMMLISTRecord rec =
	 * (SL_L_DTLSADDRCURCOMMLISTRecord)curcommlist.get(i);
	 *
	 *
	 * String code = rec.dongno; String name = rec.florcnt;
	 *
	 * sb.append("<option value=\""); sb.append(code); sb.append("\"");
	 * if(code.equals(selected)){ sb.append(" selected "); } sb.append(">");
	 * sb.append(name); sb.append("</option>"); } return sb.toString(); }
	 */
	public String resitypelistOptHtml(String selected) {
		StringBuffer sb = new StringBuffer("");
		int size = resitypelist.size();
		for (int i = 0; i < size; i++) {
			SL_L_DTLSADDRRESITYPELISTRecord rec = (SL_L_DTLSADDRRESITYPELISTRecord) resitypelist
					.get(i);

			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if (code.equals(selected)) {
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	/*
	 * public String curcommlistChkHtml(String selected){ StringBuffer sb = new
	 * StringBuffer(""); int size = curcommlist.size(); for(int i=0; i<size;
	 * i++){ SL_L_DTLSADDRCURCOMMLISTRecord rec =
	 * (SL_L_DTLSADDRCURCOMMLISTRecord)curcommlist.get(i);
	 *
	 *
	 * String code = rec.dongno; String name = rec.florcnt;
	 *
	 * sb.append("<input name=\""); sb.append("dongno"); sb.append("\"
	 * type=\"checkbox\" value=\""); sb.append(code); sb.append("\"");
	 * if(code.equals(selected)){ sb.append(" checked "); } sb.append(">");
	 * sb.append(name); sb.append("</input>"); } return sb.toString(); }
	 */
	public String resitypelistChkHtml(String selected) {
		StringBuffer sb = new StringBuffer("");
		int size = resitypelist.size();
		for (int i = 0; i < size; i++) {
			SL_L_DTLSADDRRESITYPELISTRecord rec = (SL_L_DTLSADDRRESITYPELISTRecord) resitypelist
					.get(i);

			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if (code.equals(selected)) {
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	/*
	 * public String curcommlistRdoHtml(String selected){ StringBuffer sb = new
	 * StringBuffer(""); int size = curcommlist.size(); for(int i=0; i<size;
	 * i++){ SL_L_DTLSADDRCURCOMMLISTRecord rec =
	 * (SL_L_DTLSADDRCURCOMMLISTRecord)curcommlist.get(i);
	 *
	 *
	 * String code = rec.dongno; String name = rec.florcnt;
	 *
	 * sb.append("<input name=\""); sb.append("dongno"); sb.append("\"
	 * type=\"radio\" value=\""); sb.append(code); sb.append("\"");
	 * if(code.equals(selected)){ sb.append(" checked "); } sb.append(">");
	 * sb.append(name); sb.append("</input>"); } return sb.toString(); }
	 */
	public String resitypelistRdoHtml(String selected) {
		StringBuffer sb = new StringBuffer("");
		int size = resitypelist.size();
		for (int i = 0; i < size; i++) {
			SL_L_DTLSADDRRESITYPELISTRecord rec = (SL_L_DTLSADDRRESITYPELISTRecord) resitypelist
					.get(i);

			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if (code.equals(selected)) {
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
	SL_L_DTLSADDRDataSet ds = (SL_L_DTLSADDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_DTLSADDRCURCOMMLISTRecord curcommlistRec = (SL_L_DTLSADDRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypelist.size(); i++){
		SL_L_DTLSADDRRESITYPELISTRecord resitypelistRec = (SL_L_DTLSADDRRESITYPELISTRecord)ds.resitypelist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

 <%= ds.getErrcode()%>
 <%= ds.getErrmsg()%>
 <%= ds.getAddrcd()%>
 <%= ds.getAddrnm()%>
 <%= ds.getResitypecd()%>
 <%= ds.getResikubun()%>
 <%= ds.getAddrbnji()%>
 <%= ds.getMvindt()%>
 <%= ds.getMvinexpdt()%>
 <%= ds.getMvinaptyn()%>
 <%= ds.getTotalcnt()%>
 <%= ds.getCurcommlist()%>
 <%= ds.getResitypelist()%>
 ----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

 <%= curcommlistRec.dongno%>
 <%= curcommlistRec.florcnt%>
 <%= curcommlistRec.flor_houscnt%>
 <%= curcommlistRec.hoscnt%>
 <%= curcommlistRec.pyong%>
 <%= curcommlistRec.stairyn%>
 <%= curcommlistRec.under_exne%>
 <%= resitypelistRec.cicodeval%>
 <%= resitypelistRec.cicdnm%>
 <%= resitypelistRec.ciymgbcd%>
 <%= resitypelistRec.cicdgb%>
 <%= resitypelistRec.cicdynm%>
 ----------------------------------------------------------------------------------------------------*/

/* 작성시간 : Mon May 15 10:55:42 KST 2006 */
