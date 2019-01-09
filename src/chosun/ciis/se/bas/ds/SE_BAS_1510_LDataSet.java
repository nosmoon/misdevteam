/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList joblist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1510_LDataSet(){}
	public SE_BAS_1510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_BAS_1510_LJOBLISTRecord rec = new SE_BAS_1510_LJOBLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.chrg_emp_nm = Util.checkString(rset0.getString("chrg_emp_nm"));
			rec.clos_pers_emp_nm = Util.checkString(rset0.getString("clos_pers_emp_nm"));
			rec.clos_proc_dt = Util.checkString(rset0.getString("clos_proc_dt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.work_remk_1 = Util.checkString(rset0.getString("work_remk_1"));
			rec.work_remk_2 = Util.checkString(rset0.getString("work_remk_2"));
			this.joblist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BAS_1510_LDataSet ds = (SE_BAS_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.joblist.size(); i++){
		SE_BAS_1510_LJOBLISTRecord joblistRec = (SE_BAS_1510_LJOBLISTRecord)ds.joblist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJoblist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= joblistRec.dept_nm%>
<%= joblistRec.part_nm%>
<%= joblistRec.area_nm%>
<%= joblistRec.chrg_emp_nm%>
<%= joblistRec.clos_pers_emp_nm%>
<%= joblistRec.clos_proc_dt%>
<%= joblistRec.clos_yn%>
<%= joblistRec.work_remk_1%>
<%= joblistRec.work_remk_2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 21 12:00:08 KST 2009 */