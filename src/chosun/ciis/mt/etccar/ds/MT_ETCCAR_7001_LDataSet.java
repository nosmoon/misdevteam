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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_7001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_7001_LDataSet(){}
	public MT_ETCCAR_7001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			MT_ETCCAR_7001_LCURLISTRecord rec = new MT_ETCCAR_7001_LCURLISTRecord();
			rec.close_yymm = Util.checkString(rset0.getString("close_yymm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.redm_yn = Util.checkString(rset0.getString("redm_yn"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset0.getString("cd_clsf"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.sub_cd = Util.checkString(rset0.getString("sub_cd"));
			rec.exec_no = Util.checkString(rset0.getString("exec_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCCAR_7001_LDataSet ds = (MT_ETCCAR_7001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_7001_LCURLISTRecord curlistRec = (MT_ETCCAR_7001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.close_yymm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.redm_yn%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.job_clsf%>
<%= curlistRec.cd_clsf%>
<%= curlistRec.cd%>
<%= curlistRec.sub_cd%>
<%= curlistRec.exec_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 09 10:39:40 KST 2012 */