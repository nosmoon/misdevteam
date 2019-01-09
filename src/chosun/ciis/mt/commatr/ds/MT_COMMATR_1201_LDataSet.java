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


public class MT_COMMATR_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_1201_LDataSet(){}
	public MT_COMMATR_1201_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_COMMATR_1201_LCURLISTRecord rec = new MT_COMMATR_1201_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			rec.eps_no = Util.checkString(rset0.getString("eps_no"));
			rec.abc_clas = Util.checkString(rset0.getString("abc_clas"));
			rec.prt_seq = Util.checkString(rset0.getString("prt_seq"));
			rec.daily_rept_yn = Util.checkString(rset0.getString("daily_rept_yn"));
			rec.impt_yn = Util.checkString(rset0.getString("impt_yn"));
			rec.wste_yn = Util.checkString(rset0.getString("wste_yn"));
			rec.wste_dt = Util.checkString(rset0.getString("wste_dt"));
			rec.stok_mang_yn = Util.checkString(rset0.getString("stok_mang_yn"));
			rec.via_dept_yn = Util.checkString(rset0.getString("via_dept_yn"));
			rec.item_req_mand_yn = Util.checkString(rset0.getString("item_req_mand_yn"));
			rec.item_req_mt_yn = Util.checkString(rset0.getString("item_req_mt_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_1201_LDataSet ds = (MT_COMMATR_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_1201_LCURLISTRecord curlistRec = (MT_COMMATR_1201_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.unit%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.std_modl%>
<%= curlistRec.usag%>
<%= curlistRec.chg_pers%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.dstb_rat_cd%>
<%= curlistRec.eps_no%>
<%= curlistRec.abc_clas%>
<%= curlistRec.prt_seq%>
<%= curlistRec.daily_rept_yn%>
<%= curlistRec.impt_yn%>
<%= curlistRec.wste_yn%>
<%= curlistRec.wste_dt%>
<%= curlistRec.stok_mang_yn%>
<%= curlistRec.via_dept_yn%>
<%= curlistRec.item_req_mand_yn%>
<%= curlistRec.item_req_mt_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 20 16:38:20 KST 2009 */