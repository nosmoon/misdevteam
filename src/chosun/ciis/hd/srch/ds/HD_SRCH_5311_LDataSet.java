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


public class HD_SRCH_5311_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public HD_SRCH_5311_LDataSet(){}
	public HD_SRCH_5311_LDataSet(String errcode, String errmsg, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5311_LCURLIST1Record rec = new HD_SRCH_5311_LCURLIST1Record();
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.clas_clsf1 = Util.checkString(rset0.getString("clas_clsf1"));
			rec.clas_clsf2 = Util.checkString(rset0.getString("clas_clsf2"));
			rec.prv_mm_amt = Util.checkString(rset0.getString("prv_mm_amt"));
			rec.base_mm_amt = Util.checkString(rset0.getString("base_mm_amt"));
			rec.prvmm_cmpr = Util.checkString(rset0.getString("prvmm_cmpr"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		this.title = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SRCH_5311_LDataSet ds = (HD_SRCH_5311_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5311_LCURLIST1Record curlist1Rec = (HD_SRCH_5311_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getTitle()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.clsf%>
<%= curlist1Rec.clsf1%>
<%= curlist1Rec.clsf2%>
<%= curlist1Rec.prv_mm_amt%>
<%= curlist1Rec.base_mm_amt%>
<%= curlist1Rec.prvmm_cmpr%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 17 18:39:37 KST 2018 */