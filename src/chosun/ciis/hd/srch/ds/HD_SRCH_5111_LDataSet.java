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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_nops_cnt;

	public HD_SRCH_5111_LDataSet(){}
	public HD_SRCH_5111_LDataSet(String errcode, String errmsg, String xx_nops_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_nops_cnt = xx_nops_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_nops_cnt(String xx_nops_cnt){
		this.xx_nops_cnt = xx_nops_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_nops_cnt(){
		return this.xx_nops_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5111_LCURLISTRecord rec = new HD_SRCH_5111_LCURLISTRecord();
			rec.clas_clsf = Util.checkString(rset0.getString("clas_clsf"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.prv_nops = Util.checkString(rset0.getString("prv_nops"));
			rec.this_nops = Util.checkString(rset0.getString("this_nops"));
			rec.cmpr_nops = Util.checkString(rset0.getString("cmpr_nops"));
			this.curlist.add(rec);
		}
		this.xx_nops_cnt = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SRCH_5111_LDataSet ds = (HD_SRCH_5111_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_5111_LCURLISTRecord curlistRec = (HD_SRCH_5111_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_nops_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.clas_clsf%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.prv_nops%>
<%= curlistRec.this_nops%>
<%= curlistRec.cmpr_nops%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 30 18:21:12 KST 2018 */