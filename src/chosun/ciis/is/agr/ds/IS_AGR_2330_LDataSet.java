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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2330_LDataSet(){}
	public IS_AGR_2330_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			IS_AGR_2330_LCURLISTRecord rec = new IS_AGR_2330_LCURLISTRecord();
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			rec.scat_mm = Util.checkString(rset0.getString("scat_mm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.s_purc_amt = Util.checkString(rset0.getString("s_purc_amt"));
			rec.prft_amt = Util.checkString(rset0.getString("prft_amt"));
			rec.prft_rate = Util.checkString(rset0.getString("prft_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_AGR_2330_LDataSet ds = (IS_AGR_2330_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2330_LCURLISTRecord curlistRec = (IS_AGR_2330_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.t_no%>
<%= curlistRec.scat_mm%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.s_purc_amt%>
<%= curlistRec.prft_amt%>
<%= curlistRec.prft_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 29 13:03:13 KST 2012 */