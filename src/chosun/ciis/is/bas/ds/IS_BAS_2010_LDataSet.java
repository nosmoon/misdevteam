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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_2010_LDataSet(){}
	public IS_BAS_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_BAS_2010_LCURLISTRecord rec = new IS_BAS_2010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.trgt_mm = Util.checkString(rset0.getString("trgt_mm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.trgt_clamt = Util.checkString(rset0.getString("trgt_clamt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BAS_2010_LDataSet ds = (IS_BAS_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_2010_LCURLISTRecord curlistRec = (IS_BAS_2010_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.trgt_mm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.trgt_clamt%>
<%= curlistRec.remk%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.chg_pers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 25 10:53:46 KST 2012 */