/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_3000_LDataSet(){}
	public MT_COMMATR_3000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_COMMATR_3000_LCURLISTRecord rec = new MT_COMMATR_3000_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.presi_tel_no_1 = Util.checkString(rset0.getString("presi_tel_no_1"));
			rec.presi_tel_no_2 = Util.checkString(rset0.getString("presi_tel_no_2"));
			rec.presi_email = Util.checkString(rset0.getString("presi_email"));
			rec.presi_prof = Util.checkString(rset0.getString("presi_prof"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_tel_no_1 = Util.checkString(rset0.getString("chrg_pers_tel_no_1"));
			rec.chrg_pers_tel_no_2 = Util.checkString(rset0.getString("chrg_pers_tel_no_2"));
			rec.chrg_pers_email_1 = Util.checkString(rset0.getString("chrg_pers_email_1"));
			rec.trsm_usag_email_yn_1 = Util.checkString(rset0.getString("trsm_usag_email_yn_1"));
			rec.chrg_pers_email_2 = Util.checkString(rset0.getString("chrg_pers_email_2"));
			rec.trsm_usag_email_yn_2 = Util.checkString(rset0.getString("trsm_usag_email_yn_2"));
			rec.chrg_pers_dept = Util.checkString(rset0.getString("chrg_pers_dept"));
			rec.chrg_pers_prof = Util.checkString(rset0.getString("chrg_pers_prof"));
			rec.fndt_dt = Util.checkString(rset0.getString("fndt_dt"));
			rec.cmpy_hmpg = Util.checkString(rset0.getString("cmpy_hmpg"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.mrkt_ocpy_rate = Util.checkString(rset0.getString("mrkt_ocpy_rate"));
			rec.dlco_pcond = Util.checkString(rset0.getString("dlco_pcond"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_3000_LDataSet ds = (MT_COMMATR_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_3000_LCURLISTRecord curlistRec = (MT_COMMATR_3000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ern%>
<%= curlistRec.presi_nm%>
<%= curlistRec.addr%>
<%= curlistRec.item%>
<%= curlistRec.tel_no%>
<%= curlistRec.fax_no%>
<%= curlistRec.presi_tel_no_1%>
<%= curlistRec.presi_tel_no_2%>
<%= curlistRec.presi_email%>
<%= curlistRec.presi_prof%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_tel_no_1%>
<%= curlistRec.chrg_pers_tel_no_2%>
<%= curlistRec.chrg_pers_email_1%>
<%= curlistRec.trsm_usag_email_yn_1%>
<%= curlistRec.chrg_pers_email_2%>
<%= curlistRec.trsm_usag_email_yn_2%>
<%= curlistRec.chrg_pers_dept%>
<%= curlistRec.chrg_pers_prof%>
<%= curlistRec.fndt_dt%>
<%= curlistRec.cmpy_hmpg%>
<%= curlistRec.sale_amt%>
<%= curlistRec.mrkt_ocpy_rate%>
<%= curlistRec.dlco_pcond%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 17:11:09 KST 2009 */