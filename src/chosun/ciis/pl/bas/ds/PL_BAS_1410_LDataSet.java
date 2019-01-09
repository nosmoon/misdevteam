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


public class PL_BAS_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlcobasebalcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1410_LDataSet(){}
	public PL_BAS_1410_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PL_BAS_1410_LDLCOBASEBALCURRecord rec = new PL_BAS_1410_LDLCOBASEBALCURRecord();
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset1.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset1.getString("dlco_abrv_nm"));
			rec.comn_mang_no = Util.checkString(rset1.getString("comn_mang_no"));
			rec.rptv_flnm = Util.checkString(rset1.getString("rptv_flnm"));
			rec.dlco_clsf_nm = Util.checkString(rset1.getString("dlco_clsf_nm"));
			rec.area_nm = Util.checkString(rset1.getString("area_nm"));
			rec.prv_curr_clsf_nm = Util.checkString(rset1.getString("prv_curr_clsf_nm"));
			rec.magz_deal_yn = Util.checkString(rset1.getString("magz_deal_yn"));
			rec.sep_book_deal_yn = Util.checkString(rset1.getString("sep_book_deal_yn"));
			rec.magz_setup_amt = Util.checkString(rset1.getString("magz_setup_amt"));
			rec.sep_book_setup_amt = Util.checkString(rset1.getString("sep_book_setup_amt"));
			this.dlcobasebalcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1410_LDataSet ds = (PL_BAS_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlcobasebalcur.size(); i++){
		PL_BAS_1410_LDLCOBASEBALCURRecord dlcobasebalcurRec = (PL_BAS_1410_LDLCOBASEBALCURRecord)ds.dlcobasebalcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlcobasebalcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlcobasebalcurRec.dlco_cd%>
<%= dlcobasebalcurRec.dlco_seq%>
<%= dlcobasebalcurRec.dlco_nm%>
<%= dlcobasebalcurRec.dlco_abrv_nm%>
<%= dlcobasebalcurRec.comn_mang_no%>
<%= dlcobasebalcurRec.rptv_flnm%>
<%= dlcobasebalcurRec.dlco_clsf_nm%>
<%= dlcobasebalcurRec.area_nm%>
<%= dlcobasebalcurRec.prv_curr_clsf_nm%>
<%= dlcobasebalcurRec.magz_deal_yn%>
<%= dlcobasebalcurRec.sep_book_deal_yn%>
<%= dlcobasebalcurRec.magz_setup_amt%>
<%= dlcobasebalcurRec.sep_book_setup_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 19:55:11 KST 2009 */