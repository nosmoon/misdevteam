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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_2600_LDataSet(){}
	public HD_INFO_2600_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INFO_2600_LCURLISTRecord rec = new HD_INFO_2600_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cmpy_nm = Util.checkString(rset0.getString("cmpy_nm"));
			rec.rptv_movm_nm = Util.checkString(rset0.getString("rptv_movm_nm"));
			rec.emp_cnt = Util.checkString(rset0.getString("emp_cnt"));
			rec.vip_serv_job = Util.checkString(rset0.getString("vip_serv_job"));
			rec.cntr_cnclus_dt = Util.checkString(rset0.getString("cntr_cnclus_dt"));
			rec.aply_yymm = Util.checkString(rset0.getString("aply_yymm"));
			rec.mm_servcost = Util.checkString(rset0.getString("mm_servcost"));
			rec.one_pers_servcost = Util.checkString(rset0.getString("one_pers_servcost"));
			rec.spc_matt = Util.checkString(rset0.getString("spc_matt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_2600_LDataSet ds = (HD_INFO_2600_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_2600_LCURLISTRecord curlistRec = (HD_INFO_2600_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.cmpy_nm%>
<%= curlistRec.rptv_movm_nm%>
<%= curlistRec.emp_cnt%>
<%= curlistRec.vip_serv_job%>
<%= curlistRec.cntr_cnclus_dt%>
<%= curlistRec.aply_yymm%>
<%= curlistRec.mm_servcost%>
<%= curlistRec.one_pers_servcost%>
<%= curlistRec.spc_matt%>
<%= curlistRec.remk%>
<%= curlistRec.seq%>
<%= curlistRec.occr_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 25 14:32:45 KST 2009 */