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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3301_100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_3301_100_LDataSet(){}
	public HD_EVLU_3301_100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EVLU_3301_100_LCURLISTRecord rec = new HD_EVLU_3301_100_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset0.getString("sel_chk"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.evlu_proc_stat_2tms = Util.checkString(rset0.getString("evlu_proc_stat_2tms"));
			rec.evlu_proc_stat_1tms = Util.checkString(rset0.getString("evlu_proc_stat_1tms"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.not_chg_cnt = Util.checkString(rset0.getString("not_chg_cnt"));
			rec.chg_cnt = Util.checkString(rset0.getString("chg_cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_3301_100_LDataSet ds = (HD_EVLU_3301_100_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3301_100_LCURLISTRecord curlistRec = (HD_EVLU_3301_100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sel_chk%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.evlu_proc_stat_2tms%>
<%= curlistRec.evlu_proc_stat_1tms%>
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.tot_cnt%>
<%= curlistRec.not_chg_cnt%>
<%= curlistRec.chg_cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 06 17:50:01 KST 2016 */