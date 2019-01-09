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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1300_LDataSet(){}
	public HD_SALY_1300_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1300_LCURLISTRecord rec = new HD_SALY_1300_LCURLISTRecord();
			rec.saly_yy = Util.checkString(rset0.getString("saly_yy"));
			rec.saly_no = Util.checkString(rset0.getString("saly_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.real_pay_rgla_saly = Util.checkString(rset0.getString("real_pay_rgla_saly"));
			rec.prvmm_mstk_saly = Util.checkString(rset0.getString("prvmm_mstk_saly"));
			rec.excp_resn = Util.checkString(rset0.getString("excp_resn"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.food_alon = Util.checkString(rset0.getString("food_alon"));
			rec.care_alon = Util.checkString(rset0.getString("care_alon"));
			rec.dty_alon = Util.checkString(rset0.getString("dty_alon"));
			rec.posk_alon = Util.checkString(rset0.getString("posk_alon"));
			rec.jrnst = Util.checkString(rset0.getString("jrnst"));
			rec.auto_driv_alon = Util.checkString(rset0.getString("auto_driv_alon"));
			rec.evngt_saly = Util.checkString(rset0.getString("evngt_saly"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1300_LDataSet ds = (HD_SALY_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1300_LCURLISTRecord curlistRec = (HD_SALY_1300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.saly_yy%>
<%= curlistRec.saly_no%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.real_pay_rgla_saly%>
<%= curlistRec.prvmm_mstk_saly%>
<%= curlistRec.excp_resn%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.food_alon%>
<%= curlistRec.care_alon%>
<%= curlistRec.dty_alon%>
<%= curlistRec.posk_alon%>
<%= curlistRec.jrnst%>
<%= curlistRec.auto_driv_alon%>
<%= curlistRec.evngt_saly%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 18 13:44:43 KST 2014 */