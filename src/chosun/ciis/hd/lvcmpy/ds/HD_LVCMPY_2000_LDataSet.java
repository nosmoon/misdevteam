/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2000_LDataSet(){}
	public HD_LVCMPY_2000_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_2000_LCURLISTRecord rec = new HD_LVCMPY_2000_LCURLISTRecord();
			rec.etc_saly_nm = Util.checkString(rset0.getString("etc_saly_nm"));
			rec.etc_saly_cd = Util.checkString(rset0.getString("etc_saly_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt_1 = Util.checkString(rset0.getString("crdt_amt_1"));
			rec.crdt_amt_2 = Util.checkString(rset0.getString("crdt_amt_2"));
			rec.cal_pay_amt = Util.checkString(rset0.getString("cal_pay_amt"));
			rec.emp_amt = Util.checkString(rset0.getString("emp_amt"));
			rec.np_amt = Util.checkString(rset0.getString("np_amt"));
			rec.hlth_amt = Util.checkString(rset0.getString("hlth_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2000_LDataSet ds = (HD_LVCMPY_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_2000_LCURLISTRecord curlistRec = (HD_LVCMPY_2000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.etc_saly_nm%>
<%= curlistRec.etc_saly_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt_1%>
<%= curlistRec.crdt_amt_2%>
<%= curlistRec.cal_pay_amt%>
<%= curlistRec.emp_amt%>
<%= curlistRec.np_amt%>
<%= curlistRec.hlth_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 04 17:38:27 KST 2012 */