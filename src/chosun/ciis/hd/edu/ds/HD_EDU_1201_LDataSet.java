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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_1201_LDataSet(){}
	public HD_EDU_1201_LDataSet(String errcode, String errmsg){
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
			HD_EDU_1201_LCURLISTRecord rec = new HD_EDU_1201_LCURLISTRecord();
			rec.report = Util.checkString(rset0.getString("report"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.stdy_yy = Util.checkString(rset0.getString("stdy_yy"));
			rec.ictry_excep_clsf = Util.checkString(rset0.getString("ictry_excep_clsf"));
			rec.stdy_clsf = Util.checkString(rset0.getString("stdy_clsf"));
			rec.invit_instt = Util.checkString(rset0.getString("invit_instt"));
			rec.stdy_frdt = Util.checkString(rset0.getString("stdy_frdt"));
			rec.stdy_todt = Util.checkString(rset0.getString("stdy_todt"));
			rec.stdy_natn_cd = Util.checkString(rset0.getString("stdy_natn_cd"));
			rec.stdy_instt = Util.checkString(rset0.getString("stdy_instt"));
			rec.aviat_cost = Util.checkString(rset0.getString("aviat_cost"));
			rec.stay_cost = Util.checkString(rset0.getString("stay_cost"));
			rec.scl_exps = Util.checkString(rset0.getString("scl_exps"));
			rec.etc_cost = Util.checkString(rset0.getString("etc_cost"));
			rec.stdy_cost_stot = Util.checkString(rset0.getString("stdy_cost_stot"));
			rec.ictry_excep_clsf_nm = Util.checkString(rset0.getString("ictry_excep_clsf_nm"));
			rec.stdy_clsf_nm = Util.checkString(rset0.getString("stdy_clsf_nm"));
			rec.stdy_natn_cd_nm = Util.checkString(rset0.getString("stdy_natn_cd_nm"));
			rec.pk_rep = Util.checkString(rset0.getString("pk_rep"));
			rec.rep_cont = Util.checkString(rset0.getString("rep_cont"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EDU_1201_LDataSet ds = (HD_EDU_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_1201_LCURLISTRecord curlistRec = (HD_EDU_1201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.report%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.stdy_yy%>
<%= curlistRec.ictry_excep_clsf%>
<%= curlistRec.stdy_clsf%>
<%= curlistRec.invit_instt%>
<%= curlistRec.stdy_frdt%>
<%= curlistRec.stdy_todt%>
<%= curlistRec.stdy_natn_cd%>
<%= curlistRec.stdy_instt%>
<%= curlistRec.aviat_cost%>
<%= curlistRec.stay_cost%>
<%= curlistRec.scl_exps%>
<%= curlistRec.etc_cost%>
<%= curlistRec.stdy_cost_stot%>
<%= curlistRec.ictry_excep_clsf_nm%>
<%= curlistRec.stdy_clsf_nm%>
<%= curlistRec.stdy_natn_cd_nm%>
<%= curlistRec.pk_rep%>
<%= curlistRec.rep_cont%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 24 18:04:16 KST 2009 */