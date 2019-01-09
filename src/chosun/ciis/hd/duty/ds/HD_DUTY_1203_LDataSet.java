/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.duty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1203_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DUTY_1203_LDataSet(){}
	public HD_DUTY_1203_LDataSet(String errcode, String errmsg){
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
			HD_DUTY_1203_LCURLISTRecord rec = new HD_DUTY_1203_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.finish_dd_nm = Util.checkString(rset0.getString("finish_dd_nm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_nm = Util.checkString(rset0.getString("proc_nm"));
			rec.addm_rest_minute = Util.checkString(rset0.getString("addm_rest_minute"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_nm = Util.checkString(rset0.getString("hody_nm"));
			rec.vaca_cd = Util.checkString(rset0.getString("vaca_cd"));
			rec.vaca_nm = Util.checkString(rset0.getString("vaca_nm"));
			rec.duty_clsf = Util.checkString(rset0.getString("duty_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_DUTY_1203_LDataSet ds = (HD_DUTY_1203_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_1203_LCURLISTRecord curlistRec = (HD_DUTY_1203_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.duty_dt%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.finish_dd_nm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_nm%>
<%= curlistRec.addm_rest_minute%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_nm%>
<%= curlistRec.vaca_cd%>
<%= curlistRec.vaca_nm%>
<%= curlistRec.duty_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 09 13:43:07 KST 2018 */