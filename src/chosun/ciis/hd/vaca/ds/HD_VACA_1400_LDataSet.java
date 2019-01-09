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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_1400_LDataSet(){}
	public HD_VACA_1400_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_VACA_1400_LCURLISTRecord rec = new HD_VACA_1400_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_clsf_cd = Util.checkString(rset0.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.emp_dtls_clsf = Util.checkString(rset0.getString("emp_dtls_clsf"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.real_vaca_dds = Util.checkString(rset0.getString("real_vaca_dds"));
			rec.use_vaca_dds = Util.checkString(rset0.getString("use_vaca_dds"));
			rec.duty_vaca_dds = Util.checkString(rset0.getString("duty_vaca_dds"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.aply_yy = Util.checkString(rset0.getString("aply_yy"));
			rec.qq_clsf = Util.checkString(rset0.getString("qq_clsf"));
			rec.vaca_dds1 = Util.checkString(rset0.getString("vaca_dds1"));
			rec.vaca_dds2 = Util.checkString(rset0.getString("vaca_dds2"));
			rec.vaca_dds3 = Util.checkString(rset0.getString("vaca_dds3"));
			rec.vaca_dds4 = Util.checkString(rset0.getString("vaca_dds4"));
			rec.vaca_dds5 = Util.checkString(rset0.getString("vaca_dds5"));
			rec.vaca_dds6 = Util.checkString(rset0.getString("vaca_dds6"));
			rec.vaca_dds7 = Util.checkString(rset0.getString("vaca_dds7"));
			rec.vaca_dds8 = Util.checkString(rset0.getString("vaca_dds8"));
			rec.vaca_dds9 = Util.checkString(rset0.getString("vaca_dds9"));
			rec.vaca_dds10 = Util.checkString(rset0.getString("vaca_dds10"));
			rec.vaca_dds11 = Util.checkString(rset0.getString("vaca_dds11"));
			rec.vaca_dds12 = Util.checkString(rset0.getString("vaca_dds12"));
			rec.vaca_dds13 = Util.checkString(rset0.getString("vaca_dds13"));
			rec.vaca_dds14 = Util.checkString(rset0.getString("vaca_dds14"));
			rec.vaca_dds15 = Util.checkString(rset0.getString("vaca_dds15"));
			rec.chkok = Util.checkString(rset0.getString("chkok"));
			rec.chkreturn = Util.checkString(rset0.getString("chkreturn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1400_LDataSet ds = (HD_VACA_1400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1400_LCURLISTRecord curlistRec = (HD_VACA_1400_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_clsf_cd%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.emp_dtls_clsf%>
<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.real_vaca_dds%>
<%= curlistRec.use_vaca_dds%>
<%= curlistRec.duty_vaca_dds%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.aply_yy%>
<%= curlistRec.qq_clsf%>
<%= curlistRec.vaca_dds1%>
<%= curlistRec.vaca_dds2%>
<%= curlistRec.vaca_dds3%>
<%= curlistRec.vaca_dds4%>
<%= curlistRec.vaca_dds5%>
<%= curlistRec.vaca_dds6%>
<%= curlistRec.vaca_dds7%>
<%= curlistRec.vaca_dds8%>
<%= curlistRec.vaca_dds9%>
<%= curlistRec.vaca_dds10%>
<%= curlistRec.vaca_dds11%>
<%= curlistRec.vaca_dds12%>
<%= curlistRec.vaca_dds13%>
<%= curlistRec.vaca_dds14%>
<%= curlistRec.vaca_dds15%>
<%= curlistRec.chkok%>
<%= curlistRec.chkreturn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 19 19:30:31 KST 2009 */