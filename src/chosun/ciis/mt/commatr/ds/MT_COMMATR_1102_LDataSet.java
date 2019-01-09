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


public class MT_COMMATR_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_1102_LDataSet(){}
	public MT_COMMATR_1102_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_COMMATR_1102_LCURLISTRecord rec = new MT_COMMATR_1102_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.matr_clas = Util.checkString(rset0.getString("matr_clas"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.abc_clas = Util.checkString(rset0.getString("abc_clas"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.ewh_budg_cd_nm = Util.checkString(rset0.getString("ewh_budg_cd_nm"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.owh_budg_cd_nm = Util.checkString(rset0.getString("owh_budg_cd_nm"));
			rec.eps_no = Util.checkString(rset0.getString("eps_no"));
			rec.prt_seq = Util.checkString(rset0.getString("prt_seq"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.impt_yn = Util.checkString(rset0.getString("impt_yn"));
			rec.daily_rept_yn = Util.checkString(rset0.getString("daily_rept_yn"));
			rec.stok_mang_yn = Util.checkString(rset0.getString("stok_mang_yn"));
			rec.remk_use_yn = Util.checkString(rset0.getString("remk_use_yn"));
			rec.wste_yn = Util.checkString(rset0.getString("wste_yn"));
			rec.wste_dt = Util.checkString(rset0.getString("wste_dt"));
			rec.vip_matr_yn = Util.checkString(rset0.getString("vip_matr_yn"));
			rec.brws_obj_yn = Util.checkString(rset0.getString("brws_obj_yn"));
			rec.item_req_mt_yn = Util.checkString(rset0.getString("item_req_mt_yn"));
			rec.item_req_usag_yn = Util.checkString(rset0.getString("item_req_usag_yn"));
			rec.via_dept_yn = Util.checkString(rset0.getString("via_dept_yn"));
			rec.item_req_mand_yn = Util.checkString(rset0.getString("item_req_mand_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_1102_LDataSet ds = (MT_COMMATR_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_1102_LCURLISTRecord curlistRec = (MT_COMMATR_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.matr_clas%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.std_modl%>
<%= curlistRec.unit%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ern%>
<%= curlistRec.abc_clas%>
<%= curlistRec.dstb_rat_cd%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.ewh_budg_cd_nm%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.owh_budg_cd_nm%>
<%= curlistRec.eps_no%>
<%= curlistRec.prt_seq%>
<%= curlistRec.usag%>
<%= curlistRec.impt_yn%>
<%= curlistRec.daily_rept_yn%>
<%= curlistRec.stok_mang_yn%>
<%= curlistRec.remk_use_yn%>
<%= curlistRec.wste_yn%>
<%= curlistRec.wste_dt%>
<%= curlistRec.vip_matr_yn%>
<%= curlistRec.brws_obj_yn%>
<%= curlistRec.item_req_mt_yn%>
<%= curlistRec.item_req_usag_yn%>
<%= curlistRec.via_dept_yn%>
<%= curlistRec.item_req_mand_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 29 20:47:44 KST 2009 */