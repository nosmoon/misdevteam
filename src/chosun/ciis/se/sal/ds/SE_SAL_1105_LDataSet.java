/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1105_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1105_LDataSet(){}
	public SE_SAL_1105_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SAL_1105_LCURLISTRecord rec = new SE_SAL_1105_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.rcpm_yymm = Util.checkString(rset0.getString("rcpm_yymm"));
			rec.thmm_1tms_rcpm_dt = Util.checkString(rset0.getString("thmm_1tms_rcpm_dt"));
			rec.thmm_1tms_rcpm_wkdy = Util.checkString(rset0.getString("thmm_1tms_rcpm_wkdy"));
			rec.thmm_2tms_rcpm_dt = Util.checkString(rset0.getString("thmm_2tms_rcpm_dt"));
			rec.thmm_2tms_rcpm_wkdy = Util.checkString(rset0.getString("thmm_2tms_rcpm_wkdy"));
			rec.thmm_1tms_encur_amt = Util.checkString(rset0.getString("thmm_1tms_encur_amt"));
			rec.thmm_2tms_encur_amt = Util.checkString(rset0.getString("thmm_2tms_encur_amt"));
			rec.thmm_un_pymt_encur_amt = Util.checkString(rset0.getString("thmm_un_pymt_encur_amt"));
			rec.thmm_db_encur_amt = Util.checkString(rset0.getString("thmm_db_encur_amt"));
			rec.prvmm_1tms_encur_amt = Util.checkString(rset0.getString("prvmm_1tms_encur_amt"));
			rec.prvmm_2tms_encur_amt = Util.checkString(rset0.getString("prvmm_2tms_encur_amt"));
			rec.prvmm_un_pymt_encur_amt = Util.checkString(rset0.getString("prvmm_un_pymt_encur_amt"));
			rec.boy_fpymt_encur_amt = Util.checkString(rset0.getString("boy_fpymt_encur_amt"));
			rec.boy_un_pymt_encur_amt = Util.checkString(rset0.getString("boy_un_pymt_encur_amt"));
			rec.stetsell_fpymt_encur_amt = Util.checkString(rset0.getString("stetsell_fpymt_encur_amt"));
			rec.stetsell_un_pymt_encur_amt = Util.checkString(rset0.getString("stetsell_un_pymt_encur_amt"));
			rec.edus_fpymt_encur_amt = Util.checkString(rset0.getString("edus_fpymt_encur_amt"));
			rec.edus_un_pymt_encur_amt = Util.checkString(rset0.getString("edus_un_pymt_encur_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_1105_LDataSet ds = (SE_SAL_1105_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_1105_LCURLISTRecord curlistRec = (SE_SAL_1105_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.basi_yymm%>
<%= curlistRec.rcpm_yymm%>
<%= curlistRec.thmm_1tms_rcpm_dt%>
<%= curlistRec.thmm_1tms_rcpm_wkdy%>
<%= curlistRec.thmm_2tms_rcpm_dt%>
<%= curlistRec.thmm_2tms_rcpm_wkdy%>
<%= curlistRec.thmm_1tms_encur_amt%>
<%= curlistRec.thmm_2tms_encur_amt%>
<%= curlistRec.thmm_un_pymt_encur_amt%>
<%= curlistRec.thmm_db_encur_amt%>
<%= curlistRec.prvmm_1tms_encur_amt%>
<%= curlistRec.prvmm_2tms_encur_amt%>
<%= curlistRec.prvmm_un_pymt_encur_amt%>
<%= curlistRec.boy_fpymt_encur_amt%>
<%= curlistRec.boy_un_pymt_encur_amt%>
<%= curlistRec.stetsell_fpymt_encur_amt%>
<%= curlistRec.stetsell_un_pymt_encur_amt%>
<%= curlistRec.edus_fpymt_encur_amt%>
<%= curlistRec.edus_un_pymt_encur_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 16 20:37:52 KST 2009 */