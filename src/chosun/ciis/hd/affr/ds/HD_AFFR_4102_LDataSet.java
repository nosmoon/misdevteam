/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
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

public class HD_AFFR_4102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_4102_LDataSet(){}
	public HD_AFFR_4102_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_4102_LCURLISTRecord rec = new HD_AFFR_4102_LCURLISTRecord();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.stop_dt = Util.checkString(rset0.getString("stop_dt"));
			rec.cont_svc_yys = Util.checkString(rset0.getString("cont_svc_yys"));
			rec.rest_vaca_yys_clsf = Util.checkString(rset0.getString("rest_vaca_yys_clsf"));
			rec.base_pont = Util.checkString(rset0.getString("base_pont"));
			rec.faml_pont = Util.checkString(rset0.getString("faml_pont"));
			rec.cont_svc_pont = Util.checkString(rset0.getString("cont_svc_pont"));
			rec.rest_pont = Util.checkString(rset0.getString("rest_pont"));
			rec.dty_taem_chf_un_norm = Util.checkString(rset0.getString("dty_taem_chf_un_norm"));
			rec.dty_comite_memb = Util.checkString(rset0.getString("dty_comite_memb"));
			rec.pont_tot = Util.checkString(rset0.getString("pont_tot"));
			rec.use_pont = Util.checkString(rset0.getString("use_pont"));
			rec.rsrt_amt = Util.checkString(rset0.getString("rsrt_amt"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aply_yy = Util.checkString(rset0.getString("aply_yy"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_4102_LDataSet ds = (HD_AFFR_4102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_4102_LCURLISTRecord curlistRec = (HD_AFFR_4102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.frdt%>
<%= curlistRec.stop_dt%>
<%= curlistRec.cont_svc_yys%>
<%= curlistRec.rest_vaca_yys_clsf%>
<%= curlistRec.base_pont%>
<%= curlistRec.faml_pont%>
<%= curlistRec.cont_svc_pont%>
<%= curlistRec.rest_pont%>
<%= curlistRec.dty_taem_chf_un_norm%>
<%= curlistRec.dty_comite_memb%>
<%= curlistRec.pont_tot%>
<%= curlistRec.use_pont%>
<%= curlistRec.rsrt_amt%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.aply_yy%>
<%= curlistRec.db_status%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 11:52:46 KST 2009 */