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


package chosun.ciis.pr.sendmg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String send_medi_cd;

	public PR_SENDMG_1001_LDataSet(){}
	public PR_SENDMG_1001_LDataSet(String errcode, String errmsg, String send_medi_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.send_medi_cd = send_medi_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSend_medi_cd(String send_medi_cd){
		this.send_medi_cd = send_medi_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSend_medi_cd(){
		return this.send_medi_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_SENDMG_1001_LCURLISTRecord rec = new PR_SENDMG_1001_LCURLISTRecord();
			rec.sun = Util.checkString(rset0.getString("sun"));
			rec.sun_dt = Util.checkString(rset0.getString("sun_dt"));
			rec.sun_cnt = Util.checkString(rset0.getString("sun_cnt"));
			rec.mon = Util.checkString(rset0.getString("mon"));
			rec.mon_dt = Util.checkString(rset0.getString("mon_dt"));
			rec.mon_cnt = Util.checkString(rset0.getString("mon_cnt"));
			rec.tue = Util.checkString(rset0.getString("tue"));
			rec.tue_dt = Util.checkString(rset0.getString("tue_dt"));
			rec.tue_cnt = Util.checkString(rset0.getString("tue_cnt"));
			rec.wed = Util.checkString(rset0.getString("wed"));
			rec.wed_dt = Util.checkString(rset0.getString("wed_dt"));
			rec.wed_cnt = Util.checkString(rset0.getString("wed_cnt"));
			rec.thr = Util.checkString(rset0.getString("thr"));
			rec.thr_dt = Util.checkString(rset0.getString("thr_dt"));
			rec.thr_cnt = Util.checkString(rset0.getString("thr_cnt"));
			rec.fri = Util.checkString(rset0.getString("fri"));
			rec.fri_dt = Util.checkString(rset0.getString("fri_dt"));
			rec.fri_cnt = Util.checkString(rset0.getString("fri_cnt"));
			rec.sat = Util.checkString(rset0.getString("sat"));
			rec.sat_dt = Util.checkString(rset0.getString("sat_dt"));
			rec.sat_cnt = Util.checkString(rset0.getString("sat_cnt"));
			this.curlist.add(rec);
		}
		this.send_medi_cd = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_SENDMG_1001_LDataSet ds = (PR_SENDMG_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_SENDMG_1001_LCURLISTRecord curlistRec = (PR_SENDMG_1001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getSend_medi_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.sun%>
<%= curlistRec.sun_dt%>
<%= curlistRec.sun_cnt%>
<%= curlistRec.mon%>
<%= curlistRec.mon_dt%>
<%= curlistRec.mon_cnt%>
<%= curlistRec.tue%>
<%= curlistRec.tue_dt%>
<%= curlistRec.tue_cnt%>
<%= curlistRec.wed%>
<%= curlistRec.wed_dt%>
<%= curlistRec.wed_cnt%>
<%= curlistRec.thr%>
<%= curlistRec.thr_dt%>
<%= curlistRec.thr_cnt%>
<%= curlistRec.fri%>
<%= curlistRec.fri_dt%>
<%= curlistRec.fri_cnt%>
<%= curlistRec.sat%>
<%= curlistRec.sat_dt%>
<%= curlistRec.sat_cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 17 11:14:59 KST 2009 */