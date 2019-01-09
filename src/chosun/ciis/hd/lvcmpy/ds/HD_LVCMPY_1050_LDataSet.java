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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_1050_LDataSet(){}
	public HD_LVCMPY_1050_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_1050_LCURLISTRecord rec = new HD_LVCMPY_1050_LCURLISTRecord();
			rec.cmpy_cd_1 = Util.checkString(rset0.getString("cmpy_cd_1"));
			rec.duty_dt_1 = Util.checkString(rset0.getString("duty_dt_1"));
			rec.emp_no_1 = Util.checkString(rset0.getString("emp_no_1"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_nm = Util.checkString(rset0.getString("hody_nm"));
			rec.cmpy_cd_2 = Util.checkString(rset0.getString("cmpy_cd_2"));
			rec.duty_dt_2 = Util.checkString(rset0.getString("duty_dt_2"));
			rec.emp_no_2 = Util.checkString(rset0.getString("emp_no_2"));
			rec.base_alon = Util.checkString(rset0.getString("base_alon"));
			rec.cmpn_alon = Util.checkString(rset0.getString("cmpn_alon"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_LVCMPY_1050_LDataSet ds = (HD_LVCMPY_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_1050_LCURLISTRecord curlistRec = (HD_LVCMPY_1050_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd_1%>
<%= curlistRec.duty_dt_1%>
<%= curlistRec.emp_no_1%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_nm%>
<%= curlistRec.cmpy_cd_2%>
<%= curlistRec.duty_dt_2%>
<%= curlistRec.emp_no_2%>
<%= curlistRec.base_alon%>
<%= curlistRec.cmpn_alon%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 21:06:42 KST 2009 */