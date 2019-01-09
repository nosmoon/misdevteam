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


package chosun.ciis.en.evnt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.rec.*;

/**
 * 
 */


public class EN_EVNT_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_EVNT_1201_LDataSet(){}
	public EN_EVNT_1201_LDataSet(String errcode, String errmsg){
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
			EN_EVNT_1201_LCURLISTRecord rec = new EN_EVNT_1201_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.evnt_yy = Util.checkString(rset0.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.evnt_rcpm_unit_clsf = Util.checkString(rset0.getString("evnt_rcpm_unit_clsf"));
			rec.evnt_rcpm_unit_nm = Util.checkString(rset0.getString("evnt_rcpm_unit_nm"));
			rec.vitl_acct_no_bgn = Util.checkString(rset0.getString("vitl_acct_no_bgn"));
			rec.vitl_acct_no_end = Util.checkString(rset0.getString("vitl_acct_no_end"));
			rec.use_end_yn = Util.checkString(rset0.getString("use_end_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_emp_nm = Util.checkString(rset0.getString("incmg_pers_emp_nm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_pers_emp_nm = Util.checkString(rset0.getString("chg_pers_emp_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_EVNT_1201_LDataSet ds = (EN_EVNT_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_EVNT_1201_LCURLISTRecord curlistRec = (EN_EVNT_1201_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.evnt_yy%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_seq%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.evnt_rcpm_unit_clsf%>
<%= curlistRec.evnt_rcpm_unit_nm%>
<%= curlistRec.vitl_acct_no_bgn%>
<%= curlistRec.vitl_acct_no_end%>
<%= curlistRec.use_end_yn%>
<%= curlistRec.remk%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_emp_nm%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_pers_emp_nm%>
<%= curlistRec.chg_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 12 14:16:10 KST 2009 */