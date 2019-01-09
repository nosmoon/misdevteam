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


package chosun.ciis.hd.trip.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1010_LDataSet(){}
	public HD_TRIP_1010_LDataSet(String errcode, String errmsg){
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
			HD_TRIP_1010_LCURLISTRecord rec = new HD_TRIP_1010_LCURLISTRecord();
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.busi_trip_frdt = Util.checkString(rset0.getString("busi_trip_frdt"));
			rec.busi_trip_todt = Util.checkString(rset0.getString("busi_trip_todt"));
			rec.busi_trip_clsf_nm = Util.checkString(rset0.getString("busi_trip_clsf_nm"));
			rec.busi_trip_purp = Util.checkString(rset0.getString("busi_trip_purp"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_TRIP_1010_LDataSet ds = (HD_TRIP_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1010_LCURLISTRecord curlistRec = (HD_TRIP_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.proc_stat_nm%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.busi_trip_clsf_nm%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.emp_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 01 11:14:18 KST 2017 */