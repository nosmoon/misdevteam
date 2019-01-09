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


public class IS_AGR_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2210_LDataSet(){}
	public IS_AGR_2210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			IS_AGR_2210_LCURLISTRecord rec = new IS_AGR_2210_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.cur_cnt = Util.checkString(rset0.getString("cur_cnt"));
			rec.bef_cnt = Util.checkString(rset0.getString("bef_cnt"));
			rec.cnt_rate = Util.checkString(rset0.getString("cnt_rate"));
			rec.cur_suply_amt = Util.checkString(rset0.getString("cur_suply_amt"));
			rec.bef_suply_amt = Util.checkString(rset0.getString("bef_suply_amt"));
			rec.suply_amt_rate = Util.checkString(rset0.getString("suply_amt_rate"));
			rec.scat_dt_fr = Util.checkString(rset0.getString("scat_dt_fr"));
			rec.scat_dt_to = Util.checkString(rset0.getString("scat_dt_to"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_AGR_2210_LDataSet ds = (IS_AGR_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2210_LCURLISTRecord curlistRec = (IS_AGR_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.cur_cnt%>
<%= curlistRec.bef_cnt%>
<%= curlistRec.cnt_rate%>
<%= curlistRec.cur_suply_amt%>
<%= curlistRec.bef_suply_amt%>
<%= curlistRec.suply_amt_rate%>
<%= curlistRec.scat_dt_fr%>
<%= curlistRec.scat_dt_to%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 25 10:39:06 KST 2012 */