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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4003_LDataSet(){}
	public MC_BUDG_4003_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_4003_LCURLISTRecord rec = new MC_BUDG_4003_LCURLISTRecord();
			rec.work_no = Util.checkString(rset0.getString("work_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.fix_asin_amt = Util.checkString(rset0.getString("fix_asin_amt"));
			rec.fix_asin_uprc = Util.checkString(rset0.getString("fix_asin_uprc"));
			rec.fix_asin_qunt = Util.checkString(rset0.getString("fix_asin_qunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4003_LDataSet ds = (MC_BUDG_4003_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4003_LCURLISTRecord curlistRec = (MC_BUDG_4003_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.work_no%>
<%= curlistRec.seq%>
<%= curlistRec.sub_seq%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.rmks%>
<%= curlistRec.fix_asin_amt%>
<%= curlistRec.fix_asin_uprc%>
<%= curlistRec.fix_asin_qunt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 19 22:04:01 KST 2009 */