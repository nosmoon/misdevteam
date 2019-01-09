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


public class HD_SRCH_5323_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tag1;

	public HD_SRCH_5323_LDataSet(){}
	public HD_SRCH_5323_LDataSet(String errcode, String errmsg, String tag1){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tag1 = tag1;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTag1(String tag1){
		this.tag1 = tag1;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTag1(){
		return this.tag1;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_SRCH_5323_LCURLIST1Record rec = new HD_SRCH_5323_LCURLIST1Record();
			rec.clsf1 = Util.checkString(rset1.getString("clsf1"));
			rec.clsf2 = Util.checkString(rset1.getString("clsf2"));
			rec.emp_clsf1 = Util.checkString(rset1.getString("emp_clsf1"));
			rec.emp_clsf2 = Util.checkString(rset1.getString("emp_clsf2"));
			rec.emp_clsf3 = Util.checkString(rset1.getString("emp_clsf3"));
			rec.emp_clsf4 = Util.checkString(rset1.getString("emp_clsf4"));
			rec.tot_stot = Util.checkString(rset1.getString("tot_stot"));
			this.curlist1.add(rec);
		}
		this.tag1 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SRCH_5323_LDataSet ds = (HD_SRCH_5323_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5323_LCURLIST1Record curlist1Rec = (HD_SRCH_5323_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getTag1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.clsf1%>
<%= curlist1Rec.clsf2%>
<%= curlist1Rec.emp_clsf1%>
<%= curlist1Rec.emp_clsf2%>
<%= curlist1Rec.emp_clsf3%>
<%= curlist1Rec.emp_clsf4%>
<%= curlist1Rec.tot_stot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 26 10:52:53 KST 2018 */