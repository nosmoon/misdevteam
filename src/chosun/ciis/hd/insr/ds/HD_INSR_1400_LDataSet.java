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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INSR_1400_LDataSet(){}
	public HD_INSR_1400_LDataSet(String errcode, String errmsg){
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
			HD_INSR_1400_LCURLISTRecord rec = new HD_INSR_1400_LCURLISTRecord();
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.hlth_entr_no = Util.checkString(rset0.getString("hlth_entr_no"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.burd_cnt = Util.checkString(rset0.getString("burd_cnt"));
			rec.med_cnt = Util.checkString(rset0.getString("med_cnt"));
			rec.sum_insr_care = Util.checkString(rset0.getString("sum_insr_care"));
			rec.sum_insr_fee = Util.checkString(rset0.getString("sum_insr_fee"));
			rec.sum_care_insr_fee = Util.checkString(rset0.getString("sum_care_insr_fee"));
			rec.impt_stot = Util.checkString(rset0.getString("impt_stot"));
			rec.bet = Util.checkString(rset0.getString("bet"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INSR_1400_LDataSet ds = (HD_INSR_1400_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1400_LCURLISTRecord curlistRec = (HD_INSR_1400_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.hlth_entr_no%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.prn%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.burd_cnt%>
<%= curlistRec.med_cnt%>
<%= curlistRec.sum_insr_care%>
<%= curlistRec.sum_insr_fee%>
<%= curlistRec.sum_care_insr_fee%>
<%= curlistRec.impt_stot%>
<%= curlistRec.bet%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 18 10:08:12 KST 2009 */