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


public class HD_AFFR_9031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9031_LDataSet(){}
	public HD_AFFR_9031_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_9031_LCURLISTRecord rec = new HD_AFFR_9031_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.basi_yy = Util.checkString(rset0.getString("basi_yy"));
			rec.basi_no = Util.checkString(rset0.getString("basi_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.otn_mgng_cd = Util.checkString(rset0.getString("otn_mgng_cd"));
			rec.outside_flnm = Util.checkString(rset0.getString("outside_flnm"));
			rec.outside_clsf_cd = Util.checkString(rset0.getString("outside_clsf_cd"));
			rec.outside_clsf_nm = Util.checkString(rset0.getString("outside_clsf_nm"));
			rec.journal_cd = Util.checkString(rset0.getString("journal_cd"));
			rec.journal_nm = Util.checkString(rset0.getString("journal_nm"));
			rec.outside_tel_no = Util.checkString(rset0.getString("outside_tel_no"));
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.prvmm_qty = Util.checkString(rset0.getString("prvmm_qty"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.icdc_qty = Util.checkString(rset0.getString("icdc_qty"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.clos_nm = Util.checkString(rset0.getString("clos_nm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9031_LDataSet ds = (HD_AFFR_9031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_9031_LCURLISTRecord curlistRec = (HD_AFFR_9031_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.basi_yy%>
<%= curlistRec.basi_no%>
<%= curlistRec.seq%>
<%= curlistRec.otn_mgng_cd%>
<%= curlistRec.outside_flnm%>
<%= curlistRec.outside_clsf_cd%>
<%= curlistRec.outside_clsf_nm%>
<%= curlistRec.journal_cd%>
<%= curlistRec.journal_nm%>
<%= curlistRec.outside_tel_no%>
<%= curlistRec.zipcode%>
<%= curlistRec.addr%>
<%= curlistRec.prvmm_qty%>
<%= curlistRec.qty%>
<%= curlistRec.icdc_qty%>
<%= curlistRec.remk%>
<%= curlistRec.clos_yn%>
<%= curlistRec.clos_nm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 12 19:02:04 KST 2016 */