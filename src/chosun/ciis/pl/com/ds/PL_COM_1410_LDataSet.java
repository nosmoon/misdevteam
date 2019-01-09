/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlcoinfolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_COM_1410_LDataSet(){}
	public PL_COM_1410_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PL_COM_1410_LDLCOINFOLISTRecord rec = new PL_COM_1410_LDLCOINFOLISTRecord();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.comn_mang_no = Util.checkString(rset0.getString("comn_mang_no"));
			rec.rptv_flnm = Util.checkString(rset0.getString("rptv_flnm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.area = Util.checkString(rset0.getString("area"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.prv_curr_clsf = Util.checkString(rset0.getString("prv_curr_clsf"));
			rec.prv_curr_clsf_nm = Util.checkString(rset0.getString("prv_curr_clsf_nm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.magz_deal_yn = Util.checkString(rset0.getString("magz_deal_yn"));
			rec.sep_book_deal_yn = Util.checkString(rset0.getString("sep_book_deal_yn"));
			this.dlcoinfolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1410_LDataSet ds = (PL_COM_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlcoinfolist.size(); i++){
		PL_COM_1410_LDLCOINFOLISTRecord dlcoinfolistRec = (PL_COM_1410_LDLCOINFOLISTRecord)ds.dlcoinfolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlcoinfolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlcoinfolistRec.dlco_cd%>
<%= dlcoinfolistRec.dlco_seq%>
<%= dlcoinfolistRec.dlco_nm%>
<%= dlcoinfolistRec.dlco_abrv_nm%>
<%= dlcoinfolistRec.send_plac_seq%>
<%= dlcoinfolistRec.send_plac_nm%>
<%= dlcoinfolistRec.comn_mang_no%>
<%= dlcoinfolistRec.rptv_flnm%>
<%= dlcoinfolistRec.dlco_clsf%>
<%= dlcoinfolistRec.dlco_clsf_nm%>
<%= dlcoinfolistRec.area%>
<%= dlcoinfolistRec.area_nm%>
<%= dlcoinfolistRec.prv_curr_clsf%>
<%= dlcoinfolistRec.prv_curr_clsf_nm%>
<%= dlcoinfolistRec.tel_no%>
<%= dlcoinfolistRec.ptph_no%>
<%= dlcoinfolistRec.fax_no%>
<%= dlcoinfolistRec.email%>
<%= dlcoinfolistRec.addr%>
<%= dlcoinfolistRec.magz_deal_yn%>
<%= dlcoinfolistRec.sep_book_deal_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 16:25:38 KST 2009 */