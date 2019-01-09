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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1110_LDataSet(){}
	public HD_AFFR_1110_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_1110_LCURLISTRecord rec = new HD_AFFR_1110_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.cmpy_cnt = Util.checkString(rset0.getString("cmpy_cnt"));
			rec.cmpy_use_cnt = Util.checkString(rset0.getString("cmpy_use_cnt"));
			rec.cmpy_able_cnt = Util.checkString(rset0.getString("cmpy_able_cnt"));
			rec.not_use = Util.checkString(rset0.getString("not_use"));
			rec.cmpy_cnt_next = Util.checkString(rset0.getString("cmpy_cnt_next"));
			rec.cmpy_use_cnt_next = Util.checkString(rset0.getString("cmpy_use_cnt_next"));
			rec.cmpy_able_cnt_next = Util.checkString(rset0.getString("cmpy_able_cnt_next"));
			rec.not_use_next = Util.checkString(rset0.getString("not_use_next"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_1110_LDataSet ds = (HD_AFFR_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1110_LCURLISTRecord curlistRec = (HD_AFFR_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.cmpy_cnt%>
<%= curlistRec.cmpy_use_cnt%>
<%= curlistRec.cmpy_able_cnt%>
<%= curlistRec.not_use%>
<%= curlistRec.cmpy_cnt_next%>
<%= curlistRec.cmpy_use_cnt_next%>
<%= curlistRec.cmpy_able_cnt_next%>
<%= curlistRec.not_use_next%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 23 14:47:14 KST 2009 */