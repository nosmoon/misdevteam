/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_3320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_3320_LDataSet(){}
	public HD_VACA_3320_LDataSet(String errcode, String errmsg){
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
			HD_VACA_3320_LCURLISTRecord rec = new HD_VACA_3320_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.tot_acc_cnt = Util.checkString(rset0.getString("tot_acc_cnt"));
			rec.alvc_use_rate = Util.checkString(rset0.getString("alvc_use_rate"));
			rec.sunday_rate = Util.checkString(rset0.getString("sunday_rate"));
			rec.week_rate = Util.checkString(rset0.getString("week_rate"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_VACA_3320_LCURLIST2Record rec = new HD_VACA_3320_LCURLIST2Record();
			rec.emp_cnt = Util.checkString(rset1.getString("emp_cnt"));
			rec.tot_acc_cnt = Util.checkString(rset1.getString("tot_acc_cnt"));
			rec.tot_alvc_use_rate = Util.checkString(rset1.getString("tot_alvc_use_rate"));
			rec.tot_week_rate = Util.checkString(rset1.getString("tot_week_rate"));
			rec.tot_sunday_rate = Util.checkString(rset1.getString("tot_sunday_rate"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_3320_LDataSet ds = (HD_VACA_3320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_3320_LCURLISTRecord curlistRec = (HD_VACA_3320_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_VACA_3320_LCURLIST2Record curlist2Rec = (HD_VACA_3320_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.tot_acc_cnt%>
<%= curlistRec.alvc_use_rate%>
<%= curlistRec.sunday_rate%>
<%= curlistRec.week_rate%>
<%= curlist2Rec.emp_cnt%>
<%= curlist2Rec.tot_acc_cnt%>
<%= curlist2Rec.tot_alvc_use_rate%>
<%= curlist2Rec.tot_week_rate%>
<%= curlist2Rec.tot_sunday_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 20 15:21:30 KST 2015 */