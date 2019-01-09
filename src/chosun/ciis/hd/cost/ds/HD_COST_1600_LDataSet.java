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


package chosun.ciis.hd.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_COST_1600_LDataSet(){}
	public HD_COST_1600_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_COST_1600_LCURLISTRecord rec = new HD_COST_1600_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.hd_mang_dty_nm = Util.checkString(rset0.getString("hd_mang_dty_nm"));
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_day = Util.checkString(rset0.getString("deal_day"));
			rec.use_plac = Util.checkString(rset0.getString("use_plac"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			rec.remk_2 = Util.checkString(rset0.getString("remk_2"));
			rec.slip_proc_mang = Util.checkString(rset0.getString("slip_proc_mang"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.proc_clsf_nm = Util.checkString(rset0.getString("proc_clsf_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COST_1600_LDataSet ds = (HD_COST_1600_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_COST_1600_LCURLISTRecord curlistRec = (HD_COST_1600_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.hd_mang_dty_nm%>
<%= curlistRec.deal_dt%>
<%= curlistRec.deal_day%>
<%= curlistRec.use_plac%>
<%= curlistRec.deal_amt%>
<%= curlistRec.remk_2%>
<%= curlistRec.slip_proc_mang%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.proc_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 19 14:53:52 KST 2016 */