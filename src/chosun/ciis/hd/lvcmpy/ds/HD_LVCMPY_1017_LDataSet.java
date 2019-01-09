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


public class HD_LVCMPY_1017_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_1017_LDataSet(){}
	public HD_LVCMPY_1017_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_LVCMPY_1017_LCURLIST1Record rec = new HD_LVCMPY_1017_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_LVCMPY_1017_LCURLIST2Record rec = new HD_LVCMPY_1017_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.year_vaca_dds = Util.checkString(rset1.getString("year_vaca_dds"));
			rec.add_vaca_dds = Util.checkString(rset1.getString("add_vaca_dds"));
			rec.use_vaca_dds = Util.checkString(rset1.getString("use_vaca_dds"));
			rec.duty_vaca_dds = Util.checkString(rset1.getString("duty_vaca_dds"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_LVCMPY_1017_LDataSet ds = (HD_LVCMPY_1017_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_LVCMPY_1017_LCURLIST1Record curlist1Rec = (HD_LVCMPY_1017_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_LVCMPY_1017_LCURLIST2Record curlist2Rec = (HD_LVCMPY_1017_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.base_saly%>
<%= curlist1Rec.posk_saly%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.year_vaca_dds%>
<%= curlist2Rec.add_vaca_dds%>
<%= curlist2Rec.use_vaca_dds%>
<%= curlist2Rec.duty_vaca_dds%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 23 21:02:48 KST 2009 */