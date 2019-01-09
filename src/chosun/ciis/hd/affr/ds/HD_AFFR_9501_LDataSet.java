/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_9501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9501_LDataSet(){}
	public HD_AFFR_9501_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_9501_LCURLISTRecord rec = new HD_AFFR_9501_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.memb_clsf = Util.checkString(rset0.getString("memb_clsf"));
			rec.memb_clsf_nm = Util.checkString(rset0.getString("memb_clsf_nm"));
			rec.emp_birthday = Util.checkString(rset0.getString("emp_birthday"));
			rec.dth_yn = Util.checkString(rset0.getString("dth_yn"));
			rec.spos_name = Util.checkString(rset0.getString("spos_name"));
			rec.spos_birthday = Util.checkString(rset0.getString("spos_birthday"));
			rec.spos_yn = Util.checkString(rset0.getString("spos_yn"));
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.phon_no = Util.checkString(rset0.getString("phon_no"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.deps_per = Util.checkString(rset0.getString("deps_per"));
			rec.lvcmpy_dty = Util.checkString(rset0.getString("lvcmpy_dty"));
			rec.lvcmpy_dty_nm = Util.checkString(rset0.getString("lvcmpy_dty_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.lve_yn = Util.checkString(rset0.getString("lve_yn"));
			rec.lve_yn_nm = Util.checkString(rset0.getString("lve_yn_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9501_LDataSet ds = (HD_AFFR_9501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_9501_LCURLISTRecord curlistRec = (HD_AFFR_9501_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.memb_clsf%>
<%= curlistRec.memb_clsf_nm%>
<%= curlistRec.emp_birthday%>
<%= curlistRec.dth_yn%>
<%= curlistRec.spos_name%>
<%= curlistRec.spos_birthday%>
<%= curlistRec.spos_yn%>
<%= curlistRec.zipcode%>
<%= curlistRec.addr%>
<%= curlistRec.phon_no%>
<%= curlistRec.tel_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.deps_per%>
<%= curlistRec.lvcmpy_dty%>
<%= curlistRec.lvcmpy_dty_nm%>
<%= curlistRec.remk%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.lve_yn%>
<%= curlistRec.lve_yn_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 06 17:31:09 KST 2017 */