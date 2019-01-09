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


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlco_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1210_LDataSet(){}
	public PL_BAS_1210_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PL_BAS_1210_LDLCO_PTCRCURRecord rec = new PL_BAS_1210_LDLCO_PTCRCURRecord();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
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
			rec.elec_tax_stmt_yn = Util.checkString(rset0.getString("elec_tax_stmt_yn"));
			this.dlco_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1210_LDataSet ds = (PL_BAS_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlco_ptcrcur.size(); i++){
		PL_BAS_1210_LDLCO_PTCRCURRecord dlco_ptcrcurRec = (PL_BAS_1210_LDLCO_PTCRCURRecord)ds.dlco_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlco_ptcrcurRec.dlco_cd%>
<%= dlco_ptcrcurRec.dlco_seq%>
<%= dlco_ptcrcurRec.dlco_nm%>
<%= dlco_ptcrcurRec.dlco_abrv_nm%>
<%= dlco_ptcrcurRec.comn_mang_no%>
<%= dlco_ptcrcurRec.rptv_flnm%>
<%= dlco_ptcrcurRec.dlco_clsf%>
<%= dlco_ptcrcurRec.dlco_clsf_nm%>
<%= dlco_ptcrcurRec.area%>
<%= dlco_ptcrcurRec.area_nm%>
<%= dlco_ptcrcurRec.prv_curr_clsf%>
<%= dlco_ptcrcurRec.prv_curr_clsf_nm%>
<%= dlco_ptcrcurRec.tel_no%>
<%= dlco_ptcrcurRec.ptph_no%>
<%= dlco_ptcrcurRec.fax_no%>
<%= dlco_ptcrcurRec.email%>
<%= dlco_ptcrcurRec.addr%>
<%= dlco_ptcrcurRec.magz_deal_yn%>
<%= dlco_ptcrcurRec.sep_book_deal_yn%>
<%= dlco_ptcrcurRec.elec_tax_stmt_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 13:37:54 KST 2009 */