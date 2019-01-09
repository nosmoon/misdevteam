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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1301_LDataSet(){}
	public EN_INNEXP_1301_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			EN_INNEXP_1301_LCURLISTRecord rec = new EN_INNEXP_1301_LCURLISTRecord();
			rec.flag = Util.checkString(rset0.getString("flag"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.clos_stat = Util.checkString(rset0.getString("clos_stat"));
			rec.clos_proc_dt = Util.checkString(rset0.getString("clos_proc_dt"));
			rec.clos_pers_emp_nm = Util.checkString(rset0.getString("clos_pers_emp_nm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.chg_pers_nm = Util.checkString(rset0.getString("chg_pers_nm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_INNEXP_1301_LDataSet ds = (EN_INNEXP_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1301_LCURLISTRecord curlistRec = (EN_INNEXP_1301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.flag%>
<%= curlistRec.occr_dt%>
<%= curlistRec.clos_stat%>
<%= curlistRec.clos_proc_dt%>
<%= curlistRec.clos_pers_emp_nm%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.chg_dt%>
<%= curlistRec.chg_pers_nm%>
<%= curlistRec.clos_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 07 13:23:20 KST 2009 */