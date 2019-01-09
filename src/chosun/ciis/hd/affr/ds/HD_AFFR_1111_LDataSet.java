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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1111_LDataSet(){}
	public HD_AFFR_1111_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_AFFR_1111_LCURLISTRecord rec = new HD_AFFR_1111_LCURLISTRecord();
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.remk_adm = Util.checkString(rset0.getString("remk_adm"));
			rec.real_preng_condo_nm = Util.checkString(rset0.getString("real_preng_condo_nm"));
			rec.preng_condo_nm_1 = Util.checkString(rset0.getString("preng_condo_nm_1"));
			rec.preng_condo_nm_2 = Util.checkString(rset0.getString("preng_condo_nm_2"));
			rec.preng_no = Util.checkString(rset0.getString("preng_no"));
			rec.use_frdt = Util.checkString(rset0.getString("use_frdt"));
			rec.use_todt = Util.checkString(rset0.getString("use_todt"));
			rec.cmpy_sply_use_yn = Util.checkString(rset0.getString("cmpy_sply_use_yn"));
			rec.use_dds = Util.checkString(rset0.getString("use_dds"));
			rec.guest_room_cnt = Util.checkString(rset0.getString("guest_room_cnt"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.email_addr = Util.checkString(rset0.getString("email_addr"));
			rec.use_pay_amt = Util.checkString(rset0.getString("use_pay_amt"));
			rec.slf_burd_amt = Util.checkString(rset0.getString("slf_burd_amt"));
			rec.cmpy_sply_amt = Util.checkString(rset0.getString("cmpy_sply_amt"));
			rec.slf_drbk_amt = Util.checkString(rset0.getString("slf_drbk_amt"));
			rec.guest_room_fee_tot_amt = Util.checkString(rset0.getString("guest_room_fee_tot_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1111_LDataSet ds = (HD_AFFR_1111_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1111_LCURLISTRecord curlistRec = (HD_AFFR_1111_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.proc_stat_nm%>
<%= curlistRec.remk%>
<%= curlistRec.remk_adm%>
<%= curlistRec.real_preng_condo_nm%>
<%= curlistRec.preng_condo_nm_1%>
<%= curlistRec.preng_condo_nm_2%>
<%= curlistRec.preng_no%>
<%= curlistRec.use_frdt%>
<%= curlistRec.use_todt%>
<%= curlistRec.cmpy_sply_use_yn%>
<%= curlistRec.use_dds%>
<%= curlistRec.guest_room_cnt%>
<%= curlistRec.ptph_no%>
<%= curlistRec.tel_no%>
<%= curlistRec.email_addr%>
<%= curlistRec.use_pay_amt%>
<%= curlistRec.slf_burd_amt%>
<%= curlistRec.cmpy_sply_amt%>
<%= curlistRec.slf_drbk_amt%>
<%= curlistRec.guest_room_fee_tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 23 15:20:04 KST 2009 */