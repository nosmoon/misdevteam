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


package chosun.ciis.mc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_1011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_CO_1011_LDataSet(){}
	public MC_CO_1011_LDataSet(String errcode, String errmsg){
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
			MC_CO_1011_LCURLIST1Record rec = new MC_CO_1011_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_team_clsf = Util.checkString(rset0.getString("dept_team_clsf"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.dept_team_nm = Util.checkString(rset0.getString("dept_team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.part_dn_nm = Util.checkString(rset0.getString("part_dn_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_CO_1011_LDataSet ds = (MC_CO_1011_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_CO_1011_LCURLIST1Record curlist1Rec = (MC_CO_1011_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_team_clsf%>
<%= curlist1Rec.abrv_nm%>
<%= curlist1Rec.offi_nm%>
<%= curlist1Rec.dept_team_nm%>
<%= curlist1Rec.part_nm%>
<%= curlist1Rec.part_dn_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 17:12:02 KST 2009 */