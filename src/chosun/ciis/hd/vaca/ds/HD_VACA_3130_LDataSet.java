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


public class HD_VACA_3130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_3130_LDataSet(){}
	public HD_VACA_3130_LDataSet(String errcode, String errmsg){
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
			HD_VACA_3130_LCURLISTRecord rec = new HD_VACA_3130_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.mon_ck = Util.checkString(rset0.getString("mon_ck"));
			rec.tue_ck = Util.checkString(rset0.getString("tue_ck"));
			rec.wed_ck = Util.checkString(rset0.getString("wed_ck"));
			rec.thu_ck = Util.checkString(rset0.getString("thu_ck"));
			rec.fri_ck = Util.checkString(rset0.getString("fri_ck"));
			rec.sat_ck = Util.checkString(rset0.getString("sat_ck"));
			rec.sun_ck = Util.checkString(rset0.getString("sun_ck"));
			rec.aply_yymm = Util.checkString(rset0.getString("aply_yymm"));
			rec.week = Util.checkString(rset0.getString("week"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.hody_plan_dt_mon = Util.checkString(rset0.getString("hody_plan_dt_mon"));
			rec.hody_plan_dt_tue = Util.checkString(rset0.getString("hody_plan_dt_tue"));
			rec.hody_plan_dt_wed = Util.checkString(rset0.getString("hody_plan_dt_wed"));
			rec.hody_plan_dt_thu = Util.checkString(rset0.getString("hody_plan_dt_thu"));
			rec.hody_plan_dt_fri = Util.checkString(rset0.getString("hody_plan_dt_fri"));
			rec.hody_plan_dt_sat = Util.checkString(rset0.getString("hody_plan_dt_sat"));
			rec.hody_plan_dt_sun = Util.checkString(rset0.getString("hody_plan_dt_sun"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_nm = Util.checkString(rset0.getString("proc_nm"));
			rec.rmn_vaca_dds = Util.checkString(rset0.getString("rmn_vaca_dds"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_3130_LDataSet ds = (HD_VACA_3130_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_3130_LCURLISTRecord curlistRec = (HD_VACA_3130_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.mon_ck%>
<%= curlistRec.tue_ck%>
<%= curlistRec.wed_ck%>
<%= curlistRec.thu_ck%>
<%= curlistRec.fri_ck%>
<%= curlistRec.sat_ck%>
<%= curlistRec.sun_ck%>
<%= curlistRec.aply_yymm%>
<%= curlistRec.week%>
<%= curlistRec.wkdy%>
<%= curlistRec.hody_plan_dt_mon%>
<%= curlistRec.hody_plan_dt_tue%>
<%= curlistRec.hody_plan_dt_wed%>
<%= curlistRec.hody_plan_dt_thu%>
<%= curlistRec.hody_plan_dt_fri%>
<%= curlistRec.hody_plan_dt_sat%>
<%= curlistRec.hody_plan_dt_sun%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_nm%>
<%= curlistRec.rmn_vaca_dds%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 08 14:48:23 KST 2015 */